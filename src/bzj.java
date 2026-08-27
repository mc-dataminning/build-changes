import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzj extends buk implements bjz<Optional<cho>>, byv {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bkf bT = new bkf(e, "Covered armor bonus", 20.0, bkf.a.a);
   protected static final aec<hc> b = aef.a(bzj.class, aee.p);
   protected static final aec<Byte> c = aef.a(bzj.class, aee.a);
   protected static final aec<Byte> d = aef.a(bzj.class, aee.a);
   private static final int bU = 6;
   private static final byte bV = 16;
   private static final byte bW = 16;
   private static final int bX = 8;
   private static final int bY = 8;
   private static final int bZ = 5;
   private static final float ca = 0.05F;
   static final Vector3f cb = ac.a(() -> {
      ib $$0 = hc.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private float cc;
   private float cd;
   @Nullable
   private gw ce;
   private int cf;
   private static final float cg = 1.0F;

   public bzj(bip<? extends bzj> $$0, cpq $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new bzj.d(this);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bqe(this, cbp.class, 8.0F, 0.02F, true));
      this.bO.a(4, new bzj.a());
      this.bO.a(7, new bzj.f());
      this.bO.a(8, new bqr(this));
      this.bP.a(1, new bro(this, this.getClass()).a());
      this.bP.a(2, new bzj.e(this));
      this.bP.a(3, new bzj.c(this));
   }

   @Override
   protected bil.b aU() {
      return bil.b.a;
   }

   @Override
   public apa da() {
      return apa.f;
   }

   @Override
   protected aoy r() {
      return aoz.uY;
   }

   @Override
   public void M() {
      if (!this.gf()) {
         super.M();
      }
   }

   @Override
   protected aoy h_() {
      return aoz.ve;
   }

   @Override
   protected aoy d(bhj $$0) {
      return this.gf() ? aoz.vg : aoz.vf;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, hc.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bkg.a p() {
      return bjd.x().a(bkh.a, 30.0);
   }

   @Override
   protected bou B() {
      return new bzj.b(this);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a(hc.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(qu $$0) {
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
      hc $$0 = this.i(this.dk());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.q();
      }
   }

   @Override
   protected ehd ao() {
      float $$0 = G(this.cd);
      hc $$1 = this.t().g();
      float $$2 = this.ag().k() / 2.0F;
      return a($$1, $$0).d(this.dp() - (double)$$2, this.dr(), this.dv() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - ars.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gd() {
      this.cc = this.cd;
      float $$0 = (float)this.gh() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = ars.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = ars.a(this.cd + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void ge() {
      this.ap();
      float $$0 = G(this.cd);
      float $$1 = G(this.cc);
      hc $$2 = this.t().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (bil $$5 : this.dK().a(this, a($$2, $$1, $$0).d(this.dp() - 0.5, this.dr(), this.dv() - 0.5), bio.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof bzj) && !$$5.af) {
               $$5.a(bjh.e, new ehi((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ehd a(hc $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static ehd a(hc $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new ehd(gw.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(bil $$0, boolean $$1) {
      if (this.dK().r_()) {
         this.ce = null;
         this.cf = 0;
      }

      this.a(hc.a);
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
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      this.r(0.0F);
      this.aW = this.dA();
      this.bn();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bjh $$0, ehi $$1) {
      if ($$0 == bjh.d) {
         this.q();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ehi dn() {
      return ehi.b;
   }

   @Override
   public void f(ehi $$0) {
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      gw $$3 = this.dk();
      if (this.bN()) {
         super.e($$0, $$1, $$2);
      } else {
         super.e((double)ars.a($$0) + 0.5, (double)ars.a($$1 + 0.5), (double)ars.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         gw $$4 = this.dk();
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
   protected hc i(gw $$0) {
      for (hc $$1 : hc.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(gw $$0, hc $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         hc $$2 = $$1.g();
         if (!this.dK().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ehd $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dK().a(this, $$3);
         }
      }
   }

   private boolean j(gw $$0) {
      dfe $$1 = this.dK().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(csr.bQ) && $$0.equals(this.dk());
         return !$$2;
      }
   }

   protected boolean q() {
      if (!this.fQ() && this.bv()) {
         gw $$0 = this.dk();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            gw $$2 = $$0.b(ars.b(this.ag, -8, 8), ars.b(this.ag, -8, 8), ars.b(this.ag, -8, 8));
            if ($$2.v() > this.dK().C_() && this.dK().t($$2) && this.dK().w_().a($$2) && this.dK().a(this, new ehd($$2).h(1.0E-6))) {
               hc $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ae();
                  this.a($$3);
                  this.a(aoz.vj, 1.0F, 1.0F);
                  this.e((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dK().a(djo.R, $$0, djo.a.a(this));
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
   public boolean a(bhj $$0, float $$1) {
      if (this.gf()) {
         bil $$2 = $$0.c();
         if ($$2 instanceof cbv) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.et() < (double)this.eK() * 0.5 && this.ag.a(4) == 0) {
            this.q();
         } else if ($$0.a(apq.j)) {
            bil $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == bip.aH) {
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
      ehi $$0 = this.di();
      ehd $$1 = this.cG();
      if (!this.gf() && this.q()) {
         int $$2 = this.dK().a(bip.aG, $$1.g(8.0), bil::bv).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dK().z.i() < $$3)) {
            bzj $$4 = bip.aG.a(this.dK());
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

   public hc t() {
      return this.an.b(b);
   }

   private void a(hc $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(aec<?> $$0) {
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
         this.a(bkh.i).b(bT.a());
         if ($$0 == 0) {
            this.a(bkh.i).c(bT);
            this.a(aoz.vd, 1.0F, 1.0F);
            this.a(djo.j);
         } else {
            this.a(aoz.vh, 1.0F, 1.0F);
            this.a(djo.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return ars.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 0.5F;
   }

   @Override
   public void a(wt $$0) {
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
   public void g(bil $$0) {
   }

   @Override
   public float bD() {
      return 0.0F;
   }

   public Optional<ehi> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         gw $$2 = this.dk();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new ehi(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<cho> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cho> ga() {
      return Optional.ofNullable(this.gb());
   }

   @Nullable
   public cho gb() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? cho.a($$0) : null;
   }

   class a extends bpw {
      private int b;

      public a() {
         this.a(EnumSet.of(bpw.a.a, bpw.a.b));
      }

      @Override
      public boolean a() {
         bjb $$0 = bzj.this.j();
         return $$0 != null && $$0.bv() ? bzj.this.dK().ai() != bgq.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         bzj.this.b(100);
      }

      @Override
      public void d() {
         bzj.this.b(0);
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         if (bzj.this.dK().ai() != bgq.a) {
            this.b--;
            bjb $$0 = bzj.this.j();
            if ($$0 != null) {
               bzj.this.D().a($$0, 180.0F, 180.0F);
               double $$1 = bzj.this.f($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + bzj.this.ag.a(10) * 20 / 2;
                     bzj.this.dK().b(new ccj(bzj.this.dK(), bzj.this, $$0, bzj.this.t().o()));
                     bzj.this.a(aoz.vi, 2.0F, (bzj.this.ag.i() - bzj.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  bzj.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bou {
      public b(bjd $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends brp<bjb> {
      public c(bzj $$0) {
         super($$0, bjb.class, 10, true, false, $$0x -> $$0x instanceof byv);
      }

      @Override
      public boolean a() {
         return this.e.cf() == null ? false : super.a();
      }

      @Override
      protected ehd a(double $$0) {
         hc $$1 = ((bzj)this.e).t();
         if ($$1.o() == hc.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hc.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends boy {
      public d(bjd $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         hc $$0 = bzj.this.t().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(bzj.cb));
         ib $$2 = $$0.q();
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
            : Optional.of((float)(ars.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends brp<cbp> {
      public e(bzj $$0) {
         super($$0, cbp.class, true);
      }

      @Override
      public boolean a() {
         return bzj.this.dK().ai() == bgq.a ? false : super.a();
      }

      @Override
      protected ehd a(double $$0) {
         hc $$1 = ((bzj)this.e).t();
         if ($$1.o() == hc.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hc.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bpw {
      private int b;

      @Override
      public boolean a() {
         return bzj.this.j() == null && bzj.this.ag.a(b(40)) == 0 && bzj.this.a(bzj.this.dk(), bzj.this.t());
      }

      @Override
      public boolean b() {
         return bzj.this.j() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + bzj.this.ag.a(3)));
         bzj.this.b(30);
      }

      @Override
      public void d() {
         if (bzj.this.j() == null) {
            bzj.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
