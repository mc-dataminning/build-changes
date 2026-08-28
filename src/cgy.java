import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgy extends bvb implements buk, bve<jn<cgz>> {
   private static final akg<Boolean> cf = akk.a(cgy.class, aki.k);
   private static final akg<Integer> cg = akk.a(cgy.class, aki.b);
   private static final akg<Integer> ch = akk.a(cgy.class, aki.b);
   private static final akg<jn<cgz>> ci = akk.a(cgy.class, aki.y);
   public static final Predicate<buf> cd = $$0 -> {
      btq<?> $$1 = $$0.ao();
      return $$1 == btq.aJ || $$1 == btq.aG || $$1 == btq.Q;
   };
   private static final float cj = 8.0F;
   private static final float ck = 40.0F;
   private static final float cl = 0.125F;
   public static final float ce = (float) (Math.PI / 5);
   private float cm;
   private float cn;
   private boolean co;
   private boolean cp;
   private float cq;
   private float cr;
   private static final bqv cs = bad.a(20, 39);
   @Nullable
   private UUID ct;

   public cgy(btq<? extends cgy> $$0, dds $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(eqs.f, -1.0F);
      this.a(eqs.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bT.a(1, new caw(this));
      this.bT.a(1, new bvb.a(1.5, awu.G));
      this.bT.a(2, new cch(this));
      this.bT.a(3, new cgy.a<>(this, cic.class, 24.0F, 1.5, 1.5));
      this.bT.a(4, new cbi(this, 0.4F));
      this.bT.a(5, new cbm(this, 1.0, true));
      this.bT.a(6, new cba(this, 1.0, 10.0F, 2.0F));
      this.bT.a(7, new cao(this, 1.0));
      this.bT.a(8, new ccp(this, 1.0));
      this.bT.a(9, new cak(this, 8.0F));
      this.bT.a(10, new cbk(this, cnp.class, 8.0F));
      this.bT.a(10, new cbx(this));
      this.bU.a(1, new ccz(this));
      this.bU.a(2, new cda(this));
      this.bU.a(3, new ccu(this).a());
      this.bU.a(4, new ccv<>(this, cnp.class, 10, true, false, this::a_));
      this.bU.a(5, new ccy<>(this, cfv.class, false, cd));
      this.bU.a(6, new ccy<>(this, cgw.class, false, cgw.bZ));
      this.bU.a(7, new ccv<>(this, ckd.class, false));
      this.bU.a(8, new cdb<>(this, true));
   }

   public alb gA() {
      cgz $$0 = this.gB().a();
      if (this.q()) {
         return $$0.b();
      } else {
         return this.ac_() ? $$0.c() : $$0.a();
      }
   }

   public jn<cgz> gB() {
      return this.am.a(ci);
   }

   public void j(jn<cgz> $$0) {
      this.am.a(ci, $$0);
   }

   public static bvl.a gC() {
      return cfv.gt().a(bvm.v, 0.3F).a(bvm.s, 8.0).a(bvm.c, 4.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      kb $$1 = this.dU();
      ka<cgz> $$2 = $$1.d(lv.m);
      $$0.a(ci, $$2.b(cha.j).or($$2::a).orElseThrow());
      $$0.a(cf, false);
      $$0.a(cg, cue.o.a());
      $$0.a(ch, 0);
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.CZ, 0.15F, 1.0F);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gE().a());
      this.gB().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      Optional.ofNullable(alb.c($$0.l("variant"))).map($$0x -> ala.a(lv.m, $$0x)).flatMap($$0x -> this.dU().d(lv.m).b($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cue.a($$0.h("CollarColor")));
      }

      this.a(this.dS(), $$0);
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      jn<det> $$4 = $$0.t(this.ds());
      jn<cgz> $$6;
      if ($$3 instanceof cgy.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cha.a(this.dU(), $$4);
         $$3 = new cgy.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awc w() {
      if (this.ac_()) {
         return awd.CU;
      } else if (this.af.a(3) == 0) {
         return this.q() && this.eA() < 20.0F ? awd.Da : awd.CX;
      } else {
         return awd.CS;
      }
   }

   @Override
   protected awc d(bsb $$0) {
      return this.g($$0) ? awd.CQ : awd.CW;
   }

   @Override
   protected awc n_() {
      return awd.CT;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B && this.co && !this.cp && !this.gk() && this.aH()) {
         this.cp = true;
         this.cq = 0.0F;
         this.cr = 0.0F;
         this.dS().a(this, (byte)8);
      }

      if (!this.dS().B) {
         this.a((arg)this.dS(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bI()) {
         this.cn = this.cm;
         if (this.gG()) {
            this.cm = this.cm + (1.0F - this.cm) * 0.4F;
         } else {
            this.cm = this.cm + (0.0F - this.cm) * 0.4F;
         }

         if (this.bk()) {
            this.co = true;
            if (this.cp && !this.dS().B) {
               this.dS().a(this, (byte)56);
               this.gH();
            }
         } else if ((this.co || this.cp) && this.cp) {
            if (this.cq == 0.0F) {
               this.a(awd.CY, this.fd(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
               this.a(dyx.u);
            }

            this.cr = this.cq;
            this.cq += 0.05F;
            if (this.cr >= 2.0F) {
               this.co = false;
               this.cp = false;
               this.cr = 0.0F;
               this.cq = 0.0F;
            }

            if (this.cq > 0.4F) {
               float $$0 = (float)this.dz();
               int $$1 = (int)(azc.a((this.cq - 0.4F) * (float) Math.PI) * 7.0F);
               eye $$2 = this.dv();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.af.i() * 2.0F - 1.0F) * this.dn() * 0.5F;
                  float $$5 = (this.af.i() * 2.0F - 1.0F) * this.dn() * 0.5F;
                  this.dS().a(ln.am, this.dx() + (double)$$4, (double)($$0 + 0.8F), this.dD() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gH() {
      this.cp = false;
      this.cq = 0.0F;
      this.cr = 0.0F;
   }

   @Override
   public void a(bsb $$0) {
      this.co = false;
      this.cp = false;
      this.cr = 0.0F;
      this.cq = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.co ? 1.0F : Math.min(0.75F + azc.h($$0, this.cr, this.cq) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azc.h($$0, this.cr, this.cq);
   }

   public float L(float $$0) {
      return azc.h($$0, this.cn, this.cm) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ae() {
      return this.y() ? 20 : super.ae();
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dS().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean e(btr $$0) {
      return true;
   }

   @Override
   protected void f(bsb $$0, float $$1) {
      if (!this.g($$0)) {
         super.f($$0, $$1);
      } else {
         cvl $$2 = this.fS();
         int $$3 = $$2.o();
         int $$4 = $$2.p();
         $$2.a(azc.f($$1), this, btr.g);
         if (btg.b.a($$3, $$4) != btg.b.a(this.fS())) {
            this.a(awd.CP);
            if (this.dS() instanceof arg $$5) {
               $$5.a(new lj(ln.S, cvo.or.w()), this.dx(), this.dz() + 1.0, this.dD(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean g(bsb $$0) {
      return this.gF() && !$$0.a(awu.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(bvm.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bvm.s).a(8.0);
      }
   }

   @Override
   protected void b(bsb $$0, float $$1) {
      this.a($$0, $$1, new btr[]{btr.g});
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      cvg $$3 = $$2.h();
      if (this.q()) {
         if (this.p($$2) && this.eA() < this.eQ()) {
            $$2.a(1, $$0);
            cqn $$4 = $$2.a(kr.v);
            float $$5 = $$4 != null ? (float)$$4.b() : 1.0F;
            this.c(2.0F * $$5);
            return brk.a;
         } else {
            if ($$3 instanceof cuf $$6 && this.j($$0)) {
               cue $$7 = $$6.c();
               if ($$7 != this.gE()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return brk.a;
               }

               return super.b($$0, $$1);
            }

            if ($$2.a(cvo.os) && this.j($$0) && this.fS().f() && !this.o_()) {
               this.n($$2.c(1));
               $$2.a(1, $$0);
               return brk.a;
            } else if ($$2.a(cvo.rW) && this.j($$0) && this.gF() && (!day.a(this.fS(), dax.E) || $$0.f())) {
               $$2.a(1, $$0, d($$1));
               this.a(awd.az);
               cvl $$8 = this.fS();
               this.n(cvl.k);
               this.b($$8);
               return brk.a;
            } else if (this.y() && this.gF() && this.j($$0) && this.fS().n() && this.fS().b($$2)) {
               $$2.h(1);
               this.a(awd.CR);
               cvl $$9 = this.fS();
               int $$10 = (int)((float)$$9.p() * 0.125F);
               $$9.b(Math.max(0, $$9.o() - $$10));
               return brk.a;
            } else {
               brk $$11 = super.b($$0, $$1);
               if (!$$11.a() && this.j($$0)) {
                  this.z(!this.go());
                  this.bk = false;
                  this.bS.o();
                  this.h(null);
                  return brk.a.b();
               } else {
                  return $$11;
               }
            }
         }
      } else if (!this.dS().B && $$2.a(cvo.rA) && !this.ac_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return brk.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(cnp $$0) {
      if (this.af.a(3) == 0) {
         this.a($$0);
         this.bS.o();
         this.h(null);
         this.z(true);
         this.dS().a(this, (byte)7);
      } else {
         this.dS().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cp = true;
         this.cq = 0.0F;
         this.cr = 0.0F;
      } else if ($$0 == 56) {
         this.gH();
      } else {
         super.b($$0);
      }
   }

   public float gD() {
      if (this.ac_()) {
         return 1.5393804F;
      } else if (this.q()) {
         float $$0 = this.eQ();
         float $$1 = ($$0 - this.eA()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.ad);
   }

   @Override
   public int fR() {
      return 8;
   }

   @Override
   public int a() {
      return this.am.a(ch);
   }

   @Override
   public void a(int $$0) {
      this.am.a(ch, $$0);
   }

   @Override
   public void c() {
      this.a(cs.a(this.af));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ct;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ct = $$0;
   }

   public cue gE() {
      return cue.a(this.am.a(cg));
   }

   public boolean gF() {
      return this.fS().a(cvo.os);
   }

   private void a(cue $$0) {
      this.am.a(cg, $$0.a());
   }

   @Nullable
   public cgy b(arg $$0, btc $$1) {
      cgy $$2 = btq.bs.a($$0, btp.e);
      if ($$2 != null && $$1 instanceof cgy $$3) {
         if (this.af.h()) {
            $$2.j(this.gB());
         } else {
            $$2.j($$3.gB());
         }

         if (this.q()) {
            $$2.b(this.Z_());
            $$2.b(true, true);
            if (this.af.h()) {
               $$2.a(this.gE());
            } else {
               $$2.a($$3.gE());
            }
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.am.a(cf, $$0);
   }

   @Override
   public boolean a(cfv $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof cgy $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.y() ? false : this.gy() && $$1.gy();
      }
   }

   public boolean gG() {
      return this.am.a(cf);
   }

   @Override
   public boolean a(buf $$0, buf $$1) {
      if ($$0 instanceof ckh || $$0 instanceof ckp || $$0 instanceof cjo) {
         return false;
      } else if ($$0 instanceof cgy $$2) {
         return !$$2.q() || $$2.R_() != $$1;
      } else {
         if ($$0 instanceof cnp $$3 && $$1 instanceof cnp $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof chz $$5 && $$5.gF()) {
            return false;
         }

         if ($$0 instanceof bvb $$6 && $$6.q()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean A() {
      return !this.ac_();
   }

   @Override
   public eye cQ() {
      return new eye(0.0, (double)(0.6F * this.cP()), (double)(this.dn() * 0.4F));
   }

   public static boolean c(btq<cgy> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.a_($$3.e()).a(aws.cg) && a($$1, $$3);
   }

   class a<T extends buf> extends caj<T> {
      private final cgy j;

      public a(final cgy $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cic ? !this.j.q() && this.a((cic)this.b) : false;
      }

      private boolean a(cic $$0) {
         return $$0.gs() >= cgy.this.af.a(5);
      }

      @Override
      public void d() {
         cgy.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         cgy.this.h(null);
         super.a();
      }
   }

   public static class b extends btc.a {
      public final jn<cgz> a;

      public b(jn<cgz> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
