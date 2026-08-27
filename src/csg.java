import javax.annotation.Nullable;

public class csg extends cpn {
   public static final ddb a = dcr.aQ;
   protected static final efb b = cpn.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int c = 7;

   protected csg(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$1 == ha.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      dcb $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof csi || $$3.b() instanceof dbt;
   }

   @Override
   public dcb a(cih $$0) {
      return !this.n().a((cmp)$$0.q(), $$0.a()) ? cpo.j.n() : super.a($$0);
   }

   @Override
   public boolean g_(dcb $$0) {
      return true;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return b;
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      int $$4 = $$0.c(a);
      if (!a((cmp)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(a, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cls)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cmm $$0, dcb $$1, gu $$2, bfj $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bfz && ($$3 instanceof byo || $$0.X().b(cmi.c)) && $$3.dd() * $$3.dd() * $$3.de() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bfj $$0, dcb $$1, cmm $$2, gu $$3) {
      dcb $$4 = a($$1, cpo.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dgl.c, $$3, dgl.a.a($$0, $$4));
   }

   private static boolean a(cls $$0, gu $$1) {
      return $$0.a_($$1.c()).a(amw.cn);
   }

   private static boolean a(cmp $$0, gu $$1) {
      for (gu $$2 : gu.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(anb.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
