import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dno extends dnk implements bom {
   public static final int e = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int h = 1;
   public static final int i = 10;
   public static final float j = 0.5F;
   public static final float k = 270.0F;
   private static final String l = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private iu<crj> s = iu.a(27, crj.i);
   private int t;
   private dno.a u = dno.a.a;
   private float v;
   private float w;
   @Nullable
   private final cqc x;

   public dno(@Nullable cqc $$0, ib $$1, doz $$2) {
      super(dmh.x, $$1, $$2);
      this.x = $$0;
   }

   public dno(ib $$0, doz $$1) {
      super(dmh.x, $$0, $$1);
      this.x = diw.a($$1.b());
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dno $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cyx $$0, ib $$1, doz $$2) {
      this.w = this.v;
      switch (this.u) {
         case a:
            this.v = 0.0F;
            break;
         case b:
            this.v += 0.1F;
            if (this.w == 0.0F) {
               d($$0, $$1, $$2);
            }

            if (this.v >= 1.0F) {
               this.u = dno.a.c;
               this.v = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case d:
            this.v -= 0.1F;
            if (this.w == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.v <= 0.0F) {
               this.u = dno.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dno.a l() {
      return this.u;
   }

   public erv a(doz $$0) {
      return chf.a(1.0F, $$0.c(diw.b), 0.5F * this.a(1.0F));
   }

   private void c(cyx $$0, ib $$1, doz $$2) {
      if ($$2.b() instanceof diw) {
         ih $$3 = $$2.c(diw.b);
         erv $$4 = chf.a(1.0F, $$3, this.w, this.v).a($$1);
         List<bpv> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bpv $$6 : $$5) {
               if ($$6.k_() != ekx.d) {
                  $$6.a(bqt.d, new esa(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.s.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.t = $$1;
         if ($$1 == 0) {
            this.u = dno.a.d;
         }

         if ($$1 == 1) {
            this.u = dno.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cyx $$0, ib $$1, doz $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cjt $$0) {
      if (!this.q && !$$0.N_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.n().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dts.k, this.p);
            this.o.a(null, this.p, aum.wr, aun.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cjt $$0) {
      if (!this.q && !$$0.N_()) {
         this.t--;
         this.o.a(this.p, this.n().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dts.j, this.p);
            this.o.a(null, this.p, aum.wq, aun.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wg k() {
      return wg.c("container.shulkerBox");
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.c($$0, $$1);
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bnu.a($$0, this.s, false, $$1);
      }
   }

   public void c(tm $$0, in.a $$1) {
      this.s = iu.a(this.b(), crj.i);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bnu.b($$0, this.s, $$1);
      }
   }

   @Override
   protected iu<crj> j() {
      return this.s;
   }

   @Override
   protected void a(iu<crj> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ih $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, crj $$1, @Nullable ih $$2) {
      return !(dby.a($$1.f()) instanceof diw);
   }

   @Override
   public boolean b(int $$0, crj $$1, ih $$2) {
      return true;
   }

   public float a(float $$0) {
      return axk.i($$0, this.w, this.v);
   }

   @Nullable
   public cqc t() {
      return this.x;
   }

   @Override
   protected cmp a(int $$0, cjs $$1) {
      return new coh($$0, $$1, this);
   }

   public boolean u() {
      return this.u == dno.a.a;
   }

   @Override
   public void a(jl $$0) {
      super.a($$0);
      $$0.a(jp.Q, cua.a).a(this.s);
   }

   @Override
   public void a(jl.a $$0) {
      super.a($$0);
      $$0.a(jp.Q, cua.a(this.s));
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      $$0.r("Items");
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
