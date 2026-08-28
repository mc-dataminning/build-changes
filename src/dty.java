import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dty(alb<etm> d, double e, double f, cvp g, Optional<alb<etm>> h, dtq i, dtq.a j) {
   static final String a = "config";
   static dty b = new dty();
   static Codec<dty> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alb.a(lv.bd).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dty::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dty::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dty::d),
                  cvp.a("key_item").forGetter(dty::e),
                  alb.a(lv.bd).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dty::f)
               )
               .apply($$0, dty::new)
      )
      .validate(dty::h);

   private dty() {
      this(etd.S, 4.0, 4.5, new cvp(cvt.yF), Optional.empty(), dtq.b, dtq.a.a);
   }

   public dty(alb<etm> $$0, double $$1, double $$2, cvp $$3, Optional<alb<etm>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dtq a() {
      return this.i;
   }

   private DataResult<dty> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alb<etm> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cvp e() {
      return this.g;
   }

   public Optional<alb<etm>> f() {
      return this.h;
   }

   public dtq.a g() {
      return this.j;
   }
}
