import java.util.UUID;
import javax.annotation.Nullable;

public class cqf extends cqd implements byk {
   private static final bxh c = bxn.bS.n().a(0.5F).b(0.97F);
   private static final alr bJ = alr.b("attacking");
   private static final bzj bK = new bzj(bJ, 0.05, bzj.a.a);
   private static final bun bL = bbd.a(0, 1);
   private int bM;
   private static final bun bN = bbd.a(20, 39);
   private int bO;
   @Nullable
   private UUID bP;
   private static final int bQ = 10;
   private static final bun bR = bbd.a(4, 6);
   private int bS;

   public cqf(bxn<? extends cqf> $$0, dkj $$1) {
      super($$0, $$1);
      this.a(eyr.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bP = $$0;
   }

   @Override
   protected void m() {
      this.bF.a(2, new cgq(this, 1.0, false));
      this.bF.a(7, new cgo(this, 1.0));
      this.bG.a(1, new cgt(this).a());
      this.bG.a(2, new cgu<>(this, csi.class, 10, true, false, this::a));
      this.bG.a(3, new cha<>(this, true));
   }

   public static bzk.a gB() {
      return cqd.gv().a(bzl.A, 0.0).a(bzl.v, 0.23F).a(bzl.c, 5.0);
   }

   @Override
   public bxh e(byr $$0) {
      return this.n_() ? c : super.e($$0);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   protected void a(asb $$0) {
      bzh $$1 = this.g(bzl.v);
      if (this.af_()) {
         if (!this.n_() && !$$1.b(bJ)) {
            $$1.b(bK);
         }

         this.gC();
      } else if ($$1.b(bJ)) {
         $$1.c(bJ);
      }

      this.a($$0, true);
      if (this.f() != null) {
         this.gD();
      }

      super.a($$0);
   }

   private void gC() {
      if (this.bM > 0) {
         this.bM--;
         if (this.bM == 0) {
            this.gF();
         }
      }
   }

   private void gD() {
      if (this.bS > 0) {
         this.bS--;
      } else {
         if (this.P().a(this.f())) {
            this.gE();
         }

         this.bS = bR.a(this.ae);
      }
   }

   private void gE() {
      double $$0 = this.h(bzl.m);
      ffx $$1 = ffx.a(this.dt()).c($$0, 10.0, $$0);
      this.dV()
         .a(cqf.class, $$1, bxl.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.f() == null)
         .filter($$0x -> !$$0x.s(this.f()))
         .forEach($$0x -> $$0x.g(this.f()));
   }

   private void gF() {
      this.a(awy.EE, this.fe() * 2.0F, this.ff() * 1.8F);
   }

   @Override
   public void g(@Nullable byf $$0) {
      if (this.f() == null && $$0 != null) {
         this.bM = bL.a(this.ae);
         this.bS = bR.a(this.ae);
      }

      super.g($$0);
   }

   @Override
   public void c() {
      this.a(bN.a(this.ae));
   }

   public static boolean b(bxn<cqf> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.an() != buz.a && !$$1.a_($$3.e()).a(dnq.lq);
   }

   @Override
   public boolean a(dkm $$0) {
      return $$0.f(this) && !$$0.d(this.cR());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.bO = $$0;
   }

   @Override
   public int a() {
      return this.bO;
   }

   @Override
   protected awx u() {
      return this.af_() ? awy.EE : awy.ED;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.EG;
   }

   @Override
   protected awx l_() {
      return awy.EF;
   }

   @Override
   protected void a(bai $$0, bva $$1) {
      this.a(bxo.a, new dak(dao.pK));
   }

   @Override
   protected dak t() {
      return dak.l;
   }

   @Override
   protected void gA() {
      this.g(bzl.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bP;
   }

   @Override
   public boolean a(asb $$0, csi $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(asb $$0, dak $$1) {
      return this.g($$1);
   }
}
