import com.google.common.collect.ImmutableMap;

public class bla<E extends bjd & byq, T extends bjb> extends bks<E> {
   private static final int c = 1200;
   private int d;
   private bla.a e = bla.a.a;

   public bla() {
      super(ImmutableMap.of(bsc.n, bsd.c, bsc.o, bsd.a), 1200);
   }

   protected boolean a(akn $$0, E $$1) {
      bjb $$2 = b($$1);
      return $$1.b(cjd.uZ) && bku.b($$1, $$2) && bku.a($$1, $$2, 0);
   }

   protected boolean a(akn $$0, E $$1, long $$2) {
      return $$1.dM().a(bsc.o) && this.a($$0, $$1);
   }

   protected void b(akn $$0, E $$1, long $$2) {
      bjb $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(akn $$0, E $$1, long $$2) {
      if ($$1.fl()) {
         $$1.fr();
      }

      if ($$1.b(cjd.uZ)) {
         $$1.b(false);
         chi.a($$1.fn(), false);
      }
   }

   private void a(E $$0, bjb $$1) {
      if (this.e == bla.a.a) {
         $$0.c(cci.a($$0, cjd.uZ));
         this.e = bla.a.b;
         $$0.b(true);
      } else if (this.e == bla.a.b) {
         if (!$$0.fl()) {
            this.e = bla.a.a;
         }

         int $$2 = $$0.fp();
         cja $$3 = $$0.fn();
         if ($$2 >= chi.k($$3)) {
            $$0.fq();
            this.e = bla.a.c;
            this.d = 20 + $$0.ee().a(20);
            $$0.b(false);
         }
      } else if (this.e == bla.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bla.a.d;
         }
      } else if (this.e == bla.a.d) {
         $$0.a($$1, 1.0F);
         cja $$4 = $$0.b(cci.a($$0, cjd.uZ));
         chi.a($$4, false);
         this.e = bla.a.a;
      }
   }

   private void b(bjd $$0, bjb $$1) {
      $$0.dM().a(bsc.n, new bld($$1, true));
   }

   private static bjb b(bjb $$0) {
      return $$0.dM().c(bsc.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
