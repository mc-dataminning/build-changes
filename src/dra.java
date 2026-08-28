import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dra extends dqw implements bqt {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private js<cud> q = js.a(27, cud.l);
   private int r;
   private dra.a s = dra.a.a;
   private float t;
   private float u;
   @Nullable
   private final csw v;

   public dra(@Nullable csw $$0, ja $$1, dsl $$2) {
      super(dps.x, $$1, $$2);
      this.v = $$0;
   }

   public dra(ja $$0, dsl $$1) {
      super(dps.x, $$0, $$1);
      this.v = dmh.a($$1.b());
   }

   public static void a(dcg $$0, ja $$1, dsl $$2, dra $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dcg $$0, ja $$1, dsl $$2) {
      this.u = this.t;
      switch (this.s) {
         case a:
            this.t = 0.0F;
            break;
         case b:
            this.t += 0.1F;
            if (this.u == 0.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t >= 1.0F) {
               this.s = dra.a.c;
               this.t = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case c:
            this.t = 1.0F;
            break;
         case d:
            this.t -= 0.1F;
            if (this.u == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t <= 0.0F) {
               this.s = dra.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dra.a l() {
      return this.s;
   }

   public ewc a(dsl $$0) {
      return cjx.a(1.0F, $$0.c(dmh.b), 0.5F * this.a(1.0F));
   }

   private void c(dcg $$0, ja $$1, dsl $$2) {
      if ($$2.b() instanceof dmh) {
         jf $$3 = $$2.c(dmh.b);
         ewc $$4 = cjx.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bsh> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bsh $$6 : $$5) {
               if ($$6.j_() != eoo.d) {
                  $$6.a(bth.d, new ewh(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.q.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.r = $$1;
         if ($$1 == 0) {
            this.s = dra.a.d;
         }

         if ($$1 == 1) {
            this.s = dra.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dcg $$0, ja $$1, dsl $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cml $$0) {
      if (!this.p && !$$0.N_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, dxh.k, this.o);
            this.n.a(null, this.o, avh.wN, avi.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cml $$0) {
      if (!this.p && !$$0.N_()) {
         this.r--;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, dxh.j, this.o);
            this.n.a(null, this.o, avh.wM, avi.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wu k() {
      return wu.c("container.shulkerBox");
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqb.a($$0, this.q, false, $$1);
      }
   }

   public void e(tx $$0, jl.a $$1) {
      this.q = js.a(this.b(), cud.l);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bqb.b($$0, this.q, $$1);
      }
   }

   @Override
   protected js<cud> j() {
      return this.q;
   }

   @Override
   protected void a(js<cud> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(jf $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cud $$1, @Nullable jf $$2) {
      return !(dfi.a($$1.g()) instanceof dmh);
   }

   @Override
   public boolean b(int $$0, cud $$1, jf $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayg.i($$0, this.u, this.t);
   }

   @Nullable
   public csw u() {
      return this.v;
   }

   @Override
   protected cpi a(int $$0, cmk $$1) {
      return new crb($$0, $$1, this);
   }

   public boolean v() {
      return this.s == dra.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
