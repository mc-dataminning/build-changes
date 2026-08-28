import javax.annotation.Nullable;

public class cmd extends clt {
   private static final bww bI = bxc.bQ.n().a(bwv.a().a(bwu.a, 0.0F, bxc.bQ.m() - 0.03125F, 0.0F)).a(0.5F);

   public cmd(bxc<? extends cmd> $$0, djx $$1) {
      super($$0, $$1);
   }

   public static byz.a q() {
      return gV().a(bza.s, 15.0).a(bza.v, 0.2F);
   }

   public static boolean c(bxc<? extends cjk> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return !bxb.a($$2) ? cjk.b($$0, $$1, $$2, $$3, $$4) : bxb.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azx $$0) {
      this.g(bza.o).a(a($$0::j));
   }

   @Override
   protected awo u() {
      return awp.Ey;
   }

   @Override
   protected awo l_() {
      return awp.Ez;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.EA;
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      return bxc.bQ.a($$0, bxb.e);
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      return (bur)(!this.gL() ? bur.e : super.b($$0, $$1));
   }

   @Override
   protected void gM() {
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? bI : super.e($$0);
   }
}
