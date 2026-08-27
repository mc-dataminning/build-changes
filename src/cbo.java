import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbo extends bwp implements bme<Optional<cjx>>, cba {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bmk bT = new bmk(e, "Covered armor bonus", 20.0, bmk.a.a);
   protected static final afo<hx> b = afr.a(cbo.class, afq.p);
   protected static final afo<Byte> c = afr.a(cbo.class, afq.a);
   protected static final afo<Byte> d = afr.a(cbo.class, afq.a);
   private static final int bU = 6;
   private static final byte bV = 16;
   private static final byte bW = 16;
   private static final int bX = 8;
   private static final int bY = 8;
   private static final int bZ = 5;
   private static final float ca = 0.05F;
   static final Vector3f cb = ac.a(() -> {
      iw $$0 = hx.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private float cc;
   private float cd;
   @Nullable
   private ht ce;
   private int cf;
   private static final float cg = 1.0F;

   public cbo(bku<? extends cbo> $$0, csa $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new cbo.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsj(this, cdu.class, 8.0F, 0.02F, true));
      this.bO.a(4, new cbo.a());
      this.bO.a(7, new cbo.f());
      this.bO.a(8, new bsw(this));
      this.bP.a(1, new btt(this, this.getClass()).a());
      this.bP.a(2, new cbo.e(this));
      this.bP.a(3, new cbo.c(this));
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.a;
   }

   @Override
   public aqs dc() {
      return aqs.f;
   }

   @Override
   protected aqq y() {
      return aqr.vt;
   }

   @Override
   public void R() {
      if (!this.gk()) {
         super.R();
      }
   }

   @Override
   protected aqq m_() {
      return aqr.vz;
   }

   @Override
   protected aqq d(bjo $$0) {
      return this.gk() ? aqr.vB : aqr.vA;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, hx.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bml.a u() {
      return bli.C().a(bmm.l, 30.0);
   }

   @Override
   protected bqz H() {
      return new cbo.b(this);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(hx.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.A().d());
      $$0.a("Peek", this.an.b(c));
      $$0.a("Color", this.an.b(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().B && !this.bO() && !this.a(this.dn(), this.A())) {
         this.gh();
      }

      if (this.gi()) {
         this.gj();
      }

      if (this.dN().B) {
         if (this.cf > 0) {
            this.cf--;
         } else {
            this.ce = null;
         }
      }
   }

   private void gh() {
      hx $$0 = this.i(this.dn());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.w();
      }
   }

   @Override
   protected ejp aq() {
      float $$0 = G(this.cd);
      hx $$1 = this.A().g();
      float $$2 = this.ai().k() / 2.0F;
      return a($$1, $$0).d(this.ds() - (double)$$2, this.du(), this.dy() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - atm.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gi() {
      this.cc = this.cd;
      float $$0 = (float)this.gm() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = atm.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = atm.a(this.cd + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gj() {
      this.ar();
      float $$0 = G(this.cd);
      float $$1 = G(this.cc);
      hx $$2 = this.A().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (bkq $$5 : this.dN().a(this, a($$2, $$1, $$0).d(this.ds() - 0.5, this.du(), this.dy() - 0.5), bkt.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof cbo) && !$$5.af) {
               $$5.a(blm.e, new eju((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ejp a(hx $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static ejp a(hx $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new ejp(ht.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(bkq $$0, boolean $$1) {
      if (this.dN().x_()) {
         this.ce = null;
         this.cf = 0;
      }

      this.a(hx.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ac() {
      super.ac();
      if (this.dN().B) {
         this.ce = this.dn();
      }

      this.aV = 0.0F;
      this.aU = 0.0F;
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      this.r(0.0F);
      this.aW = this.dD();
      this.bp();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(blm $$0, eju $$1) {
      if ($$0 == blm.d) {
         this.w();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public eju dq() {
      return eju.b;
   }

   @Override
   public void g(eju $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      ht $$3 = this.dn();
      if (this.bO()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)atm.a($$0) + 0.5, (double)atm.a($$1 + 0.5), (double)atm.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         ht $$4 = this.dn();
         if (!$$4.equals($$3)) {
            this.an.b(c, (byte)0);
            this.au = true;
            if (this.dN().B && !this.bO() && !$$4.equals(this.ce)) {
               this.ce = $$3;
               this.cf = 6;
               this.ac = this.ds();
               this.ad = this.du();
               this.ae = this.dy();
            }
         }
      }
   }

   @Nullable
   protected hx i(ht $$0) {
      for (hx $$1 : hx.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(ht $$0, hx $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         hx $$2 = $$1.g();
         if (!this.dN().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ejp $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dN().a(this, $$3);
         }
      }
   }

   private boolean j(ht $$0) {
      dhi $$1 = this.dN().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(cvc.bQ) && $$0.equals(this.dn());
         return !$$2;
      }
   }

   protected boolean w() {
      if (!this.fV() && this.bx()) {
         ht $$0 = this.dn();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ht $$2 = $$0.b(atm.b(this.ag, -8, 8), atm.b(this.ag, -8, 8), atm.b(this.ag, -8, 8));
            if ($$2.v() > this.dN().I_() && this.dN().t($$2) && this.dN().C_().a($$2) && this.dN().a(this, new ejp($$2).h(1.0E-6))) {
               hx $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(aqr.vE, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dN().a(dls.R, $$0, dls.a.a(this));
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
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.gk()) {
         bkq $$2 = $$0.c();
         if ($$2 instanceof cea) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ew() < (double)this.eN() * 0.5 && this.ag.a(4) == 0) {
            this.w();
         } else if ($$0.a(ari.j)) {
            bkq $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bku.aH) {
               this.gl();
            }
         }

         return true;
      }
   }

   private boolean gk() {
      return this.gm() == 0;
   }

   private void gl() {
      eju $$0 = this.dl();
      ejp $$1 = this.cH();
      if (!this.gk() && this.w()) {
         int $$2 = this.dN().a(bku.aG, $$1.g(8.0), bkq::bx).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dN().z.i() < $$3)) {
            cbo $$4 = bku.aG.a(this.dN());
            if ($$4 != null) {
               $$4.a(this.gf());
               $$4.e($$0);
               this.dN().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bz() {
      return this.bx();
   }

   public hx A() {
      return this.an.b(b);
   }

   private void a(hx $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(afo<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.aq());
      }

      super.a($$0);
   }

   private int gm() {
      return this.an.b(c);
   }

   void b(int $$0) {
      if (!this.dN().B) {
         this.a(bmm.a).b(bT.a());
         if ($$0 == 0) {
            this.a(bmm.a).c(bT);
            this.a(aqr.vy, 1.0F, 1.0F);
            this.a(dls.j);
         } else {
            this.a(aqr.vC, 1.0F, 1.0F);
            this.a(dls.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return atm.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 0.5F;
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      this.aU = 0.0F;
      this.aV = 0.0F;
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public int ab() {
      return 180;
   }

   @Override
   public void g(bkq $$0) {
   }

   public Optional<eju> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         ht $$2 = this.dn();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new eju(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<cjx> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cjx> gf() {
      return Optional.ofNullable(this.gg());
   }

   @Nullable
   public cjx gg() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? cjx.a($$0) : null;
   }

   class a extends bsb {
      private int b;

      public a() {
         this.a(EnumSet.of(bsb.a.a, bsb.a.b));
      }

      @Override
      public boolean a() {
         blg $$0 = cbo.this.q();
         return $$0 != null && $$0.bx() ? cbo.this.dN().aj() != biu.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cbo.this.b(100);
      }

      @Override
      public void d() {
         cbo.this.b(0);
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         if (cbo.this.dN().aj() != biu.a) {
            this.b--;
            blg $$0 = cbo.this.q();
            if ($$0 != null) {
               cbo.this.I().a($$0, 180.0F, 180.0F);
               double $$1 = cbo.this.f((bkq)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cbo.this.ag.a(10) * 20 / 2;
                     cbo.this.dN().b(new ceo(cbo.this.dN(), cbo.this, $$0, cbo.this.A().o()));
                     cbo.this.a(aqr.vD, 2.0F, (cbo.this.ag.i() - cbo.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cbo.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bqz {
      public b(bli $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends btu<blg> {
      public c(cbo $$0) {
         super($$0, blg.class, 10, true, false, $$0x -> $$0x instanceof cba);
      }

      @Override
      public boolean a() {
         return this.e.cg() == null ? false : super.a();
      }

      @Override
      protected ejp a(double $$0) {
         hx $$1 = ((cbo)this.e).A();
         if ($$1.o() == hx.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hx.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends brd {
      public d(bli $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         hx $$0 = cbo.this.A().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cbo.cb));
         iw $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.ds();
         double $$5 = this.f - this.a.dw();
         double $$6 = this.g - this.a.dy();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(atm.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends btu<cdu> {
      public e(cbo $$0) {
         super($$0, cdu.class, true);
      }

      @Override
      public boolean a() {
         return cbo.this.dN().aj() == biu.a ? false : super.a();
      }

      @Override
      protected ejp a(double $$0) {
         hx $$1 = ((cbo)this.e).A();
         if ($$1.o() == hx.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hx.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bsb {
      private int b;

      @Override
      public boolean a() {
         return cbo.this.q() == null && cbo.this.ag.a(b(40)) == 0 && cbo.this.a(cbo.this.dn(), cbo.this.A());
      }

      @Override
      public boolean b() {
         return cbo.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cbo.this.ag.a(3)));
         cbo.this.b(30);
      }

      @Override
      public void d() {
         if (cbo.this.q() == null) {
            cbo.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
