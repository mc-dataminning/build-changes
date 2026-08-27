import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class car extends bvs implements blh<Optional<cix>>, cad {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bln bT = new bln(e, "Covered armor bonus", 20.0, bln.a.a);
   protected static final afc<hx> b = aff.a(car.class, afe.p);
   protected static final afc<Byte> c = aff.a(car.class, afe.a);
   protected static final afc<Byte> d = aff.a(car.class, afe.a);
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

   public car(bjx<? extends car> $$0, cqz $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new car.d(this);
   }

   @Override
   protected void z() {
      this.bO.a(1, new brm(this, ccx.class, 8.0F, 0.02F, true));
      this.bO.a(4, new car.a());
      this.bO.a(7, new car.f());
      this.bO.a(8, new brz(this));
      this.bP.a(1, new bsw(this, this.getClass()).a());
      this.bP.a(2, new car.e(this));
      this.bP.a(3, new car.c(this));
   }

   @Override
   protected bjt.b aU() {
      return bjt.b.a;
   }

   @Override
   public aqe da() {
      return aqe.f;
   }

   @Override
   protected aqc w() {
      return aqd.va;
   }

   @Override
   public void P() {
      if (!this.gj()) {
         super.P();
      }
   }

   @Override
   protected aqc m_() {
      return aqd.vg;
   }

   @Override
   protected aqc d(bir $$0) {
      return this.gj() ? aqd.vi : aqd.vh;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, hx.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static blo.a s() {
      return bkl.A().a(blp.l, 30.0);
   }

   @Override
   protected bqc F() {
      return new car.b(this);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.a(hx.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(rt $$0) {
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
   protected eia ao() {
      float $$0 = G(this.cd);
      hx $$1 = this.y().g();
      float $$2 = this.ag().k() / 2.0F;
      return a($$1, $$0).d(this.dq() - (double)$$2, this.ds(), this.dw() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - asy.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gh() {
      this.cc = this.cd;
      float $$0 = (float)this.gl() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = asy.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = asy.a(this.cd + 0.05F, 0.0F, $$0);
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
         for (bjt $$5 : this.dL().a(this, a($$2, $$1, $$0).d(this.dq() - 0.5, this.ds(), this.dw() - 0.5), bjw.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof car) && !$$5.af) {
               $$5.a(bkp.e, new eif((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static eia a(hx $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static eia a(hx $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new eia(ht.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(bjt $$0, boolean $$1) {
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
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      this.r(0.0F);
      this.aW = this.dB();
      this.bn();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bkp $$0, eif $$1) {
      if ($$0 == bkp.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public eif do() {
      return eif.b;
   }

   @Override
   public void f(eif $$0) {
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      ht $$3 = this.dl();
      if (this.bN()) {
         super.e($$0, $$1, $$2);
      } else {
         super.e((double)asy.a($$0) + 0.5, (double)asy.a($$1 + 0.5), (double)asy.a($$2) + 0.5);
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
            eia $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dL().a(this, $$3);
         }
      }
   }

   private boolean j(ht $$0) {
      dgb $$1 = this.dL().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(cuc.bQ) && $$0.equals(this.dl());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.fU() && this.bv()) {
         ht $$0 = this.dl();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ht $$2 = $$0.b(asy.b(this.ag, -8, 8), asy.b(this.ag, -8, 8), asy.b(this.ag, -8, 8));
            if ($$2.v() > this.dL().I_() && this.dL().t($$2) && this.dL().C_().a($$2) && this.dL().a(this, new eia($$2).h(1.0E-6))) {
               hx $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ae();
                  this.a($$3);
                  this.a(aqd.vl, 1.0F, 1.0F);
                  this.e((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dL().a(dkl.R, $$0, dkl.a.a(this));
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
   public boolean a(bir $$0, float $$1) {
      if (this.gj()) {
         bjt $$2 = $$0.c();
         if ($$2 instanceof cdd) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eu() < (double)this.eL() * 0.5 && this.ag.a(4) == 0) {
            this.t();
         } else if ($$0.a(aqu.j)) {
            bjt $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == bjx.aH) {
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
      eif $$0 = this.dj();
      eia $$1 = this.cG();
      if (!this.gj() && this.t()) {
         int $$2 = this.dL().a(bjx.aG, $$1.g(8.0), bjt::bv).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dL().z.i() < $$3)) {
            car $$4 = bjx.aG.a(this.dL());
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
   public void a(afc<?> $$0) {
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
         this.a(blp.a).b(bT.a());
         if ($$0 == 0) {
            this.a(blp.a).c(bT);
            this.a(aqd.vf, 1.0F, 1.0F);
            this.a(dkl.j);
         } else {
            this.a(aqd.vj, 1.0F, 1.0F);
            this.a(dkl.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return asy.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 0.5F;
   }

   @Override
   public void a(xv $$0) {
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
   public void g(bjt $$0) {
   }

   public Optional<eif> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         ht $$2 = this.dl();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new eif(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<cix> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cix> ge() {
      return Optional.ofNullable(this.gf());
   }

   @Nullable
   public cix gf() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? cix.a($$0) : null;
   }

   class a extends bre {
      private int b;

      public a() {
         this.a(EnumSet.of(bre.a.a, bre.a.b));
      }

      @Override
      public boolean a() {
         bkj $$0 = car.this.q();
         return $$0 != null && $$0.bv() ? car.this.dL().ai() != bhy.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         car.this.b(100);
      }

      @Override
      public void d() {
         car.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (car.this.dL().ai() != bhy.a) {
            this.b--;
            bkj $$0 = car.this.q();
            if ($$0 != null) {
               car.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = car.this.f($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + car.this.ag.a(10) * 20 / 2;
                     car.this.dL().b(new cdr(car.this.dL(), car.this, $$0, car.this.y().o()));
                     car.this.a(aqd.vk, 2.0F, (car.this.ag.i() - car.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  car.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bqc {
      public b(bkl $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends bsx<bkj> {
      public c(car $$0) {
         super($$0, bkj.class, 10, true, false, $$0x -> $$0x instanceof cad);
      }

      @Override
      public boolean a() {
         return this.e.cf() == null ? false : super.a();
      }

      @Override
      protected eia a(double $$0) {
         hx $$1 = ((car)this.e).y();
         if ($$1.o() == hx.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hx.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bqg {
      public d(bkl $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         hx $$0 = car.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(car.cb));
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
            : Optional.of((float)(asy.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends bsx<ccx> {
      public e(car $$0) {
         super($$0, ccx.class, true);
      }

      @Override
      public boolean a() {
         return car.this.dL().ai() == bhy.a ? false : super.a();
      }

      @Override
      protected eia a(double $$0) {
         hx $$1 = ((car)this.e).y();
         if ($$1.o() == hx.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hx.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bre {
      private int b;

      @Override
      public boolean a() {
         return car.this.q() == null && car.this.ag.a(b(40)) == 0 && car.this.a(car.this.dl(), car.this.y());
      }

      @Override
      public boolean b() {
         return car.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + car.this.ag.a(3)));
         car.this.b(30);
      }

      @Override
      public void d() {
         if (car.this.q() == null) {
            car.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
