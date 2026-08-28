import javax.annotation.Nullable;

public class cjt extends cix implements cjd, clv {
   private static final ajp<Boolean> b = ajt.a(cjt.class, ajr.k);
   private static final int e = 5;
   private static final int ca = 300;
   private final bqp cb = new bqp(5);

   public cjt(bsm<? extends cjt> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzt(this));
      this.bU.a(2, new cnw.a(this, 10.0F));
      this.bU.a(3, new cba<>(this, 1.0, 8.0F));
      this.bU.a(8, new caw(this, 0.6));
      this.bU.a(9, new cah(this, cmk.class, 15.0F, 1.0F));
      this.bU.a(10, new cah(this, btd.class, 15.0F));
      this.bV.a(1, new cbr(this, cnw.class).a());
      this.bV.a(2, new cbs<>(this, cmk.class, true));
      this.bV.a(3, new cbs<>(this, cls.class, false));
      this.bV.a(3, new cbs<>(this, cfd.class, true));
   }

   public static bui.a u() {
      return cjq.gu().a(buj.v, 0.35F).a(buj.s, 24.0).a(buj.c, 5.0).a(buj.m, 32.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cuv $$0) {
      return $$0 == cuf.vW;
   }

   public boolean go() {
      return this.ao.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.b($$0, this.dS());
   }

   @Override
   public cix.a s() {
      if (this.go()) {
         return cix.a.f;
      } else if (this.b(cuf.vW)) {
         return cix.a.e;
      } else {
         return this.gf() ? cix.a.b : cix.a.h;
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0, this.dS());
      this.a_(true);
   }

   @Override
   public float a(ja $$0, dci $$1) {
      return 0.0F;
   }

   @Override
   public int fN() {
      return 1;
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      ayo $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayo $$0, bqe $$1) {
      this.a(bsn.a, new cuc(cuf.vW));
   }

   @Override
   protected void a(ayo $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cuc $$2 = this.eU();
         if ($$2.a(cuf.vW)) {
            czn.a($$2, day.b, this.dQ(), this.dq(), $$0);
         }
      }
   }

   @Override
   protected avg v() {
      return avh.tV;
   }

   @Override
   protected avg o_() {
      return avh.tX;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.tY;
   }

   @Override
   public void a(btb $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bqp y() {
      return this.cb;
   }

   @Override
   protected void b(ciu $$0) {
      cuc $$1 = $$0.p();
      if ($$1.g() instanceof cry) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cuc $$2 = this.cb.b($$1);
         if ($$2.e()) {
            $$0.ap();
         } else {
            $$1.e($$2.H());
         }
      }
   }

   private boolean n(cuc $$0) {
      return this.gF() && $$0.a(cuf.uP);
   }

   @Override
   public btt a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cb.b() ? btt.a(this.cb, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cnv $$2 = this.gC();
      boolean $$3 = this.ah.i() <= $$2.v();
      if ($$3) {
         cuc $$4 = new cuc(cuf.vW);
         akj<das> $$5;
         if ($$0 > $$2.a(bqd.c)) {
            $$5 = day.d;
         } else if ($$0 > $$2.a(bqd.b)) {
            $$5 = day.c;
         } else {
            $$5 = null;
         }

         if ($$5 != null) {
            czn.a($$4, $$5, this.dQ(), this.dq(), this.dT());
            this.a(bsn.a, $$4);
         }
      }
   }

   @Override
   public avg ae_() {
      return avh.tW;
   }
}
