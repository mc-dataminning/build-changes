import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgx extends dea {
   public static final MapCodec<dgx> a = b(dgx::new);
   public static final dsd b = drt.aQ;
   protected static final evf c = dea.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   protected dgx(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1 == it.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      drd $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dgz || $$3.b() instanceof dqv;
   }

   @Override
   public drd a(cxb $$0) {
      return !this.n().a((dbc)$$0.q(), $$0.a()) ? dec.j.n() : super.a($$0);
   }

   @Override
   protected boolean f_(drd $$0) {
      return true;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      int $$4 = $$0.c(b);
      if (!a((dbc)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((daf)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(daz $$0, drd $$1, io $$2, brw $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bsq && ($$3 instanceof cly || $$0.aa().b(dav.c)) && $$3.dj() * $$3.dj() * $$3.dk() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable brw $$0, drd $$1, daz $$2, io $$3) {
      drd $$4 = a($$1, dec.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dvw.c, $$3, dvw.a.a($$0, $$4));
   }

   private static boolean a(daf $$0, io $$1) {
      return $$0.a_($$1.c()).a(avx.cx);
   }

   private static boolean a(dbc $$0, io $$1) {
      for (io $$2 : io.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awc.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
