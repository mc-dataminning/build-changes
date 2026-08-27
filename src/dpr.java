import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dpr extends dpn implements bqi {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jg<ctq> q = jg.a(27, ctq.i);
   private int r;
   private dpr.a s = dpr.a.a;
   private float t;
   private float u;
   @Nullable
   private final csj v;

   public dpr(@Nullable csj $$0, io $$1, drd $$2) {
      super(dok.x, $$1, $$2);
      this.v = $$0;
   }

   public dpr(io $$0, drd $$1) {
      super(dok.x, $$0, $$1);
      this.v = dkz.a($$1.b());
   }

   public static void a(daz $$0, io $$1, drd $$2, dpr $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(daz $$0, io $$1, drd $$2) {
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
               this.s = dpr.a.c;
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
               this.s = dpr.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dpr.a l() {
      return this.s;
   }

   public euh a(drd $$0) {
      return cjk.a(1.0F, $$0.c(dkz.b), 0.5F * this.a(1.0F));
   }

   private void c(daz $$0, io $$1, drd $$2) {
      if ($$2.b() instanceof dkz) {
         it $$3 = $$2.c(dkz.b);
         euh $$4 = cjk.a(1.0F, $$3, this.u, this.t).a($$1);
         List<brw> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (brw $$6 : $$5) {
               if ($$6.k_() != enb.d) {
                  $$6.a(bsv.d, new eum(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dpr.a.d;
         }

         if ($$1 == 1) {
            this.s = dpr.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(daz $$0, io $$1, drd $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cly $$0) {
      if (!this.p && !$$0.N_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, dvw.k, this.o);
            this.n.a(null, this.o, avi.wK, avj.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cly $$0) {
      if (!this.p && !$$0.N_()) {
         this.r--;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, dvw.j, this.o);
            this.n.a(null, this.o, avi.wJ, avj.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
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
         bpq.a($$0, this.q, false, $$1);
      }
   }

   public void e(ud $$0, iz.a $$1) {
      this.q = jg.a(this.b(), ctq.i);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bpq.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jg<ctq> j() {
      return this.q;
   }

   @Override
   protected void a(jg<ctq> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(it $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, ctq $$1, @Nullable it $$2) {
      return !(dea.a($$1.g()) instanceof dkz);
   }

   @Override
   public boolean b(int $$0, ctq $$1, it $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayf.i($$0, this.u, this.t);
   }

   @Nullable
   public csj u() {
      return this.v;
   }

   @Override
   protected cov a(int $$0, clx $$1) {
      return new cqn($$0, $$1, this);
   }

   public boolean v() {
      return this.s == dpr.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
