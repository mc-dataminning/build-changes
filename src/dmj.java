import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dmj(ajh d, double e, double f, cqk g, Optional<ajh> h, dmb i, dmb.a j) {
   static final String a = "config";
   static dmj b = new dmj();
   static Codec<dmj> c = awe.b(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ajh.a.optionalFieldOf("loot_table", b.b()).forGetter(dmj::b),
                  Codec.DOUBLE.optionalFieldOf("activation_range", b.c()).forGetter(dmj::c),
                  Codec.DOUBLE.optionalFieldOf("deactivation_range", b.d()).forGetter(dmj::d),
                  cqk.a.optionalFieldOf("key_item", b.e()).forGetter(dmj::e),
                  ajh.a.optionalFieldOf("override_loot_table_to_display").forGetter(dmj::f)
               )
               .apply($$0, dmj::new)
      ),
      dmj::h
   );

   private dmj() {
      this(eks.S, 4.0, 4.5, new cqk(cqn.yp), Optional.empty(), dmb.b, dmb.a.a);
   }

   public dmj(ajh $$0, double $$1, double $$2, cqk $$3, Optional<ajh> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dmb a() {
      return this.i;
   }

   private DataResult<dmj> h() {
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

   public cqk e() {
      return this.g;
   }

   public Optional<ajh> f() {
      return this.h;
   }

   public dmb.a g() {
      return this.j;
   }
}
