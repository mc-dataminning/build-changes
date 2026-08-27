import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbt extends bwu implements bmj<Optional<ckc>>, cbf {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bmp bT = new bmp(e, "Covered armor bonus", 20.0, bmp.a.a);
   protected static final afs<ib> b = afv.a(cbt.class, afu.p);
   protected static final afs<Byte> c = afv.a(cbt.class, afu.a);
   protected static final afs<Byte> d = afv.a(cbt.class, afu.a);
   private static final int bU = 6;
   private static final byte bV = 16;
   private static final byte bW = 16;
   private static final int bX = 8;
   private static final int bY = 8;
   private static final int bZ = 5;
   private static final float ca = 0.05F;
   static final Vector3f cb = ac.a(() -> {
      ja $$0 = ib.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private float cc;
   private float cd;
   @Nullable
   private hx ce;
   private int cf;
   private static final float cg = 1.0F;

   public cbt(bkz<? extends cbt> $$0, csf $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new cbt.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bso(this, cdz.class, 8.0F, 0.02F, true));
      this.bO.a(4, new cbt.a());
      this.bO.a(7, new cbt.f());
      this.bO.a(8, new btb(this));
      this.bP.a(1, new bty(this, this.getClass()).a());
      this.bP.a(2, new cbt.e(this));
      this.bP.a(3, new cbt.c(this));
   }

   @Override
   protected bkv.b aW() {
      return bkv.b.a;
   }

   @Override
   public aqw dc() {
      return aqw.f;
   }

   @Override
   protected aqu y() {
      return aqv.vt;
   }

   @Override
   public void R() {
      if (!this.gk()) {
         super.R();
      }
   }

   @Override
   protected aqu n_() {
      return aqv.vz;
   }

   @Override
   protected aqu d(bjt $$0) {
      return this.gk() ? aqv.vB : aqv.vA;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, ib.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bmq.a u() {
      return bln.C().a(bmr.l, 30.0);
   }

   @Override
   protected bre H() {
      return new cbt.b(this);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.a(ib.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(sd $$0) {
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
      ib $$0 = this.i(this.dn());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.w();
      }
   }

   @Override
   protected eju aq() {
      float $$0 = G(this.cd);
      ib $$1 = this.A().g();
      float $$2 = this.ai().k() / 2.0F;
      return a($$1, $$0).d(this.ds() - (double)$$2, this.du(), this.dy() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - atq.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gi() {
      this.cc = this.cd;
      float $$0 = (float)this.gm() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = atq.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = atq.a(this.cd + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gj() {
      this.ar();
      float $$0 = G(this.cd);
      float $$1 = G(this.cc);
      ib $$2 = this.A().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (bkv $$5 : this.dN().a(this, a($$2, $$1, $$0).d(this.ds() - 0.5, this.du(), this.dy() - 0.5), bky.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof cbt) && !$$5.af) {
               $$5.a(blr.e, new ejz((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static eju a(ib $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static eju a(ib $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new eju(hx.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(bkv $$0, boolean $$1) {
      if (this.dN().y_()) {
         this.ce = null;
         this.cf = 0;
      }

      this.a(ib.a);
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
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      this.r(0.0F);
      this.aW = this.dD();
      this.bp();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(blr $$0, ejz $$1) {
      if ($$0 == blr.d) {
         this.w();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ejz dq() {
      return ejz.b;
   }

   @Override
   public void g(ejz $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      hx $$3 = this.dn();
      if (this.bO()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)atq.a($$0) + 0.5, (double)atq.a($$1 + 0.5), (double)atq.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         hx $$4 = this.dn();
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
   protected ib i(hx $$0) {
      for (ib $$1 : ib.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(hx $$0, ib $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         ib $$2 = $$1.g();
         if (!this.dN().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            eju $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dN().a(this, $$3);
         }
      }
   }

   private boolean j(hx $$0) {
      dhn $$1 = this.dN().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(cvh.bQ) && $$0.equals(this.dn());
         return !$$2;
      }
   }

   protected boolean w() {
      if (!this.fV() && this.bx()) {
         hx $$0 = this.dn();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            hx $$2 = $$0.b(atq.b(this.ag, -8, 8), atq.b(this.ag, -8, 8), atq.b(this.ag, -8, 8));
            if ($$2.v() > this.dN().J_() && this.dN().t($$2) && this.dN().D_().a($$2) && this.dN().a(this, new eju($$2).h(1.0E-6))) {
               ib $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(aqv.vE, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dN().a(dlx.R, $$0, dlx.a.a(this));
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
   public boolean a(bjt $$0, float $$1) {
      if (this.gk()) {
         bkv $$2 = $$0.c();
         if ($$2 instanceof cef) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ew() < (double)this.eN() * 0.5 && this.ag.a(4) == 0) {
            this.w();
         } else if ($$0.a(arm.j)) {
            bkv $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bkz.aH) {
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
      ejz $$0 = this.dl();
      eju $$1 = this.cH();
      if (!this.gk() && this.w()) {
         int $$2 = this.dN().a(bkz.aG, $$1.g(8.0), bkv::bx).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dN().z.i() < $$3)) {
            cbt $$4 = bkz.aG.a(this.dN());
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

   public ib A() {
      return this.an.b(b);
   }

   private void a(ib $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(afs<?> $$0) {
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
         this.a(bmr.a).b(bT.a());
         if ($$0 == 0) {
            this.a(bmr.a).c(bT);
            this.a(aqv.vy, 1.0F, 1.0F);
            this.a(dlx.j);
         } else {
            this.a(aqv.vC, 1.0F, 1.0F);
            this.a(dlx.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return atq.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 0.5F;
   }

   @Override
   public void a(yi $$0) {
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
   public void g(bkv $$0) {
   }

   public Optional<ejz> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         hx $$2 = this.dn();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new ejz(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<ckc> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<ckc> gf() {
      return Optional.ofNullable(this.gg());
   }

   @Nullable
   public ckc gg() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? ckc.a($$0) : null;
   }

   class a extends bsg {
      private int b;

      public a() {
         this.a(EnumSet.of(bsg.a.a, bsg.a.b));
      }

      @Override
      public boolean a() {
         bll $$0 = cbt.this.q();
         return $$0 != null && $$0.bx() ? cbt.this.dN().aj() != biy.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cbt.this.b(100);
      }

      @Override
      public void d() {
         cbt.this.b(0);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (cbt.this.dN().aj() != biy.a) {
            this.b--;
            bll $$0 = cbt.this.q();
            if ($$0 != null) {
               cbt.this.I().a($$0, 180.0F, 180.0F);
               double $$1 = cbt.this.f((bkv)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cbt.this.ag.a(10) * 20 / 2;
                     cbt.this.dN().b(new cet(cbt.this.dN(), cbt.this, $$0, cbt.this.A().o()));
                     cbt.this.a(aqv.vD, 2.0F, (cbt.this.ag.i() - cbt.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cbt.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bre {
      public b(bln $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends btz<bll> {
      public c(cbt $$0) {
         super($$0, bll.class, 10, true, false, $$0x -> $$0x instanceof cbf);
      }

      @Override
      public boolean a() {
         return this.e.cg() == null ? false : super.a();
      }

      @Override
      protected eju a(double $$0) {
         ib $$1 = ((cbt)this.e).A();
         if ($$1.o() == ib.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ib.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bri {
      public d(bln $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ib $$0 = cbt.this.A().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cbt.cb));
         ja $$2 = $$0.q();
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
            : Optional.of((float)(atq.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends btz<cdz> {
      public e(cbt $$0) {
         super($$0, cdz.class, true);
      }

      @Override
      public boolean a() {
         return cbt.this.dN().aj() == biy.a ? false : super.a();
      }

      @Override
      protected eju a(double $$0) {
         ib $$1 = ((cbt)this.e).A();
         if ($$1.o() == ib.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ib.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bsg {
      private int b;

      @Override
      public boolean a() {
         return cbt.this.q() == null && cbt.this.ag.a(b(40)) == 0 && cbt.this.a(cbt.this.dn(), cbt.this.A());
      }

      @Override
      public boolean b() {
         return cbt.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cbt.this.ag.a(3)));
         cbt.this.b(30);
      }

      @Override
      public void d() {
         if (cbt.this.q() == null) {
            cbt.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
