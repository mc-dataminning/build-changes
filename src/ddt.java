import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ddt extends ddp implements bgz {
   public static final int c = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int j = 1;
   public static final int k = 10;
   public static final float l = 0.5F;
   public static final float m = 270.0F;
   public static final String n = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private hn<ciy> s = hn.a(27, ciy.b);
   private int t;
   private ddt.a u = ddt.a.a;
   private float v;
   private float w;
   @Nullable
   private final chm x;

   public ddt(@Nullable chm $$0, gu $$1, dfa $$2) {
      super(dco.x, $$1, $$2);
      this.x = $$0;
   }

   public ddt(gu $$0, dfa $$1) {
      super(dco.x, $$0, $$1);
      this.x = czl.a($$1.b());
   }

   public static void a(cpm $$0, gu $$1, dfa $$2, ddt $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cpm $$0, gu $$1, dfa $$2) {
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
               this.u = ddt.a.c;
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
               this.u = ddt.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public ddt.a i() {
      return this.u;
   }

   public egz a(dfa $$0) {
      return bzh.a($$0.c(czl.a), 0.5F * this.a(1.0F));
   }

   private void c(cpm $$0, gu $$1, dfa $$2) {
      if ($$2.b() instanceof czl) {
         ha $$3 = $$2.c(czl.a);
         egz $$4 = bzh.a($$3, this.w, this.v).a($$1);
         List<bii> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bii $$6 : $$5) {
               if ($$6.l_() != eai.d) {
                  $$6.a(bje.d, new ehe(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = ddt.a.d;
         }

         if ($$1 == 1) {
            this.u = ddt.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cpm $$0, gu $$1, dfa $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cbn $$0) {
      if (!this.q && !$$0.G_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, djk.k, this.p);
            this.o.a(null, this.p, aow.va, aox.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cbn $$0) {
      if (!this.q && !$$0.G_()) {
         this.t--;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, djk.j, this.p);
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
      this.s = hn.a(this.b(), ciy.b);
      if (!this.d($$0) && $$0.b("Items", 9)) {
         bgk.b($$0, this.s);
      }
   }

   @Override
   protected hn<ciy> f() {
      return this.s;
   }

   @Override
   protected void a(hn<ciy> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ha $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, ciy $$1, @Nullable ha $$2) {
      return !(csm.a($$1.d()) instanceof czl);
   }

   @Override
   public boolean b(int $$0, ciy $$1, ha $$2) {
      return true;
   }

   public float a(float $$0) {
      return arp.i($$0, this.w, this.v);
   }

   @Nullable
   public chm j() {
      return this.x;
   }

   @Override
   protected cee a(int $$0, cbm $$1) {
      return new cft($$0, $$1, this);
   }

   public boolean v() {
      return this.u == ddt.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
