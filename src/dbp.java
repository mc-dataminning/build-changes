import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbp extends cys {
   public static final MapCodec<dbp> a = b(dbp::new);
   public static final dmj b = dlz.aQ;
   protected static final eos c = cys.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dbp> a() {
      return a;
   }

   protected dbp(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$1 == ie.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      dlj $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dbr || $$3.b() instanceof dlb;
   }

   @Override
   public dlj a(crk $$0) {
      return !this.o().a((cvu)$$0.q(), $$0.a()) ? cyu.j.o() : super.a($$0);
   }

   @Override
   protected boolean g_(dlj $$0) {
      return true;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return c;
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      int $$4 = $$0.c(b);
      if (!a((cvu)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cux)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cvr $$0, dlj $$1, hz $$2, bnq $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof boi && ($$3 instanceof chl || $$0.Z().b(cvn.c)) && $$3.dg() * $$3.dg() * $$3.dh() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bnq $$0, dlj $$1, cvr $$2, hz $$3) {
      dlj $$4 = a($$1, cyu.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dpw.c, $$3, dpw.a.a($$0, $$4));
   }

   private static boolean a(cux $$0, hz $$1) {
      return $$0.a_($$1.c()).a(aua.cq);
   }

   private static boolean a(cvu $$0, hz $$1) {
      for (hz $$2 : hz.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(auf.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
