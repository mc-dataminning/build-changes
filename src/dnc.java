import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnc extends die implements dfz, dmy {
   public static final MapCodec<dnc> c = b(dnc::new);
   private static final dtr g = dtq.C;
   public static final dtu d = dtq.R;
   protected static final float e = 6.0F;
   protected static final exp f = dfw.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dnc> a() {
      return c;
   }

   public dnc(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtw.b).a(g, Boolean.valueOf(false)).a(d, ji.c));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return f;
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.a(awd.bx) || $$1.b_($$2.c()).a(eoz.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, btl $$3, cuo $$4) {
      if (!$$0.x_()) {
         jd $$5 = $$1.c();
         dta $$6 = die.c($$0, $$5, this.o().a(b, dtw.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(g) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      if ($$0.c(b) == dtw.a) {
         return super.a($$0, $$1, $$2);
      } else {
         jd $$3 = $$2.d();
         dta $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return true;
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      if ($$3.c(die.b) == dtw.b) {
         jd $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dft.a($$0, $$1, $$2, $$3.c(d));
      } else {
         jd $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
