import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbg extends bwh implements blw<Optional<cjp>>, cas {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bmc bT = new bmc(e, "Covered armor bonus", 20.0, bmc.a.a);
   protected static final afm<hx> b = afp.a(cbg.class, afo.p);
   protected static final afm<Byte> c = afp.a(cbg.class, afo.a);
   protected static final afm<Byte> d = afp.a(cbg.class, afo.a);
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

   public cbg(bkm<? extends cbg> $$0, crs $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new cbg.d(this);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bsb(this, cdm.class, 8.0F, 0.02F, true));
      this.bO.a(4, new cbg.a());
      this.bO.a(7, new cbg.f());
      this.bO.a(8, new bso(this));
      this.bP.a(1, new btl(this, this.getClass()).a());
      this.bP.a(2, new cbg.e(this));
      this.bP.a(3, new cbg.c(this));
   }

   @Override
   protected bki.b aU() {
      return bki.b.a;
   }

   @Override
   public aqo da() {
      return aqo.f;
   }

   @Override
   protected aqm w() {
      return aqn.vc;
   }

   @Override
   public void P() {
      if (!this.gj()) {
         super.P();
      }
   }

   @Override
   protected aqm m_() {
      return aqn.vi;
   }

   @Override
   protected aqm d(bjg $$0) {
      return this.gj() ? aqn.vk : aqn.vj;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, hx.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bmd.a s() {
      return bla.A().a(bme.l, 30.0);
   }

   @Override
   protected bqr F() {
      return new cbg.b(this);
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
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.an.b(c));
      $$0.a("Color", this.an.b(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B && !this.bN() && !this.a(this.dl(), this.y())) {
         this.gg();
      }

      if (this.gh()) {
         this.gi();
      }

      if (this.dL().B) {
         if (this.cf > 0) {
            this.cf--;
         } else {
            this.ce = null;
         }
      }
   }

   private void gg() {
      hx $$0 = this.i(this.dl());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected ejd ao() {
      float $$0 = G(this.cd);
      hx $$1 = this.y().g();
      float $$2 = this.ag().k() / 2.0F;
      return a($$1, $$0).d(this.dq() - (double)$$2, this.ds(), this.dw() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - ati.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gh() {
      this.cc = this.cd;
      float $$0 = (float)this.gl() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = ati.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = ati.a(this.cd + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gi() {
      this.ap();
      float $$0 = G(this.cd);
      float $$1 = G(this.cc);
      hx $$2 = this.y().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (bki $$5 : this.dL().a(this, a($$2, $$1, $$0).d(this.dq() - 0.5, this.ds(), this.dw() - 0.5), bkl.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof cbg) && !$$5.af) {
               $$5.a(ble.e, new eji((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ejd a(hx $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static ejd a(hx $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new ejd(ht.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(bki $$0, boolean $$1) {
      if (this.dL().x_()) {
         this.ce = null;
         this.cf = 0;
      }

      this.a(hx.a);
      return super.a($$0, $$1);
   }

   @Override
   public void aa() {
      super.aa();
      if (this.dL().B) {
         this.ce = this.dl();
      }

      this.aV = 0.0F;
      this.aU = 0.0F;
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      this.r(0.0F);
      this.aW = this.dB();
      this.bn();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(ble $$0, eji $$1) {
      if ($$0 == ble.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public eji do() {
      return eji.b;
   }

   @Override
   public void f(eji $$0) {
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      ht $$3 = this.dl();
      if (this.bN()) {
         super.e($$0, $$1, $$2);
      } else {
         super.e((double)ati.a($$0) + 0.5, (double)ati.a($$1 + 0.5), (double)ati.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         ht $$4 = this.dl();
         if (!$$4.equals($$3)) {
            this.an.b(c, (byte)0);
            this.au = true;
            if (this.dL().B && !this.bN() && !$$4.equals(this.ce)) {
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
         if (!this.dL().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ejd $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dL().a(this, $$3);
         }
      }
   }

   private boolean j(ht $$0) {
      dgw $$1 = this.dL().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(cuv.bQ) && $$0.equals(this.dl());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.fU() && this.bv()) {
         ht $$0 = this.dl();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ht $$2 = $$0.b(ati.b(this.ag, -8, 8), ati.b(this.ag, -8, 8), ati.b(this.ag, -8, 8));
            if ($$2.v() > this.dL().I_() && this.dL().t($$2) && this.dL().C_().a($$2) && this.dL().a(this, new ejd($$2).h(1.0E-6))) {
               hx $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ae();
                  this.a($$3);
                  this.a(aqn.vn, 1.0F, 1.0F);
                  this.e((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dL().a(dlg.R, $$0, dlg.a.a(this));
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
   public boolean a(bjg $$0, float $$1) {
      if (this.gj()) {
         bki $$2 = $$0.c();
         if ($$2 instanceof cds) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eu() < (double)this.eL() * 0.5 && this.ag.a(4) == 0) {
            this.t();
         } else if ($$0.a(are.j)) {
            bki $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == bkm.aH) {
               this.gk();
            }
         }

         return true;
      }
   }

   private boolean gj() {
      return this.gl() == 0;
   }

   private void gk() {
      eji $$0 = this.dj();
      ejd $$1 = this.cG();
      if (!this.gj() && this.t()) {
         int $$2 = this.dL().a(bkm.aG, $$1.g(8.0), bki::bv).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dL().z.i() < $$3)) {
            cbg $$4 = bkm.aG.a(this.dL());
            if ($$4 != null) {
               $$4.a(this.ge());
               $$4.d($$0);
               this.dL().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bx() {
      return this.bv();
   }

   public hx y() {
      return this.an.b(b);
   }

   private void a(hx $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(afm<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.ao());
      }

      super.a($$0);
   }

   private int gl() {
      return this.an.b(c);
   }

   void b(int $$0) {
      if (!this.dL().B) {
         this.a(bme.a).b(bT.a());
         if ($$0 == 0) {
            this.a(bme.a).c(bT);
            this.a(aqn.vh, 1.0F, 1.0F);
            this.a(dlg.j);
         } else {
            this.a(aqn.vl, 1.0F, 1.0F);
            this.a(dlg.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return ati.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 0.5F;
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      this.aU = 0.0F;
      this.aV = 0.0F;
   }

   @Override
   public int Y() {
      return 180;
   }

   @Override
   public int Z() {
      return 180;
   }

   @Override
   public void g(bki $$0) {
   }

   public Optional<eji> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         ht $$2 = this.dl();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new eji(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<cjp> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cjp> ge() {
      return Optional.ofNullable(this.gf());
   }

   @Nullable
   public cjp gf() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? cjp.a($$0) : null;
   }

   class a extends brt {
      private int b;

      public a() {
         this.a(EnumSet.of(brt.a.a, brt.a.b));
      }

      @Override
      public boolean a() {
         bky $$0 = cbg.this.q();
         return $$0 != null && $$0.bv() ? cbg.this.dL().ai() != bin.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cbg.this.b(100);
      }

      @Override
      public void d() {
         cbg.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (cbg.this.dL().ai() != bin.a) {
            this.b--;
            bky $$0 = cbg.this.q();
            if ($$0 != null) {
               cbg.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = cbg.this.f($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cbg.this.ag.a(10) * 20 / 2;
                     cbg.this.dL().b(new ceg(cbg.this.dL(), cbg.this, $$0, cbg.this.y().o()));
                     cbg.this.a(aqn.vm, 2.0F, (cbg.this.ag.i() - cbg.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cbg.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bqr {
      public b(bla $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends btm<bky> {
      public c(cbg $$0) {
         super($$0, bky.class, 10, true, false, $$0x -> $$0x instanceof cas);
      }

      @Override
      public boolean a() {
         return this.e.cf() == null ? false : super.a();
      }

      @Override
      protected ejd a(double $$0) {
         hx $$1 = ((cbg)this.e).y();
         if ($$1.o() == hx.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hx.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bqv {
      public d(bla $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         hx $$0 = cbg.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cbg.cb));
         iw $$2 = $$0.q();
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
            : Optional.of((float)(ati.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends btm<cdm> {
      public e(cbg $$0) {
         super($$0, cdm.class, true);
      }

      @Override
      public boolean a() {
         return cbg.this.dL().ai() == bin.a ? false : super.a();
      }

      @Override
      protected ejd a(double $$0) {
         hx $$1 = ((cbg)this.e).y();
         if ($$1.o() == hx.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hx.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends brt {
      private int b;

      @Override
      public boolean a() {
         return cbg.this.q() == null && cbg.this.ag.a(b(40)) == 0 && cbg.this.a(cbg.this.dl(), cbg.this.y());
      }

      @Override
      public boolean b() {
         return cbg.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cbg.this.ag.a(3)));
         cbg.this.b(30);
      }

      @Override
      public void d() {
         if (cbg.this.q() == null) {
            cbg.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
