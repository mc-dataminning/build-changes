import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dom extends doi implements bpc {
   public static final int e = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int h = 1;
   public static final int i = 10;
   public static final float j = 0.5F;
   public static final float k = 270.0F;
   private static final int[] l = IntStream.range(0, 27).toArray();
   private je<csd> r = je.a(27, csd.i);
   private int s;
   private dom.a t = dom.a.a;
   private float u;
   private float v;
   @Nullable
   private final cqw w;

   public dom(@Nullable cqw $$0, im $$1, dpy $$2) {
      super(dnf.x, $$1, $$2);
      this.w = $$0;
   }

   public dom(im $$0, dpy $$1) {
      super(dnf.x, $$0, $$1);
      this.w = dju.a($$1.b());
   }

   public static void a(czu $$0, im $$1, dpy $$2, dom $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(czu $$0, im $$1, dpy $$2) {
      this.v = this.u;
      switch (this.t) {
         case a:
            this.u = 0.0F;
            break;
         case b:
            this.u += 0.1F;
            if (this.v == 0.0F) {
               d($$0, $$1, $$2);
            }

            if (this.u >= 1.0F) {
               this.t = dom.a.c;
               this.u = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case d:
            this.u -= 0.1F;
            if (this.v == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.u <= 0.0F) {
               this.t = dom.a.a;
               this.u = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.u = 1.0F;
      }
   }

   public dom.a l() {
      return this.t;
   }

   public eta a(dpy $$0) {
      return chx.a(1.0F, $$0.c(dju.b), 0.5F * this.a(1.0F));
   }

   private void c(czu $$0, im $$1, dpy $$2) {
      if ($$2.b() instanceof dju) {
         ir $$3 = $$2.c(dju.b);
         eta $$4 = chx.a(1.0F, $$3, this.v, this.u).a($$1);
         List<bql> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bql $$6 : $$5) {
               if ($$6.k_() != elw.d) {
                  $$6.a(brj.d, new etf(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.r.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.s = $$1;
         if ($$1 == 0) {
            this.t = dom.a.d;
         }

         if ($$1 == 1) {
            this.t = dom.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(czu $$0, im $$1, dpy $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(ckl $$0) {
      if (!this.q && !$$0.N_()) {
         if (this.s < 0) {
            this.s = 0;
         }

         this.s++;
         this.o.a(this.p, this.n().b(), 1, this.s);
         if (this.s == 1) {
            this.o.a($$0, dur.k, this.p);
            this.o.a(null, this.p, auz.wy, ava.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(ckl $$0) {
      if (!this.q && !$$0.N_()) {
         this.s--;
         this.o.a(this.p, this.n().b(), 1, this.s);
         if (this.s <= 0) {
            this.o.a($$0, dur.j, this.p);
            this.o.a(null, this.p, auz.wx, ava.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected ws k() {
      return ws.c("container.shulkerBox");
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.c($$0, $$1);
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bok.a($$0, this.r, false, $$1);
      }
   }

   public void c(ty $$0, ix.a $$1) {
      this.r = je.a(this.b(), csd.i);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bok.b($$0, this.r, $$1);
      }
   }

   @Override
   protected je<csd> j() {
      return this.r;
   }

   @Override
   protected void a(je<csd> $$0) {
      this.r = $$0;
   }

   @Override
   public int[] a(ir $$0) {
      return l;
   }

   @Override
   public boolean a(int $$0, csd $$1, @Nullable ir $$2) {
      return !(dcv.a($$1.f()) instanceof dju);
   }

   @Override
   public boolean b(int $$0, csd $$1, ir $$2) {
      return true;
   }

   public float a(float $$0) {
      return axw.i($$0, this.v, this.u);
   }

   @Nullable
   public cqw t() {
      return this.w;
   }

   @Override
   protected cnh a(int $$0, ckk $$1) {
      return new cpa($$0, $$1, this);
   }

   public boolean u() {
      return this.t == dom.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
