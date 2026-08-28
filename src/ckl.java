import java.util.UUID;
import javax.annotation.Nullable;

public class ckl extends ckj implements bth {
   private static final bsj c = bsm.bx.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final buh cd = new buh(d, "Attacking speed boost", 0.05, buh.a.a);
   private static final bpr ce = azh.a(0, 1);
   private int cf;
   private static final bpr cg = azh.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;
   private static final int cj = 10;
   private static final bpr ck = azh.a(4, 6);
   private int cl;

   public ckl(bsm<? extends ckl> $$0, dcf $$1) {
      super($$0, $$1);
      this.a(eoy.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Override
   protected void u() {
      this.bU.a(2, new cbo(this, 1.0, false));
      this.bU.a(7, new cbm(this, 1.0));
      this.bV.a(1, new cbr(this).a());
      this.bV.a(2, new cbs<>(this, cmk.class, 10, true, false, this::a_));
      this.bV.a(3, new cby<>(this, true));
   }

   public static bui.a gy() {
      return ckj.gs().a(buj.A, 0.0).a(buj.v, 0.23F).a(buj.c, 5.0);
   }

   @Override
   public bsj e(btn $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   protected void Z() {
      buf $$0 = this.f(buj.v);
      if (this.Z_()) {
         if (!this.p_() && !$$0.a(cd)) {
            $$0.c(cd);
         }

         this.gz();
      } else if ($$0.a(cd)) {
         $$0.b(cd.b());
      }

      this.a((aqm)this.dQ(), true);
      if (this.p() != null) {
         this.gA();
      }

      if (this.Z_()) {
         this.bd = this.ai;
      }

      super.Z();
   }

   private void gz() {
      if (this.cf > 0) {
         this.cf--;
         if (this.cf == 0) {
            this.gC();
         }
      }
   }

   private void gA() {
      if (this.cl > 0) {
         this.cl--;
      } else {
         if (this.M().a(this.p())) {
            this.gB();
         }

         this.cl = ck.a(this.ah);
      }
   }

   private void gB() {
      double $$0 = this.g(buj.m);
      ewa $$1 = ewa.a(this.do()).c($$0, 10.0, $$0);
      this.dQ()
         .a(ckl.class, $$1, bsl.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gC() {
      this.a(avh.DF, this.fb() * 2.0F, this.fc() * 1.8F);
   }

   @Override
   public void h(@Nullable btb $$0) {
      if (this.p() == null && $$0 != null) {
         this.cf = ce.a(this.ah);
         this.cl = ck.a(this.ah);
      }

      if ($$0 instanceof cmk) {
         this.c((cmk)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ah));
   }

   public static boolean b(bsm<ckl> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.al() != bqd.a && !$$1.a_($$3.d()).a(dfj.kK);
   }

   @Override
   public boolean a(dci $$0) {
      return $$0.f(this) && !$$0.d(this.cL());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
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
   protected avg v() {
      return this.Z_() ? avh.DF : avh.DE;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.DH;
   }

   @Override
   protected avg o_() {
      return avh.DG;
   }

   @Override
   protected void a(ayo $$0, bqe $$1) {
      this.a(bsn.a, new cuc(cuf.oW));
   }

   @Override
   protected cuc gp() {
      return cuc.l;
   }

   @Override
   protected void gx() {
      this.f(buj.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   @Override
   public boolean f(cmk $$0) {
      return this.a_((btb)$$0);
   }

   @Override
   public boolean k(cuc $$0) {
      return this.j($$0);
   }
}
