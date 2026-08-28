import com.google.common.collect.ImmutableMap;

public class bzb<E extends bxe & cnm, T extends bxc> extends byt<E> {
   private static final int c = 1200;
   private int d;
   private bzb.a e = bzb.a.a;

   public bzb() {
      super(ImmutableMap.of(cge.o, cgf.c, cge.p, cgf.a), 1200);
   }

   protected boolean a(arq $$0, E $$1) {
      bxc $$2 = b($$1);
      return $$1.b(czc.xb) && byv.b($$1, $$2) && byv.a($$1, $$2, 0);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return $$1.eb().a(cge.p) && this.a($$0, $$1);
   }

   protected void b(arq $$0, E $$1, long $$2) {
      bxc $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if ($$1.fy()) {
         $$1.fE();
      }

      if ($$1.b(czc.xb)) {
         $$1.b(false);
         $$1.fA().b(kj.P, dbc.a);
      }
   }

   private void a(E $$0, bxc $$1) {
      if (this.e == bzb.a.a) {
         $$0.c(cru.a($$0, czc.xb));
         this.e = bzb.a.b;
         $$0.b(true);
      } else if (this.e == bzb.a.b) {
         if (!$$0.fy()) {
            this.e = bzb.a.a;
         }

         int $$2 = $$0.fC();
         cyy $$3 = $$0.fA();
         if ($$2 >= cxr.b($$3, $$0)) {
            $$0.fD();
            this.e = bzb.a.c;
            this.d = 20 + $$0.dY().a(20);
            $$0.b(false);
         }
      } else if (this.e == bzb.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bzb.a.d;
         }
      } else if (this.e == bzb.a.d) {
         $$0.a($$1, 1.0F);
         this.e = bzb.a.a;
      }
   }

   private void b(bxe $$0, bxc $$1) {
      $$0.eb().a(cge.o, new bze($$1, true));
   }

   private static bxc b(bxc $$0) {
      return $$0.eb().c(cge.p).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
