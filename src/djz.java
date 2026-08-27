import com.mojang.serialization.MapCodec;

public class djz extends ddy {
   public static final MapCodec<djz> a = b(djz::new);
   public static final drs b = dkc.d;

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(dra.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, clw $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bru $$3) {
      if (!$$3.bW()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.g() instanceof crm && new cwz($$4, $$5, $$0, $$6).b() ? bpw.e : bpw.a;
   }

   private static void d(drb $$0, dax $$1, io $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean d_(drb $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, cto $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cza.a(czc.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dax $$0, io $$1) {
      double $$2 = 0.5625;
      ayk $$3 = $$0.z;

      for (it $$4 : it.values()) {
         io $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            it.a $$6 = $$4.o();
            double $$7 = $$6 == it.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == it.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == it.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ks.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }
}
