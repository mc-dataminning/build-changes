import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceo extends cfi {
   private static final ajs<io> d = ajw.a(ceo.class, aju.o);
   private static final ajs<Boolean> e = ajw.a(ceo.class, aju.k);
   private static final ajs<Integer> bY = ajw.a(ceo.class, aju.b);
   static final cdh bZ = cdh.b().a(10.0).d();
   public static final int b = 4800;
   private static final int ca = 2400;
   public static final Predicate<cii> c = $$0 -> !$$0.y() && $$0.bD() && $$0.be();

   public ceo(bsc<? extends ceo> $$0, daz $$1) {
      super($$0, $$1);
      this.bP = new byt(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bys(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      this.k(this.ck());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(io $$0) {
      this.ao.a(d, $$0);
   }

   public io s() {
      return this.ao.a(d);
   }

   public boolean u() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   public int y() {
      return this.ao.a(bY);
   }

   public void c(int $$0) {
      this.ao.a(bY, $$0);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(d, io.c);
      $$0.a(e, false);
      $$0.a(bY, 2400);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.s().u());
      $$0.a("TreasurePosY", this.s().v());
      $$0.a("TreasurePosZ", this.s().w());
      $$0.a("GotFish", this.u());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(ud $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new io($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bS.a(0, new byz(this));
      this.bS.a(0, new cay(this));
      this.bS.a(1, new ceo.a(this));
      this.bS.a(2, new ceo.b(this, 4.0));
      this.bS.a(4, new cam(this, 1.0, 10));
      this.bS.a(4, new caj(this));
      this.bS.a(5, new bzw(this, cly.class, 6.0F));
      this.bS.a(5, new bze(this, 10));
      this.bS.a(6, new bzy(this, 1.2F, true));
      this.bS.a(8, new ceo.c());
      this.bS.a(8, new bzj(this));
      this.bS.a(9, new byv<>(this, cja.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cbg(this, cja.class).a());
   }

   public static btx.a gp() {
      return bss.A().a(bty.q, 10.0).a(bty.r, 1.2F).a(bty.c, 3.0);
   }

   @Override
   protected ccc b(daz $$0) {
      return new cce(this, $$0);
   }

   @Override
   public boolean C(brw $$0) {
      boolean $$1 = $$0.a(this.dQ().b((bsq)this), (float)((int)this.g(bty.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avi.gX, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int ck() {
      return 4800;
   }

   @Override
   protected int o(int $$0) {
      return this.ck();
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   protected boolean o(brw $$0) {
      return true;
   }

   @Override
   public boolean f(ctq $$0) {
      bsd $$1 = bss.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsd.a && super.f($$0);
   }

   @Override
   protected void b(cii $$0) {
      if (this.a(bsd.a).e()) {
         ctq $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bsd.a, $$1);
            this.f(bsd.a);
            this.a($$0, $$1.I());
            $$0.ao();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gf()) {
         this.k(this.ck());
      } else {
         if (this.bg()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dQ().r(), 1.0F);
            }

            if (this.aE()) {
               this.g(this.ds().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ah.i() * 360.0F);
               this.d(false);
               this.av = true;
            }
         }

         if (this.dP().B && this.be() && this.ds().g() > 0.03) {
            eum $$0 = this.f(0.0F);
            float $$1 = ayf.b(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ayf.a(this.dF() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ah.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dP()
                  .a(ky.as, this.du() - $$0.c * (double)$$3 + (double)$$1, this.dw() - $$0.d, this.dA() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dP()
                  .a(ky.as, this.du() - $$0.c * (double)$$3 - (double)$$1, this.dw() - $$0.d, this.dA() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(ky.O);
      } else {
         super.b($$0);
      }
   }

   private void a(kw $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ah.k() * 0.01;
         double $$3 = this.ah.k() * 0.01;
         double $$4 = this.ah.k() * 0.01;
         this.dP().a($$0, this.d(1.0), this.dx() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if (!$$2.e() && $$2.a(awf.aP)) {
         if (!this.dP().B) {
            this.a(avi.gZ, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bpw.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.ha;
   }

   @Nullable
   @Override
   protected avh o_() {
      return avi.gY;
   }

   @Nullable
   @Override
   protected avh v() {
      return this.be() ? avi.gW : avi.gV;
   }

   @Override
   protected avh aQ() {
      return avi.hd;
   }

   @Override
   protected avh aP() {
      return avi.he;
   }

   protected boolean gq() {
      io $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.dn(), 12.0) : false;
   }

   @Override
   public void a(eum $$0) {
      if (this.db() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(bsv.a, this.ds());
         this.g(this.ds().a(0.9));
         if (this.p() == null) {
            this.g(this.ds().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cly $$0) {
      return true;
   }

   static class a extends bzo {
      private final ceo a;
      private boolean b;

      a(ceo $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzo.a.a, bzo.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.u() && this.a.cl() >= 100;
      }

      @Override
      public boolean b() {
         io $$0 = this.a.s();
         return !io.a((double)$$0.u(), this.a.dw(), (double)$$0.w()).a(this.a.dn(), 4.0) && !this.b && this.a.cl() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dP() instanceof aqn) {
            aqn $$0 = (aqn)this.a.dP();
            this.b = false;
            this.a.K().n();
            io $$1 = this.a.dp();
            io $$2 = $$0.a(awi.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.i($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void d() {
         io $$0 = this.a.s();
         if (io.a((double)$$0.u(), this.a.dw(), (double)$$0.w()).a(this.a.dn(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         daz $$0 = this.a.dP();
         if (this.a.gq() || this.a.K().l()) {
            eum $$1 = eum.b(this.a.s());
            eum $$2 = cdl.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cdl.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               io $$3 = io.a($$2);
               if (!$$0.b_($$3).a(awc.a) || !$$0.a_($$3).a(enl.b)) {
                  $$2 = cdl.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.G().a($$2.c, $$2.d, $$2.e, (float)(this.a.aa() + 20), (float)this.a.Z());
            this.a.K().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bzo {
      private final ceo a;
      private final double b;
      @Nullable
      private cly c;

      b(ceo $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bzo.a.a, bzo.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dP().a(ceo.bZ, this.a);
         return this.c == null ? false : this.c.cc() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.cc() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bre(brg.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.c, (float)(this.a.aa() + 20), (float)this.a.Z());
         if (this.a.g(this.c) < 6.25) {
            this.a.K().n();
         } else {
            this.a.K().a(this.c, this.b);
         }

         if (this.c.cc() && this.c.dP().z.a(6) == 0) {
            this.c.b(new bre(brg.D, 100), this.a);
         }
      }
   }

   class c extends bzo {
      private int b;

      @Override
      public boolean a() {
         if (this.b > ceo.this.ai) {
            return false;
         } else {
            List<cii> $$0 = ceo.this.dP().a(cii.class, ceo.this.cK().c(8.0, 8.0, 8.0), ceo.c);
            return !$$0.isEmpty() || !ceo.this.a(bsd.a).e();
         }
      }

      @Override
      public void c() {
         List<cii> $$0 = ceo.this.dP().a(cii.class, ceo.this.cK().c(8.0, 8.0, 8.0), ceo.c);
         if (!$$0.isEmpty()) {
            ceo.this.K().a($$0.get(0), 1.2F);
            ceo.this.a(avi.hc, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         ctq $$0 = ceo.this.a(bsd.a);
         if (!$$0.e()) {
            this.a($$0);
            ceo.this.a(bsd.a, ctq.i);
            this.b = ceo.this.ai + ceo.this.ah.a(100);
         }
      }

      @Override
      public void e() {
         List<cii> $$0 = ceo.this.dP().a(cii.class, ceo.this.cK().c(8.0, 8.0, 8.0), ceo.c);
         ctq $$1 = ceo.this.a(bsd.a);
         if (!$$1.e()) {
            this.a($$1);
            ceo.this.a(bsd.a, ctq.i);
         } else if (!$$0.isEmpty()) {
            ceo.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(ctq $$0) {
         if (!$$0.e()) {
            double $$1 = ceo.this.dy() - 0.3F;
            cii $$2 = new cii(ceo.this.dP(), ceo.this.du(), $$1, ceo.this.dA(), $$0);
            $$2.b(40);
            $$2.b(ceo.this);
            float $$3 = 0.3F;
            float $$4 = ceo.this.ah.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * ceo.this.ah.i();
            $$2.o(
               (double)(0.3F * -ayf.a(ceo.this.dF() * (float) (Math.PI / 180.0)) * ayf.b(ceo.this.dH() * (float) (Math.PI / 180.0)) + ayf.b($$4) * $$5),
               (double)(0.3F * ayf.a(ceo.this.dH() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ayf.b(ceo.this.dF() * (float) (Math.PI / 180.0)) * ayf.b(ceo.this.dH() * (float) (Math.PI / 180.0)) + ayf.a($$4) * $$5)
            );
            ceo.this.dP().b($$2);
         }
      }
   }
}
