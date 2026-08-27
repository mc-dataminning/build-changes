import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxx extends cva {
   public static final MapCodec<cxx> a = b(cxx::new);
   public static final dii b = dhy.aQ;
   protected static final ekn c = cva.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<cxx> a() {
      return a;
   }

   protected cxx(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      dhi $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cxz || $$3.b() instanceof dha;
   }

   @Override
   public dhi a(cnr $$0) {
      return !this.o().a((csd)$$0.q(), $$0.a()) ? cvc.j.o() : super.a($$0);
   }

   @Override
   public boolean g_(dhi $$0) {
      return true;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      int $$4 = $$0.c(b);
      if (!a((csd)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((crg)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(csa $$0, dhi $$1, ht $$2, bkq $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof blg && ($$3 instanceof cdu || $$0.Y().b(crw.c)) && $$3.dh() * $$3.dh() * $$3.di() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bkq $$0, dhi $$1, csa $$2, ht $$3) {
      dhi $$4 = a($$1, cvc.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dls.c, $$3, dls.a.a($$0, $$4));
   }

   private static boolean a(crg $$0, ht $$1) {
      return $$0.a_($$1.c()).a(arg.cp);
   }

   private static boolean a(csd $$0, ht $$1) {
      for (ht $$2 : ht.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(arl.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
