import com.google.common.collect.ImmutableMap;

public class blf<E extends bji & byv, T extends bjg> extends bkx<E> {
   private static final int c = 1200;
   private int d;
   private blf.a e = blf.a.a;

   public blf() {
      super(ImmutableMap.of(bsh.n, bsi.c, bsh.o, bsi.a), 1200);
   }

   protected boolean a(akq $$0, E $$1) {
      bjg $$2 = b($$1);
      return $$1.b(cji.uZ) && bkz.b($$1, $$2) && bkz.a($$1, $$2, 0);
   }

   protected boolean a(akq $$0, E $$1, long $$2) {
      return $$1.dN().a(bsh.o) && this.a($$0, $$1);
   }

   protected void b(akq $$0, E $$1, long $$2) {
      bjg $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(akq $$0, E $$1, long $$2) {
      if ($$1.fm()) {
         $$1.fs();
      }

      if ($$1.b(cji.uZ)) {
         $$1.b(false);
         chn.a($$1.fo(), false);
      }
   }

   private void a(E $$0, bjg $$1) {
      if (this.e == blf.a.a) {
         $$0.c(ccn.a($$0, cji.uZ));
         this.e = blf.a.b;
         $$0.b(true);
      } else if (this.e == blf.a.b) {
         if (!$$0.fm()) {
            this.e = blf.a.a;
         }

         int $$2 = $$0.fq();
         cjf $$3 = $$0.fo();
         if ($$2 >= chn.k($$3)) {
            $$0.fr();
            this.e = blf.a.c;
            this.d = 20 + $$0.ef().a(20);
            $$0.b(false);
         }
      } else if (this.e == blf.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = blf.a.d;
         }
      } else if (this.e == blf.a.d) {
         $$0.a($$1, 1.0F);
         cjf $$4 = $$0.b(ccn.a($$0, cji.uZ));
         chn.a($$4, false);
         this.e = blf.a.a;
      }
   }

   private void b(bji $$0, bjg $$1) {
      $$0.dN().a(bsh.n, new bli($$1, true));
   }

   private static bjg b(bjg $$0) {
      return $$0.dN().c(bsh.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
