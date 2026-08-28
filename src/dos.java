import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dos extends dfi {
   public static final MapCodec<dos> a = b(dos::new);
   public static final dud<dsn> b = dtq.bz;
   public static final dtu c = djs.aE;
   public static final dtr d = dtq.bA;

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   public dos(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ji.c).a(b, dsn.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$0.e() || $$1.c(b) != dsn.b) {
         return bqs.d;
      } else if ($$2 instanceof aqt $$7) {
         if ($$7.c_($$3) instanceof dsi $$9) {
            dsi.b.a($$7, $$3, $$1, $$9.f(), $$9.b(), $$9.c(), $$4, $$0);
            return bqs.a;
         } else {
            return bqs.d;
         }
      } else {
         return bqs.b;
      }
   }

   @Nullable
   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dsi($$0, $$1);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return $$0 instanceof aqt $$3
         ? a($$2, dqh.R, ($$1x, $$2x, $$3x, $$4) -> dsi.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dqh.R, ($$0x, $$1x, $$2x, $$3x) -> dsi.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(c, $$0.g().g());
   }

   @Override
   public dta a(dta $$0, dmk $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dmd a_(dta $$0) {
      return dmd.c;
   }
}
