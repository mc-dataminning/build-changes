import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dya extends dxw implements bui {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private jn<cys> q = jn.a(27, cys.k);
   private int r;
   private dya.a s = dya.a.a;
   private float t;
   private float u;
   @Nullable
   private final cxq v;

   public dya(@Nullable cxq $$0, iu $$1, dzo $$2) {
      super(dwp.y, $$1, $$2);
      this.v = $$0;
   }

   public dya(iu $$0, dzo $$1) {
      super(dwp.y, $$0, $$1);
      this.v = $$1.b() instanceof dsz $$2 ? $$2.b() : null;
   }

   public static void a(dip $$0, iu $$1, dzo $$2, dya $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dip $$0, iu $$1, dzo $$2) {
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
               this.s = dya.a.c;
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
               this.s = dya.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public dya.a k() {
      return this.s;
   }

   public fdr a(dzo $$0) {
      fdw $$1 = new fdw(0.5, 0.0, 0.5);
      return cnz.a(1.0F, $$0.c(dsz.c), 0.5F * this.a(1.0F), $$1);
   }

   private void c(dip $$0, iu $$1, dzo $$2) {
      if ($$2.b() instanceof dsz) {
         ja $$3 = $$2.c(dsz.c);
         fdr $$4 = cnz.a(1.0F, $$3, this.u, this.t, $$1.c());
         List<bwa> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bwa $$6 : $$5) {
               if ($$6.j_() != ewa.d) {
                  $$6.a(bxd.d, new fdw(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.s = dya.a.d;
         }

         if ($$1 == 1) {
            this.s = dya.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dip $$0, iu $$1, dzo $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void a(iu $$0, dzo $$1) {
   }

   @Override
   public void c_(cqs $$0) {
      if (!this.p && !$$0.U_()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, eeo.k, this.o);
            this.n.a(null, this.o, awl.xx, awm.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cqs $$0) {
      if (!this.p && !$$0.U_()) {
         this.r--;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, eeo.j, this.o);
            this.n.a(null, this.o, awl.xw, awm.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected ww j() {
      return ww.c("container.shulkerBox");
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.e($$0, $$1);
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bts.a($$0, this.q, false, $$1);
      }
   }

   public void e(tx $$0, jg.a $$1) {
      this.q = jn.a(this.b(), cys.k);
      if (!this.b_($$0) && $$0.b("Items", 9)) {
         bts.b($$0, this.q, $$1);
      }
   }

   @Override
   protected jn<cys> f() {
      return this.q;
   }

   @Override
   protected void a(jn<cys> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(ja $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, cys $$1, @Nullable ja $$2) {
      return !(dlu.a($$1.h()) instanceof dsz);
   }

   @Override
   public boolean b(int $$0, cys $$1, ja $$2) {
      return true;
   }

   public float a(float $$0) {
      return azk.h($$0, this.u, this.t);
   }

   @Nullable
   public cxq s() {
      return this.v;
   }

   @Override
   protected cuk a(int $$0, cqr $$1) {
      return new cwe($$0, $$1, this);
   }

   public boolean t() {
      return this.s == dya.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
