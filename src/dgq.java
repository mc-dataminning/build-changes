import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dgq extends dgm implements bjm {
   public static final int e = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int h = 1;
   public static final int i = 10;
   public static final float j = 0.5F;
   public static final float k = 270.0F;
   public static final String l = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private ip<clo> s = ip.a(27, clo.b);
   private int t;
   private dgq.a u = dgq.a.a;
   private float v;
   private float w;
   @Nullable
   private final ckc x;

   public dgq(@Nullable ckc $$0, hx $$1, dhn $$2) {
      super(dfk.x, $$1, $$2);
      this.x = $$0;
   }

   public dgq(hx $$0, dhn $$1) {
      super(dfk.x, $$0, $$1);
      this.x = dcd.a($$1.b());
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dgq $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(csf $$0, hx $$1, dhn $$2) {
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
               this.u = dgq.a.c;
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
               this.u = dgq.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dgq.a m() {
      return this.u;
   }

   public eju a(dhn $$0) {
      return cbt.a($$0.c(dcd.b), 0.5F * this.a(1.0F));
   }

   private void c(csf $$0, hx $$1, dhn $$2) {
      if ($$2.b() instanceof dcd) {
         ib $$3 = $$2.c(dcd.b);
         eju $$4 = cbt.a($$3, this.w, this.v).a($$1);
         List<bkv> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bkv $$6 : $$5) {
               if ($$6.s_() != edc.d) {
                  $$6.a(blr.d, new ejz(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dgq.a.d;
         }

         if ($$1 == 1) {
            this.u = dgq.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(csf $$0, hx $$1, dhn $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cdz $$0) {
      if (!this.q && !$$0.P_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.r().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dlx.k, this.p);
            this.o.a(null, this.p, aqv.vv, aqw.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cdz $$0) {
      if (!this.q && !$$0.P_()) {
         this.t--;
         this.o.a(this.p, this.r().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dlx.j, this.p);
            this.o.a(null, this.p, aqv.vu, aqw.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected uv l() {
      return uv.c("container.shulkerBox");
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.d($$0);
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         biv.a($$0, this.s, false);
      }
   }

   @Override
   public void d(sd $$0) {
      this.s = ip.a(this.b(), clo.b);
      if (!this.c_($$0) && $$0.b("Items", 9)) {
         biv.b($$0, this.s);
      }
   }

   @Override
   protected ip<clo> k() {
      return this.s;
   }

   @Override
   protected void a(ip<clo> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ib $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, clo $$1, @Nullable ib $$2) {
      return !(cvf.a($$1.d()) instanceof dcd);
   }

   @Override
   public boolean b(int $$0, clo $$1, ib $$2) {
      return true;
   }

   public float a(float $$0) {
      return atq.i($$0, this.w, this.v);
   }

   @Nullable
   public ckc w() {
      return this.x;
   }

   @Override
   protected cgr a(int $$0, cdy $$1) {
      return new cij($$0, $$1, this);
   }

   public boolean x() {
      return this.u == dgq.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
