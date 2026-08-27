import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class chf extends ccb implements brn<Optional<cqc>>, cgr {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final brt bX = new brt(e, "Covered armor bonus", 20.0, brt.a.a);
   protected static final aiy<ih> b = ajc.a(chf.class, aja.p);
   protected static final aiy<Byte> c = ajc.a(chf.class, aja.a);
   protected static final aiy<Byte> d = ajc.a(chf.class, aja.a);
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

   public chf(bqb<? extends chf> $$0, cyx $$1) {
      super($$0, $$1);
      this.bM = 5;
      this.bN = new chf.d(this);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxt(this, cjt.class, 8.0F, 0.02F, true));
      this.bR.a(4, new chf.a());
      this.bR.a(7, new chf.f());
      this.bR.a(8, new byg(this));
      this.bS.a(1, new bzd(this, this.getClass()).a());
      this.bS.a(2, new chf.e(this));
      this.bS.a(3, new chf.c(this));
   }

   @Override
   protected bpv.b aZ() {
      return bpv.b.a;
   }

   @Override
   public aun db() {
      return aun.f;
   }

   @Override
   protected aul v() {
      return aum.wp;
   }

   @Override
   public void P() {
      if (!this.gs()) {
         super.P();
      }
   }

   @Override
   protected aul o_() {
      return aum.wv;
   }

   @Override
   protected aul d(bot $$0) {
      return this.gs() ? aum.wx : aum.ww;
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(b, ih.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 30.0);
   }

   @Override
   protected bwj E() {
      return new chf.b(this);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a(ih.a($$0.f("AttachFace")));
      this.an.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(tm $$0) {
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
         this.u();
      }
   }

   @Override
   protected erv aq() {
      float $$0 = I(this.ci);
      ih $$1 = this.y().g();
      float $$2 = this.dg() / 2.0F;
      return a(this.eb(), $$1, $$0).d(this.dr() - (double)$$2, this.dt(), this.dx() - (double)$$2);
   }

   private static float I(float $$0) {
      return 0.5F - axk.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gq() {
      this.ch = this.ci;
      float $$0 = (float)this.gu() * 0.01F;
      if (this.ci == $$0) {
         return false;
      } else {
         if (this.ci > $$0) {
            this.ci = axk.a(this.ci - 0.05F, $$0, 1.0F);
         } else {
            this.ci = axk.a(this.ci + 0.05F, 0.0F, $$0);
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
         for (bpv $$5 : this.dM().a(this, a(this.eb(), $$2, $$1, $$0).d(this.dr() - 0.5, this.dt(), this.dx() - 0.5), bqa.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof chf) && !$$5.af) {
               $$5.a(bqt.e, new esa((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static erv a(float $$0, ih $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static erv a(float $$0, ih $$1, float $$2, float $$3) {
      erv $$4 = new erv(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bpv $$0, boolean $$1) {
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
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      this.r(0.0F);
      this.aZ = this.dC();
      this.bs();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bqt $$0, esa $$1) {
      if ($$0 == bqt.d) {
         this.u();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public esa dp() {
      return esa.b;
   }

   @Override
   public void g(esa $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      ib $$3 = this.dm();
      if (this.bO()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)axk.a($$0) + 0.5, (double)axk.a($$1 + 0.5), (double)axk.a($$2) + 0.5);
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
            erv $$3 = a(this.eb(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dM().a(this, $$3);
         }
      }
   }

   private boolean j(ib $$0) {
      doz $$1 = this.dM().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dca.bQ) && $$0.equals(this.dm());
         return !$$2;
      }
   }

   protected boolean u() {
      if (!this.gd() && this.bA()) {
         ib $$0 = this.dm();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ib $$2 = $$0.b(axk.b(this.ag, -8, 8), axk.b(this.ag, -8, 8), axk.b(this.ag, -8, 8));
            if ($$2.v() > this.dM().I_() && this.dM().u($$2) && this.dM().C_().a($$2) && this.dM().a(this, new erv($$2).h(1.0E-6))) {
               ih $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(aum.wA, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dM().a(dts.R, $$0, dts.a.a(this));
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
   public boolean a(bot $$0, float $$1) {
      if (this.gs()) {
         bpv $$2 = $$0.c();
         if ($$2 instanceof cjz) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ex() < (double)this.eO() * 0.5 && this.ag.a(4) == 0) {
            this.u();
         } else if ($$0.a(ave.k)) {
            bpv $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bqb.aK) {
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
      esa $$0 = this.dk();
      erv $$1 = this.cH();
      if (!this.gs() && this.u()) {
         int $$2 = this.dM().a(bqb.aJ, $$1.g(8.0), bpv::bA).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dM().z.i() < $$3)) {
            chf $$4 = bqb.aJ.a(this.dM());
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
   public void a(aiy<?> $$0) {
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
         this.f(brv.a).b(bX.a());
         if ($$0 == 0) {
            this.f(brv.a).d(bX);
            this.a(aum.wu, 1.0F, 1.0F);
            this.a(dts.j);
         } else {
            this.a(aum.wy, 1.0F, 1.0F);
            this.a(dts.k);
         }
      }

      this.an.a(c, (byte)$$0);
   }

   public float G(float $$0) {
      return axk.i($$0, this.ch, this.ci);
   }

   @Override
   public void a(aaz $$0) {
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
   public void h(bpv $$0) {
   }

   public Optional<esa> H(float $$0) {
      if (this.cj != null && this.ck > 0) {
         double $$1 = (double)((float)this.ck - $$0) / 6.0;
         $$1 *= $$1;
         ib $$2 = this.dm();
         double $$3 = (double)($$2.u() - this.cj.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cj.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cj.w()) * $$1;
         return Optional.of(new esa(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cqc> $$0) {
      this.an.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cqc> gn() {
      return Optional.ofNullable(this.go());
   }

   @Nullable
   public cqc go() {
      byte $$0 = this.an.a(d);
      return $$0 != 16 && $$0 <= 15 ? cqc.a($$0) : null;
   }

   class a extends bxl {
      private int b;

      public a() {
         this.a(EnumSet.of(bxl.a.a, bxl.a.b));
      }

      @Override
      public boolean a() {
         bqo $$0 = chf.this.p();
         return $$0 != null && $$0.bA() ? chf.this.dM().ak() != bnx.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         chf.this.b(100);
      }

      @Override
      public void d() {
         chf.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (chf.this.dM().ak() != bnx.a) {
            this.b--;
            bqo $$0 = chf.this.p();
            if ($$0 != null) {
               chf.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = chf.this.g($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + chf.this.ag.a(10) * 20 / 2;
                     chf.this.dM().b(new cko(chf.this.dM(), chf.this, $$0, chf.this.y().o()));
                     chf.this.a(aum.wz, 2.0F, (chf.this.ag.i() - chf.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  chf.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bwj {
      public b(bqq $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends bze<bqo> {
      public c(chf $$0) {
         super($$0, bqo.class, 10, true, false, $$0x -> $$0x instanceof cgr);
      }

      @Override
      public boolean a() {
         return this.e.cg() == null ? false : super.a();
      }

      @Override
      protected erv a(double $$0) {
         ih $$1 = ((chf)this.e).y();
         if ($$1.o() == ih.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ih.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bwn {
      public d(bqq $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ih $$0 = chf.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(chf.cf));
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
            : Optional.of((float)(axk.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends bze<cjt> {
      public e(chf $$0) {
         super($$0, cjt.class, true);
      }

      @Override
      public boolean a() {
         return chf.this.dM().ak() == bnx.a ? false : super.a();
      }

      @Override
      protected erv a(double $$0) {
         ih $$1 = ((chf)this.e).y();
         if ($$1.o() == ih.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ih.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bxl {
      private int b;

      @Override
      public boolean a() {
         return chf.this.p() == null && chf.this.ag.a(b(40)) == 0 && chf.this.a(chf.this.dm(), chf.this.y());
      }

      @Override
      public boolean b() {
         return chf.this.p() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + chf.this.ag.a(3)));
         chf.this.b(30);
      }

      @Override
      public void d() {
         if (chf.this.p() == null) {
            chf.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
