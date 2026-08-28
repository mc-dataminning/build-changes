import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class drp extends drl implements brc {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jv<cuo> q = jv.a(27, cuo.l);
   private int r;
   private drp.a s = drp.a.a;
   private float t;
   private float u;
   @Nullable
   private final ctg v;

   public drp(@Nullable ctg $$0, jd $$1, dta $$2) {
      super(dqh.x, $$1, $$2);
      this.v = $$0;
   }

   public drp(jd $$0, dta $$1) {
      super(dqh.x, $$0, $$1);
      this.v = dmw.a($$1.b());
   }

   public static void a(dcu $$0, jd $$1, dta $$2, drp $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dcu $$0, jd $$1, dta $$2) {
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
               this.s = drp.a.c;
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
               this.s = drp.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public drp.a l() {
      return this.s;
   }

   public ewr a(dta $$0) {
      return ckh.a(1.0F, $$0.c(dmw.b), 0.5F * this.a(1.0F));
   }

   private void c(dcu $$0, jd $$1, dta $$2) {
      if ($$2.b() instanceof dmw) {
         ji $$3 = $$2.c(dmw.b);
         ewr $$4 = ckh.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bsq> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bsq $$6 : $$5) {
               if ($$6.j_() != epd.d) {
                  $$6.a(btq.d, new eww(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = drp.a.d;
         }

         if ($$1 == 1) {
            this.s = drp.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dcu $$0, jd $$1, dta $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, dxw.k, this.o);
            this.n.a(null, this.o, avo.wN, avp.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cmv $$0) {
      if (!this.p && !$$0.N_()) {
         this.r--;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, dxw.j, this.o);
            this.n.a(null, this.o, avo.wM, avp.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wy k() {
      return wy.c("container.shulkerBox");
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqk.a($$0, this.q, false, $$1);
      }
   }

   public void e(ua $$0, jo.a $$1) {
      this.q = jv.a(this.b(), cuo.l);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bqk.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jv<cuo> j() {
      return this.q;
   }

   @Override
   protected void a(jv<cuo> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(ji $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cuo $$1, @Nullable ji $$2) {
      return !(dfw.a($$1.g()) instanceof dmw);
   }

   @Override
   public boolean b(int $$0, cuo $$1, ji $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayn.i($$0, this.u, this.t);
   }

   @Nullable
   public ctg u() {
      return this.v;
   }

   @Override
   protected cps a(int $$0, cmu $$1) {
      return new crl($$0, $$1, this);
   }

   public boolean v() {
      return this.s == drp.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
