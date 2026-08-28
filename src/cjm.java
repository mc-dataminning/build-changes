import javax.annotation.Nullable;

public class cjm extends cjc {
   private static final buo bY = bus.bL.n().a(bun.a().a(bum.a, 0.0F, bus.bL.m() - 0.03125F, 0.0F)).a(0.5F);

   public cjm(bus<? extends cjm> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public static bwo.a n() {
      return gO().a(bwp.s, 15.0).a(bwp.v, 0.2F);
   }

   public static boolean c(bus<? extends cgy> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return !bur.a($$2) ? cgy.b($$0, $$1, $$2, $$3, $$4) : bur.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azu $$0) {
      this.g(bwp.o).a(a($$0::j));
   }

   @Override
   protected awm t() {
      return awn.DE;
   }

   @Override
   protected awm n_() {
      return awn.DF;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.DG;
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      return bus.bL.a($$0, bur.e);
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      return (bsk)(!this.gD() ? bsk.e : super.b($$0, $$1));
   }

   @Override
   protected void gE() {
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? bY : super.e($$0);
   }
}
