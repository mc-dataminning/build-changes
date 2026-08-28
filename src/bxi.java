import com.google.common.collect.ImmutableMap;

public class bxi<E extends bvj & cll, T extends bvh> extends bxa<E> {
   private static final int c = 1200;
   private int d;
   private bxi.a e = bxi.a.a;

   public bxi() {
      super(ImmutableMap.of(cel.n, cem.c, cel.o, cem.a), 1200);
   }

   protected boolean a(arp $$0, E $$1) {
      bvh $$2 = b($$1);
      return $$1.b(cwq.wn) && bxc.b($$1, $$2) && bxc.a($$1, $$2, 0);
   }

   protected boolean a(arp $$0, E $$1, long $$2) {
      return $$1.eb().a(cel.o) && this.a($$0, $$1);
   }

   protected void b(arp $$0, E $$1, long $$2) {
      bvh $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arp $$0, E $$1, long $$2) {
      if ($$1.fx()) {
         $$1.fD();
      }

      if ($$1.b(cwq.wn)) {
         $$1.b(false);
         $$1.fz().b(ku.O, cyr.a);
      }
   }

   private void a(E $$0, bvh $$1) {
      if (this.e == bxi.a.a) {
         $$0.c(cpp.a($$0, cwq.wn));
         this.e = bxi.a.b;
         $$0.b(true);
      } else if (this.e == bxi.a.b) {
         if (!$$0.fx()) {
            this.e = bxi.a.a;
         }

         int $$2 = $$0.fB();
         cwm $$3 = $$0.fz();
         if ($$2 >= cvd.b($$3, $$0)) {
            $$0.fC();
            this.e = bxi.a.c;
            this.d = 20 + $$0.dY().a(20);
            $$0.b(false);
         }
      } else if (this.e == bxi.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bxi.a.d;
         }
      } else if (this.e == bxi.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bxi.a.a;
      }
   }

   private void b(bvj $$0, bvh $$1) {
      $$0.eb().a(cel.n, new bxl($$1, true));
   }

   private static bvh b(bvh $$0) {
      return $$0.eb().c(cel.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
