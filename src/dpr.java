import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dpr(akg<eoq> d, double e, double f, csz g, Optional<akg<eoq>> h, dpj i, dpj.a j) {
   static final String a = "config";
   static dpr b = new dpr();
   static Codec<dpr> c = axh.b(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akg.a(le.aU).optionalFieldOf("loot_table", b.b()).forGetter(dpr::b),
                  Codec.DOUBLE.optionalFieldOf("activation_range", b.c()).forGetter(dpr::c),
                  Codec.DOUBLE.optionalFieldOf("deactivation_range", b.d()).forGetter(dpr::d),
                  csz.a("key_item").forGetter(dpr::e),
                  akg.a(le.aU).optionalFieldOf("override_loot_table_to_display").forGetter(dpr::f)
               )
               .apply($$0, dpr::new)
      ),
      dpr::h
   );

   private dpr() {
      this(eoj.S, 4.0, 4.5, new csz(ctc.yz), Optional.empty(), dpj.b, dpj.a.a);
   }

   public dpr(akg<eoq> $$0, double $$1, double $$2, csz $$3, Optional<akg<eoq>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dpj a() {
      return this.i;
   }

   private DataResult<dpr> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public akg<eoq> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public csz e() {
      return this.g;
   }

   public Optional<akg<eoq>> f() {
      return this.h;
   }

   public dpj.a g() {
      return this.j;
   }
}
