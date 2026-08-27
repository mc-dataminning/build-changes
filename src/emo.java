import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class emo extends emi<emo.a> {
   protected emo(dtk $$0) {
      super(dbg.a, $$0, new emo.a(new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
   }

   @Override
   protected int a(long $$0) {
      return this.e($$0, false);
   }

   protected int e(long $$0, boolean $$1) {
      long $$2 = jq.e($$0);
      int $$3 = jq.c($$2);
      emo.a $$4 = $$1 ? this.d : this.c;
      int $$5 = $$4.c.get(jq.f($$2));
      if ($$5 != $$4.b && $$3 < $$5) {
         dtc $$6 = this.a($$4, $$2);
         if ($$6 == null) {
            for ($$0 = io.e($$0); $$6 == null; $$6 = this.a($$4, $$2)) {
               if (++$$3 >= $$5) {
                  return 15;
               }

               $$2 = jq.a($$2, it.b);
            }
         }

         return $$6.a(jq.b(io.a($$0)), jq.b(io.b($$0)), jq.b(io.c($$0)));
      } else {
         return $$1 && !this.j($$2) ? 0 : 15;
      }
   }

   @Override
   protected void h(long $$0) {
      int $$1 = jq.c($$0);
      if (this.d.b > $$1) {
         this.d.b = $$1;
         this.d.c.defaultReturnValue(this.d.b);
      }

      long $$2 = jq.f($$0);
      int $$3 = this.d.c.get($$2);
      if ($$3 < $$1 + 1) {
         this.d.c.put($$2, $$1 + 1);
      }
   }

   @Override
   protected void i(long $$0) {
      long $$1 = jq.f($$0);
      int $$2 = jq.c($$0);
      if (this.d.c.get($$1) == $$2 + 1) {
         long $$3;
         for ($$3 = $$0; !this.b($$3) && this.a($$2); $$3 = jq.a($$3, it.a)) {
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
   protected dtc g(long $$0) {
      dtc $$1 = (dtc)this.g.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         int $$2 = this.d.c.get(jq.f($$0));
         if ($$2 != this.d.b && jq.c($$0) < $$2) {
            long $$3 = jq.a($$0, it.b);

            dtc $$4;
            while (($$4 = this.a($$3, true)) == null) {
               $$3 = jq.a($$3, it.b);
            }

            return a($$4);
         } else {
            return this.j($$0) ? new dtc(15) : new dtc();
         }
      }
   }

   private static dtc a(dtc $$0) {
      if ($$0.c()) {
         return $$0.b();
      } else {
         byte[] $$1 = $$0.a();
         byte[] $$2 = new byte[2048];

         for (int $$3 = 0; $$3 < 16; $$3++) {
            System.arraycopy($$1, 0, $$2, $$3 * 128, 128);
         }

         return new dtc($$2);
      }
   }

   protected boolean a(int $$0) {
      return $$0 >= this.d.b;
   }

   protected boolean l(long $$0) {
      long $$1 = jq.f($$0);
      int $$2 = this.d.c.get($$1);
      return $$2 == this.d.b || jq.c($$0) >= $$2;
   }

   protected int m(long $$0) {
      return this.d.c.get($$0);
   }

   protected int c() {
      return this.d.b;
   }

   protected static final class a extends emf<emo.a> {
      int b;
      final Long2IntOpenHashMap c;

      public a(Long2ObjectOpenHashMap<dtc> $$0, Long2IntOpenHashMap $$1, int $$2) {
         super($$0);
         this.c = $$1;
         $$1.defaultReturnValue($$2);
         this.b = $$2;
      }

      public emo.a a() {
         return new emo.a(this.a.clone(), this.c.clone(), this.b);
      }
   }
}
