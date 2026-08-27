import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cgg extends cbc implements bqo<Optional<cpd>>, cfs {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bqu bX = new bqu(e, "Covered armor bonus", 20.0, bqu.a.a);
   protected static final aim<ih> b = aiq.a(cgg.class, aio.p);
   protected static final aim<Byte> c = aiq.a(cgg.class, aio.a);
   protected static final aim<Byte> d = aiq.a(cgg.class, aio.a);
   private static final int bY = 6;
   private static final byte bZ = 16;
   private static final byte ca = 16;
   private static final int cb = 8;
   private static final int cc = 8;
   private static final int cd = 5;
   private static final float ce = 0.05F;
   static final Vector3f cf = ac.a(() -> {
      jg $$0 = ih.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float cg = 3.0F;
   private float ch;
   private float ci;
   @Nullable
   private ib cj;
   private int ck;
   private static final float cl = 1.0F;

   public cgg(bpd<? extends cgg> $$0, cxb $$1) {
      super($$0, $$1);
      this.bM = 5;
      this.bN = new cgg.d(this);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bwu(this, ciu.class, 8.0F, 0.02F, true));
      this.bR.a(4, new cgg.a());
      this.bR.a(7, new cgg.f());
      this.bR.a(8, new bxh(this));
      this.bS.a(1, new bye(this, this.getClass()).a());
      this.bS.a(2, new cgg.e(this));
      this.bS.a(3, new cgg.c(this));
   }

   @Override
   protected box.b aZ() {
      return box.b.a;
   }

   @Override
   public atz db() {
      return atz.f;
   }

   @Override
   protected atx v() {
      return aty.wm;
   }

   @Override
   public void P() {
      if (!this.gs()) {
         super.P();
      }
   }

   @Override
   protected atx n_() {
      return aty.ws;
   }

   @Override
   protected atx d(bnw $$0) {
      return this.gs() ? aty.wu : aty.wt;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(b, ih.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static bqv.a r() {
      return bpr.A().a(bqw.q, 30.0);
   }

   @Override
   protected bvk E() {
      return new cgg.b(this);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a(ih.a($$0.f("AttachFace")));
      this.an.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.an.a(c));
      $$0.a("Color", this.an.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B && !this.bO() && !this.a(this.dm(), this.y())) {
         this.gp();
      }

      if (this.gq()) {
         this.gr();
      }

      if (this.dM().B) {
         if (this.ck > 0) {
            this.ck--;
         } else {
            this.cj = null;
         }
      }
   }

   private void gp() {
      ih $$0 = this.i(this.dm());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.s();
      }
   }

   @Override
   protected epo aq() {
      float $$0 = I(this.ci);
      ih $$1 = this.y().g();
      float $$2 = this.dg() / 2.0F;
      return a(this.eb(), $$1, $$0).d(this.dr() - (double)$$2, this.dt(), this.dx() - (double)$$2);
   }

   private static float I(float $$0) {
      return 0.5F - aww.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gq() {
      this.ch = this.ci;
      float $$0 = (float)this.gu() * 0.01F;
      if (this.ci == $$0) {
         return false;
      } else {
         if (this.ci > $$0) {
            this.ci = aww.a(this.ci - 0.05F, $$0, 1.0F);
         } else {
            this.ci = aww.a(this.ci + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gr() {
      this.ar();
      float $$0 = I(this.ci);
      float $$1 = I(this.ch);
      ih $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.eb();
      if (!($$3 <= 0.0F)) {
         for (box $$5 : this.dM().a(this, a(this.eb(), $$2, $$1, $$0).d(this.dr() - 0.5, this.dt(), this.dx() - 0.5), bpc.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof cgg) && !$$5.af) {
               $$5.a(bpu.e, new ept((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static epo a(float $$0, ih $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static epo a(float $$0, ih $$1, float $$2, float $$3) {
      epo $$4 = new epo(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(box $$0, boolean $$1) {
      if (this.dM().x_()) {
         this.cj = null;
         this.ck = 0;
      }

      this.a(ih.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ac() {
      super.ac();
      if (this.dM().B) {
         this.cj = this.dm();
      }

      this.aY = 0.0F;
      this.aX = 0.0F;
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      this.r(0.0F);
      this.aZ = this.dC();
      this.bs();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bpu $$0, ept $$1) {
      if ($$0 == bpu.d) {
         this.s();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ept dp() {
      return ept.b;
   }

   @Override
   public void g(ept $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      ib $$3 = this.dm();
      if (this.bO()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)aww.a($$0) + 0.5, (double)aww.a($$1 + 0.5), (double)aww.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         ib $$4 = this.dm();
         if (!$$4.equals($$3)) {
            this.an.a(c, (byte)0);
            this.au = true;
            if (this.dM().B && !this.bO() && !$$4.equals(this.cj)) {
               this.cj = $$3;
               this.ck = 6;
               this.ac = this.dr();
               this.ad = this.dt();
               this.ae = this.dx();
            }
         }
      }
   }

   @Nullable
   protected ih i(ib $$0) {
      for (ih $$1 : ih.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(ib $$0, ih $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         ih $$2 = $$1.g();
         if (!this.dM().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            epo $$3 = a(this.eb(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dM().a(this, $$3);
         }
      }
   }

   private boolean j(ib $$0) {
      dnb $$1 = this.dM().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dae.bQ) && $$0.equals(this.dm());
         return !$$2;
      }
   }

   protected boolean s() {
      if (!this.gd() && this.bA()) {
         ib $$0 = this.dm();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ib $$2 = $$0.b(aww.b(this.ag, -8, 8), aww.b(this.ag, -8, 8), aww.b(this.ag, -8, 8));
            if ($$2.v() > this.dM().I_() && this.dM().u($$2) && this.dM().C_().a($$2) && this.dM().a(this, new epo($$2).h(1.0E-6))) {
               ih $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(aty.wx, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dM().a(drp.R, $$0, drp.a.a(this));
                  this.an.a(c, (byte)0);
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
      this.bq = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if (this.gs()) {
         box $$2 = $$0.c();
         if ($$2 instanceof cja) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ex() < (double)this.eO() * 0.5 && this.ag.a(4) == 0) {
            this.s();
         } else if ($$0.a(aup.k)) {
            box $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bpd.aL) {
               this.gt();
            }
         }

         return true;
      }
   }

   private boolean gs() {
      return this.gu() == 0;
   }

   private void gt() {
      ept $$0 = this.dk();
      epo $$1 = this.cH();
      if (!this.gs() && this.s()) {
         int $$2 = this.dM().a(bpd.aK, $$1.g(8.0), box::bA).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dM().z.i() < $$3)) {
            cgg $$4 = bpd.aK.a(this.dM());
            if ($$4 != null) {
               $$4.a(this.gn());
               $$4.e($$0);
               this.dM().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bC() {
      return this.bA();
   }

   public ih y() {
      return this.an.a(b);
   }

   private void a(ih $$0) {
      this.an.a(b, $$0);
   }

   @Override
   public void a(aim<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.aq());
      }

      super.a($$0);
   }

   private int gu() {
      return this.an.a(c);
   }

   void b(int $$0) {
      if (!this.dM().B) {
         this.f(bqw.a).b(bX.a());
         if ($$0 == 0) {
            this.f(bqw.a).d(bX);
            this.a(aty.wr, 1.0F, 1.0F);
            this.b(drp.j);
         } else {
            this.a(aty.wv, 1.0F, 1.0F);
            this.b(drp.k);
         }
      }

      this.an.a(c, (byte)$$0);
   }

   public float G(float $$0) {
      return aww.i($$0, this.ch, this.ci);
   }

   @Override
   public void a(aan $$0) {
      super.a($$0);
      this.aX = 0.0F;
      this.aY = 0.0F;
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
   public void h(box $$0) {
   }

   public Optional<ept> H(float $$0) {
      if (this.cj != null && this.ck > 0) {
         double $$1 = (double)((float)this.ck - $$0) / 6.0;
         $$1 *= $$1;
         ib $$2 = this.dm();
         double $$3 = (double)($$2.u() - this.cj.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cj.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cj.w()) * $$1;
         return Optional.of(new ept(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cpd> $$0) {
      this.an.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cpd> gn() {
      return Optional.ofNullable(this.go());
   }

   @Nullable
   public cpd go() {
      byte $$0 = this.an.a(d);
      return $$0 != 16 && $$0 <= 15 ? cpd.a($$0) : null;
   }

   class a extends bwm {
      private int b;

      public a() {
         this.a(EnumSet.of(bwm.a.a, bwm.a.b));
      }

      @Override
      public boolean a() {
         bpp $$0 = cgg.this.p();
         return $$0 != null && $$0.bA() ? cgg.this.dM().aj() != bna.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cgg.this.b(100);
      }

      @Override
      public void d() {
         cgg.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (cgg.this.dM().aj() != bna.a) {
            this.b--;
            bpp $$0 = cgg.this.p();
            if ($$0 != null) {
               cgg.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = cgg.this.g($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cgg.this.ag.a(10) * 20 / 2;
                     cgg.this.dM().b(new cjp(cgg.this.dM(), cgg.this, $$0, cgg.this.y().o()));
                     cgg.this.a(aty.ww, 2.0F, (cgg.this.ag.i() - cgg.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cgg.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bvk {
      public b(bpr $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends byf<bpp> {
      public c(cgg $$0) {
         super($$0, bpp.class, 10, true, false, $$0x -> $$0x instanceof cfs);
      }

      @Override
      public boolean a() {
         return this.e.cg() == null ? false : super.a();
      }

      @Override
      protected epo a(double $$0) {
         ih $$1 = ((cgg)this.e).y();
         if ($$1.o() == ih.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ih.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bvo {
      public d(bpr $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ih $$0 = cgg.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cgg.cf));
         jg $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dr();
         double $$5 = this.f - this.a.dv();
         double $$6 = this.g - this.a.dx();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(aww.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends byf<ciu> {
      public e(cgg $$0) {
         super($$0, ciu.class, true);
      }

      @Override
      public boolean a() {
         return cgg.this.dM().aj() == bna.a ? false : super.a();
      }

      @Override
      protected epo a(double $$0) {
         ih $$1 = ((cgg)this.e).y();
         if ($$1.o() == ih.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ih.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bwm {
      private int b;

      @Override
      public boolean a() {
         return cgg.this.p() == null && cgg.this.ag.a(b(40)) == 0 && cgg.this.a(cgg.this.dm(), cgg.this.y());
      }

      @Override
      public boolean b() {
         return cgg.this.p() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cgg.this.ag.a(3)));
         cgg.this.b(30);
      }

      @Override
      public void d() {
         if (cgg.this.p() == null) {
            cgg.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
