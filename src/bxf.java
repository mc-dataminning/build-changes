import com.google.common.collect.ImmutableMap;

public class bxf<E extends bvg & cli, T extends bve> extends bwx<E> {
   private static final int c = 1200;
   private int d;
   private bxf.a e = bxf.a.a;

   public bxf() {
      super(ImmutableMap.of(cei.n, cej.c, cei.o, cej.a), 1200);
   }

   protected boolean a(arq $$0, E $$1) {
      bve $$2 = b($$1);
      return $$1.b(cwj.wn) && bwz.b($$1, $$2) && bwz.a($$1, $$2, 0);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return $$1.ee().a(cei.o) && this.a($$0, $$1);
   }

   protected void b(arq $$0, E $$1, long $$2) {
      bve $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if ($$1.fC()) {
         $$1.fI();
      }

      if ($$1.b(cwj.wn)) {
         $$1.b(false);
         $$1.fE().b(ku.O, cyk.a);
      }
   }

   private void a(E $$0, bve $$1) {
      if (this.e == bxf.a.a) {
         $$0.c(cpm.a($$0, cwj.wn));
         this.e = bxf.a.b;
         $$0.b(true);
      } else if (this.e == bxf.a.b) {
         if (!$$0.fC()) {
            this.e = bxf.a.a;
         }

         int $$2 = $$0.fG();
         cwf $$3 = $$0.fE();
         if ($$2 >= cuw.b($$3, $$0)) {
            $$0.fH();
            this.e = bxf.a.c;
            this.d = 20 + $$0.eb().a(20);
            $$0.b(false);
         }
      } else if (this.e == bxf.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bxf.a.d;
         }
      } else if (this.e == bxf.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bxf.a.a;
      }
   }

   private void b(bvg $$0, bve $$1) {
      $$0.ee().a(cei.n, new bxi($$1, true));
   }

   private static bve b(bve $$0) {
      return $$0.ee().c(cei.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
