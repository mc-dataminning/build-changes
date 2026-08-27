import com.google.common.collect.ImmutableMap;

public class bqe<E extends boi & cea, T extends bog> extends bpw<E> {
   private static final int c = 1200;
   private int d;
   private bqe.a e = bqe.a.a;

   public bqe() {
      super(ImmutableMap.of(bxh.n, bxi.c, bxh.o, bxi.a), 1200);
   }

   protected boolean a(aov $$0, E $$1) {
      bog $$2 = b($$1);
      return $$1.b(cpc.vP) && bpy.b($$1, $$2) && bpy.a($$1, $$2, 0);
   }

   protected boolean a(aov $$0, E $$1, long $$2) {
      return $$1.dO().a(bxh.o) && this.a($$0, $$1);
   }

   protected void b(aov $$0, E $$1, long $$2) {
      bog $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aov $$0, E $$1, long $$2) {
      if ($$1.fn()) {
         $$1.ft();
      }

      if ($$1.b(cpc.vP)) {
         $$1.b(false);
         cnh.a($$1.fp(), false);
      }
   }

   private void a(E $$0, bog $$1) {
      if (this.e == bqe.a.a) {
         $$0.c(cib.a($$0, cpc.vP));
         this.e = bqe.a.b;
         $$0.b(true);
      } else if (this.e == bqe.a.b) {
         if (!$$0.fn()) {
            this.e = bqe.a.a;
         }

         int $$2 = $$0.fr();
         coz $$3 = $$0.fp();
         if ($$2 >= cnh.k($$3)) {
            $$0.fs();
            this.e = bqe.a.c;
            this.d = 20 + $$0.eh().a(20);
            $$0.b(false);
         }
      } else if (this.e == bqe.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = bqe.a.d;
         }
      } else if (this.e == bqe.a.d) {
         $$0.a($$1, 1.0F);
         coz $$4 = $$0.b(cib.a($$0, cpc.vP));
         cnh.a($$4, false);
         this.e = bqe.a.a;
      }
   }

   private void b(boi $$0, bog $$1) {
      $$0.dO().a(bxh.n, new bqh($$1, true));
   }

   private static bog b(bog $$0) {
      return $$0.dO().c(bxh.o).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
