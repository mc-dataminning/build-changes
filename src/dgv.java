import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgv extends ddy {
   public static final MapCodec<dgv> a = b(dgv::new);
   public static final dsb b = drr.aQ;
   protected static final evd c = ddy.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dgv> a() {
      return a;
   }

   protected dgv(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$1 == it.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      drb $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dgx || $$3.b() instanceof dqt;
   }

   @Override
   public drb a(cwz $$0) {
      return !this.n().a((dba)$$0.q(), $$0.a()) ? dea.j.n() : super.a($$0);
   }

   @Override
   protected boolean f_(drb $$0) {
      return true;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      int $$4 = $$0.c(b);
      if (!a((dba)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dad)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dax $$0, drb $$1, io $$2, bru $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bso && ($$3 instanceof clw || $$0.aa().b(dat.c)) && $$3.dj() * $$3.dj() * $$3.dk() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bru $$0, drb $$1, dax $$2, io $$3) {
      drb $$4 = a($$1, dea.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dvu.c, $$3, dvu.a.a($$0, $$4));
   }

   private static boolean a(dad $$0, io $$1) {
      return $$0.a_($$1.c()).a(avw.cx);
   }

   private static boolean a(dba $$0, io $$1) {
      for (io $$2 : io.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awb.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
