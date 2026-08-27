import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzu extends buv implements bkk<Optional<chz>>, bzg {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bkq bT = new bkq(e, "Covered armor bonus", 20.0, bkq.a.a);
   protected static final aef<ha> b = aei.a(bzu.class, aeh.p);
   protected static final aef<Byte> c = aei.a(bzu.class, aeh.a);
   protected static final aef<Byte> d = aei.a(bzu.class, aeh.a);
   private static final int bU = 6;
   private static final byte bV = 16;
   private static final byte bW = 16;
   private static final int bX = 8;
   private static final int bY = 8;
   private static final int bZ = 5;
   private static final float ca = 0.05F;
   static final Vector3f cb = ac.a(() -> {
      hy $$0 = ha.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private float cc;
   private float cd;
   @Nullable
   private gw ce;
   private int cf;
   private static final float cg = 1.0F;

   public bzu(bja<? extends bzu> $$0, cqb $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new bzu.d(this);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqp(this, cca.class, 8.0F, 0.02F, true));
      this.bO.a(4, new bzu.a());
      this.bO.a(7, new bzu.f());
      this.bO.a(8, new brc(this));
      this.bP.a(1, new brz(this, this.getClass()).a());
      this.bP.a(2, new bzu.e(this));
      this.bP.a(3, new bzu.c(this));
   }

   @Override
   protected biw.b aU() {
      return biw.b.a;
   }

   @Override
   public aph da() {
      return aph.f;
   }

   @Override
   protected apf w() {
      return apg.uY;
   }

   @Override
   public void P() {
      if (!this.gj()) {
         super.P();
      }
   }

   @Override
   protected apf l_() {
      return apg.ve;
   }

   @Override
   protected apf d(bhu $$0) {
      return this.gj() ? apg.vg : apg.vf;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, ha.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bkr.a s() {
      return bjo.A().a(bks.l, 30.0);
   }

   @Override
   protected bpf F() {
      return new bzu.b(this);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a(ha.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(qw $$0) {
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
      ha $$0 = this.i(this.dl());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected ehc ao() {
      float $$0 = G(this.cd);
      ha $$1 = this.y().g();
      float $$2 = this.ag().k() / 2.0F;
      return a($$1, $$0).d(this.dq() - (double)$$2, this.ds(), this.dw() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - asb.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gh() {
      this.cc = this.cd;
      float $$0 = (float)this.gl() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = asb.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = asb.a(this.cd + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gi() {
      this.ap();
      float $$0 = G(this.cd);
      float $$1 = G(this.cc);
      ha $$2 = this.y().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (biw $$5 : this.dL().a(this, a($$2, $$1, $$0).d(this.dq() - 0.5, this.ds(), this.dw() - 0.5), biz.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof bzu) && !$$5.af) {
               $$5.a(bjs.e, new ehh((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ehc a(ha $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static ehc a(ha $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new ehc(gw.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(biw $$0, boolean $$1) {
      if (this.dL().w_()) {
         this.ce = null;
         this.cf = 0;
      }

      this.a(ha.a);
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
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      this.r(0.0F);
      this.aW = this.dB();
      this.bn();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bjs $$0, ehh $$1) {
      if ($$0 == bjs.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ehh do() {
      return ehh.b;
   }

   @Override
   public void f(ehh $$0) {
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      gw $$3 = this.dl();
      if (this.bN()) {
         super.e($$0, $$1, $$2);
      } else {
         super.e((double)asb.a($$0) + 0.5, (double)asb.a($$1 + 0.5), (double)asb.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         gw $$4 = this.dl();
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
   protected ha i(gw $$0) {
      for (ha $$1 : ha.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(gw $$0, ha $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         ha $$2 = $$1.g();
         if (!this.dL().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ehc $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dL().a(this, $$3);
         }
      }
   }

   private boolean j(gw $$0) {
      dfd $$1 = this.dL().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(cte.bQ) && $$0.equals(this.dl());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.fU() && this.bv()) {
         gw $$0 = this.dl();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            gw $$2 = $$0.b(asb.b(this.ag, -8, 8), asb.b(this.ag, -8, 8), asb.b(this.ag, -8, 8));
            if ($$2.v() > this.dL().H_() && this.dL().t($$2) && this.dL().B_().a($$2) && this.dL().a(this, new ehc($$2).h(1.0E-6))) {
               ha $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ae();
                  this.a($$3);
                  this.a(apg.vj, 1.0F, 1.0F);
                  this.e((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dL().a(djn.R, $$0, djn.a.a(this));
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
   public boolean a(bhu $$0, float $$1) {
      if (this.gj()) {
         biw $$2 = $$0.c();
         if ($$2 instanceof ccg) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eu() < (double)this.eL() * 0.5 && this.ag.a(4) == 0) {
            this.t();
         } else if ($$0.a(apx.j)) {
            biw $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == bja.aH) {
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
      ehh $$0 = this.dj();
      ehc $$1 = this.cG();
      if (!this.gj() && this.t()) {
         int $$2 = this.dL().a(bja.aG, $$1.g(8.0), biw::bv).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dL().z.i() < $$3)) {
            bzu $$4 = bja.aG.a(this.dL());
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

   public ha y() {
      return this.an.b(b);
   }

   private void a(ha $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(aef<?> $$0) {
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
         this.a(bks.a).b(bT.a());
         if ($$0 == 0) {
            this.a(bks.a).c(bT);
            this.a(apg.vd, 1.0F, 1.0F);
            this.a(djn.j);
         } else {
            this.a(apg.vh, 1.0F, 1.0F);
            this.a(djn.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return asb.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return 0.5F;
   }

   @Override
   public void a(wy $$0) {
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
   public void g(biw $$0) {
   }

   @Override
   public float bD() {
      return 0.0F;
   }

   public Optional<ehh> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         gw $$2 = this.dl();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new ehh(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<chz> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<chz> ge() {
      return Optional.ofNullable(this.gf());
   }

   @Nullable
   public chz gf() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? chz.a($$0) : null;
   }

   class a extends bqh {
      private int b;

      public a() {
         this.a(EnumSet.of(bqh.a.a, bqh.a.b));
      }

      @Override
      public boolean a() {
         bjm $$0 = bzu.this.q();
         return $$0 != null && $$0.bv() ? bzu.this.dL().ai() != bhb.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         bzu.this.b(100);
      }

      @Override
      public void d() {
         bzu.this.b(0);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         if (bzu.this.dL().ai() != bhb.a) {
            this.b--;
            bjm $$0 = bzu.this.q();
            if ($$0 != null) {
               bzu.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = bzu.this.f($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + bzu.this.ag.a(10) * 20 / 2;
                     bzu.this.dL().b(new ccu(bzu.this.dL(), bzu.this, $$0, bzu.this.y().o()));
                     bzu.this.a(apg.vi, 2.0F, (bzu.this.ag.i() - bzu.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  bzu.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bpf {
      public b(bjo $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends bsa<bjm> {
      public c(bzu $$0) {
         super($$0, bjm.class, 10, true, false, $$0x -> $$0x instanceof bzg);
      }

      @Override
      public boolean a() {
         return this.e.cf() == null ? false : super.a();
      }

      @Override
      protected ehc a(double $$0) {
         ha $$1 = ((bzu)this.e).y();
         if ($$1.o() == ha.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ha.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bpj {
      public d(bjo $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ha $$0 = bzu.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(bzu.cb));
         hy $$2 = $$0.q();
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
            : Optional.of((float)(asb.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends bsa<cca> {
      public e(bzu $$0) {
         super($$0, cca.class, true);
      }

      @Override
      public boolean a() {
         return bzu.this.dL().ai() == bhb.a ? false : super.a();
      }

      @Override
      protected ehc a(double $$0) {
         ha $$1 = ((bzu)this.e).y();
         if ($$1.o() == ha.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ha.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bqh {
      private int b;

      @Override
      public boolean a() {
         return bzu.this.q() == null && bzu.this.ag.a(b(40)) == 0 && bzu.this.a(bzu.this.dl(), bzu.this.y());
      }

      @Override
      public boolean b() {
         return bzu.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + bzu.this.ag.a(3)));
         bzu.this.b(30);
      }

      @Override
      public void d() {
         if (bzu.this.q() == null) {
            bzu.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
