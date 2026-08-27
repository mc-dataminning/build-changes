import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzg extends buh implements bjw<Optional<chl>>, bys {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bkc bT = new bkc(e, "Covered armor bonus", 20.0, bkc.a.a);
   protected static final adz<ha> b = aec.a(bzg.class, aeb.p);
   protected static final adz<Byte> c = aec.a(bzg.class, aeb.a);
   protected static final adz<Byte> d = aec.a(bzg.class, aeb.a);
   private static final int bU = 6;
   private static final byte bV = 16;
   private static final byte bW = 16;
   private static final int bX = 8;
   private static final int bY = 8;
   private static final int bZ = 5;
   private static final float ca = 0.05F;
   static final Vector3f cb = ac.a(() -> {
      hz $$0 = ha.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private float cc;
   private float cd;
   @Nullable
   private gu ce;
   private int cf;
   private static final float cg = 1.0F;

   public bzg(bim<? extends bzg> $$0, cpl $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new bzg.d(this);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bqb(this, cbm.class, 8.0F, 0.02F, true));
      this.bO.a(4, new bzg.a());
      this.bO.a(7, new bzg.f());
      this.bO.a(8, new bqo(this));
      this.bP.a(1, new brl(this, this.getClass()).a());
      this.bP.a(2, new bzg.e(this));
      this.bP.a(3, new bzg.c(this));
   }

   @Override
   protected bii.b aU() {
      return bii.b.a;
   }

   @Override
   public aox da() {
      return aox.f;
   }

   @Override
   protected aov r() {
      return aow.uY;
   }

   @Override
   public void M() {
      if (!this.gf()) {
         super.M();
      }
   }

   @Override
   protected aov h_() {
      return aow.ve;
   }

   @Override
   protected aov d(bhg $$0) {
      return this.gf() ? aow.vg : aow.vf;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, ha.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bkd.a p() {
      return bja.x().a(bke.a, 30.0);
   }

   @Override
   protected bor B() {
      return new bzg.b(this);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(ha.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.t().d());
      $$0.a("Peek", this.an.b(c));
      $$0.a("Color", this.an.b(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dK().B && !this.bN() && !this.a(this.dk(), this.t())) {
         this.gc();
      }

      if (this.gd()) {
         this.ge();
      }

      if (this.dK().B) {
         if (this.cf > 0) {
            this.cf--;
         } else {
            this.ce = null;
         }
      }
   }

   private void gc() {
      ha $$0 = this.i(this.dk());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.q();
      }
   }

   @Override
   protected egy ao() {
      float $$0 = G(this.cd);
      ha $$1 = this.t().g();
      float $$2 = this.ag().k() / 2.0F;
      return a($$1, $$0).d(this.dp() - (double)$$2, this.dr(), this.dv() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - arp.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gd() {
      this.cc = this.cd;
      float $$0 = (float)this.gh() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = arp.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = arp.a(this.cd + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void ge() {
      this.ap();
      float $$0 = G(this.cd);
      float $$1 = G(this.cc);
      ha $$2 = this.t().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (bii $$5 : this.dK().a(this, a($$2, $$1, $$0).d(this.dp() - 0.5, this.dr(), this.dv() - 0.5), bil.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof bzg) && !$$5.af) {
               $$5.a(bje.e, new ehd((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static egy a(ha $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static egy a(ha $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new egy(gu.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(bii $$0, boolean $$1) {
      if (this.dK().r_()) {
         this.ce = null;
         this.cf = 0;
      }

      this.a(ha.a);
      return super.a($$0, $$1);
   }

   @Override
   public void aa() {
      super.aa();
      if (this.dK().B) {
         this.ce = this.dk();
      }

      this.aV = 0.0F;
      this.aU = 0.0F;
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      this.r(0.0F);
      this.aW = this.dA();
      this.bn();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bje $$0, ehd $$1) {
      if ($$0 == bje.d) {
         this.q();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ehd dn() {
      return ehd.b;
   }

   @Override
   public void f(ehd $$0) {
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      gu $$3 = this.dk();
      if (this.bN()) {
         super.e($$0, $$1, $$2);
      } else {
         super.e((double)arp.a($$0) + 0.5, (double)arp.a($$1 + 0.5), (double)arp.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         gu $$4 = this.dk();
         if (!$$4.equals($$3)) {
            this.an.b(c, (byte)0);
            this.au = true;
            if (this.dK().B && !this.bN() && !$$4.equals(this.ce)) {
               this.ce = $$3;
               this.cf = 6;
               this.ac = this.dp();
               this.ad = this.dr();
               this.ae = this.dv();
            }
         }
      }
   }

   @Nullable
   protected ha i(gu $$0) {
      for (ha $$1 : ha.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(gu $$0, ha $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         ha $$2 = $$1.g();
         if (!this.dK().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            egy $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dK().a(this, $$3);
         }
      }
   }

   private boolean j(gu $$0) {
      dez $$1 = this.dK().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(csm.bQ) && $$0.equals(this.dk());
         return !$$2;
      }
   }

   protected boolean q() {
      if (!this.fQ() && this.bv()) {
         gu $$0 = this.dk();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            gu $$2 = $$0.b(arp.b(this.ag, -8, 8), arp.b(this.ag, -8, 8), arp.b(this.ag, -8, 8));
            if ($$2.v() > this.dK().C_() && this.dK().t($$2) && this.dK().w_().a($$2) && this.dK().a(this, new egy($$2).h(1.0E-6))) {
               ha $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ae();
                  this.a($$3);
                  this.a(aow.vj, 1.0F, 1.0F);
                  this.e((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dK().a(djj.R, $$0, djj.a.a(this));
                  this.an.b(c, (byte)0);
                  this.h(null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bn = 0;
      this.e($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.gf()) {
         bii $$2 = $$0.c();
         if ($$2 instanceof cbs) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.et() < (double)this.eK() * 0.5 && this.ag.a(4) == 0) {
            this.q();
         } else if ($$0.a(apn.j)) {
            bii $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == bim.aH) {
               this.gg();
            }
         }

         return true;
      }
   }

   private boolean gf() {
      return this.gh() == 0;
   }

   private void gg() {
      ehd $$0 = this.di();
      egy $$1 = this.cG();
      if (!this.gf() && this.q()) {
         int $$2 = this.dK().a(bim.aG, $$1.g(8.0), bii::bv).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dK().z.i() < $$3)) {
            bzg $$4 = bim.aG.a(this.dK());
            if ($$4 != null) {
               $$4.a(this.ga());
               $$4.d($$0);
               this.dK().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bx() {
      return this.bv();
   }

   public ha t() {
      return this.an.b(b);
   }

   private void a(ha $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(adz<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.ao());
      }

      super.a($$0);
   }

   private int gh() {
      return this.an.b(c);
   }

   void b(int $$0) {
      if (!this.dK().B) {
         this.a(bke.i).b(bT.a());
         if ($$0 == 0) {
            this.a(bke.i).c(bT);
            this.a(aow.vd, 1.0F, 1.0F);
            this.a(djj.j);
         } else {
            this.a(aow.vh, 1.0F, 1.0F);
            this.a(djj.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return arp.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 0.5F;
   }

   @Override
   public void a(wq $$0) {
      super.a($$0);
      this.aU = 0.0F;
      this.aV = 0.0F;
   }

   @Override
   public int W() {
      return 180;
   }

   @Override
   public int X() {
      return 180;
   }

   @Override
   public void g(bii $$0) {
   }

   @Override
   public float bD() {
      return 0.0F;
   }

   public Optional<ehd> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         gu $$2 = this.dk();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new ehd(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<chl> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<chl> ga() {
      return Optional.ofNullable(this.gb());
   }

   @Nullable
   public chl gb() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? chl.a($$0) : null;
   }

   class a extends bpt {
      private int b;

      public a() {
         this.a(EnumSet.of(bpt.a.a, bpt.a.b));
      }

      @Override
      public boolean a() {
         biy $$0 = bzg.this.j();
         return $$0 != null && $$0.bv() ? bzg.this.dK().ai() != bgn.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         bzg.this.b(100);
      }

      @Override
      public void d() {
         bzg.this.b(0);
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         if (bzg.this.dK().ai() != bgn.a) {
            this.b--;
            biy $$0 = bzg.this.j();
            if ($$0 != null) {
               bzg.this.D().a($$0, 180.0F, 180.0F);
               double $$1 = bzg.this.f($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + bzg.this.ag.a(10) * 20 / 2;
                     bzg.this.dK().b(new ccg(bzg.this.dK(), bzg.this, $$0, bzg.this.t().o()));
                     bzg.this.a(aow.vi, 2.0F, (bzg.this.ag.i() - bzg.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  bzg.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bor {
      public b(bja $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends brm<biy> {
      public c(bzg $$0) {
         super($$0, biy.class, 10, true, false, $$0x -> $$0x instanceof bys);
      }

      @Override
      public boolean a() {
         return this.e.cf() == null ? false : super.a();
      }

      @Override
      protected egy a(double $$0) {
         ha $$1 = ((bzg)this.e).t();
         if ($$1.o() == ha.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ha.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bov {
      public d(bja $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ha $$0 = bzg.this.t().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(bzg.cb));
         hz $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dp();
         double $$5 = this.f - this.a.dt();
         double $$6 = this.g - this.a.dv();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(arp.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends brm<cbm> {
      public e(bzg $$0) {
         super($$0, cbm.class, true);
      }

      @Override
      public boolean a() {
         return bzg.this.dK().ai() == bgn.a ? false : super.a();
      }

      @Override
      protected egy a(double $$0) {
         ha $$1 = ((bzg)this.e).t();
         if ($$1.o() == ha.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ha.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bpt {
      private int b;

      @Override
      public boolean a() {
         return bzg.this.j() == null && bzg.this.ag.a(b(40)) == 0 && bzg.this.a(bzg.this.dk(), bzg.this.t());
      }

      @Override
      public boolean b() {
         return bzg.this.j() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + bzg.this.ag.a(3)));
         bzg.this.b(30);
      }

      @Override
      public void d() {
         if (bzg.this.j() == null) {
            bzg.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
