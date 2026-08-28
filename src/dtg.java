import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dtg extends dtc implements bsc {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jx<cvs> n = jx.a(27, cvs.k);
   private int r;
   private dtg.a s = dtg.a.a;
   private float t;
   private float u;
   @Nullable
   private final cum v;

   public dtg(@Nullable cum $$0, jf $$1, dus $$2) {
      super(drx.x, $$1, $$2);
      this.v = $$0;
   }

   public dtg(jf $$0, dus $$1) {
      super(drx.x, $$0, $$1);
      this.v = dom.a($$1.b());
   }

   public static void a(dej $$0, jf $$1, dus $$2, dtg $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dej $$0, jf $$1, dus $$2) {
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
               this.s = dtg.a.c;
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
               this.s = dtg.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dtg.a k() {
      return this.s;
   }

   public eyr a(dus $$0) {
      return clj.a(1.0F, $$0.c(dom.b), 0.5F * this.a(1.0F));
   }

   private void c(dej $$0, jf $$1, dus $$2) {
      if ($$2.b() instanceof dom) {
         jk $$3 = $$2.c(dom.b);
         eyr $$4 = clj.a(1.0F, $$3, this.u, this.t).a($$1);
         List<btr> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (btr $$6 : $$5) {
               if ($$6.k_() != eqy.d) {
                  $$6.a(bur.d, new eyw(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.n.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.r = $$1;
         if ($$1 == 0) {
            this.s = dtg.a.d;
         }

         if ($$1 == 1) {
            this.s = dtg.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dej $$0, jf $$1, dus $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cnx $$0) {
      if (!this.q && !$$0.Q_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.o.a($$0, dzp.k, this.p);
            this.o.a(null, this.p, awg.wO, awh.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cnx $$0) {
      if (!this.q && !$$0.Q_()) {
         this.r--;
         this.o.a(this.p, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.o.a($$0, dzp.j, this.p);
            this.o.a(null, this.p, awg.wN, awh.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xe j() {
      return xe.c("container.shulkerBox");
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brm.a($$0, this.n, false, $$1);
      }
   }

   public void e(ug $$0, jq.a $$1) {
      this.n = jx.a(this.b(), cvs.k);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         brm.b($$0, this.n, $$1);
      }
   }

   @Override
   protected jx<cvs> f() {
      return this.n;
   }

   @Override
   protected void a(jx<cvs> $$0) {
      this.n = $$0;
   }

   @Override
   public int[] a(jk $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cvs $$1, @Nullable jk $$2) {
      return !(dhm.a($$1.h()) instanceof dom);
   }

   @Override
   public boolean b(int $$0, cvs $$1, jk $$2) {
      return true;
   }

   public float a(float $$0) {
      return azf.h($$0, this.u, this.t);
   }

   @Nullable
   public cum t() {
      return this.v;
   }

   @Override
   protected cqz a(int $$0, cnw $$1) {
      return new cst($$0, $$1, this);
   }

   public boolean u() {
      return this.s == dtg.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
