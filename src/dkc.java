import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkc extends dfw implements dmy {
   public static final MapCodec<dkc> a = b(dkc::new);
   public static final dtu b = djs.aE;
   public static final dtr c = dtq.C;
   protected static final float d = 3.0F;
   protected static final exp e = dfw.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final exp f = dfw.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exp g = dfw.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final exp h = dfw.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   protected dkc(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      switch ((ji)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(dca $$0, jd $$1, ji $$2) {
      dta $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      ji $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return dfy.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eoz.c, eoz.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      if (!$$0.c()) {
         dta $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dta $$2 = this.o();
      dcx $$3 = $$0.q();
      jd $$4 = $$0.a();
      eoy $$5 = $$0.q().b_($$0.a());

      for (ji $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == eoz.c));
            }
         }
      }

      return null;
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
      $$0.a(b, c);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(c) ? eoz.c.a(false) : super.b_($$0);
   }
}
