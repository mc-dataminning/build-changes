import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dhl extends dhh implements bjw {
   public static final int e = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int h = 1;
   public static final int i = 10;
   public static final float j = 0.5F;
   public static final float k = 270.0F;
   public static final String l = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private io<cmh> s = io.a(27, cmh.f);
   private int t;
   private dhl.a u = dhl.a.a;
   private float v;
   private float w;
   @Nullable
   private final ckv x;

   public dhl(@Nullable ckv $$0, hv $$1, dip $$2) {
      super(dgf.x, $$1, $$2);
      this.x = $$0;
   }

   public dhl(hv $$0, dip $$1) {
      super(dgf.x, $$0, $$1);
      this.x = dcx.a($$1.b());
   }

   public static void a(csy $$0, hv $$1, dip $$2, dhl $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(csy $$0, hv $$1, dip $$2) {
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
               this.u = dhl.a.c;
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
               this.u = dhl.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dhl.a m() {
      return this.u;
   }

   public ekw a(dip $$0) {
      return ccf.a($$0.c(dcx.b), 0.5F * this.a(1.0F));
   }

   private void c(csy $$0, hv $$1, dip $$2) {
      if ($$2.b() instanceof dcx) {
         ia $$3 = $$2.c(dcx.b);
         ekw $$4 = ccf.a($$3, this.w, this.v).a($$1);
         List<blf> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (blf $$6 : $$5) {
               if ($$6.s_() != eee.d) {
                  $$6.a(bmb.d, new elb(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dhl.a.d;
         }

         if ($$1 == 1) {
            this.u = dhl.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(csy $$0, hv $$1, dip $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cer $$0) {
      if (!this.q && !$$0.P_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.r().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dmz.k, this.p);
            this.o.a(null, this.p, arc.vQ, ard.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cer $$0) {
      if (!this.q && !$$0.P_()) {
         this.t--;
         this.o.a(this.p, this.r().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dmz.j, this.p);
            this.o.a(null, this.p, arc.vP, ard.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected vb l() {
      return vb.c("container.shulkerBox");
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.d($$0);
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjf.a($$0, this.s, false);
      }
   }

   @Override
   public void d(sj $$0) {
      this.s = io.a(this.b(), cmh.f);
      if (!this.c_($$0) && $$0.b("Items", 9)) {
         bjf.b($$0, this.s);
      }
   }

   @Override
   protected io<cmh> k() {
      return this.s;
   }

   @Override
   protected void a(io<cmh> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ia $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cmh $$1, @Nullable ia $$2) {
      return !(cvz.a($$1.d()) instanceof dcx);
   }

   @Override
   public boolean b(int $$0, cmh $$1, ia $$2) {
      return true;
   }

   public float a(float $$0) {
      return aty.i($$0, this.w, this.v);
   }

   @Nullable
   public ckv w() {
      return this.x;
   }

   @Override
   protected chk a(int $$0, ceq $$1) {
      return new cjc($$0, $$1, this);
   }

   public boolean x() {
      return this.u == dhl.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
