import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cer extends btv implements bty<jj<ces>> {
   public static final double cd = 0.6;
   public static final double ce = 0.8;
   public static final double cf = 1.33;
   private static final ajp<jj<ces>> cg = ajt.a(cer.class, ajr.x);
   private static final ajp<Boolean> ch = ajt.a(cer.class, ajr.k);
   private static final ajp<Boolean> ci = ajt.a(cer.class, ajr.k);
   private static final ajp<Integer> cj = ajt.a(cer.class, ajr.b);
   private static final akj<ces> ck = ces.b;
   @Nullable
   private cer.a<cmh> cl;
   @Nullable
   private cbe cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cer(bsj<? extends cer> $$0, dcd $$1) {
      super($$0, $$1);
      this.gz();
   }

   public akk gt() {
      return this.gu().a().a();
   }

   @Override
   protected void z() {
      this.cm = new cer.c(this, 0.6, $$0 -> $$0.a(awd.ae), true);
      this.bU.a(1, new bzq(this));
      this.bU.a(1, new cap(this, 1.5));
      this.bU.a(2, new cbb(this));
      this.bU.a(3, new cer.b(this));
      this.bU.a(4, this.cm);
      this.bU.a(5, new bzj(this, 1.1, 8));
      this.bU.a(6, new bzu(this, 1.0, 10.0F, 5.0F, false));
      this.bU.a(7, new bzk(this, 0.8));
      this.bU.a(8, new cac(this, 0.3F));
      this.bU.a(9, new cam(this));
      this.bU.a(10, new bzi(this, 0.8));
      this.bU.a(11, new cbj(this, 0.8, 1.0000001E-5F));
      this.bU.a(12, new cae(this, cmh.class, 10.0F));
      this.bV.a(1, new cbs<>(this, cfi.class, false, null));
      this.bV.a(1, new cbs<>(this, cfp.class, false, cfp.ca));
   }

   public jj<ces> gu() {
      return this.ao.a(cg);
   }

   @Override
   public void i(jj<ces> $$0) {
      this.ao.a(cg, $$0);
   }

   public void z(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   public boolean gv() {
      return this.ao.a(ch);
   }

   void A(boolean $$0) {
      this.ao.a(ci, $$0);
   }

   boolean gA() {
      return this.ao.a(ci);
   }

   public cst gw() {
      return cst.a(this.ao.a(cj));
   }

   private void a(cst $$0) {
      this.ao.a(cj, $$0.a());
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cg, lq.ai.g(ck));
      $$0.a(ch, false);
      $$0.a(ci, false);
      $$0.a(cj, cst.o.a());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("variant", this.gu().e().orElse(ck).a().toString());
      $$0.a("CollarColor", (byte)this.gw().a());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      Optional.ofNullable(akk.a($$0.l("variant"))).map($$0x -> akj.a(lr.l, $$0x)).flatMap(lq.ai::b).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(cst.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(btk.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(btk.a);
            this.h(true);
         } else {
            this.b(btk.a);
            this.h(false);
         }
      } else {
         this.b(btk.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected ave v() {
      if (this.s()) {
         if (this.gr()) {
            return avf.dX;
         } else {
            return this.ah.a(4) == 0 ? avf.dY : avf.dQ;
         }
      } else {
         return avf.dR;
      }
   }

   @Override
   public int P() {
      return 120;
   }

   public void gx() {
      this.b(avf.dU);
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.dW;
   }

   @Override
   protected ave o_() {
      return avf.dS;
   }

   public static buf.a gy() {
      return bta.A().a(bug.s, 10.0).a(bug.v, 0.3F).a(bug.c, 3.0);
   }

   @Override
   protected void a(cmh $$0, bqc $$1, cua $$2) {
      if (this.o($$2)) {
         this.a(avf.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public void l() {
      super.l();
      if (this.cm != null && this.cm.i() && !this.s() && this.ai % 100 == 0) {
         this.a(avf.dV, 1.0F, 1.0F);
      }

      this.gB();
   }

   private void gB() {
      if ((this.gv() || this.gA()) && this.ai % 5 == 0) {
         this.a(avf.dX, 0.6F + 0.4F * (this.ah.i() - this.ah.i()), 1.0F);
      }

      this.gC();
      this.gD();
   }

   private void gC() {
      this.co = this.cn;
      this.cq = this.cp;
      if (this.gv()) {
         this.cn = Math.min(1.0F, this.cn + 0.15F);
         this.cp = Math.min(1.0F, this.cp + 0.08F);
      } else {
         this.cn = Math.max(0.0F, this.cn - 0.22F);
         this.cp = Math.max(0.0F, this.cp - 0.13F);
      }
   }

   private void gD() {
      this.cs = this.cr;
      if (this.gA()) {
         this.cr = Math.min(1.0F, this.cr + 0.1F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.13F);
      }
   }

   public float H(float $$0) {
      return aye.i($$0, this.co, this.cn);
   }

   public float I(float $$0) {
      return aye.i($$0, this.cq, this.cp);
   }

   public float J(float $$0) {
      return aye.i($$0, this.cs, this.cr);
   }

   @Nullable
   public cer b(aqk $$0, brx $$1) {
      cer $$2 = bsj.p.a((dcd)$$0);
      if ($$2 != null && $$1 instanceof cer $$3) {
         if (this.ah.h()) {
            $$2.i(this.gu());
         } else {
            $$2.i($$3.gu());
         }

         if (this.s()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gw());
            } else {
               $$2.a($$3.gw());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(ceo $$0) {
      if (!this.s()) {
         return false;
      } else {
         return !($$0 instanceof cer $$1) ? false : $$1.s() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.aq() > 0.9F;
      awk<ces> $$5 = $$4 ? avv.b : avv.a;
      lq.ai.a($$5, $$0.E_()).ifPresent(this::i);
      aqk $$6 = $$0.E();
      if ($$6.a().a(this.dp(), awg.o).b()) {
         this.i(lq.ai.g(ces.k));
         this.fQ();
      }

      return $$3;
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      ctv $$3 = $$2.g();
      if (this.s()) {
         if (this.j($$0)) {
            if ($$3 instanceof csu $$4) {
               cst $$5 = $$4.c();
               if ($$5 != this.gw()) {
                  if (!this.dP().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fQ();
                  }

                  return bqd.a(this.dP().x_());
               }
            } else if (this.o($$2) && this.ew() < this.eN()) {
               if (!this.dP().x_()) {
                  this.a($$0, $$1, $$2);
                  cpb $$6 = $$2.a(kn.v);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
               }

               return bqd.a(this.dP().x_());
            }

            bqd $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gn());
               return bqd.a(this.dP().x_());
            }

            return $$7;
         }
      } else if (this.o($$2)) {
         if (!this.dP().x_()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            this.fQ();
         }

         return bqd.a(this.dP().x_());
      }

      bqd $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fQ();
      }

      return $$8;
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.ae);
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && this.ai > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gz();
   }

   protected void gz() {
      if (this.cl == null) {
         this.cl = new cer.a<>(this, cmh.class, 16.0F, 0.8, 1.33);
      }

      this.bU.a(this.cl);
      if (!this.s()) {
         this.bU.a(4, this.cl);
      }
   }

   private void h(cmh $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.y(true);
         this.dP().a(this, (byte)7);
      } else {
         this.dP().a(this, (byte)6);
      }
   }

   @Override
   public boolean bW() {
      return this.ca() || super.bW();
   }

   static class a<T extends bsy> extends bzd<T> {
      private final cer i;

      public a(cer $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsi.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.s() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.s() && super.b();
      }
   }

   static class b extends bzw {
      private final cer a;
      @Nullable
      private cmh b;
      @Nullable
      private ja c;
      private int d;

      public b(cer $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.gn()) {
            return false;
         } else {
            bsy $$0 = this.a.P_();
            if ($$0 instanceof cmh) {
               this.b = (cmh)$$0;
               if (!$$0.fH()) {
                  return false;
               }

               if (this.a.g((bsd)this.b) > 100.0) {
                  return false;
               }

               ja $$1 = this.b.dp();
               dsh $$2 = this.a.dP().a_($$1);
               if ($$2.a(avu.R)) {
                  this.c = $$2.d(dey.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ja($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cer $$1 : this.a.dP().a(cer.class, new evu(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gv() || $$1.gA())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.s() && !this.a.gn() && this.b != null && this.b.fH() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.x(false);
            this.a.K().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.z(false);
         float $$0 = this.a.dP().f(1.0F);
         if (this.b.gc() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dP().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.K().n();
      }

      private void i() {
         aym $$0 = this.a.dS();
         ja.a $$1 = new ja.a();
         $$1.g(this.a.fZ() ? this.a.gb().dp() : this.a.dp());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dp());
         eqt $$2 = this.a.dP().o().be().b(eqk.aG);
         eqr $$3 = new eqr.a((aqk)this.a.dP()).a(etk.f, this.a.dn()).a(etk.a, this.a).a(etj.j);

         for (cua $$5 : $$2.a($$3)) {
            this.a
               .dP()
               .b(
                  new cir(
                     this.a.dP(),
                     (double)$$1.u() - (double)aye.a(this.a.aY * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)aye.b(this.a.aY * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.x(false);
            this.a.K().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g((bsd)this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.z(true);
                  this.a.A(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.A(true);
               }
            } else {
               this.a.z(false);
            }
         }
      }
   }

   static class c extends cbe {
      @Nullable
      private cmh c;
      private final cer d;

      public c(cer $$0, double $$1, Predicate<cua> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.dS().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dS().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.s();
      }
   }
}
