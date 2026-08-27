import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dds extends ddo implements bgz {
   public static final int c = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int j = 1;
   public static final int k = 10;
   public static final float l = 0.5F;
   public static final float m = 270.0F;
   public static final String n = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private hn<cix> s = hn.a(27, cix.b);
   private int t;
   private dds.a u = dds.a.a;
   private float v;
   private float w;
   @Nullable
   private final chl x;

   public dds(@Nullable chl $$0, gu $$1, dez $$2) {
      super(dcn.x, $$1, $$2);
      this.x = $$0;
   }

   public dds(gu $$0, dez $$1) {
      super(dcn.x, $$0, $$1);
      this.x = czk.a($$1.b());
   }

   public static void a(cpl $$0, gu $$1, dez $$2, dds $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cpl $$0, gu $$1, dez $$2) {
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
               this.u = dds.a.c;
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
               this.u = dds.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dds.a i() {
      return this.u;
   }

   public egy a(dez $$0) {
      return bzg.a($$0.c(czk.a), 0.5F * this.a(1.0F));
   }

   private void c(cpl $$0, gu $$1, dez $$2) {
      if ($$2.b() instanceof czk) {
         ha $$3 = $$2.c(czk.a);
         egy $$4 = bzg.a($$3, this.w, this.v).a($$1);
         List<bii> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bii $$6 : $$5) {
               if ($$6.l_() != eah.d) {
                  $$6.a(bje.d, new ehd(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dds.a.d;
         }

         if ($$1 == 1) {
            this.u = dds.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cpl $$0, gu $$1, dez $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cbm $$0) {
      if (!this.q && !$$0.G_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, djj.k, this.p);
            this.o.a(null, this.p, aow.va, aox.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cbm $$0) {
      if (!this.q && !$$0.G_()) {
         this.t--;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, djj.j, this.p);
            this.o.a(null, this.p, aow.uZ, aox.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected tf g() {
      return tf.c("container.shulkerBox");
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.f($$0);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgk.a($$0, this.s, false);
      }
   }

   public void f(qr $$0) {
      this.s = hn.a(this.b(), cix.b);
      if (!this.d($$0) && $$0.b("Items", 9)) {
         bgk.b($$0, this.s);
      }
   }

   @Override
   protected hn<cix> f() {
      return this.s;
   }

   @Override
   protected void a(hn<cix> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ha $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cix $$1, @Nullable ha $$2) {
      return !(csl.a($$1.d()) instanceof czk);
   }

   @Override
   public boolean b(int $$0, cix $$1, ha $$2) {
      return true;
   }

   public float a(float $$0) {
      return arp.i($$0, this.w, this.v);
   }

   @Nullable
   public chl j() {
      return this.x;
   }

   @Override
   protected ced a(int $$0, cbl $$1) {
      return new cfs($$0, $$1, this);
   }

   public boolean v() {
      return this.u == dds.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
