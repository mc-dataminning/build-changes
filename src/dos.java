import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dos(ajv d, double e, double f, crs g, Optional<ajv> h, dok i, dok.a j) {
   static final String a = "config";
   static dos b = new dos();
   static Codec<dos> c = awu.b(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ajv.a.optionalFieldOf("loot_table", b.b()).forGetter(dos::b),
                  Codec.DOUBLE.optionalFieldOf("activation_range", b.c()).forGetter(dos::c),
                  Codec.DOUBLE.optionalFieldOf("deactivation_range", b.d()).forGetter(dos::d),
                  crs.a("key_item").forGetter(dos::e),
                  ajv.a.optionalFieldOf("override_loot_table_to_display").forGetter(dos::f)
               )
               .apply($$0, dos::new)
      ),
      dos::h
   );

   private dos() {
      this(eni.S, 4.0, 4.5, new crs(crv.yq), Optional.empty(), dok.b, dok.a.a);
   }

   public dos(ajv $$0, double $$1, double $$2, crs $$3, Optional<ajv> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dok a() {
      return this.i;
   }

   private DataResult<dos> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ajv b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public crs e() {
      return this.g;
   }

   public Optional<ajv> f() {
      return this.h;
   }

   public dok.a g() {
      return this.j;
   }
}
