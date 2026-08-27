import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dkf extends dkb implements bmi {
   public static final int e = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int h = 1;
   public static final int i = 10;
   public static final float j = 0.5F;
   public static final float k = 270.0F;
   public static final String l = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private is<cpd> s = is.a(27, cpd.h);
   private int t;
   private dkf.a u = dkf.a.a;
   private float v;
   private float w;
   @Nullable
   private final cnr x;

   public dkf(@Nullable cnr $$0, hz $$1, dlj $$2) {
      super(diz.x, $$1, $$2);
      this.x = $$0;
   }

   public dkf(hz $$0, dlj $$1) {
      super(diz.x, $$0, $$1);
      this.x = dfq.a($$1.b());
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, dkf $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cvr $$0, hz $$1, dlj $$2) {
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
               this.u = dkf.a.c;
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
               this.u = dkf.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dkf.a m() {
      return this.u;
   }

   public enu a(dlj $$0) {
      return cex.a(1.0F, $$0.c(dfq.b), 0.5F * this.a(1.0F));
   }

   private void c(cvr $$0, hz $$1, dlj $$2) {
      if ($$2.b() instanceof dfq) {
         ie $$3 = $$2.c(dfq.b);
         enu $$4 = cex.a(1.0F, $$3, this.w, this.v).a($$1);
         List<bnq> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bnq $$6 : $$5) {
               if ($$6.s_() != ehb.d) {
                  $$6.a(bon.d, new enz(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dkf.a.d;
         }

         if ($$1 == 1) {
            this.u = dkf.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cvr $$0, hz $$1, dlj $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(chl $$0) {
      if (!this.q && !$$0.P_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.r().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dpw.k, this.p);
            this.o.a(null, this.p, atl.wg, atm.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(chl $$0) {
      if (!this.q && !$$0.P_()) {
         this.t--;
         this.o.a(this.p, this.r().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dpw.j, this.p);
            this.o.a(null, this.p, atl.wf, atm.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected vq l() {
      return vq.c("container.shulkerBox");
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.d($$0);
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         blq.a($$0, this.s, false);
      }
   }

   @Override
   public void d(sw $$0) {
      this.s = is.a(this.b(), cpd.h);
      if (!this.c_($$0) && $$0.b("Items", 9)) {
         blq.b($$0, this.s);
      }
   }

   @Override
   protected is<cpd> k() {
      return this.s;
   }

   @Override
   protected void a(is<cpd> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ie $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cpd $$1, @Nullable ie $$2) {
      return !(cys.a($$1.d()) instanceof dfq);
   }

   @Override
   public boolean b(int $$0, cpd $$1, ie $$2) {
      return true;
   }

   public float a(float $$0) {
      return awi.i($$0, this.w, this.v);
   }

   @Nullable
   public cnr w() {
      return this.x;
   }

   @Override
   protected ckf a(int $$0, chk $$1) {
      return new clx($$0, $$1, this);
   }

   public boolean x() {
      return this.u == dkf.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
