import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dlq extends dlm implements bnp {
   public static final int e = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int h = 1;
   public static final int i = 10;
   public static final float j = 0.5F;
   public static final float k = 270.0F;
   public static final String l = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private iu<cqm> s = iu.a(27, cqm.h);
   private int t;
   private dlq.a u = dlq.a.a;
   private float v;
   private float w;
   @Nullable
   private final cpd x;

   public dlq(@Nullable cpd $$0, ib $$1, dnb $$2) {
      super(dkk.x, $$1, $$2);
      this.x = $$0;
   }

   public dlq(ib $$0, dnb $$1) {
      super(dkk.x, $$0, $$1);
      this.x = dha.a($$1.b());
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, dlq $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cxb $$0, ib $$1, dnb $$2) {
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
               this.u = dlq.a.c;
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
               this.u = dlq.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dlq.a l() {
      return this.u;
   }

   public epo a(dnb $$0) {
      return cgg.a(1.0F, $$0.c(dha.b), 0.5F * this.a(1.0F));
   }

   private void c(cxb $$0, ib $$1, dnb $$2) {
      if ($$2.b() instanceof dha) {
         ih $$3 = $$2.c(dha.b);
         epo $$4 = cgg.a(1.0F, $$3, this.w, this.v).a($$1);
         List<box> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (box $$6 : $$5) {
               if ($$6.r_() != eiu.d) {
                  $$6.a(bpu.d, new ept(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dlq.a.d;
         }

         if ($$1 == 1) {
            this.u = dlq.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cxb $$0, ib $$1, dnb $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(ciu $$0) {
      if (!this.q && !$$0.N_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.n().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, drp.k, this.p);
            this.o.a(null, this.p, aty.wo, atz.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(ciu $$0) {
      if (!this.q && !$$0.N_()) {
         this.t--;
         this.o.a(this.p, this.n().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, drp.j, this.p);
            this.o.a(null, this.p, aty.wn, atz.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected vu k() {
      return vu.c("container.shulkerBox");
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.c($$0);
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmx.a($$0, this.s, false);
      }
   }

   @Override
   public void c(ta $$0) {
      this.s = iu.a(this.b(), cqm.h);
      if (!this.c_($$0) && $$0.b("Items", 9)) {
         bmx.b($$0, this.s);
      }
   }

   @Override
   protected iu<cqm> j() {
      return this.s;
   }

   @Override
   protected void a(iu<cqm> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ih $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cqm $$1, @Nullable ih $$2) {
      return !(dac.a($$1.d()) instanceof dha);
   }

   @Override
   public boolean b(int $$0, cqm $$1, ih $$2) {
      return true;
   }

   public float a(float $$0) {
      return aww.i($$0, this.w, this.v);
   }

   @Nullable
   public cpd s() {
      return this.x;
   }

   @Override
   protected clq a(int $$0, cit $$1) {
      return new cni($$0, $$1, this);
   }

   public boolean t() {
      return this.u == dlq.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
