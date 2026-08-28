import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class drr extends drn implements brd {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jv<cuq> q = jv.a(27, cuq.l);
   private int r;
   private drr.a s = drr.a.a;
   private float t;
   private float u;
   @Nullable
   private final cti v;

   public drr(@Nullable cti $$0, jd $$1, dtc $$2) {
      super(dqj.x, $$1, $$2);
      this.v = $$0;
   }

   public drr(jd $$0, dtc $$1) {
      super(dqj.x, $$0, $$1);
      this.v = dmy.a($$1.b());
   }

   public static void a(dcw $$0, jd $$1, dtc $$2, drr $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dcw $$0, jd $$1, dtc $$2) {
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
               this.s = drr.a.c;
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
               this.s = drr.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public drr.a l() {
      return this.s;
   }

   public ewv a(dtc $$0) {
      return ckj.a(1.0F, $$0.c(dmy.b), 0.5F * this.a(1.0F));
   }

   private void c(dcw $$0, jd $$1, dtc $$2) {
      if ($$2.b() instanceof dmy) {
         ji $$3 = $$2.c(dmy.b);
         ewv $$4 = ckj.a(1.0F, $$3, this.u, this.t).a($$1);
         List<bsr> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bsr $$6 : $$5) {
               if ($$6.j_() != eph.d) {
                  $$6.a(bts.d, new exa(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = drr.a.d;
         }

         if ($$1 == 1) {
            this.s = drr.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dcw $$0, jd $$1, dtc $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cmx $$0) {
      if (!this.p && !$$0.R_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, dxz.k, this.o);
            this.n.a(null, this.o, avp.wN, avq.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cmx $$0) {
      if (!this.p && !$$0.R_()) {
         this.r--;
         this.n.a(this.o, this.n().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, dxz.j, this.o);
            this.n.a(null, this.o, avp.wM, avq.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wz k() {
      return wz.c("container.shulkerBox");
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bql.a($$0, this.q, false, $$1);
      }
   }

   public void e(ub $$0, jo.a $$1) {
      this.q = jv.a(this.b(), cuq.l);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         bql.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jv<cuq> j() {
      return this.q;
   }

   @Override
   protected void a(jv<cuq> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(ji $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cuq $$1, @Nullable ji $$2) {
      return !(dfy.a($$1.g()) instanceof dmy);
   }

   @Override
   public boolean b(int $$0, cuq $$1, ji $$2) {
      return true;
   }

   public float a(float $$0) {
      return ayo.i($$0, this.u, this.t);
   }

   @Nullable
   public cti u() {
      return this.v;
   }

   @Override
   protected cpu a(int $$0, cmw $$1) {
      return new crn($$0, $$1, this);
   }

   public boolean v() {
      return this.s == drr.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
