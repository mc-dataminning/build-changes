import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzq extends bur implements bkg<Optional<chv>>, bzc {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bkm bT = new bkm(e, "Covered armor bonus", 20.0, bkm.a.a);
   protected static final aeg<hc> b = aej.a(bzq.class, aei.p);
   protected static final aeg<Byte> c = aej.a(bzq.class, aei.a);
   protected static final aeg<Byte> d = aej.a(bzq.class, aei.a);
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

   public bzq(biw<? extends bzq> $$0, cpx $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new bzq.d(this);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bql(this, cbw.class, 8.0F, 0.02F, true));
      this.bO.a(4, new bzq.a());
      this.bO.a(7, new bzq.f());
      this.bO.a(8, new bqy(this));
      this.bP.a(1, new brv(this, this.getClass()).a());
      this.bP.a(2, new bzq.e(this));
      this.bP.a(3, new bzq.c(this));
   }

   @Override
   protected bis.b aU() {
      return bis.b.a;
   }

   @Override
   public apg da() {
      return apg.f;
   }

   @Override
   protected ape w() {
      return apf.uY;
   }

   @Override
   public void P() {
      if (!this.gi()) {
         super.P();
      }
   }

   @Override
   protected ape l_() {
      return apf.ve;
   }

   @Override
   protected ape d(bhq $$0) {
      return this.gi() ? apf.vg : apf.vf;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, hc.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bkn.a s() {
      return bjk.A().a(bko.a, 30.0);
   }

   @Override
   protected bpb F() {
      return new bzq.b(this);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.a(hc.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.an.b(c));
      $$0.a("Color", this.an.b(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B && !this.bN() && !this.a(this.dl(), this.y())) {
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
   protected ehk ao() {
      float $$0 = G(this.cd);
      hc $$1 = this.y().g();
      float $$2 = this.ag().k() / 2.0F;
      return a($$1, $$0).d(this.dq() - (double)$$2, this.ds(), this.dw() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - ary.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gg() {
      this.cc = this.cd;
      float $$0 = (float)this.gk() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = ary.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = ary.a(this.cd + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gh() {
      this.ap();
      float $$0 = G(this.cd);
      float $$1 = G(this.cc);
      hc $$2 = this.y().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (bis $$5 : this.dL().a(this, a($$2, $$1, $$0).d(this.dq() - 0.5, this.ds(), this.dw() - 0.5), biv.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof bzq) && !$$5.af) {
               $$5.a(bjo.e, new ehp((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ehk a(hc $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static ehk a(hc $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new ehk(gw.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(bis $$0, boolean $$1) {
      if (this.dL().w_()) {
         this.ce = null;
         this.cf = 0;
      }

      this.a(hc.a);
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
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      this.r(0.0F);
      this.aW = this.dB();
      this.bn();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bjo $$0, ehp $$1) {
      if ($$0 == bjo.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ehp do() {
      return ehp.b;
   }

   @Override
   public void f(ehp $$0) {
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      gw $$3 = this.dl();
      if (this.bN()) {
         super.e($$0, $$1, $$2);
      } else {
         super.e((double)ary.a($$0) + 0.5, (double)ary.a($$1 + 0.5), (double)ary.a($$2) + 0.5);
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
            ehk $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dL().a(this, $$3);
         }
      }
   }

   private boolean j(gw $$0) {
      dfl $$1 = this.dL().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(csy.bQ) && $$0.equals(this.dl());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.fT() && this.bv()) {
         gw $$0 = this.dl();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            gw $$2 = $$0.b(ary.b(this.ag, -8, 8), ary.b(this.ag, -8, 8), ary.b(this.ag, -8, 8));
            if ($$2.v() > this.dL().H_() && this.dL().t($$2) && this.dL().B_().a($$2) && this.dL().a(this, new ehk($$2).h(1.0E-6))) {
               hc $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ae();
                  this.a($$3);
                  this.a(apf.vj, 1.0F, 1.0F);
                  this.e((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dL().a(djv.R, $$0, djv.a.a(this));
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
   public boolean a(bhq $$0, float $$1) {
      if (this.gi()) {
         bis $$2 = $$0.c();
         if ($$2 instanceof ccc) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eu() < (double)this.eL() * 0.5 && this.ag.a(4) == 0) {
            this.t();
         } else if ($$0.a(apw.j)) {
            bis $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == biw.aH) {
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
      ehp $$0 = this.dj();
      ehk $$1 = this.cG();
      if (!this.gi() && this.t()) {
         int $$2 = this.dL().a(biw.aG, $$1.g(8.0), bis::bv).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dL().z.i() < $$3)) {
            bzq $$4 = biw.aG.a(this.dL());
            if ($$4 != null) {
               $$4.a(this.gd());
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

   public hc y() {
      return this.an.b(b);
   }

   private void a(hc $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(aeg<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.ao());
      }

      super.a($$0);
   }

   private int gk() {
      return this.an.b(c);
   }

   void b(int $$0) {
      if (!this.dL().B) {
         this.a(bko.i).b(bT.a());
         if ($$0 == 0) {
            this.a(bko.i).c(bT);
            this.a(apf.vd, 1.0F, 1.0F);
            this.a(djv.j);
         } else {
            this.a(apf.vh, 1.0F, 1.0F);
            this.a(djv.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return ary.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 0.5F;
   }

   @Override
   public void a(wz $$0) {
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
   public void g(bis $$0) {
   }

   @Override
   public float bD() {
      return 0.0F;
   }

   public Optional<ehp> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         gw $$2 = this.dl();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new ehp(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<chv> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<chv> gd() {
      return Optional.ofNullable(this.ge());
   }

   @Nullable
   public chv ge() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? chv.a($$0) : null;
   }

   class a extends bqd {
      private int b;

      public a() {
         this.a(EnumSet.of(bqd.a.a, bqd.a.b));
      }

      @Override
      public boolean a() {
         bji $$0 = bzq.this.q();
         return $$0 != null && $$0.bv() ? bzq.this.dL().ai() != bgx.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         bzq.this.b(100);
      }

      @Override
      public void d() {
         bzq.this.b(0);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         if (bzq.this.dL().ai() != bgx.a) {
            this.b--;
            bji $$0 = bzq.this.q();
            if ($$0 != null) {
               bzq.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = bzq.this.f($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + bzq.this.ag.a(10) * 20 / 2;
                     bzq.this.dL().b(new ccq(bzq.this.dL(), bzq.this, $$0, bzq.this.y().o()));
                     bzq.this.a(apf.vi, 2.0F, (bzq.this.ag.i() - bzq.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  bzq.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bpb {
      public b(bjk $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends brw<bji> {
      public c(bzq $$0) {
         super($$0, bji.class, 10, true, false, $$0x -> $$0x instanceof bzc);
      }

      @Override
      public boolean a() {
         return this.e.cf() == null ? false : super.a();
      }

      @Override
      protected ehk a(double $$0) {
         hc $$1 = ((bzq)this.e).y();
         if ($$1.o() == hc.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hc.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bpf {
      public d(bjk $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         hc $$0 = bzq.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(bzq.cb));
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
            : Optional.of((float)(ary.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends brw<cbw> {
      public e(bzq $$0) {
         super($$0, cbw.class, true);
      }

      @Override
      public boolean a() {
         return bzq.this.dL().ai() == bgx.a ? false : super.a();
      }

      @Override
      protected ehk a(double $$0) {
         hc $$1 = ((bzq)this.e).y();
         if ($$1.o() == hc.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hc.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bqd {
      private int b;

      @Override
      public boolean a() {
         return bzq.this.q() == null && bzq.this.ag.a(b(40)) == 0 && bzq.this.a(bzq.this.dl(), bzq.this.y());
      }

      @Override
      public boolean b() {
         return bzq.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + bzq.this.ag.a(3)));
         bzq.this.b(30);
      }

      @Override
      public void d() {
         if (bzq.this.q() == null) {
            bzq.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
