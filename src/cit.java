import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cit extends cdn implements bsz<Optional<crs>>, cif {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final btf bY = new btf(e, "Covered armor bonus", 20.0, btf.a.a);
   protected static final ajm<is> b = ajq.a(cit.class, ajo.q);
   protected static final ajm<Byte> c = ajq.a(cit.class, ajo.a);
   protected static final ajm<Byte> d = ajq.a(cit.class, ajo.a);
   private static final int bZ = 6;
   private static final byte ca = 16;
   private static final byte cb = 16;
   private static final int cc = 8;
   private static final int cd = 8;
   private static final int ce = 5;
   private static final float cf = 0.05F;
   static final Vector3f cg = ac.a(() -> {
      jr $$0 = is.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ch = 3.0F;
   private float ci;
   private float cj;
   @Nullable
   private in ck;
   private int cl;
   private static final float cm = 1.0F;

   public cit(brn<? extends cit> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new cit.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzf(this, clh.class, 8.0F, 0.02F, true));
      this.bS.a(4, new cit.a());
      this.bS.a(7, new cit.f());
      this.bS.a(8, new bzs(this));
      this.bT.a(1, new cap(this, this.getClass()).a());
      this.bT.a(2, new cit.e(this));
      this.bT.a(3, new cit.c(this));
   }

   @Override
   protected brh.b aZ() {
      return brh.b.a;
   }

   @Override
   public avd dc() {
      return avd.f;
   }

   @Override
   protected avb v() {
      return avc.wx;
   }

   @Override
   public void P() {
      if (!this.gu()) {
         super.P();
      }
   }

   @Override
   protected avb o_() {
      return avc.wD;
   }

   @Override
   protected avb d(bqf $$0) {
      return this.gu() ? avc.wF : avc.wE;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(b, is.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static btg.a r() {
      return bsc.A().a(bth.q, 30.0);
   }

   @Override
   protected bxv E() {
      return new cit.b(this);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(is.a($$0.f("AttachFace")));
      this.ao.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.ao.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(ua $$0) {
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
      is $$0 = this.i(this.dn());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.u();
      }
   }

   @Override
   protected etk aq() {
      float $$0 = I(this.cj);
      is $$1 = this.y().g();
      float $$2 = this.dh() / 2.0F;
      return a(this.ec(), $$1, $$0).d(this.ds() - (double)$$2, this.du(), this.dy() - (double)$$2);
   }

   private static float I(float $$0) {
      return 0.5F - axz.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gs() {
      this.ci = this.cj;
      float $$0 = (float)this.gw() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = axz.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = axz.a(this.cj + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gt() {
      this.ar();
      float $$0 = I(this.cj);
      float $$1 = I(this.ci);
      is $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.ec();
      if (!($$3 <= 0.0F)) {
         for (brh $$5 : this.dN().a(this, a(this.ec(), $$2, $$1, $$0).d(this.ds() - 0.5, this.du(), this.dy() - 0.5), brm.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof cit) && !$$5.ag) {
               $$5.a(bsf.e, new etp((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static etk a(float $$0, is $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static etk a(float $$0, is $$1, float $$2, float $$3) {
      etk $$4 = new etk(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(brh $$0, boolean $$1) {
      if (this.dN().x_()) {
         this.ck = null;
         this.cl = 0;
      }

      this.a(is.a);
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
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      this.r(0.0F);
      this.bb = this.dD();
      this.bs();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bsf $$0, etp $$1) {
      if ($$0 == bsf.d) {
         this.u();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public etp dq() {
      return etp.b;
   }

   @Override
   public void g(etp $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      in $$3 = this.dn();
      if (this.bP()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)axz.a($$0) + 0.5, (double)axz.a($$1 + 0.5), (double)axz.a($$2) + 0.5);
      }

      if (this.ai != 0) {
         in $$4 = this.dn();
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
   protected is i(in $$0) {
      for (is $$1 : is.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(in $$0, is $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         is $$2 = $$1.g();
         if (!this.dN().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            etk $$3 = a(this.ec(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dN().a(this, $$3);
         }
      }
   }

   private boolean j(in $$0) {
      dqh $$1 = this.dN().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(ddg.bQ) && $$0.equals(this.dn());
         return !$$2;
      }
   }

   protected boolean u() {
      if (!this.gf() && this.bB()) {
         in $$0 = this.dn();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            in $$2 = $$0.b(axz.b(this.ah, -8, 8), axz.b(this.ah, -8, 8), axz.b(this.ah, -8, 8));
            if ($$2.v() > this.dN().I_() && this.dN().u($$2) && this.dN().C_().a($$2) && this.dN().a(this, new etk($$2).h(1.0E-6))) {
               is $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(avc.wI, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dN().a(dva.R, $$0, dva.a.a(this));
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
   public boolean a(bqf $$0, float $$1) {
      if (this.gu()) {
         brh $$2 = $$0.c();
         if ($$2 instanceof cln) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ey() < (double)this.eP() * 0.5 && this.ah.a(4) == 0) {
            this.u();
         } else if ($$0.a(avt.k)) {
            brh $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == brn.aK) {
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
      etp $$0 = this.dl();
      etk $$1 = this.cI();
      if (!this.gu() && this.u()) {
         int $$2 = this.dN().a(brn.aJ, $$1.g(8.0), brh::bB).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dN().z.i() < $$3)) {
            cit $$4 = brn.aJ.a(this.dN());
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

   public is y() {
      return this.ao.a(b);
   }

   private void a(is $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(ajm<?> $$0) {
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
         this.f(bth.a).b(bY.b());
         if ($$0 == 0) {
            this.f(bth.a).d(bY);
            this.a(avc.wC, 1.0F, 1.0F);
            this.a(dva.j);
         } else {
            this.a(avc.wG, 1.0F, 1.0F);
            this.a(dva.k);
         }
      }

      this.ao.a(c, (byte)$$0);
   }

   public float G(float $$0) {
      return axz.i($$0, this.ci, this.cj);
   }

   @Override
   public void a(abn $$0) {
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
   public void h(brh $$0) {
   }

   public Optional<etp> H(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         in $$2 = this.dn();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return Optional.of(new etp(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<crs> $$0) {
      this.ao.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<crs> gp() {
      return Optional.ofNullable(this.gq());
   }

   @Nullable
   public crs gq() {
      byte $$0 = this.ao.a(d);
      return $$0 != 16 && $$0 <= 15 ? crs.a($$0) : null;
   }

   class a extends byx {
      private int b;

      public a() {
         this.a(EnumSet.of(byx.a.a, byx.a.b));
      }

      @Override
      public boolean a() {
         bsa $$0 = cit.this.p();
         return $$0 != null && $$0.bB() ? cit.this.dN().ak() != bpj.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cit.this.b(100);
      }

      @Override
      public void d() {
         cit.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (cit.this.dN().ak() != bpj.a) {
            this.b--;
            bsa $$0 = cit.this.p();
            if ($$0 != null) {
               cit.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = cit.this.g($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cit.this.ah.a(10) * 20 / 2;
                     cit.this.dN().b(new cmc(cit.this.dN(), cit.this, $$0, cit.this.y().o()));
                     cit.this.a(avc.wH, 2.0F, (cit.this.ah.i() - cit.this.ah.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cit.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bxv {
      public b(bsc $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends caq<bsa> {
      public c(cit $$0) {
         super($$0, bsa.class, 10, true, false, $$0x -> $$0x instanceof cif);
      }

      @Override
      public boolean a() {
         return this.e.ch() == null ? false : super.a();
      }

      @Override
      protected etk a(double $$0) {
         is $$1 = ((cit)this.e).y();
         if ($$1.o() == is.a.a) {
            return this.e.cI().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == is.a.c ? this.e.cI().c($$0, $$0, 4.0) : this.e.cI().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bxz {
      public d(bsc $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         is $$0 = cit.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cit.cg));
         jr $$2 = $$0.q();
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
            : Optional.of((float)(axz.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends caq<clh> {
      public e(cit $$0) {
         super($$0, clh.class, true);
      }

      @Override
      public boolean a() {
         return cit.this.dN().ak() == bpj.a ? false : super.a();
      }

      @Override
      protected etk a(double $$0) {
         is $$1 = ((cit)this.e).y();
         if ($$1.o() == is.a.a) {
            return this.e.cI().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == is.a.c ? this.e.cI().c($$0, $$0, 4.0) : this.e.cI().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends byx {
      private int b;

      @Override
      public boolean a() {
         return cit.this.p() == null && cit.this.ah.a(b(40)) == 0 && cit.this.a(cit.this.dn(), cit.this.y());
      }

      @Override
      public boolean b() {
         return cit.this.p() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cit.this.ah.a(3)));
         cit.this.b(30);
      }

      @Override
      public void d() {
         if (cit.this.p() == null) {
            cit.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
