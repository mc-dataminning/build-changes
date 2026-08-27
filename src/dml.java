import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dml(ajh d, double e, double f, cqm g, Optional<ajh> h, dmd i, dmd.a j) {
   static final String a = "config";
   static dml b = new dml();
   static Codec<dml> c = awe.b(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ajh.a.optionalFieldOf("loot_table", b.b()).forGetter(dml::b),
                  Codec.DOUBLE.optionalFieldOf("activation_range", b.c()).forGetter(dml::c),
                  Codec.DOUBLE.optionalFieldOf("deactivation_range", b.d()).forGetter(dml::d),
                  cqm.a.optionalFieldOf("key_item", b.e()).forGetter(dml::e),
                  ajh.a.optionalFieldOf("override_loot_table_to_display").forGetter(dml::f)
               )
               .apply($$0, dml::new)
      ),
      dml::h
   );

   private dml() {
      this(eku.S, 4.0, 4.5, new cqm(cqp.yq), Optional.empty(), dmd.b, dmd.a.a);
   }

   public dml(ajh $$0, double $$1, double $$2, cqm $$3, Optional<ajh> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dmd a() {
      return this.i;
   }

   private DataResult<dml> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ajh b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cqm e() {
      return this.g;
   }

   public Optional<ajh> f() {
      return this.h;
   }

   public dmd.a g() {
      return this.j;
   }
}
