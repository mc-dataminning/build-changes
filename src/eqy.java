import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class eqy extends eqs<eqy.a> {
   protected eqy(dxm $$0) {
      super(dfe.a, $$0, new eqy.a(new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
   }

   @Override
   protected int a(long $$0) {
      return this.e($$0, false);
   }

   protected int e(long $$0, boolean $$1) {
      long $$2 = ki.e($$0);
      int $$3 = ki.c($$2);
      eqy.a $$4 = $$1 ? this.d : this.c;
      int $$5 = $$4.c.get(ki.f($$2));
      if ($$5 != $$4.b && $$3 < $$5) {
         dxe $$6 = this.a($$4, $$2);
         if ($$6 == null) {
            for ($$0 = jg.e($$0); $$6 == null; $$6 = this.a($$4, $$2)) {
               if (++$$3 >= $$5) {
                  return 15;
               }

               $$2 = ki.a($$2, jl.b);
            }
         }

         return $$6.a(ki.b(jg.a($$0)), ki.b(jg.b($$0)), ki.b(jg.c($$0)));
      } else {
         return $$1 && !this.j($$2) ? 0 : 15;
      }
   }

   @Override
   protected void h(long $$0) {
      int $$1 = ki.c($$0);
      if (this.d.b > $$1) {
         this.d.b = $$1;
         this.d.c.defaultReturnValue(this.d.b);
      }

      long $$2 = ki.f($$0);
      int $$3 = this.d.c.get($$2);
      if ($$3 < $$1 + 1) {
         this.d.c.put($$2, $$1 + 1);
      }
   }

   @Override
   protected void i(long $$0) {
      long $$1 = ki.f($$0);
      int $$2 = ki.c($$0);
      if (this.d.c.get($$1) == $$2 + 1) {
         long $$3;
         for ($$3 = $$0; !this.b($$3) && this.a($$2); $$3 = ki.a($$3, jl.a)) {
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
   protected dxe g(long $$0) {
      dxe $$1 = (dxe)this.g.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         int $$2 = this.d.c.get(ki.f($$0));
         if ($$2 != this.d.b && ki.c($$0) < $$2) {
            long $$3 = ki.a($$0, jl.b);

            dxe $$4;
            while (($$4 = this.a($$3, true)) == null) {
               $$3 = ki.a($$3, jl.b);
            }

            return a($$4);
         } else {
            return this.j($$0) ? new dxe(15) : new dxe();
         }
      }
   }

   private static dxe a(dxe $$0) {
      if ($$0.c()) {
         return $$0.b();
      } else {
         byte[] $$1 = $$0.a();
         byte[] $$2 = new byte[2048];

         for (int $$3 = 0; $$3 < 16; $$3++) {
            System.arraycopy($$1, 0, $$2, $$3 * 128, 128);
         }

         return new dxe($$2);
      }
   }

   protected boolean a(int $$0) {
      return $$0 >= this.d.b;
   }

   protected boolean m(long $$0) {
      long $$1 = ki.f($$0);
      int $$2 = this.d.c.get($$1);
      return $$2 == this.d.b || ki.c($$0) >= $$2;
   }

   protected int n(long $$0) {
      return this.d.c.get($$0);
   }

   protected int c() {
      return this.d.b;
   }

   protected static final class a extends eqp<eqy.a> {
      int b;
      final Long2IntOpenHashMap c;

      public a(Long2ObjectOpenHashMap<dxe> $$0, Long2IntOpenHashMap $$1, int $$2) {
         super($$0);
         this.c = $$1;
         $$1.defaultReturnValue($$2);
         this.b = $$2;
      }

      public eqy.a a() {
         return new eqy.a(this.a.clone(), this.c.clone(), this.b);
      }
   }
}
