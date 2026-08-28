import javax.annotation.Nullable;

public class cmf extends clv {
   private static final bwy bI = bxe.bQ.n().a(bwx.a().a(bww.a, 0.0F, bxe.bQ.m() - 0.03125F, 0.0F)).a(0.5F);

   public cmf(bxe<? extends cmf> $$0, djz $$1) {
      super($$0, $$1);
   }

   public static bzb.a q() {
      return gV().a(bzc.s, 15.0).a(bzc.v, 0.2F);
   }

   public static boolean c(bxe<? extends cjm> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return !bxd.a($$2) ? cjm.b($$0, $$1, $$2, $$3, $$4) : bxd.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azz $$0) {
      this.g(bzc.o).a(a($$0::j));
   }

   @Override
   protected awq u() {
      return awr.Ey;
   }

   @Override
   protected awq l_() {
      return awr.Ez;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.EA;
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      return bxe.bQ.a($$0, bxd.e);
   }

   @Override
   public but b(crz $$0, bus $$1) {
      return (but)(!this.gL() ? but.e : super.b($$0, $$1));
   }

   @Override
   protected void gM() {
   }

   @Override
   public bwy e(byi $$0) {
      return this.n_() ? bI : super.e($$0);
   }
}
