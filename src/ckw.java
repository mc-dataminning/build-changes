import java.util.UUID;
import javax.annotation.Nullable;

public class ckw extends cku implements btr {
   private static final bst c = bsw.bx.n().a(0.5F).b(0.97F);
   private static final akq d = akq.b("attacking");
   private static final bus cd = new bus(d, 0.05, bus.a.a);
   private static final bqb ce = azo.a(0, 1);
   private int cf;
   private static final bqb cg = azo.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;
   private static final int cj = 10;
   private static final bqb ck = azo.a(4, 6);
   private int cl;

   public ckw(bsw<? extends ckw> $$0, dcu $$1) {
      super($$0, $$1);
      this.a(epp.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Override
   protected void t() {
      this.bU.a(2, new cbz(this, 1.0, false));
      this.bU.a(7, new cbx(this, 1.0));
      this.bV.a(1, new ccc(this).a());
      this.bV.a(2, new ccd<>(this, cmv.class, 10, true, false, this::a_));
      this.bV.a(3, new ccj<>(this, true));
   }

   public static but.a gw() {
      return cku.gq().a(buu.A, 0.0).a(buu.v, 0.23F).a(buu.c, 5.0);
   }

   @Override
   public bst e(bty $$0) {
      return this.o_() ? c : super.e($$0);
   }

   @Override
   protected boolean go() {
      return false;
   }

   @Override
   protected void Z() {
      buq $$0 = this.f(buu.v);
      if (this.Z_()) {
         if (!this.o_() && !$$0.b(d)) {
            $$0.b(cd);
         }

         this.gx();
      } else if ($$0.b(d)) {
         $$0.c(d);
      }

      this.a((aqt)this.dQ(), true);
      if (this.p() != null) {
         this.gy();
      }

      if (this.Z_()) {
         this.bd = this.ai;
      }

      super.Z();
   }

   private void gx() {
      if (this.cf > 0) {
         this.cf--;
         if (this.cf == 0) {
            this.gA();
         }
      }
   }

   private void gy() {
      if (this.cl > 0) {
         this.cl--;
      } else {
         if (this.L().a(this.p())) {
            this.gz();
         }

         this.cl = ck.a(this.ah);
      }
   }

   private void gz() {
      double $$0 = this.g(buu.m);
      ewr $$1 = ewr.a(this.do()).c($$0, 10.0, $$0);
      this.dQ()
         .a(ckw.class, $$1, bsv.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gA() {
      this.a(avo.DG, this.fb() * 2.0F, this.fc() * 1.8F);
   }

   @Override
   public void h(@Nullable btl $$0) {
      if (this.p() == null && $$0 != null) {
         this.cf = ce.a(this.ah);
         this.cl = ck.a(this.ah);
      }

      if ($$0 instanceof cmv) {
         this.c((cmv)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ah));
   }

   public static boolean b(bsw<ckw> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.al() != bqn.a && !$$1.a_($$3.d()).a(dfy.kK);
   }

   @Override
   public boolean a(dcx $$0) {
      return $$0.f(this) && !$$0.d(this.cL());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(this.dQ(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.ch = $$0;
   }

   @Override
   public int a() {
      return this.ch;
   }

   @Override
   protected avn v() {
      return this.Z_() ? avo.DG : avo.DF;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.DI;
   }

   @Override
   protected avn n_() {
      return avo.DH;
   }

   @Override
   protected void a(ayv $$0, bqo $$1) {
      this.a(bsx.a, new cuo(cur.oW));
   }

   @Override
   protected cuo gn() {
      return cuo.l;
   }

   @Override
   protected void gv() {
      this.f(buu.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   @Override
   public boolean f(cmv $$0) {
      return this.a_((btl)$$0);
   }

   @Override
   public boolean k(cuo $$0) {
      return this.j($$0);
   }
}
