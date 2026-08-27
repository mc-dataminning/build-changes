import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceh extends btl implements bto<ix<cei>> {
   public static final double cb = 0.6;
   public static final double cc = 0.8;
   public static final double cd = 1.33;
   private static final ajr<ix<cei>> ce = ajv.a(ceh.class, ajt.x);
   private static final ajr<Boolean> cf = ajv.a(ceh.class, ajt.k);
   private static final ajr<Boolean> cg = ajv.a(ceh.class, ajt.k);
   private static final ajr<Integer> ch = ajv.a(ceh.class, ajt.b);
   private static final akl<cei> ci = cei.b;
   @Nullable
   private ceh.a<clw> cj;
   @Nullable
   private cau ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;

   public ceh(bsa<? extends ceh> $$0, dax $$1) {
      super($$0, $$1);
      this.gB();
   }

   public akm gv() {
      return this.gw().a().a();
   }

   @Override
   protected void z() {
      this.ck = new ceh.c(this, 0.6, $$0 -> $$0.a(awe.ae), true);
      this.bS.a(1, new bzg(this));
      this.bS.a(1, new caf(this, 1.5));
      this.bS.a(2, new car(this));
      this.bS.a(3, new ceh.b(this));
      this.bS.a(4, this.ck);
      this.bS.a(5, new byz(this, 1.1, 8));
      this.bS.a(6, new bzk(this, 1.0, 10.0F, 5.0F, false));
      this.bS.a(7, new bza(this, 0.8));
      this.bS.a(8, new bzs(this, 0.3F));
      this.bS.a(9, new cac(this));
      this.bS.a(10, new byy(this, 0.8));
      this.bS.a(11, new caz(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new bzu(this, clw.class, 10.0F));
      this.bT.a(1, new cbi<>(this, cey.class, false, null));
      this.bT.a(1, new cbi<>(this, cff.class, false, cff.bY));
   }

   public ix<cei> gw() {
      return this.ao.a(ce);
   }

   @Override
   public void i(ix<cei> $$0) {
      this.ao.a(ce, $$0);
   }

   public void z(boolean $$0) {
      this.ao.a(cf, $$0);
   }

   public boolean gx() {
      return this.ao.a(cf);
   }

   void A(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   boolean gC() {
      return this.ao.a(cg);
   }

   public csh gy() {
      return csh.a(this.ao.a(ch));
   }

   private void a(csh $$0) {
      this.ao.a(ch, $$0.a());
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(ce, le.ak.g(ci));
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(ch, csh.o.a());
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("variant", this.gw().e().orElse(ci).a().toString());
      $$0.a("CollarColor", (byte)this.gy().a());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      Optional.ofNullable(akm.a($$0.l("variant"))).map($$0x -> akl.a(lf.l, $$0x)).flatMap(le.ak::b).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(csh.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bta.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bta.a);
            this.h(true);
         } else {
            this.b(bta.a);
            this.h(false);
         }
      } else {
         this.b(bta.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected avg v() {
      if (this.s()) {
         if (this.gt()) {
            return avh.dX;
         } else {
            return this.ah.a(4) == 0 ? avh.dY : avh.dQ;
         }
      } else {
         return avh.dR;
      }
   }

   @Override
   public int O() {
      return 120;
   }

   public void gz() {
      this.b(avh.dU);
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.dW;
   }

   @Override
   protected avg o_() {
      return avh.dS;
   }

   public static btv.a gA() {
      return bsq.A().a(btw.q, 10.0).a(btw.r, 0.3F).a(btw.c, 3.0);
   }

   @Override
   protected void a(clw $$0, bpt $$1, cto $$2) {
      if (this.o($$2)) {
         this.a(avh.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gD() {
      return (float)this.g(btw.c);
   }

   @Override
   public boolean C(bru $$0) {
      return $$0.a(this.dQ().b((bso)this), this.gD());
   }

   @Override
   public void l() {
      super.l();
      if (this.ck != null && this.ck.i() && !this.s() && this.ai % 100 == 0) {
         this.a(avh.dV, 1.0F, 1.0F);
      }

      this.gE();
   }

   private void gE() {
      if ((this.gx() || this.gC()) && this.ai % 5 == 0) {
         this.a(avh.dX, 0.6F + 0.4F * (this.ah.i() - this.ah.i()), 1.0F);
      }

      this.gF();
      this.gG();
   }

   private void gF() {
      this.cm = this.cl;
      this.co = this.cn;
      if (this.gx()) {
         this.cl = Math.min(1.0F, this.cl + 0.15F);
         this.cn = Math.min(1.0F, this.cn + 0.08F);
      } else {
         this.cl = Math.max(0.0F, this.cl - 0.22F);
         this.cn = Math.max(0.0F, this.cn - 0.13F);
      }
   }

   private void gG() {
      this.cq = this.cp;
      if (this.gC()) {
         this.cp = Math.min(1.0F, this.cp + 0.1F);
      } else {
         this.cp = Math.max(0.0F, this.cp - 0.13F);
      }
   }

   public float G(float $$0) {
      return ayd.i($$0, this.cm, this.cl);
   }

   public float H(float $$0) {
      return ayd.i($$0, this.co, this.cn);
   }

   public float I(float $$0) {
      return ayd.i($$0, this.cq, this.cp);
   }

   @Nullable
   public ceh b(aqm $$0, bro $$1) {
      ceh $$2 = bsa.p.a((dax)$$0);
      if ($$2 != null && $$1 instanceof ceh $$3) {
         if (this.ah.h()) {
            $$2.i(this.gw());
         } else {
            $$2.i($$3.gw());
         }

         if (this.s()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gy());
            } else {
               $$2.a($$3.gy());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cee $$0) {
      if (!this.s()) {
         return false;
      } else {
         return !($$0 instanceof ceh $$1) ? false : $$1.s() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ap() > 0.9F;
      awl<cei> $$5 = $$4 ? avx.b : avx.a;
      le.ak.a($$5, $$0.E_()).ifPresent(this::i);
      aqm $$6 = $$0.E();
      if ($$6.a().a(this.dp(), awh.o).b()) {
         this.i(le.ak.g(cei.k));
         this.fT();
      }

      return $$3;
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      ctj $$3 = $$2.g();
      if (this.s()) {
         if (this.j($$0)) {
            if ($$3 instanceof csi $$4) {
               csh $$5 = $$4.c();
               if ($$5 != this.gy()) {
                  if (!this.dP().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fT();
                  }

                  return bpu.a(this.dP().x_());
               }
            } else if (this.o($$2) && this.eA() < this.eR()) {
               if (!this.dP().x_()) {
                  this.a($$0, $$1, $$2);
                  coq $$6 = $$2.a(kb.u);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
               }

               return bpu.a(this.dP().x_());
            }

            bpu $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gp());
               return bpu.a(this.dP().x_());
            }

            return $$7;
         }
      } else if (this.o($$2)) {
         if (!this.dP().x_()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            this.fT();
         }

         return bpu.a(this.dP().x_());
      }

      bpu $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fT();
      }

      return $$8;
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.ae);
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && this.ai > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gB();
   }

   protected void gB() {
      if (this.cj == null) {
         this.cj = new ceh.a<>(this, clw.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cj);
      if (!this.s()) {
         this.bS.a(4, this.cj);
      }
   }

   private void h(clw $$0) {
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

   static class a<T extends bso> extends byt<T> {
      private final ceh i;

      public a(ceh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, brz.e::test);
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

   static class b extends bzm {
      private final ceh a;
      @Nullable
      private clw b;
      @Nullable
      private io c;
      private int d;

      public b(ceh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.gp()) {
            return false;
         } else {
            bso $$0 = this.a.P_();
            if ($$0 instanceof clw) {
               this.b = (clw)$$0;
               if (!$$0.fL()) {
                  return false;
               }

               if (this.a.g((bru)this.b) > 100.0) {
                  return false;
               }

               io $$1 = this.b.dp();
               drb $$2 = this.a.dP().a_($$1);
               if ($$2.a(avw.R)) {
                  this.c = $$2.d(ddr.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new io($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (ceh $$1 : this.a.dP().a(ceh.class, new euf(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gx() || $$1.gC())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.s() && !this.a.gp() && this.b != null && this.b.fL() && this.c != null && !this.h();
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
         if (this.b.gg() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dP().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.K().n();
      }

      private void i() {
         ayk $$0 = this.a.el();
         io.a $$1 = new io.a();
         $$1.g(this.a.gc() ? this.a.ge().dp() : this.a.dp());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dp());
         epk $$2 = this.a.dP().o().be().b(epd.aE);
         epi $$3 = new epi.a((aqm)this.a.dP()).a(erx.f, this.a.dn()).a(erx.a, this.a).a(erw.j);

         for (cto $$5 : $$2.a($$3)) {
            this.a
               .dP()
               .b(
                  new cig(
                     this.a.dP(),
                     (double)$$1.u() - (double)ayd.a(this.a.aZ * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)ayd.b(this.a.aZ * (float) (Math.PI / 180.0)),
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
            if (this.a.g((bru)this.b) < 2.5) {
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

   static class c extends cau {
      @Nullable
      private clw c;
      private final ceh d;

      public c(ceh $$0, double $$1, Predicate<cto> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.el().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.el().a(this.a(500)) == 0) {
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
