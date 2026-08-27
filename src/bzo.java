import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzo extends bup implements bke<Optional<cht>>, bza {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bkk bT = new bkk(e, "Covered armor bonus", 20.0, bkk.a.a);
   protected static final aef<hc> b = aei.a(bzo.class, aeh.p);
   protected static final aef<Byte> c = aei.a(bzo.class, aeh.a);
   protected static final aef<Byte> d = aei.a(bzo.class, aeh.a);
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

   public bzo(biu<? extends bzo> $$0, cpv $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new bzo.d(this);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqj(this, cbu.class, 8.0F, 0.02F, true));
      this.bO.a(4, new bzo.a());
      this.bO.a(7, new bzo.f());
      this.bO.a(8, new bqw(this));
      this.bP.a(1, new brt(this, this.getClass()).a());
      this.bP.a(2, new bzo.e(this));
      this.bP.a(3, new bzo.c(this));
   }

   @Override
   protected biq.b aV() {
      return biq.b.a;
   }

   @Override
   public apf db() {
      return apf.f;
   }

   @Override
   protected apd w() {
      return ape.uY;
   }

   @Override
   public void P() {
      if (!this.gi()) {
         super.P();
      }
   }

   @Override
   protected apd l_() {
      return ape.ve;
   }

   @Override
   protected apd d(bho $$0) {
      return this.gi() ? ape.vg : ape.vf;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, hc.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bkl.a s() {
      return bji.A().a(bkm.a, 30.0);
   }

   @Override
   protected boz F() {
      return new bzo.b(this);
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.a(hc.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.an.b(c));
      $$0.a("Color", this.an.b(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B && !this.bO() && !this.a(this.dl(), this.y())) {
         this.gf();
      }

      if (this.gg()) {
         this.gh();
      }

      if (this.dL().B) {
         if (this.cf > 0) {
            this.cf--;
         } else {
            this.ce = null;
         }
      }
   }

   private void gf() {
      hc $$0 = this.i(this.dl());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected ehi ap() {
      float $$0 = G(this.cd);
      hc $$1 = this.y().g();
      float $$2 = this.ah().k() / 2.0F;
      return a($$1, $$0).d(this.dq() - (double)$$2, this.ds(), this.dw() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - arx.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gg() {
      this.cc = this.cd;
      float $$0 = (float)this.gk() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = arx.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = arx.a(this.cd + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gh() {
      this.aq();
      float $$0 = G(this.cd);
      float $$1 = G(this.cc);
      hc $$2 = this.y().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (biq $$5 : this.dL().a(this, a($$2, $$1, $$0).d(this.dq() - 0.5, this.ds(), this.dw() - 0.5), bit.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof bzo) && !$$5.af) {
               $$5.a(bjm.e, new ehn((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ehi a(hc $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static ehi a(hc $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new ehi(gw.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(biq $$0, boolean $$1) {
      if (this.dL().w_()) {
         this.ce = null;
         this.cf = 0;
      }

      this.a(hc.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ab() {
      super.ab();
      if (this.dL().B) {
         this.ce = this.dl();
      }

      this.aV = 0.0F;
      this.aU = 0.0F;
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      this.r(0.0F);
      this.aW = this.dB();
      this.bo();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bjm $$0, ehn $$1) {
      if ($$0 == bjm.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ehn do() {
      return ehn.b;
   }

   @Override
   public void f(ehn $$0) {
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      gw $$3 = this.dl();
      if (this.bO()) {
         super.e($$0, $$1, $$2);
      } else {
         super.e((double)arx.a($$0) + 0.5, (double)arx.a($$1 + 0.5), (double)arx.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         gw $$4 = this.dl();
         if (!$$4.equals($$3)) {
            this.an.b(c, (byte)0);
            this.au = true;
            if (this.dL().B && !this.bO() && !$$4.equals(this.ce)) {
               this.ce = $$3;
               this.cf = 6;
               this.ac = this.dq();
               this.ad = this.ds();
               this.ae = this.dw();
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
         if (!this.dL().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ehi $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dL().a(this, $$3);
         }
      }
   }

   private boolean j(gw $$0) {
      dfj $$1 = this.dL().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(csw.bQ) && $$0.equals(this.dl());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.fT() && this.bw()) {
         gw $$0 = this.dl();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            gw $$2 = $$0.b(arx.b(this.ag, -8, 8), arx.b(this.ag, -8, 8), arx.b(this.ag, -8, 8));
            if ($$2.v() > this.dL().H_() && this.dL().t($$2) && this.dL().B_().a($$2) && this.dL().a(this, new ehi($$2).h(1.0E-6))) {
               hc $$3 = this.i($$2);
               if ($$3 != null) {
                  this.af();
                  this.a($$3);
                  this.a(ape.vj, 1.0F, 1.0F);
                  this.e((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dL().a(djt.R, $$0, djt.a.a(this));
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
   public double n_() {
      return this.dq();
   }

   @Override
   public double K_() {
      return this.ds();
   }

   @Override
   public double L_() {
      return this.dw();
   }

   @Override
   public float d_() {
      return this.dD();
   }

   @Override
   public float o_() {
      return this.dB();
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.gi()) {
         biq $$2 = $$0.c();
         if ($$2 instanceof cca) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eu() < (double)this.eL() * 0.5 && this.ag.a(4) == 0) {
            this.t();
         } else if ($$0.a(apv.j)) {
            biq $$3 = $$0.c();
            if ($$3 != null && $$3.ah() == biu.aH) {
               this.gj();
            }
         }

         return true;
      }
   }

   private boolean gi() {
      return this.gk() == 0;
   }

   private void gj() {
      ehn $$0 = this.dj();
      ehi $$1 = this.cH();
      if (!this.gi() && this.t()) {
         int $$2 = this.dL().a(biu.aG, $$1.g(8.0), biq::bw).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dL().z.i() < $$3)) {
            bzo $$4 = biu.aG.a(this.dL());
            if ($$4 != null) {
               $$4.a(this.gd());
               $$4.d($$0);
               this.dL().b($$4);
            }
         }
      }
   }

   @Override
   public boolean by() {
      return this.bw();
   }

   public hc y() {
      return this.an.b(b);
   }

   private void a(hc $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(aef<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.ap());
      }

      super.a($$0);
   }

   private int gk() {
      return this.an.b(c);
   }

   void b(int $$0) {
      if (!this.dL().B) {
         this.a(bkm.i).b(bT.a());
         if ($$0 == 0) {
            this.a(bkm.i).c(bT);
            this.a(ape.vd, 1.0F, 1.0F);
            this.a(djt.j);
         } else {
            this.a(ape.vh, 1.0F, 1.0F);
            this.a(djt.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return arx.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 0.5F;
   }

   @Override
   public void a(wx $$0) {
      super.a($$0);
      this.aU = 0.0F;
      this.aV = 0.0F;
   }

   @Override
   public int Z() {
      return 180;
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public void g(biq $$0) {
   }

   @Override
   public float bE() {
      return 0.0F;
   }

   public Optional<ehn> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         gw $$2 = this.dl();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new ehn(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<cht> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cht> gd() {
      return Optional.ofNullable(this.ge());
   }

   @Nullable
   public cht ge() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? cht.a($$0) : null;
   }

   class a extends bqb {
      private int b;

      public a() {
         this.a(EnumSet.of(bqb.a.a, bqb.a.b));
      }

      @Override
      public boolean a() {
         bjg $$0 = bzo.this.q();
         return $$0 != null && $$0.bw() ? bzo.this.dL().ai() != bgv.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         bzo.this.b(100);
      }

      @Override
      public void d() {
         bzo.this.b(0);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         if (bzo.this.dL().ai() != bgv.a) {
            this.b--;
            bjg $$0 = bzo.this.q();
            if ($$0 != null) {
               bzo.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = bzo.this.f($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + bzo.this.ag.a(10) * 20 / 2;
                     bzo.this.dL().b(new cco(bzo.this.dL(), bzo.this, $$0, bzo.this.y().o()));
                     bzo.this.a(ape.vi, 2.0F, (bzo.this.ag.i() - bzo.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  bzo.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends boz {
      public b(bji $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends bru<bjg> {
      public c(bzo $$0) {
         super($$0, bjg.class, 10, true, false, $$0x -> $$0x instanceof bza);
      }

      @Override
      public boolean a() {
         return this.e.cg() == null ? false : super.a();
      }

      @Override
      protected ehi a(double $$0) {
         hc $$1 = ((bzo)this.e).y();
         if ($$1.o() == hc.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hc.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bpd {
      public d(bji $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         hc $$0 = bzo.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(bzo.cb));
         ib $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dq();
         double $$5 = this.f - this.a.du();
         double $$6 = this.g - this.a.dw();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(arx.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends bru<cbu> {
      public e(bzo $$0) {
         super($$0, cbu.class, true);
      }

      @Override
      public boolean a() {
         return bzo.this.dL().ai() == bgv.a ? false : super.a();
      }

      @Override
      protected ehi a(double $$0) {
         hc $$1 = ((bzo)this.e).y();
         if ($$1.o() == hc.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hc.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bqb {
      private int b;

      @Override
      public boolean a() {
         return bzo.this.q() == null && bzo.this.ag.a(b(40)) == 0 && bzo.this.a(bzo.this.dl(), bzo.this.y());
      }

      @Override
      public boolean b() {
         return bzo.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + bzo.this.ag.a(3)));
         bzo.this.b(30);
      }

      @Override
      public void d() {
         if (bzo.this.q() == null) {
            bzo.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
