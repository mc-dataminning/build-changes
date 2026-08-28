import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cjt extends cem implements bty<Optional<cst>>, cjf {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bue ca = new bue(e, "Covered armor bonus", 20.0, bue.a.a);
   protected static final ajp<jf> b = ajt.a(cjt.class, ajr.q);
   protected static final ajp<Byte> c = ajt.a(cjt.class, ajr.a);
   protected static final ajp<Byte> d = ajt.a(cjt.class, ajr.a);
   private static final int cb = 6;
   private static final byte cc = 16;
   private static final byte cd = 16;
   private static final int ce = 8;
   private static final int cf = 8;
   private static final int cg = 5;
   private static final float ch = 0.05F;
   static final Vector3f ci = ac.a(() -> {
      ke $$0 = jf.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float cj = 3.0F;
   private float ck;
   private float cl;
   @Nullable
   private ja cm;
   private int cn;
   private static final float co = 1.0F;

   public cjt(bsj<? extends cjt> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bQ = new cjt.d(this);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cae(this, cmh.class, 8.0F, 0.02F, true));
      this.bU.a(4, new cjt.a());
      this.bU.a(7, new cjt.f());
      this.bU.a(8, new car(this));
      this.bV.a(1, new cbo(this, this.getClass()).a());
      this.bV.a(2, new cjt.e(this));
      this.bV.a(3, new cjt.c(this));
   }

   @Override
   protected bsd.b bb() {
      return bsd.b.a;
   }

   @Override
   public avg de() {
      return avg.f;
   }

   @Override
   protected ave v() {
      return avf.wL;
   }

   @Override
   public void Q() {
      if (!this.gs()) {
         super.Q();
      }
   }

   @Override
   protected ave o_() {
      return avf.wR;
   }

   @Override
   protected ave d(bqw $$0) {
      return this.gs() ? avf.wT : avf.wS;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, jf.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 30.0);
   }

   @Override
   protected byu E() {
      return new cjt.b(this);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(jf.a($$0.f("AttachFace")));
      this.ao.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.ao.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.ao.a(c));
      $$0.a("Color", this.ao.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dP().B && !this.bR() && !this.a(this.dp(), this.y())) {
         this.gp();
      }

      if (this.gq()) {
         this.gr();
      }

      if (this.dP().B) {
         if (this.cn > 0) {
            this.cn--;
         } else {
            this.cm = null;
         }
      }
   }

   private void gp() {
      jf $$0 = this.h(this.dp());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.u();
      }
   }

   @Override
   protected evu as() {
      float $$0 = J(this.cl);
      jf $$1 = this.y().g();
      float $$2 = this.dj() / 2.0F;
      return a(this.eb(), $$1, $$0).d(this.du() - (double)$$2, this.dw(), this.dA() - (double)$$2);
   }

   private static float J(float $$0) {
      return 0.5F - aye.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gq() {
      this.ck = this.cl;
      float $$0 = (float)this.gu() * 0.01F;
      if (this.cl == $$0) {
         return false;
      } else {
         if (this.cl > $$0) {
            this.cl = aye.a(this.cl - 0.05F, $$0, 1.0F);
         } else {
            this.cl = aye.a(this.cl + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gr() {
      this.at();
      float $$0 = J(this.cl);
      float $$1 = J(this.ck);
      jf $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.eb();
      if (!($$3 <= 0.0F)) {
         for (bsd $$5 : this.dP().a(this, a(this.eb(), $$2, $$1, $$0).d(this.du() - 0.5, this.dw(), this.dA() - 0.5), bsi.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof cjt) && !$$5.ag) {
               $$5.a(btd.e, new evz((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static evu a(float $$0, jf $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static evu a(float $$0, jf $$1, float $$2, float $$3) {
      evu $$4 = new evu(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bsd $$0, boolean $$1) {
      if (this.dP().x_()) {
         this.cm = null;
         this.cn = 0;
      }

      this.a(jf.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ac() {
      super.ac();
      if (this.dP().B) {
         this.cm = this.dp();
      }

      this.aZ = 0.0F;
      this.aY = 0.0F;
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      this.s(0.0F);
      this.ba = this.dF();
      this.bu();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(btd $$0, evz $$1) {
      if ($$0 == btd.d) {
         this.u();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public evz ds() {
      return evz.b;
   }

   @Override
   public void h(evz $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      ja $$3 = this.dp();
      if (this.bR()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)aye.a($$0) + 0.5, (double)aye.a($$1 + 0.5), (double)aye.a($$2) + 0.5);
      }

      if (this.ai != 0) {
         ja $$4 = this.dp();
         if (!$$4.equals($$3)) {
            this.ao.a(c, (byte)0);
            this.av = true;
            if (this.dP().B && !this.bR() && !$$4.equals(this.cm)) {
               this.cm = $$3;
               this.cn = 6;
               this.ad = this.du();
               this.ae = this.dw();
               this.af = this.dA();
            }
         }
      }
   }

   @Nullable
   protected jf h(ja $$0) {
      for (jf $$1 : jf.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(ja $$0, jf $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jf $$2 = $$1.g();
         if (!this.dP().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            evu $$3 = a(this.eb(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dP().a(this, $$3);
         }
      }
   }

   private boolean i(ja $$0) {
      dsh $$1 = this.dP().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dfh.bQ) && $$0.equals(this.dp());
         return !$$2;
      }
   }

   protected boolean u() {
      if (!this.gc() && this.bD()) {
         ja $$0 = this.dp();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ja $$2 = $$0.b(aye.b(this.ah, -8, 8), aye.b(this.ah, -8, 8), aye.b(this.ah, -8, 8));
            if ($$2.v() > this.dP().I_() && this.dP().u($$2) && this.dP().C_().a($$2) && this.dP().a(this, new evu($$2).h(1.0E-6))) {
               jf $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ai();
                  this.a($$3);
                  this.a(avf.wW, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dP().a(dxa.R, $$0, dxa.a.a(this));
                  this.ao.a(c, (byte)0);
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
      this.br = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.gs()) {
         bsd $$2 = $$0.c();
         if ($$2 instanceof cmn) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ew() < (double)this.eN() * 0.5 && this.ah.a(4) == 0) {
            this.u();
         } else if ($$0.a(avw.k)) {
            bsd $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == bsj.aL) {
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
      evz $$0 = this.dn();
      evu $$1 = this.cK();
      if (!this.gs() && this.u()) {
         int $$2 = this.dP().a(bsj.aK, $$1.g(8.0), bsd::bD).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dP().z.i() < $$3)) {
            cjt $$4 = bsj.aK.a(this.dP());
            if ($$4 != null) {
               $$4.a(this.gn());
               $$4.e($$0);
               this.dP().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bF() {
      return this.bD();
   }

   public jf y() {
      return this.ao.a(b);
   }

   private void a(jf $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.as());
      }

      super.a($$0);
   }

   private int gu() {
      return this.ao.a(c);
   }

   void b(int $$0) {
      if (!this.dP().B) {
         this.f(bug.a).b(ca.b());
         if ($$0 == 0) {
            this.f(bug.a).d(ca);
            this.a(avf.wQ, 1.0F, 1.0F);
            this.a(dxa.j);
         } else {
            this.a(avf.wU, 1.0F, 1.0F);
            this.a(dxa.k);
         }
      }

      this.ao.a(c, (byte)$$0);
   }

   public float H(float $$0) {
      return aye.i($$0, this.ck, this.cl);
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      this.aY = 0.0F;
      this.aZ = 0.0F;
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
   public void h(bsd $$0) {
   }

   public Optional<evz> I(float $$0) {
      if (this.cm != null && this.cn > 0) {
         double $$1 = (double)((float)this.cn - $$0) / 6.0;
         $$1 *= $$1;
         ja $$2 = this.dp();
         double $$3 = (double)($$2.u() - this.cm.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cm.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cm.w()) * $$1;
         return Optional.of(new evz(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cst> $$0) {
      this.ao.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cst> gn() {
      return Optional.ofNullable(this.go());
   }

   @Nullable
   public cst go() {
      byte $$0 = this.ao.a(d);
      return $$0 != 16 && $$0 <= 15 ? cst.a($$0) : null;
   }

   class a extends bzw {
      private int b;

      public a() {
         this.a(EnumSet.of(bzw.a.a, bzw.a.b));
      }

      @Override
      public boolean a() {
         bsy $$0 = cjt.this.p();
         return $$0 != null && $$0.bD() ? cjt.this.dP().al() != bqa.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cjt.this.b(100);
      }

      @Override
      public void d() {
         cjt.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (cjt.this.dP().al() != bqa.a) {
            this.b--;
            bsy $$0 = cjt.this.p();
            if ($$0 != null) {
               cjt.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = cjt.this.g((bsd)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cjt.this.ah.a(10) * 20 / 2;
                     cjt.this.dP().b(new cnc(cjt.this.dP(), cjt.this, $$0, cjt.this.y().o()));
                     cjt.this.a(avf.wV, 2.0F, (cjt.this.ah.i() - cjt.this.ah.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cjt.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends byu {
      public b(bta $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cbp<bsy> {
      public c(cjt $$0) {
         super($$0, bsy.class, 10, true, false, $$0x -> $$0x instanceof cjf);
      }

      @Override
      public boolean a() {
         return this.e.cj() == null ? false : super.a();
      }

      @Override
      protected evu a(double $$0) {
         jf $$1 = ((cjt)this.e).y();
         if ($$1.o() == jf.a.a) {
            return this.e.cK().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jf.a.c ? this.e.cK().c($$0, $$0, 4.0) : this.e.cK().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends byy {
      public d(final bta $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jf $$0 = cjt.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cjt.ci));
         ke $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.du();
         double $$5 = this.f - this.a.dy();
         double $$6 = this.g - this.a.dA();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(aye.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cbp<cmh> {
      public e(final cjt $$0) {
         super($$0, cmh.class, true);
      }

      @Override
      public boolean a() {
         return cjt.this.dP().al() == bqa.a ? false : super.a();
      }

      @Override
      protected evu a(double $$0) {
         jf $$1 = ((cjt)this.e).y();
         if ($$1.o() == jf.a.a) {
            return this.e.cK().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jf.a.c ? this.e.cK().c($$0, $$0, 4.0) : this.e.cK().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bzw {
      private int b;

      @Override
      public boolean a() {
         return cjt.this.p() == null && cjt.this.ah.a(b(40)) == 0 && cjt.this.a(cjt.this.dp(), cjt.this.y());
      }

      @Override
      public boolean b() {
         return cjt.this.p() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cjt.this.ah.a(3)));
         cjt.this.b(30);
      }

      @Override
      public void d() {
         if (cjt.this.p() == null) {
            cjt.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
