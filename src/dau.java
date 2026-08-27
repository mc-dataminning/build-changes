import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dau extends daq implements beg {
   public static final int c = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int j = 1;
   public static final int k = 10;
   public static final float l = 0.5F;
   public static final float m = 270.0F;
   public static final String n = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private hn<cfz> s = hn.a(27, cfz.b);
   private int t;
   private dau.a u = dau.a.a;
   private float v;
   private float w;
   @Nullable
   private final cen x;

   public dau(@Nullable cen $$0, gu $$1, dcb $$2) {
      super(czp.x, $$1, $$2);
      this.x = $$0;
   }

   public dau(gu $$0, dcb $$1) {
      super(czp.x, $$0, $$1);
      this.x = cwm.a($$1.b());
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, dau $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cmm $$0, gu $$1, dcb $$2) {
      this.w = this.v;
      switch (this.u) {
         case a:
            this.v = 0.0F;
            break;
         case b:
            this.v += 0.1F;
            if (this.v >= 1.0F) {
               this.u = dau.a.c;
               this.v = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case d:
            this.v -= 0.1F;
            if (this.v <= 0.0F) {
               this.u = dau.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dau.a i() {
      return this.u;
   }

   public eed a(dcb $$0) {
      return bwi.a($$0.c(cwm.a), 0.5F * this.a(1.0F));
   }

   private void c(cmm $$0, gu $$1, dcb $$2) {
      if ($$2.b() instanceof cwm) {
         ha $$3 = $$2.c(cwm.a);
         eed $$4 = bwi.a($$3, this.w, this.v).a($$1);
         List<bfj> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               bfj $$7 = $$5.get($$6);
               if ($$7.l_() != dxj.d) {
                  $$7.a(bgf.d, new eei(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dau.a.d;
            d(this.k(), this.p, this.q());
         }

         if ($$1 == 1) {
            this.u = dau.a.b;
            d(this.k(), this.p, this.q());
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cmm $$0, gu $$1, dcb $$2) {
      $$2.a($$0, $$1, 3);
   }

   @Override
   public void d_(byo $$0) {
      if (!this.q && !$$0.G_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dgl.k, this.p);
            this.o.a(null, this.p, amh.va, ami.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(byo $$0) {
      if (!this.q && !$$0.G_()) {
         this.t--;
         this.o.a(this.p, this.q().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dgl.j, this.p);
            this.o.a(null, this.p, amh.uZ, ami.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected sw g() {
      return sw.c("container.shulkerBox");
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
         bdr.a($$0, this.s, false);
      }
   }

   public void f(qr $$0) {
      this.s = hn.a(this.b(), cfz.b);
      if (!this.d($$0) && $$0.b("Items", 9)) {
         bdr.b($$0, this.s);
      }
   }

   @Override
   protected hn<cfz> f() {
      return this.s;
   }

   @Override
   protected void a(hn<cfz> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ha $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cfz $$1, @Nullable ha $$2) {
      return !(cpn.a($$1.d()) instanceof cwm);
   }

   @Override
   public boolean b(int $$0, cfz $$1, ha $$2) {
      return true;
   }

   public float a(float $$0) {
      return apa.i($$0, this.w, this.v);
   }

   @Nullable
   public cen j() {
      return this.x;
   }

   @Override
   protected cbf a(int $$0, byn $$1) {
      return new ccu($$0, $$1, this);
   }

   public boolean v() {
      return this.u == dau.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
