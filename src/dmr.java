import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmr extends dfi implements dmy {
   public static final MapCodec<dmr> a = b(dmr::new);
   public static final dtr b = dtq.F;
   public static final dtr c = dtq.C;
   public static final dtr d = dtq.G;
   protected static final exp e = dfw.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ji.a.b);

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   public dmr(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, bsq $$3) {
      if ($$0 instanceof aqt $$4) {
         aqu $$5 = dro.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dqh.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if ($$1 instanceof aqt $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dqh.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dqh.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return e;
   }

   @Override
   protected exp f(dta $$0, dca $$1, jd $$2) {
      return e;
   }

   @Override
   protected boolean f_(dta $$0) {
      return true;
   }

   @Nullable
   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dro($$0, $$1);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eoz.c));
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(c) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, cuo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bps.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return !$$0.B ? dfi.a($$2, dqh.L, ($$0x, $$1x, $$2x, $$3) -> dyf.c.a($$0x, $$3.go(), $$3.gp())) : null;
   }
}
