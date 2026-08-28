import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ewi extends ewc<ewi.a> {
   protected ewi(ecr $$0) {
      super(djj.a, $$0, new ewi.a(new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
   }

   @Override
   protected int a(long $$0) {
      return this.e($$0, false);
   }

   protected int e(long $$0, boolean $$1) {
      long $$2 = jx.e($$0);
      int $$3 = jx.c($$2);
      ewi.a $$4 = $$1 ? this.d : this.c;
      int $$5 = $$4.c.get(jx.f($$2));
      if ($$5 != $$4.b && $$3 < $$5) {
         ecj $$6 = this.a($$4, $$2);
         if ($$6 == null) {
            for ($$0 = iu.e($$0); $$6 == null; $$6 = this.a($$4, $$2)) {
               if (++$$3 >= $$5) {
                  return 15;
               }

               $$2 = jx.a($$2, ja.b);
            }
         }

         return $$6.a(jx.b(iu.a($$0)), jx.b(iu.b($$0)), jx.b(iu.c($$0)));
      } else {
         return $$1 && !this.j($$2) ? 0 : 15;
      }
   }

   @Override
   protected void h(long $$0) {
      int $$1 = jx.c($$0);
      if (this.d.b > $$1) {
         this.d.b = $$1;
         this.d.c.defaultReturnValue(this.d.b);
      }

      long $$2 = jx.f($$0);
      int $$3 = this.d.c.get($$2);
      if ($$3 < $$1 + 1) {
         this.d.c.put($$2, $$1 + 1);
      }
   }

   @Override
   protected void i(long $$0) {
      long $$1 = jx.f($$0);
      int $$2 = jx.c($$0);
      if (this.d.c.get($$1) == $$2 + 1) {
         long $$3;
         for ($$3 = $$0; !this.b($$3) && this.a($$2); $$3 = jx.a($$3, ja.a)) {
            $$2--;
         }

         if (this.b($$3)) {
            this.d.c.put($$1, $$2 + 1);
         } else {
            this.d.c.remove($$1);
         }
      }
   }

   @Override
   protected ecj g(long $$0) {
      ecj $$1 = (ecj)this.g.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         int $$2 = this.d.c.get(jx.f($$0));
         if ($$2 != this.d.b && jx.c($$0) < $$2) {
            long $$3 = jx.a($$0, ja.b);

            ecj $$4;
            while (($$4 = this.a($$3, true)) == null) {
               $$3 = jx.a($$3, ja.b);
            }

            return a($$4);
         } else {
            return this.j($$0) ? new ecj(15) : new ecj();
         }
      }
   }

   private static ecj a(ecj $$0) {
      if ($$0.c()) {
         return $$0.b();
      } else {
         byte[] $$1 = $$0.a();
         byte[] $$2 = new byte[2048];

         for (int $$3 = 0; $$3 < 16; $$3++) {
            System.arraycopy($$1, 0, $$2, $$3 * 128, 128);
         }

         return new ecj($$2);
      }
   }

   protected boolean a(int $$0) {
      return $$0 >= this.d.b;
   }

   protected boolean m(long $$0) {
      long $$1 = jx.f($$0);
      int $$2 = this.d.c.get($$1);
      return $$2 == this.d.b || jx.c($$0) >= $$2;
   }

   protected int n(long $$0) {
      return this.d.c.get($$0);
   }

   protected int c() {
      return this.d.b;
   }

   protected static final class a extends evz<ewi.a> {
      int b;
      final Long2IntOpenHashMap c;

      public a(Long2ObjectOpenHashMap<ecj> $$0, Long2IntOpenHashMap $$1, int $$2) {
         super($$0);
         this.c = $$1;
         $$1.defaultReturnValue($$2);
         this.b = $$2;
      }

      public ewi.a a() {
         return new ewi.a(this.a.clone(), this.c.clone(), this.b);
      }
   }
}
