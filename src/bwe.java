import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bwe extends bfq implements bvu {
   public static final float b = 7.448451F;
   public static final int c = apa.f(24.166098F);
   private static final aby<Integer> d = acb.a(bwe.class, aca.b);
   eei e = eei.b;
   gu bS = gu.b;
   bwe.a bT = bwe.a.a;

   public bwe(bfn<? extends bwe> $$0, cmm $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new bwe.g(this);
      this.bK = new bwe.f(this);
   }

   @Override
   public boolean aP() {
      return (this.r() + this.ag) % c == 0;
   }

   @Override
   protected blt D() {
      return new bwe.d(this);
   }

   @Override
   protected void x() {
      this.bO.a(1, new bwe.c());
      this.bO.a(2, new bwe.i());
      this.bO.a(3, new bwe.e());
      this.bP.a(1, new bwe.b());
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(d, 0);
   }

   public void b(int $$0) {
      this.am.b(d, apa.a($$0, 0, 64));
   }

   private void w() {
      this.d_();
      this.a(bhg.f).a((double)(6 + this.q()));
   }

   public int q() {
      return this.am.b(d);
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(aby<?> $$0) {
      if (d.equals($$0)) {
         this.w();
      }

      super.a($$0);
   }

   public int r() {
      return this.af() * 3;
   }

   @Override
   protected boolean U() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dI().B) {
         float $$0 = apa.b((float)(this.r() + this.ag) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = apa.b((float)(this.r() + this.ag + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dI().a(this.dn(), this.dp(), this.dt(), amh.rL, this.cY(), 0.95F + this.af.i() * 0.05F, 0.95F + this.af.i() * 0.05F, false);
         }

         int $$2 = this.q();
         float $$3 = apa.b(this.dy() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = apa.a(this.dy() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dI().a(iv.U, this.dn() + (double)$$3, this.dp() + (double)$$5, this.dt() + (double)$$4, 0.0, 0.0, 0.0);
         this.dI().a(iv.U, this.dn() - (double)$$3, this.dp() + (double)$$5, this.dt() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void b_() {
      if (this.bs() && this.fT()) {
         this.g(8);
      }

      super.b_();
   }

   @Override
   protected void W() {
      super.W();
   }

   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      this.bS = this.di().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new gu($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("AX", this.bS.u());
      $$0.a("AY", this.bS.v());
      $$0.a("AZ", this.bS.w());
      $$0.a("Size", this.q());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public ami cY() {
      return ami.f;
   }

   @Override
   protected amg s() {
      return amh.rI;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.rM;
   }

   @Override
   protected amg g_() {
      return amh.rK;
   }

   @Override
   public bge eN() {
      return bge.b;
   }

   @Override
   protected float eR() {
      return 1.0F;
   }

   @Override
   public boolean a(bfn<?> $$0) {
      return true;
   }

   @Override
   public bfk a(bgl $$0) {
      int $$1 = this.q();
      bfk $$2 = super.a($$0);
      float $$3 = ($$2.a + 0.2F * (float)$$1) / $$2.a;
      return $$2.a($$3);
   }

   @Override
   public double bx() {
      return (double)this.cF();
   }

   static enum a {
      a,
      b;
   }

   class b extends bmv {
      private final bqm b = bqm.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<byo> $$0 = bwe.this.dI().a(this.b, bwe.this, bwe.this.cE().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bfj::dp).reversed());

               for (byo $$1 : $$0) {
                  if (bwe.this.a($$1, bqm.a)) {
                     bwe.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bfz $$0 = bwe.this.j();
         return $$0 != null ? bwe.this.a($$0, bqm.a) : false;
      }
   }

   class c extends bmv {
      private int b;

      @Override
      public boolean a() {
         bfz $$0 = bwe.this.j();
         return $$0 != null ? bwe.this.a($$0, bqm.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         bwe.this.bT = bwe.a.a;
         this.h();
      }

      @Override
      public void d() {
         bwe.this.bS = bwe.this.dI().a(dhk.a.e, bwe.this.bS).b(10 + bwe.this.af.a(20));
      }

      @Override
      public void e() {
         if (bwe.this.bT == bwe.a.a) {
            this.b--;
            if (this.b <= 0) {
               bwe.this.bT = bwe.a.b;
               this.h();
               this.b = this.a((8 + bwe.this.af.a(4)) * 20);
               bwe.this.a(amh.rN, 10.0F, 0.95F + bwe.this.af.i() * 0.1F);
            }
         }
      }

      private void h() {
         bwe.this.bS = bwe.this.j().di().b(20 + bwe.this.af.a(20));
         if (bwe.this.bS.v() < bwe.this.dI().t_()) {
            bwe.this.bS = new gu(bwe.this.bS.u(), bwe.this.dI().t_() + 1, bwe.this.bS.w());
         }
      }
   }

   class d extends blt {
      public d(bgb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         bwe.this.aX = bwe.this.aV;
         bwe.this.aV = bwe.this.dy();
      }
   }

   class e extends bwe.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return bwe.this.j() == null || bwe.this.bT == bwe.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + bwe.this.af.i() * 10.0F;
         this.e = -4.0F + bwe.this.af.i() * 9.0F;
         this.f = bwe.this.af.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (bwe.this.af.a(this.a(350)) == 0) {
            this.e = -4.0F + bwe.this.af.i() * 9.0F;
         }

         if (bwe.this.af.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (bwe.this.af.a(this.a(450)) == 0) {
            this.c = bwe.this.af.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (bwe.this.e.d < bwe.this.dp() && !bwe.this.dI().t(bwe.this.di().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (bwe.this.e.d > bwe.this.dp() && !bwe.this.dI().t(bwe.this.di().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (gu.b.equals(bwe.this.bS)) {
            bwe.this.bS = bwe.this.di();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         bwe.this.e = eei.a(bwe.this.bS).b((double)(this.d * apa.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * apa.a(this.c)));
      }
   }

   class f extends blx {
      public f(bgb $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bly {
      private float m = 0.1F;

      public g(bgb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (bwe.this.O) {
            bwe.this.a_(bwe.this.dy() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = bwe.this.e.c - bwe.this.dn();
         double $$1 = bwe.this.e.d - bwe.this.dp();
         double $$2 = bwe.this.e.e - bwe.this.dt();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = bwe.this.dy();
            float $$7 = (float)apa.d($$2, $$0);
            float $$8 = apa.g(bwe.this.dy() + 90.0F);
            float $$9 = apa.g($$7 * (180.0F / (float)Math.PI));
            bwe.this.a_(apa.e($$8, $$9, 4.0F) - 90.0F);
            bwe.this.aV = bwe.this.dy();
            if (apa.d($$6, bwe.this.dy()) < 3.0F) {
               this.m = apa.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = apa.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(apa.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            bwe.this.b_($$10);
            float $$11 = bwe.this.dy() + 90.0F;
            double $$12 = (double)(this.m * apa.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * apa.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * apa.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            eei $$15 = bwe.this.dl();
            bwe.this.f($$15.e(new eei($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bmv {
      public h() {
         this.a(EnumSet.of(bmv.a.a));
      }

      protected boolean h() {
         return bwe.this.e.c(bwe.this.dn(), bwe.this.dp(), bwe.this.dt()) < 4.0;
      }
   }

   class i extends bwe.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return bwe.this.j() != null && bwe.this.bT == bwe.a.b;
      }

      @Override
      public boolean b() {
         bfz $$0 = bwe.this.j();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bs()) {
            return false;
         } else {
            if ($$0 instanceof byo $$1 && ($$0.G_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (bwe.this.ag > this.e) {
                  this.e = bwe.this.ag + 20;
                  List<bro> $$2 = bwe.this.dI().a(bro.class, bwe.this.cE().g(16.0), bfm.a);

                  for (bro $$3 : $$2) {
                     $$3.gj();
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
         bwe.this.h(null);
         bwe.this.bT = bwe.a.a;
      }

      @Override
      public void e() {
         bfz $$0 = bwe.this.j();
         if ($$0 != null) {
            bwe.this.e = new eei($$0.dn(), $$0.e(0.5), $$0.dt());
            if (bwe.this.cE().g(0.2F).c($$0.cE())) {
               bwe.this.z($$0);
               bwe.this.bT = bwe.a.a;
               if (!bwe.this.aQ()) {
                  bwe.this.dI().c(1039, bwe.this.di(), 0);
               }
            } else if (bwe.this.O || bwe.this.aL > 0) {
               bwe.this.bT = bwe.a.a;
            }
         }
      }
   }
}
