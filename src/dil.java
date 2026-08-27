import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dil extends dih implements bko {
   public static final int e = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int h = 1;
   public static final int i = 10;
   public static final float j = 0.5F;
   public static final float k = 270.0F;
   public static final String l = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private iq<cng> s = iq.a(27, cng.f);
   private int t;
   private dil.a u = dil.a.a;
   private float v;
   private float w;
   @Nullable
   private final clv x;

   public dil(@Nullable clv $$0, hx $$1, djp $$2) {
      super(dhf.x, $$1, $$2);
      this.x = $$0;
   }

   public dil(hx $$0, djp $$1) {
      super(dhf.x, $$0, $$1);
      this.x = ddw.a($$1.b());
   }

   public static void a(ctx $$0, hx $$1, djp $$2, dil $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(ctx $$0, hx $$1, djp $$2) {
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
               this.u = dil.a.c;
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
               this.u = dil.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dil.a m() {
      return this.u;
   }

   public elx a(djp $$0) {
      return cdc.a($$0.c(ddw.b), 0.5F * this.a(1.0F));
   }

   private void c(ctx $$0, hx $$1, djp $$2) {
      if ($$2.b() instanceof ddw) {
         ic $$3 = $$2.c(ddw.b);
         elx $$4 = cdc.a($$3, this.w, this.v).a($$1);
         List<blw> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (blw $$6 : $$5) {
               if ($$6.s_() != efe.d) {
                  $$6.a(bmu.d, new emc(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dil.a.d;
         }

         if ($$1 == 1) {
            this.u = dil.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(ctx $$0, hx $$1, djp $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cfq $$0) {
      if (!this.q && !$$0.P_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.r().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dnz.k, this.p);
            this.o.a(null, this.p, art.wf, aru.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cfq $$0) {
      if (!this.q && !$$0.P_()) {
         this.t--;
         this.o.a(this.p, this.r().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dnz.j, this.p);
            this.o.a(null, this.p, art.we, aru.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected vg l() {
      return vg.c("container.shulkerBox");
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.d($$0);
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjw.a($$0, this.s, false);
      }
   }

   @Override
   public void d(so $$0) {
      this.s = iq.a(this.b(), cng.f);
      if (!this.c_($$0) && $$0.b("Items", 9)) {
         bjw.b($$0, this.s);
      }
   }

   @Override
   protected iq<cng> k() {
      return this.s;
   }

   @Override
   protected void a(iq<cng> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ic $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cng $$1, @Nullable ic $$2) {
      return !(cwy.a($$1.d()) instanceof ddw);
   }

   @Override
   public boolean b(int $$0, cng $$1, ic $$2) {
      return true;
   }

   public float a(float $$0) {
      return aup.i($$0, this.w, this.v);
   }

   @Nullable
   public clv w() {
      return this.x;
   }

   @Override
   protected cij a(int $$0, cfp $$1) {
      return new ckb($$0, $$1, this);
   }

   public boolean x() {
      return this.u == dil.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
