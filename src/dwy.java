import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dwy extends dwu implements bua {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private kb<cxy> q = kb.a(27, cxy.k);
   private int r;
   private dwy.a s = dwy.a.a;
   private float t;
   private float u;
   @Nullable
   private final cwv v;

   public dwy(@Nullable cwv $$0, jj $$1, dym $$2) {
      super(dvn.y, $$1, $$2);
      this.v = $$0;
   }

   public dwy(jj $$0, dym $$1) {
      super(dvn.y, $$0, $$1);
      this.v = $$1.b() instanceof drz $$2 ? $$2.b() : null;
   }

   public static void a(dhp $$0, jj $$1, dym $$2, dwy $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dhp $$0, jj $$1, dym $$2) {
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
               this.s = dwy.a.c;
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
               this.s = dwy.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dwy.a k() {
      return this.s;
   }

   public fcp a(dym $$0) {
      fcu $$1 = new fcu(0.5, 0.0, 0.5);
      return cnp.a(1.0F, $$0.c(drz.c), 0.5F * this.a(1.0F), $$1);
   }

   private void c(dhp $$0, jj $$1, dym $$2) {
      if ($$2.b() instanceof drz) {
         jo $$3 = $$2.c(drz.c);
         fcp $$4 = cnp.a(1.0F, $$3, this.u, this.t, $$1.c());
         List<bvs> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bvs $$6 : $$5) {
               if ($$6.j_() != euy.d) {
                  $$6.a(bwv.d, new fcu(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dwy.a.d;
         }

         if ($$1 == 1) {
            this.s = dwy.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dhp $$0, jj $$1, dym $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void a(jj $$0, dym $$1) {
   }

   @Override
   public void c_(cqi $$0) {
      if (!this.p && !$$0.U_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, edm.k, this.o);
            this.n.a(null, this.o, awk.xx, awl.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cqi $$0) {
      if (!this.p && !$$0.U_()) {
         this.r--;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, edm.j, this.o);
            this.n.a(null, this.o, awk.xw, awl.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wv j() {
      return wv.c("container.shulkerBox");
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btk.a($$0, this.q, false, $$1);
      }
   }

   public void e(tw $$0, ju.a $$1) {
      this.q = kb.a(this.b(), cxy.k);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         btk.b($$0, this.q, $$1);
      }
   }

   @Override
   protected kb<cxy> f() {
      return this.q;
   }

   @Override
   protected void a(kb<cxy> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(jo $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cxy $$1, @Nullable jo $$2) {
      return !(dku.a($$1.h()) instanceof drz);
   }

   @Override
   public boolean b(int $$0, cxy $$1, jo $$2) {
      return true;
   }

   public float a(float $$0) {
      return azk.h($$0, this.u, this.t);
   }

   @Nullable
   public cwv s() {
      return this.v;
   }

   @Override
   protected ctn a(int $$0, cqh $$1) {
      return new cvh($$0, $$1, this);
   }

   public boolean t() {
      return this.s == dwy.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
