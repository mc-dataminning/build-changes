import com.google.common.collect.ImmutableMap;

public class byy<E extends bxb & cng, T extends bwz> extends byq<E> {
   private static final int c = 1200;
   private int d;
   private byy.a e = byy.a.a;

   public byy() {
      super(ImmutableMap.of(cgb.o, cgc.c, cgb.p, cgc.a), 1200);
   }

   protected boolean a(aro $$0, E $$1) {
      bwz $$2 = b($$1);
      return $$1.b(cyw.wZ) && bys.b($$1, $$2) && bys.a($$1, $$2, 0);
   }

   protected boolean a(aro $$0, E $$1, long $$2) {
      return $$1.eb().a(cgb.p) && this.a($$0, $$1);
   }

   protected void b(aro $$0, E $$1, long $$2) {
      bwz $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aro $$0, E $$1, long $$2) {
      if ($$1.fy()) {
         $$1.fE();
      }

      if ($$1.b(cyw.wZ)) {
         $$1.b(false);
         $$1.fA().b(kj.P, daw.a);
      }
   }

   private void a(E $$0, bwz $$1) {
      if (this.e == byy.a.a) {
         $$0.c(cro.a($$0, cyw.wZ));
         this.e = byy.a.b;
         $$0.b(true);
      } else if (this.e == byy.a.b) {
         if (!$$0.fy()) {
            this.e = byy.a.a;
         }

         int $$2 = $$0.fC();
         cys $$3 = $$0.fA();
         if ($$2 >= cxl.b($$3, $$0)) {
            $$0.fD();
            this.e = byy.a.c;
            this.d = 20 + $$0.dY().a(20);
            $$0.b(false);
         }
      } else if (this.e == byy.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = byy.a.d;
         }
      } else if (this.e == byy.a.d) {
         $$0.a($$1, 1.0F);
         this.e = byy.a.a;
      }
   }

   private void b(bxb $$0, bwz $$1) {
      $$0.eb().a(cgb.o, new bzb($$1, true));
   }

   private static bwz b(bwz $$0) {
      return $$0.eb().c(cgb.p).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
