import com.google.common.collect.ImmutableMap;

public class bnu<E extends blx & cbm, T extends blv> extends bnm<E> {
   private static final int c = 1200;
   private int d;
   private bnu.a e = bnu.a.a;

   public bnu() {
      super(ImmutableMap.of(bux.n, buy.c, bux.o, buy.a), 1200);
   }

   protected boolean a(amp $$0, E $$1) {
      blv $$2 = b($$1);
      return $$1.b(cmk.vM) && bno.b($$1, $$2) && bno.a($$1, $$2, 0);
   }

   protected boolean a(amp $$0, E $$1, long $$2) {
      return $$1.dO().a(bux.o) && this.a($$0, $$1);
   }

   protected void b(amp $$0, E $$1, long $$2) {
      blv $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(amp $$0, E $$1, long $$2) {
      if ($$1.fn()) {
         $$1.ft();
      }

      if ($$1.b(cmk.vM)) {
         $$1.b(false);
         ckp.a($$1.fp(), false);
      }
   }

   private void a(E $$0, blv $$1) {
      if (this.e == bnu.a.a) {
         $$0.c(cfk.a($$0, cmk.vM));
         this.e = bnu.a.b;
         $$0.b(true);
      } else if (this.e == bnu.a.b) {
         if (!$$0.fn()) {
            this.e = bnu.a.a;
         }

         int $$2 = $$0.fr();
         cmh $$3 = $$0.fp();
         if ($$2 >= ckp.k($$3)) {
            $$0.fs();
            this.e = bnu.a.c;
            this.d = 20 + $$0.eg().a(20);
            $$0.b(false);
         }
      } else if (this.e == bnu.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bnu.a.d;
         }
      } else if (this.e == bnu.a.d) {
         $$0.a($$1, 1.0F);
         cmh $$4 = $$0.b(cfk.a($$0, cmk.vM));
         ckp.a($$4, false);
         this.e = bnu.a.a;
      }
   }

   private void b(blx $$0, blv $$1) {
      $$0.dO().a(bux.n, new bnx($$1, true));
   }

   private static blv b(blv $$0) {
      return $$0.dO().c(bux.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
