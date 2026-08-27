import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dhw extends dhs implements bkg {
   public static final int e = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int h = 1;
   public static final int i = 10;
   public static final float j = 0.5F;
   public static final float k = 270.0F;
   public static final String l = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private iq<cmr> s = iq.a(27, cmr.f);
   private int t;
   private dhw.a u = dhw.a.a;
   private float v;
   private float w;
   @Nullable
   private final clf x;

   public dhw(@Nullable clf $$0, hx $$1, dja $$2) {
      super(dgq.x, $$1, $$2);
      this.x = $$0;
   }

   public dhw(hx $$0, dja $$1) {
      super(dgq.x, $$0, $$1);
      this.x = ddh.a($$1.b());
   }

   public static void a(cti $$0, hx $$1, dja $$2, dhw $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cti $$0, hx $$1, dja $$2) {
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
               this.u = dhw.a.c;
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
               this.u = dhw.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dhw.a m() {
      return this.u;
   }

   public elh a(dja $$0) {
      return ccp.a($$0.c(ddh.b), 0.5F * this.a(1.0F));
   }

   private void c(cti $$0, hx $$1, dja $$2) {
      if ($$2.b() instanceof ddh) {
         ic $$3 = $$2.c(ddh.b);
         elh $$4 = ccp.a($$3, this.w, this.v).a($$1);
         List<blp> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (blp $$6 : $$5) {
               if ($$6.s_() != eep.d) {
                  $$6.a(bml.d, new elm(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dhw.a.d;
         }

         if ($$1 == 1) {
            this.u = dhw.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cti $$0, hx $$1, dja $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cfb $$0) {
      if (!this.q && !$$0.P_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.r().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dnk.k, this.p);
            this.o.a(null, this.p, arm.vQ, arn.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cfb $$0) {
      if (!this.q && !$$0.P_()) {
         this.t--;
         this.o.a(this.p, this.r().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dnk.j, this.p);
            this.o.a(null, this.p, arm.vP, arn.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected vd l() {
      return vd.c("container.shulkerBox");
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.d($$0);
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjp.a($$0, this.s, false);
      }
   }

   @Override
   public void d(sl $$0) {
      this.s = iq.a(this.b(), cmr.f);
      if (!this.c_($$0) && $$0.b("Items", 9)) {
         bjp.b($$0, this.s);
      }
   }

   @Override
   protected iq<cmr> k() {
      return this.s;
   }

   @Override
   protected void a(iq<cmr> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ic $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cmr $$1, @Nullable ic $$2) {
      return !(cwj.a($$1.d()) instanceof ddh);
   }

   @Override
   public boolean b(int $$0, cmr $$1, ic $$2) {
      return true;
   }

   public float a(float $$0) {
      return aui.i($$0, this.w, this.v);
   }

   @Nullable
   public clf w() {
      return this.x;
   }

   @Override
   protected chu a(int $$0, cfa $$1) {
      return new cjm($$0, $$1, this);
   }

   public boolean x() {
      return this.u == dhw.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
