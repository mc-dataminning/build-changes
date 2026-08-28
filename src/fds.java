import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fds extends gwj {
   protected BooleanConsumer a;
   private final wy b;
   private final wy c;

   public fds(BooleanConsumer $$0, wy $$1, wy $$2) {
      super(fga.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aP_() {
      this.c(fig.a(wx.f, $$0 -> this.a.accept(true)).a(this.m / 2 - 105, g(9), 100, 20).a());
      this.c(fig.a(wx.g, $$0 -> this.a.accept(false)).a(this.m / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.b, this.m / 2, g(3), -1);
      $$0.a(this.o, this.c, this.m / 2, g(5), -1);
   }
}
