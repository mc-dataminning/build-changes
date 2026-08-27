import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cdc extends bya implements bnm<Optional<clv>>, cco {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bns bU = new bns(e, "Covered armor bonus", 20.0, bns.a.a);
   protected static final agn<ic> b = agq.a(cdc.class, agp.p);
   protected static final agn<Byte> c = agq.a(cdc.class, agp.a);
   protected static final agn<Byte> d = agq.a(cdc.class, agp.a);
   private static final int bV = 6;
   private static final byte bW = 16;
   private static final byte bX = 16;
   private static final int bY = 8;
   private static final int bZ = 8;
   private static final int ca = 5;
   private static final float cb = 0.05F;
   static final Vector3f cc = ac.a(() -> {
      jb $$0 = ic.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private float cd;
   private float ce;
   @Nullable
   private hx cf;
   private int cg;
   private static final float ch = 1.0F;

   public cdc(bmc<? extends cdc> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 5;
      this.bL = new cdc.d(this);
   }

   @Override
   protected void B() {
      this.bP.a(1, new bts(this, cfq.class, 8.0F, 0.02F, true));
      this.bP.a(4, new cdc.a());
      this.bP.a(7, new cdc.f());
      this.bP.a(8, new buf(this));
      this.bQ.a(1, new bvc(this, this.getClass()).a());
      this.bQ.a(2, new cdc.e(this));
      this.bQ.a(3, new cdc.c(this));
   }

   @Override
   protected blw.b aW() {
      return blw.b.a;
   }

   @Override
   public aru db() {
      return aru.f;
   }

   @Override
   protected ars y() {
      return art.wd;
   }

   @Override
   public void R() {
      if (!this.gk()) {
         super.R();
      }
   }

   @Override
   protected ars n_() {
      return art.wj;
   }

   @Override
   protected ars d(bkv $$0) {
      return this.gk() ? art.wl : art.wk;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, ic.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 30.0);
   }

   @Override
   protected bsi H() {
      return new cdc.b(this);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a(ic.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.A().d());
      $$0.a("Peek", this.an.b(c));
      $$0.a("Color", this.an.b(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B && !this.bO() && !this.a(this.dl(), this.A())) {
         this.gh();
      }

      if (this.gi()) {
         this.gj();
      }

      if (this.dL().B) {
         if (this.cg > 0) {
            this.cg--;
         } else {
            this.cf = null;
         }
      }
   }

   private void gh() {
      ic $$0 = this.i(this.dl());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.w();
      }
   }

   @Override
   protected elx aq() {
      float $$0 = F(this.ce);
      ic $$1 = this.A().g();
      float $$2 = this.ai().k() / 2.0F;
      return a($$1, $$0).d(this.dq() - (double)$$2, this.ds(), this.dw() - (double)$$2);
   }

   private static float F(float $$0) {
      return 0.5F - aup.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gi() {
      this.cd = this.ce;
      float $$0 = (float)this.gm() * 0.01F;
      if (this.ce == $$0) {
         return false;
      } else {
         if (this.ce > $$0) {
            this.ce = aup.a(this.ce - 0.05F, $$0, 1.0F);
         } else {
            this.ce = aup.a(this.ce + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gj() {
      this.ar();
      float $$0 = F(this.ce);
      float $$1 = F(this.cd);
      ic $$2 = this.A().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (blw $$5 : this.dL().a(this, a($$2, $$1, $$0).d(this.dq() - 0.5, this.ds(), this.dw() - 0.5), bmb.f.and($$0x -> !$$0x.x(this)))) {
            if (!($$5 instanceof cdc) && !$$5.af) {
               $$5.a(bmu.e, new emc((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static elx a(ic $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static elx a(ic $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new elx(hx.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(blw $$0, boolean $$1) {
      if (this.dL().y_()) {
         this.cf = null;
         this.cg = 0;
      }

      this.a(ic.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ac() {
      super.ac();
      if (this.dL().B) {
         this.cf = this.dl();
      }

      this.aV = 0.0F;
      this.aU = 0.0F;
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      this.r(0.0F);
      this.aW = this.dB();
      this.bp();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bmu $$0, emc $$1) {
      if ($$0 == bmu.d) {
         this.w();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public emc do() {
      return emc.b;
   }

   @Override
   public void g(emc $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      hx $$3 = this.dl();
      if (this.bO()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)aup.a($$0) + 0.5, (double)aup.a($$1 + 0.5), (double)aup.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         hx $$4 = this.dl();
         if (!$$4.equals($$3)) {
            this.an.b(c, (byte)0);
            this.au = true;
            if (this.dL().B && !this.bO() && !$$4.equals(this.cf)) {
               this.cf = $$3;
               this.cg = 6;
               this.ac = this.dq();
               this.ad = this.ds();
               this.ae = this.dw();
            }
         }
      }
   }

   @Nullable
   protected ic i(hx $$0) {
      for (ic $$1 : ic.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(hx $$0, ic $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         ic $$2 = $$1.g();
         if (!this.dL().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            elx $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dL().a(this, $$3);
         }
      }
   }

   private boolean j(hx $$0) {
      djp $$1 = this.dL().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(cxa.bQ) && $$0.equals(this.dl());
         return !$$2;
      }
   }

   protected boolean w() {
      if (!this.fV() && this.bx()) {
         hx $$0 = this.dl();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            hx $$2 = $$0.b(aup.b(this.ag, -8, 8), aup.b(this.ag, -8, 8), aup.b(this.ag, -8, 8));
            if ($$2.v() > this.dL().J_() && this.dL().u($$2) && this.dL().D_().a($$2) && this.dL().a(this, new elx($$2).h(1.0E-6))) {
               ic $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(art.wo, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dL().a(dnz.R, $$0, dnz.a.a(this));
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
   public boolean a(bkv $$0, float $$1) {
      if (this.gk()) {
         blw $$2 = $$0.c();
         if ($$2 instanceof cfw) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ev() < (double)this.eM() * 0.5 && this.ag.a(4) == 0) {
            this.w();
         } else if ($$0.a(ask.k)) {
            blw $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bmc.aJ) {
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
      emc $$0 = this.dj();
      elx $$1 = this.cH();
      if (!this.gk() && this.w()) {
         int $$2 = this.dL().a(bmc.aI, $$1.g(8.0), blw::bx).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dL().z.i() < $$3)) {
            cdc $$4 = bmc.aI.a(this.dL());
            if ($$4 != null) {
               $$4.a(this.gf());
               $$4.e($$0);
               this.dL().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bz() {
      return this.bx();
   }

   public ic A() {
      return this.an.b(b);
   }

   private void a(ic $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(agn<?> $$0) {
      if (b.equals($$0)) {
         this.b(this.aq());
      }

      super.a($$0);
   }

   private int gm() {
      return this.an.b(c);
   }

   void b(int $$0) {
      if (!this.dL().B) {
         this.f(bnu.a).b(bU.a());
         if ($$0 == 0) {
            this.f(bnu.a).d(bU);
            this.a(art.wi, 1.0F, 1.0F);
            this.b(dnz.j);
         } else {
            this.a(art.wm, 1.0F, 1.0F);
            this.b(dnz.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float D(float $$0) {
      return aup.i($$0, this.cd, this.ce);
   }

   @Override
   public void a(zc $$0) {
      super.a($$0);
      this.aU = 0.0F;
      this.aV = 0.0F;
   }

   @Override
   public int ab() {
      return 180;
   }

   @Override
   public int fH() {
      return 180;
   }

   @Override
   public void g(blw $$0) {
   }

   public Optional<emc> E(float $$0) {
      if (this.cf != null && this.cg > 0) {
         double $$1 = (double)((float)this.cg - $$0) / 6.0;
         $$1 *= $$1;
         hx $$2 = this.dl();
         double $$3 = (double)($$2.u() - this.cf.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cf.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cf.w()) * $$1;
         return Optional.of(new emc(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<clv> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<clv> gf() {
      return Optional.ofNullable(this.gg());
   }

   @Nullable
   public clv gg() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? clv.a($$0) : null;
   }

   class a extends btk {
      private int b;

      public a() {
         this.a(EnumSet.of(btk.a.a, btk.a.b));
      }

      @Override
      public boolean a() {
         bmo $$0 = cdc.this.q();
         return $$0 != null && $$0.bx() ? cdc.this.dL().ak() != bjz.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cdc.this.b(100);
      }

      @Override
      public void d() {
         cdc.this.b(0);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (cdc.this.dL().ak() != bjz.a) {
            this.b--;
            bmo $$0 = cdc.this.q();
            if ($$0 != null) {
               cdc.this.I().a($$0, 180.0F, 180.0F);
               double $$1 = cdc.this.f((blw)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cdc.this.ag.a(10) * 20 / 2;
                     cdc.this.dL().b(new cgk(cdc.this.dL(), cdc.this, $$0, cdc.this.A().o()));
                     cdc.this.a(art.wn, 2.0F, (cdc.this.ag.i() - cdc.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cdc.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bsi {
      public b(bmq $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends bvd<bmo> {
      public c(cdc $$0) {
         super($$0, bmo.class, 10, true, false, $$0x -> $$0x instanceof cco);
      }

      @Override
      public boolean a() {
         return this.e.cg() == null ? false : super.a();
      }

      @Override
      protected elx a(double $$0) {
         ic $$1 = ((cdc)this.e).A();
         if ($$1.o() == ic.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ic.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bsm {
      public d(bmq $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ic $$0 = cdc.this.A().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cdc.cc));
         jb $$2 = $$0.q();
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
            : Optional.of((float)(aup.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends bvd<cfq> {
      public e(cdc $$0) {
         super($$0, cfq.class, true);
      }

      @Override
      public boolean a() {
         return cdc.this.dL().ak() == bjz.a ? false : super.a();
      }

      @Override
      protected elx a(double $$0) {
         ic $$1 = ((cdc)this.e).A();
         if ($$1.o() == ic.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ic.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends btk {
      private int b;

      @Override
      public boolean a() {
         return cdc.this.q() == null && cdc.this.ag.a(b(40)) == 0 && cdc.this.a(cdc.this.dl(), cdc.this.A());
      }

      @Override
      public boolean b() {
         return cdc.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cdc.this.ag.a(3)));
         cdc.this.b(30);
      }

      @Override
      public void d() {
         if (cdc.this.q() == null) {
            cdc.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
