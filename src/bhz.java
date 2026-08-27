import com.google.common.collect.ImmutableMap;

public class bhz<E extends bgb & bvp, T extends bfz> extends bhr<E> {
   private static final int c = 1200;
   private int d;
   private bhz.a e = bhz.a.a;

   public bhz() {
      super(ImmutableMap.of(bpb.n, bpc.c, bpb.o, bpc.a), 1200);
   }

   protected boolean a(aif $$0, E $$1) {
      bfz $$2 = b($$1);
      return $$1.b(cgc.uZ) && bht.b($$1, $$2) && bht.a($$1, $$2, 0);
   }

   protected boolean a(aif $$0, E $$1, long $$2) {
      return $$1.dK().a(bpb.o) && this.a($$0, $$1);
   }

   protected void b(aif $$0, E $$1, long $$2) {
      bfz $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aif $$0, E $$1, long $$2) {
      if ($$1.fi()) {
         $$1.fo();
      }

      if ($$1.b(cgc.uZ)) {
         $$1.b(false);
         ceh.a($$1.fk(), false);
      }
   }

   private void a(E $$0, bfz $$1) {
      if (this.e == bhz.a.a) {
         $$0.c(bzh.a($$0, cgc.uZ));
         this.e = bhz.a.b;
         $$0.b(true);
      } else if (this.e == bhz.a.b) {
         if (!$$0.fi()) {
            this.e = bhz.a.a;
         }

         int $$2 = $$0.fm();
         cfz $$3 = $$0.fk();
         if ($$2 >= ceh.k($$3)) {
            $$0.fn();
            this.e = bhz.a.c;
            this.d = 20 + $$0.ec().a(20);
            $$0.b(false);
         }
      } else if (this.e == bhz.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bhz.a.d;
         }
      } else if (this.e == bhz.a.d) {
         $$0.a($$1, 1.0F);
         cfz $$4 = $$0.b(bzh.a($$0, cgc.uZ));
         ceh.a($$4, false);
         this.e = bhz.a.a;
      }
   }

   private void b(bgb $$0, bfz $$1) {
      $$0.dK().a(bpb.n, new bic($$1, true));
   }

   private static bfz b(bfz $$0) {
      return $$0.dK().c(bpb.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
