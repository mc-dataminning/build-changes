import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cht extends bqv implements chj {
   public static final float b = 7.448451F;
   public static final int c = axw.f(24.166098F);
   private static final ajk<Integer> d = ajo.a(cht.class, ajm.b);
   etf e = etf.b;
   im bX = im.c;
   cht.a bY = cht.a.a;

   public cht(bqr<? extends cht> $$0, czu $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cht.g(this);
      this.bO = new cht.f(this);
   }

   @Override
   public boolean aT() {
      return (this.u() + this.ai) % c == 0;
   }

   @Override
   protected bwz E() {
      return new cht.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cht.c());
      this.bS.a(2, new cht.i());
      this.bS.a(3, new cht.e());
      this.bT.a(1, new cht.b());
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, axw.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.f(bsl.c).a((double)(6 + this.r()));
   }

   public int r() {
      return this.ao.a(d);
   }

   @Override
   public void a(ajk<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int u() {
      return this.aj() * 3;
   }

   @Override
   protected boolean W() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B) {
         float $$0 = axw.b((float)(this.u() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = axw.b((float)(this.u() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dN().a(this.ds(), this.du(), this.dy(), auz.ti, this.dc(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dh() * 1.48F;
         float $$3 = axw.b(this.dD() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = axw.a(this.dD() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.di() * 2.5F;
         this.dN().a(kw.W, this.ds() + (double)$$3, this.du() + (double)$$5, this.dy() + (double)$$4, 0.0, 0.0, 0.0);
         this.dN().a(kw.W, this.ds() - (double)$$3, this.du() + (double)$$5, this.dy() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void n_() {
      if (this.bB() && this.gj()) {
         this.g(8);
      }

      super.n_();
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      this.bX = this.dn().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bX = new im($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("AX", this.bX.u());
      $$0.a("AY", this.bX.v());
      $$0.a("AZ", this.bX.w());
      $$0.a("Size", this.r());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public ava dc() {
      return ava.f;
   }

   @Override
   protected auy v() {
      return auz.tf;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.tj;
   }

   @Override
   protected auy o_() {
      return auz.th;
   }

   @Override
   protected float fc() {
      return 1.0F;
   }

   @Override
   public boolean a(bqr<?> $$0) {
      return true;
   }

   @Override
   public bqo e(brp $$0) {
      int $$1 = this.r();
      bqo $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends byb {
      private final cbu b = cbu.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<ckl> $$0 = cht.this.dN().a(this.b, cht.this, cht.this.cI().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bql::du).reversed());

               for (ckl $$1 : $$0) {
                  if (cht.this.a($$1, cbu.a)) {
                     cht.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bre $$0 = cht.this.p();
         return $$0 != null ? cht.this.a($$0, cbu.a) : false;
      }
   }

   class c extends byb {
      private int b;

      @Override
      public boolean a() {
         bre $$0 = cht.this.p();
         return $$0 != null ? cht.this.a($$0, cbu.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cht.this.bY = cht.a.a;
         this.h();
      }

      @Override
      public void d() {
         cht.this.bX = cht.this.dN().a(dvq.a.e, cht.this.bX).b(10 + cht.this.ah.a(20));
      }

      @Override
      public void e() {
         if (cht.this.bY == cht.a.a) {
            this.b--;
            if (this.b <= 0) {
               cht.this.bY = cht.a.b;
               this.h();
               this.b = this.a((8 + cht.this.ah.a(4)) * 20);
               cht.this.a(auz.tk, 10.0F, 0.95F + cht.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         cht.this.bX = cht.this.p().dn().b(20 + cht.this.ah.a(20));
         if (cht.this.bX.v() < cht.this.dN().z_()) {
            cht.this.bX = new im(cht.this.bX.u(), cht.this.dN().z_() + 1, cht.this.bX.w());
         }
      }
   }

   class d extends bwz {
      public d(brg $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cht.this.bb = cht.this.aZ;
         cht.this.aZ = cht.this.dD();
      }
   }

   class e extends cht.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cht.this.p() == null || cht.this.bY == cht.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cht.this.ah.i() * 10.0F;
         this.e = -4.0F + cht.this.ah.i() * 9.0F;
         this.f = cht.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cht.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + cht.this.ah.i() * 9.0F;
         }

         if (cht.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cht.this.ah.a(this.a(450)) == 0) {
            this.c = cht.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cht.this.e.d < cht.this.du() && !cht.this.dN().u(cht.this.dn().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cht.this.e.d > cht.this.du() && !cht.this.dN().u(cht.this.dn().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (im.c.equals(cht.this.bX)) {
            cht.this.bX = cht.this.dn();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cht.this.e = etf.a(cht.this.bX).b((double)(this.d * axw.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * axw.a(this.c)));
      }
   }

   class f extends bxd {
      public f(brg $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bxe {
      private float m = 0.1F;

      public g(brg $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cht.this.Q) {
            cht.this.r(cht.this.dD() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cht.this.e.c - cht.this.ds();
         double $$1 = cht.this.e.d - cht.this.du();
         double $$2 = cht.this.e.e - cht.this.dy();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cht.this.dD();
            float $$7 = (float)axw.d($$2, $$0);
            float $$8 = axw.g(cht.this.dD() + 90.0F);
            float $$9 = axw.g($$7 * (180.0F / (float)Math.PI));
            cht.this.r(axw.e($$8, $$9, 4.0F) - 90.0F);
            cht.this.aZ = cht.this.dD();
            if (axw.d($$6, cht.this.dD()) < 3.0F) {
               this.m = axw.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = axw.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(axw.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cht.this.s($$10);
            float $$11 = cht.this.dD() + 90.0F;
            double $$12 = (double)(this.m * axw.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * axw.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * axw.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            etf $$15 = cht.this.dq();
            cht.this.g($$15.e(new etf($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends byb {
      public h() {
         this.a(EnumSet.of(byb.a.a));
      }

      protected boolean h() {
         return cht.this.e.c(cht.this.ds(), cht.this.du(), cht.this.dy()) < 4.0;
      }
   }

   class i extends cht.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cht.this.p() != null && cht.this.bY == cht.a.b;
      }

      @Override
      public boolean b() {
         bre $$0 = cht.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bB()) {
            return false;
         } else {
            if ($$0 instanceof ckl $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cht.this.ai > this.e) {
                  this.e = cht.this.ai + 20;
                  List<ccw> $$2 = cht.this.dN().a(ccw.class, cht.this.cI().g(16.0), bqq.a);

                  for (ccw $$3 : $$2) {
                     $$3.gz();
                  }

                  this.d = !$$2.isEmpty();
               }

               return !this.d;
            }
         }
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
         cht.this.h(null);
         cht.this.bY = cht.a.a;
      }

      @Override
      public void e() {
         bre $$0 = cht.this.p();
         if ($$0 != null) {
            cht.this.e = new etf($$0.ds(), $$0.e(0.5), $$0.dy());
            if (cht.this.cI().g(0.2F).c($$0.cI())) {
               cht.this.C($$0);
               cht.this.bY = cht.a.a;
               if (!cht.this.aU()) {
                  cht.this.dN().c(1039, cht.this.dn(), 0);
               }
            } else if (cht.this.Q || cht.this.aP > 0) {
               cht.this.bY = cht.a.a;
            }
         }
      }
   }
}
