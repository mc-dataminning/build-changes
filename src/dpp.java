import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dpp extends dpl implements bqg {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jg<cto> q = jg.a(27, cto.i);
   private int r;
   private dpp.a s = dpp.a.a;
   private float t;
   private float u;
   @Nullable
   private final csh v;

   public dpp(@Nullable csh $$0, io $$1, drb $$2) {
      super(doi.x, $$1, $$2);
      this.v = $$0;
   }

   public dpp(io $$0, drb $$1) {
      super(doi.x, $$0, $$1);
      this.v = dkx.a($$1.b());
   }

   public static void a(dax $$0, io $$1, drb $$2, dpp $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dax $$0, io $$1, drb $$2) {
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
               this.s = dpp.a.c;
               this.t = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case d:
            this.t -= 0.1F;
            if (this.u == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t <= 0.0F) {
               this.s = dpp.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.t = 1.0F;
      }
   }

   public dpp.a l() {
      return this.s;
   }

   public euf a(drb $$0) {
      return cji.a(1.0F, $$0.c(dkx.b), 0.5F * this.a(1.0F));
   }

   private void c(dax $$0, io $$1, drb $$2) {
      if ($$2.b() instanceof dkx) {
         it $$3 = $$2.c(dkx.b);
         euf $$4 = cji.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bru> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bru $$6 : $$5) {
               if ($$6.k_() != emz.d) {
                  $$6.a(bst.d, new euk(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dpp.a.d;
         }

         if ($$1 == 1) {
            this.s = dpp.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dax $$0, io $$1, drb $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(clw $$0) {
      if (!this.p && !$$0.N_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, dvu.k, this.o);
            this.n.a(null, this.o, avh.wK, avi.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(clw $$0) {
      if (!this.p && !$$0.N_()) {
         this.r--;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, dvu.j, this.o);
            this.n.a(null, this.o, avh.wJ, avi.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wx k() {
      return wx.c("container.shulkerBox");
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpo.a($$0, this.q, false, $$1);
      }
   }

   public void e(ud $$0, iz.a $$1) {
      this.q = jg.a(this.b(), cto.i);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bpo.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jg<cto> j() {
      return this.q;
   }

   @Override
   protected void a(jg<cto> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(it $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cto $$1, @Nullable it $$2) {
      return !(ddy.a($$1.g()) instanceof dkx);
   }

   @Override
   public boolean b(int $$0, cto $$1, it $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayd.i($$0, this.u, this.t);
   }

   @Nullable
   public csh u() {
      return this.v;
   }

   @Override
   protected cot a(int $$0, clv $$1) {
      return new cql($$0, $$1, this);
   }

   public boolean v() {
      return this.s == dpp.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
