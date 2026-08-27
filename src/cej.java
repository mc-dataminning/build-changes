import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cej extends btn implements btq<ix<cek>> {
   public static final double cb = 0.6;
   public static final double cc = 0.8;
   public static final double cd = 1.33;
   private static final ajs<ix<cek>> ce = ajw.a(cej.class, aju.x);
   private static final ajs<Boolean> cf = ajw.a(cej.class, aju.k);
   private static final ajs<Boolean> cg = ajw.a(cej.class, aju.k);
   private static final ajs<Integer> ch = ajw.a(cej.class, aju.b);
   private static final akm<cek> ci = cek.b;
   @Nullable
   private cej.a<cly> cj;
   @Nullable
   private caw ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;

   public cej(bsc<? extends cej> $$0, daz $$1) {
      super($$0, $$1);
      this.gB();
   }

   public akn gv() {
      return this.gw().a().a();
   }

   @Override
   protected void z() {
      this.ck = new cej.c(this, 0.6, $$0 -> $$0.a(awf.ae), true);
      this.bS.a(1, new bzi(this));
      this.bS.a(1, new cah(this, 1.5));
      this.bS.a(2, new cat(this));
      this.bS.a(3, new cej.b(this));
      this.bS.a(4, this.ck);
      this.bS.a(5, new bzb(this, 1.1, 8));
      this.bS.a(6, new bzm(this, 1.0, 10.0F, 5.0F, false));
      this.bS.a(7, new bzc(this, 0.8));
      this.bS.a(8, new bzu(this, 0.3F));
      this.bS.a(9, new cae(this));
      this.bS.a(10, new bza(this, 0.8));
      this.bS.a(11, new cbb(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new bzw(this, cly.class, 10.0F));
      this.bT.a(1, new cbk<>(this, cfa.class, false, null));
      this.bT.a(1, new cbk<>(this, cfh.class, false, cfh.bY));
   }

   public ix<cek> gw() {
      return this.ao.a(ce);
   }

   @Override
   public void i(ix<cek> $$0) {
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

   public csj gy() {
      return csj.a(this.ao.a(ch));
   }

   private void a(csj $$0) {
      this.ao.a(ch, $$0.a());
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(ce, le.ak.g(ci));
      $$0.a(cf, false);
      $$0.a(cg, false);
      $$0.a(ch, csj.o.a());
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
      Optional.ofNullable(akn.a($$0.l("variant"))).map($$0x -> akm.a(lf.l, $$0x)).flatMap(le.ak::b).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(csj.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(btc.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(btc.a);
            this.h(true);
         } else {
            this.b(btc.a);
            this.h(false);
         }
      } else {
         this.b(btc.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected avh v() {
      if (this.s()) {
         if (this.gt()) {
            return avi.dX;
         } else {
            return this.ah.a(4) == 0 ? avi.dY : avi.dQ;
         }
      } else {
         return avi.dR;
      }
   }

   @Override
   public int O() {
      return 120;
   }

   public void gz() {
      this.b(avi.dU);
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.dW;
   }

   @Override
   protected avh o_() {
      return avi.dS;
   }

   public static btx.a gA() {
      return bss.A().a(bty.q, 10.0).a(bty.r, 0.3F).a(bty.c, 3.0);
   }

   @Override
   protected void a(cly $$0, bpv $$1, ctq $$2) {
      if (this.o($$2)) {
         this.a(avi.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gD() {
      return (float)this.g(bty.c);
   }

   @Override
   public boolean C(brw $$0) {
      return $$0.a(this.dQ().b((bsq)this), this.gD());
   }

   @Override
   public void l() {
      super.l();
      if (this.ck != null && this.ck.i() && !this.s() && this.ai % 100 == 0) {
         this.a(avi.dV, 1.0F, 1.0F);
      }

      this.gE();
   }

   private void gE() {
      if ((this.gx() || this.gC()) && this.ai % 5 == 0) {
         this.a(avi.dX, 0.6F + 0.4F * (this.ah.i() - this.ah.i()), 1.0F);
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
      return ayf.i($$0, this.cm, this.cl);
   }

   public float H(float $$0) {
      return ayf.i($$0, this.co, this.cn);
   }

   public float I(float $$0) {
      return ayf.i($$0, this.cq, this.cp);
   }

   @Nullable
   public cej b(aqn $$0, brq $$1) {
      cej $$2 = bsc.p.a((daz)$$0);
      if ($$2 != null && $$1 instanceof cej $$3) {
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
   public boolean a(ceg $$0) {
      if (!this.s()) {
         return false;
      } else {
         return !($$0 instanceof cej $$1) ? false : $$1.s() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ap() > 0.9F;
      awm<cek> $$5 = $$4 ? avy.b : avy.a;
      le.ak.a($$5, $$0.E_()).ifPresent(this::i);
      aqn $$6 = $$0.E();
      if ($$6.a().a(this.dp(), awi.o).b()) {
         this.i(le.ak.g(cek.k));
         this.fT();
      }

      return $$3;
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      ctl $$3 = $$2.g();
      if (this.s()) {
         if (this.j($$0)) {
            if ($$3 instanceof csk $$4) {
               csj $$5 = $$4.c();
               if ($$5 != this.gy()) {
                  if (!this.dP().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fT();
                  }

                  return bpw.a(this.dP().x_());
               }
            } else if (this.o($$2) && this.eA() < this.eR()) {
               if (!this.dP().x_()) {
                  this.a($$0, $$1, $$2);
                  cos $$6 = $$2.a(kb.u);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
               }

               return bpw.a(this.dP().x_());
            }

            bpw $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gp());
               return bpw.a(this.dP().x_());
            }

            return $$7;
         }
      } else if (this.o($$2)) {
         if (!this.dP().x_()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            this.fT();
         }

         return bpw.a(this.dP().x_());
      }

      bpw $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.fT();
      }

      return $$8;
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.ae);
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
         this.cj = new cej.a<>(this, cly.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cj);
      if (!this.s()) {
         this.bS.a(4, this.cj);
      }
   }

   private void h(cly $$0) {
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

   static class a<T extends bsq> extends byv<T> {
      private final cej i;

      public a(cej $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsb.e::test);
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

   static class b extends bzo {
      private final cej a;
      @Nullable
      private cly b;
      @Nullable
      private io c;
      private int d;

      public b(cej $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.s()) {
            return false;
         } else if (this.a.gp()) {
            return false;
         } else {
            bsq $$0 = this.a.P_();
            if ($$0 instanceof cly) {
               this.b = (cly)$$0;
               if (!$$0.fL()) {
                  return false;
               }

               if (this.a.g((brw)this.b) > 100.0) {
                  return false;
               }

               io $$1 = this.b.dp();
               drd $$2 = this.a.dP().a_($$1);
               if ($$2.a(avx.R)) {
                  this.c = $$2.d(ddt.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new io($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cej $$1 : this.a.dP().a(cej.class, new euh(this.c).g(2.0))) {
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
         aym $$0 = this.a.el();
         io.a $$1 = new io.a();
         $$1.g(this.a.gc() ? this.a.ge().dp() : this.a.dp());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dp());
         epm $$2 = this.a.dP().o().be().b(epf.aE);
         epk $$3 = new epk.a((aqn)this.a.dP()).a(erz.f, this.a.dn()).a(erz.a, this.a).a(ery.j);

         for (ctq $$5 : $$2.a($$3)) {
            this.a
               .dP()
               .b(
                  new cii(
                     this.a.dP(),
                     (double)$$1.u() - (double)ayf.a(this.a.aY * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)ayf.b(this.a.aY * (float) (Math.PI / 180.0)),
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
            if (this.a.g((brw)this.b) < 2.5) {
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

   static class c extends caw {
      @Nullable
      private cly c;
      private final cej d;

      public c(cej $$0, double $$1, Predicate<ctq> $$2, boolean $$3) {
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
