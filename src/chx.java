import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class chx extends ccr implements bsd<Optional<cqw>>, chj {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bsj bY = new bsj(e, "Covered armor bonus", 20.0, bsj.a.a);
   protected static final ajk<ir> b = ajo.a(chx.class, ajm.q);
   protected static final ajk<Byte> c = ajo.a(chx.class, ajm.a);
   protected static final ajk<Byte> d = ajo.a(chx.class, ajm.a);
   private static final int bZ = 6;
   private static final byte ca = 16;
   private static final byte cb = 16;
   private static final int cc = 8;
   private static final int cd = 8;
   private static final int ce = 5;
   private static final float cf = 0.05F;
   static final Vector3f cg = ac.a(() -> {
      jq $$0 = ir.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ch = 3.0F;
   private float ci;
   private float cj;
   @Nullable
   private im ck;
   private int cl;
   private static final float cm = 1.0F;

   public chx(bqr<? extends chx> $$0, czu $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new chx.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new byj(this, ckl.class, 8.0F, 0.02F, true));
      this.bS.a(4, new chx.a());
      this.bS.a(7, new chx.f());
      this.bS.a(8, new byw(this));
      this.bT.a(1, new bzt(this, this.getClass()).a());
      this.bT.a(2, new chx.e(this));
      this.bT.a(3, new chx.c(this));
   }

   @Override
   protected bql.b aZ() {
      return bql.b.a;
   }

   @Override
   public ava dc() {
      return ava.f;
   }

   @Override
   protected auy v() {
      return auz.ww;
   }

   @Override
   public void P() {
      if (!this.gu()) {
         super.P();
      }
   }

   @Override
   protected auy o_() {
      return auz.wC;
   }

   @Override
   protected auy d(bpj $$0) {
      return this.gu() ? auz.wE : auz.wD;
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(b, ir.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static bsk.a r() {
      return brg.A().a(bsl.q, 30.0);
   }

   @Override
   protected bwz E() {
      return new chx.b(this);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a(ir.a($$0.f("AttachFace")));
      this.ao.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.ao.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.ao.a(c));
      $$0.a("Color", this.ao.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().B && !this.bP() && !this.a(this.dn(), this.y())) {
         this.gr();
      }

      if (this.gs()) {
         this.gt();
      }

      if (this.dN().B) {
         if (this.cl > 0) {
            this.cl--;
         } else {
            this.ck = null;
         }
      }
   }

   private void gr() {
      ir $$0 = this.i(this.dn());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.u();
      }
   }

   @Override
   protected eta aq() {
      float $$0 = I(this.cj);
      ir $$1 = this.y().g();
      float $$2 = this.dh() / 2.0F;
      return a(this.ec(), $$1, $$0).d(this.ds() - (double)$$2, this.du(), this.dy() - (double)$$2);
   }

   private static float I(float $$0) {
      return 0.5F - axw.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gs() {
      this.ci = this.cj;
      float $$0 = (float)this.gw() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = axw.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = axw.a(this.cj + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gt() {
      this.ar();
      float $$0 = I(this.cj);
      float $$1 = I(this.ci);
      ir $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.ec();
      if (!($$3 <= 0.0F)) {
         for (bql $$5 : this.dN().a(this, a(this.ec(), $$2, $$1, $$0).d(this.ds() - 0.5, this.du(), this.dy() - 0.5), bqq.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof chx) && !$$5.ag) {
               $$5.a(brj.e, new etf((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static eta a(float $$0, ir $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static eta a(float $$0, ir $$1, float $$2, float $$3) {
      eta $$4 = new eta(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bql $$0, boolean $$1) {
      if (this.dN().x_()) {
         this.ck = null;
         this.cl = 0;
      }

      this.a(ir.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ac() {
      super.ac();
      if (this.dN().B) {
         this.ck = this.dn();
      }

      this.ba = 0.0F;
      this.aZ = 0.0F;
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      this.r(0.0F);
      this.bb = this.dD();
      this.bs();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(brj $$0, etf $$1) {
      if ($$0 == brj.d) {
         this.u();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public etf dq() {
      return etf.b;
   }

   @Override
   public void g(etf $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      im $$3 = this.dn();
      if (this.bP()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)axw.a($$0) + 0.5, (double)axw.a($$1 + 0.5), (double)axw.a($$2) + 0.5);
      }

      if (this.ai != 0) {
         im $$4 = this.dn();
         if (!$$4.equals($$3)) {
            this.ao.a(c, (byte)0);
            this.av = true;
            if (this.dN().B && !this.bP() && !$$4.equals(this.ck)) {
               this.ck = $$3;
               this.cl = 6;
               this.ad = this.ds();
               this.ae = this.du();
               this.af = this.dy();
            }
         }
      }
   }

   @Nullable
   protected ir i(im $$0) {
      for (ir $$1 : ir.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(im $$0, ir $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         ir $$2 = $$1.g();
         if (!this.dN().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            eta $$3 = a(this.ec(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dN().a(this, $$3);
         }
      }
   }

   private boolean j(im $$0) {
      dpy $$1 = this.dN().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dcx.bQ) && $$0.equals(this.dn());
         return !$$2;
      }
   }

   protected boolean u() {
      if (!this.gf() && this.bB()) {
         im $$0 = this.dn();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            im $$2 = $$0.b(axw.b(this.ah, -8, 8), axw.b(this.ah, -8, 8), axw.b(this.ah, -8, 8));
            if ($$2.v() > this.dN().I_() && this.dN().u($$2) && this.dN().C_().a($$2) && this.dN().a(this, new eta($$2).h(1.0E-6))) {
               ir $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(auz.wH, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dN().a(dur.R, $$0, dur.a.a(this));
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
      this.bs = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.gu()) {
         bql $$2 = $$0.c();
         if ($$2 instanceof ckr) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ey() < (double)this.eP() * 0.5 && this.ah.a(4) == 0) {
            this.u();
         } else if ($$0.a(avq.k)) {
            bql $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bqr.aK) {
               this.gv();
            }
         }

         return true;
      }
   }

   private boolean gu() {
      return this.gw() == 0;
   }

   private void gv() {
      etf $$0 = this.dl();
      eta $$1 = this.cI();
      if (!this.gu() && this.u()) {
         int $$2 = this.dN().a(bqr.aJ, $$1.g(8.0), bql::bB).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dN().z.i() < $$3)) {
            chx $$4 = bqr.aJ.a(this.dN());
            if ($$4 != null) {
               $$4.a(this.gp());
               $$4.e($$0);
               this.dN().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bD() {
      return this.bB();
   }

   public ir y() {
      return this.ao.a(b);
   }

   private void a(ir $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(ajk<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.aq());
      }

      super.a($$0);
   }

   private int gw() {
      return this.ao.a(c);
   }

   void b(int $$0) {
      if (!this.dN().B) {
         this.f(bsl.a).b(bY.b());
         if ($$0 == 0) {
            this.f(bsl.a).d(bY);
            this.a(auz.wB, 1.0F, 1.0F);
            this.a(dur.j);
         } else {
            this.a(auz.wF, 1.0F, 1.0F);
            this.a(dur.k);
         }
      }

      this.ao.a(c, (byte)$$0);
   }

   public float G(float $$0) {
      return axw.i($$0, this.ci, this.cj);
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      this.aZ = 0.0F;
      this.ba = 0.0F;
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
   public void h(bql $$0) {
   }

   public Optional<etf> H(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         im $$2 = this.dn();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return Optional.of(new etf(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cqw> $$0) {
      this.ao.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cqw> gp() {
      return Optional.ofNullable(this.gq());
   }

   @Nullable
   public cqw gq() {
      byte $$0 = this.ao.a(d);
      return $$0 != 16 && $$0 <= 15 ? cqw.a($$0) : null;
   }

   class a extends byb {
      private int b;

      public a() {
         this.a(EnumSet.of(byb.a.a, byb.a.b));
      }

      @Override
      public boolean a() {
         bre $$0 = chx.this.p();
         return $$0 != null && $$0.bB() ? chx.this.dN().ak() != bon.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         chx.this.b(100);
      }

      @Override
      public void d() {
         chx.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (chx.this.dN().ak() != bon.a) {
            this.b--;
            bre $$0 = chx.this.p();
            if ($$0 != null) {
               chx.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = chx.this.g($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + chx.this.ah.a(10) * 20 / 2;
                     chx.this.dN().b(new clg(chx.this.dN(), chx.this, $$0, chx.this.y().o()));
                     chx.this.a(auz.wG, 2.0F, (chx.this.ah.i() - chx.this.ah.i()) * 0.2F + 1.0F);
                  }
               } else {
                  chx.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bwz {
      public b(brg $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends bzu<bre> {
      public c(chx $$0) {
         super($$0, bre.class, 10, true, false, $$0x -> $$0x instanceof chj);
      }

      @Override
      public boolean a() {
         return this.e.ch() == null ? false : super.a();
      }

      @Override
      protected eta a(double $$0) {
         ir $$1 = ((chx)this.e).y();
         if ($$1.o() == ir.a.a) {
            return this.e.cI().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ir.a.c ? this.e.cI().c($$0, $$0, 4.0) : this.e.cI().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bxd {
      public d(brg $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ir $$0 = chx.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(chx.cg));
         jq $$2 = $$0.q();
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
            : Optional.of((float)(axw.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends bzu<ckl> {
      public e(chx $$0) {
         super($$0, ckl.class, true);
      }

      @Override
      public boolean a() {
         return chx.this.dN().ak() == bon.a ? false : super.a();
      }

      @Override
      protected eta a(double $$0) {
         ir $$1 = ((chx)this.e).y();
         if ($$1.o() == ir.a.a) {
            return this.e.cI().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ir.a.c ? this.e.cI().c($$0, $$0, 4.0) : this.e.cI().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends byb {
      private int b;

      @Override
      public boolean a() {
         return chx.this.p() == null && chx.this.ah.a(b(40)) == 0 && chx.this.a(chx.this.dn(), chx.this.y());
      }

      @Override
      public boolean b() {
         return chx.this.p() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + chx.this.ah.a(3)));
         chx.this.b(30);
      }

      @Override
      public void d() {
         if (chx.this.p() == null) {
            chx.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
