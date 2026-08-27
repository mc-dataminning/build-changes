import com.mojang.serialization.MapCodec;

public class ddy extends cwj {
   public static final MapCodec<ddy> a = b(ddy::new);
   private static final emf b = cwj.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<ddy> a() {
      return a;
   }

   public ddy(diz.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return cwj.a($$1, $$2.c(), ic.a) && !$$1.z($$2);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1 == ic.b && !this.a($$0, $$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(jx.aw, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      hx.a $$10 = new hx.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + aui.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + aui.a($$3, -10, 10));
         dja $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(jx.aA, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }
}
