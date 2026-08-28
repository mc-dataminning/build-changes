import java.util.List;

public class cuq extends cvg implements cwh {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cuq(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      if ($$1 instanceof arg $$2) {
         cvl $$3 = $$0.n();
         eye $$4 = $$0.l();
         jj $$5 = $$0.k();
         coi.a(new cod($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return brk.a;
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      if ($$1.fE()) {
         cvl $$3 = $$1.b($$2);
         if ($$0 instanceof arg $$4) {
            coi.a(new cod($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awn.c.b(this));
         }

         return brk.a;
      } else {
         return brk.e;
      }
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      cyf $$4 = $$0.a(kr.X);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public coi a(dds $$0, jx $$1, cvl $$2, jj $$3) {
      return new cod($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cwh.a c() {
      return cwh.a.a().a(cuq::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static eye a(kv $$0, jj $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)btq.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)btq.P.m() / 2.0) - (double)btq.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)btq.P.l() / 2.0)
         );
   }
}
