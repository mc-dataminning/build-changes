import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnu extends dfw {
   public static final MapCodec<dnu> a = b(dnu::new);
   private static final wy d = wy.c("container.stonecutter");
   public static final dtu b = djs.aE;
   protected static final exp c = dfw.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   public dnu(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c));
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avy.ay);
         return bqq.c;
      }
   }

   @Nullable
   @Override
   protected bqu b(dta $$0, dcu $$1, jd $$2) {
      return new bra(($$2x, $$3, $$4) -> new cru($$2x, $$3, cqe.a($$1, $$2)), d);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c;
   }

   @Override
   protected boolean f_(dta $$0) {
      return true;
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
