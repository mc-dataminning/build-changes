import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckb extends cjn implements btx {
   public static final float b = 45.836624F;
   public static final int c = aye.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajp<Byte> d = ajt.a(ckb.class, ajr.a);
   private static final int e = 1;
   @Nullable
   bta ca;
   @Nullable
   private ja cb;
   private boolean cc;
   private int cd;

   public ckb(bsj<? extends ckb> $$0, dcd $$1) {
      super($$0, $$1);
      this.bR = new ckb.c(this);
      this.bP = 3;
   }

   @Override
   public boolean aV() {
      return this.ai % c == 0;
   }

   @Override
   public void a(btd $$0, evz $$1) {
      super.a($$0, $$1);
      this.aS();
   }

   @Override
   public void l() {
      this.ag = true;
      super.l();
      this.ag = false;
      this.f(true);
      if (this.cc && --this.cd <= 0) {
         this.cd = 20;
         this.a(this.dQ().j(), 1.0F);
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzq(this));
      this.bU.a(4, new ckb.a());
      this.bU.a(8, new ckb.d());
      this.bU.a(9, new cae(this, cmh.class, 3.0F, 1.0F));
      this.bU.a(10, new cae(this, bta.class, 8.0F));
      this.bV.a(1, new cbo(this, cnt.class).a());
      this.bV.a(2, new ckb.b(this));
      this.bV.a(3, new cbp<>(this, cmh.class, true));
   }

   public static buf.a u() {
      return cjn.gt().a(bug.s, 14.0).a(bug.c, 4.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.cb = new ja($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bsd $$0) {
      super.w($$0);
      if ($$0 instanceof ckb $$1) {
         this.ca = $$1.y();
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.cb != null) {
         $$0.a("BoundX", this.cb.u());
         $$0.a("BoundY", this.cb.v());
         $$0.a("BoundZ", this.cb.w());
      }

      if (this.cc) {
         $$0.a("LifeTicks", this.cd);
      }
   }

   @Nullable
   public bta y() {
      return this.ca;
   }

   @Nullable
   public ja gn() {
      return this.cb;
   }

   public void h(@Nullable ja $$0) {
      this.cb = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.ao.a(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.ao.a(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.ao.a(d, (byte)($$2 & 0xFF));
   }

   public boolean go() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bta $$0) {
      this.ca = $$0;
   }

   public void b(int $$0) {
      this.cc = true;
      this.cd = $$0;
   }

   @Override
   protected ave v() {
      return avf.AN;
   }

   @Override
   protected ave o_() {
      return avf.AP;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.AQ;
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      aym $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(aym $$0, bqb $$1) {
      this.a(bsk.a, new cua(cud.pa));
      this.a(bsk.a, 0.0F);
   }

   class a extends bzw {
      public a() {
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean a() {
         bsy $$0 = ckb.this.p();
         return $$0 != null && $$0.bD() && !ckb.this.H().b() && ckb.this.ah.a(b(7)) == 0 ? ckb.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return ckb.this.H().b() && ckb.this.go() && ckb.this.p() != null && ckb.this.p().bD();
      }

      @Override
      public void c() {
         bsy $$0 = ckb.this.p();
         if ($$0 != null) {
            evz $$1 = $$0.bx();
            ckb.this.bR.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ckb.this.w(true);
         ckb.this.a(avf.AO, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         ckb.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bsy $$0 = ckb.this.p();
         if ($$0 != null) {
            if (ckb.this.cK().c($$0.cK())) {
               ckb.this.D($$0);
               ckb.this.w(false);
            } else {
               double $$1 = ckb.this.g($$0);
               if ($$1 < 9.0) {
                  evz $$2 = $$0.bx();
                  ckb.this.bR.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends cbw {
      private final cdp b = cdp.b().d().e();

      public b(final bth $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return ckb.this.ca != null && ckb.this.ca.p() != null && this.a(ckb.this.ca.p(), this.b);
      }

      @Override
      public void c() {
         ckb.this.h(ckb.this.ca.p());
         super.c();
      }
   }

   class c extends byz {
      public c(final ckb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == byz.a.b) {
            evz $$0 = new evz(this.e - ckb.this.du(), this.f - ckb.this.dw(), this.g - ckb.this.dA());
            double $$1 = $$0.f();
            if ($$1 < ckb.this.cK().a()) {
               this.k = byz.a.a;
               ckb.this.h(ckb.this.ds().a(0.5));
            } else {
               ckb.this.h(ckb.this.ds().e($$0.a(this.h * 0.05 / $$1)));
               if (ckb.this.p() == null) {
                  evz $$2 = ckb.this.ds();
                  ckb.this.s(-((float)aye.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ckb.this.aY = ckb.this.dF();
               } else {
                  double $$3 = ckb.this.p().du() - ckb.this.du();
                  double $$4 = ckb.this.p().dA() - ckb.this.dA();
                  ckb.this.s(-((float)aye.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ckb.this.aY = ckb.this.dF();
               }
            }
         }
      }
   }

   class d extends bzw {
      public d() {
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean a() {
         return !ckb.this.H().b() && ckb.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         ja $$0 = ckb.this.gn();
         if ($$0 == null) {
            $$0 = ckb.this.dp();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            ja $$2 = $$0.b(ckb.this.ah.a(15) - 7, ckb.this.ah.a(11) - 5, ckb.this.ah.a(15) - 7);
            if (ckb.this.dP().u($$2)) {
               ckb.this.bR.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ckb.this.p() == null) {
                  ckb.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
