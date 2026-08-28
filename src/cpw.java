import java.util.UUID;
import javax.annotation.Nullable;

public class cpw extends cpu implements byb {
   private static final bwy c = bxe.bS.n().a(0.5F).b(0.97F);
   private static final alk bJ = alk.b("attacking");
   private static final bza bK = new bza(bJ, 0.05, bza.a.a);
   private static final bue bL = bau.a(0, 1);
   private int bM;
   private static final bue bN = bau.a(20, 39);
   private int bO;
   @Nullable
   private UUID bP;
   private static final int bQ = 10;
   private static final bue bR = bau.a(4, 6);
   private int bS;

   public cpw(bxe<? extends cpw> $$0, djz $$1) {
      super($$0, $$1);
      this.a(eyh.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bP = $$0;
   }

   @Override
   protected void m() {
      this.bF.a(2, new cgh(this, 1.0, false));
      this.bF.a(7, new cgf(this, 1.0));
      this.bG.a(1, new cgk(this).a());
      this.bG.a(2, new cgl<>(this, crz.class, 10, true, false, this::a));
      this.bG.a(3, new cgr<>(this, true));
   }

   public static bzb.a gB() {
      return cpu.gv().a(bzc.A, 0.0).a(bzc.v, 0.23F).a(bzc.c, 5.0);
   }

   @Override
   public bwy e(byi $$0) {
      return this.n_() ? c : super.e($$0);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   protected void a(aru $$0) {
      byy $$1 = this.g(bzc.v);
      if (this.ae_()) {
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
      double $$0 = this.h(bzc.m);
      ffn $$1 = ffn.a(this.dt()).c($$0, 10.0, $$0);
      this.dV()
         .a(cpw.class, $$1, bxc.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.f() == null)
         .filter($$0x -> !$$0x.s(this.f()))
         .forEach($$0x -> $$0x.g(this.f()));
   }

   private void gF() {
      this.a(awr.EE, this.fe() * 2.0F, this.ff() * 1.8F);
   }

   @Override
   public void g(@Nullable bxw $$0) {
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

   public static boolean b(bxe<cpw> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.an() != buq.a && !$$1.a_($$3.e()).a(dng.lq);
   }

   @Override
   public boolean a(dkc $$0) {
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
   protected awq u() {
      return this.ae_() ? awr.EE : awr.ED;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.EG;
   }

   @Override
   protected awq l_() {
      return awr.EF;
   }

   @Override
   protected void a(azz $$0, bur $$1) {
      this.a(bxf.a, new daa(dae.pK));
   }

   @Override
   protected daa t() {
      return daa.k;
   }

   @Override
   protected void gA() {
      this.g(bzc.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bP;
   }

   @Override
   public boolean a(aru $$0, crz $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(aru $$0, daa $$1) {
      return this.g($$1);
   }
}
