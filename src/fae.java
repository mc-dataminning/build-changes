import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fae extends gsq {
   protected BooleanConsumer a;
   private final ws b;
   private final ws c;

   public fae(BooleanConsumer $$0, ws $$1, ws $$2) {
      super(fcm.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aM_() {
      this.c(feu.a(wr.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(9), 100, 20).a());
      this.c(feu.a(wr.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(9), 100, 20).a());
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b, this.n / 2, g(3), -1);
      $$0.a(this.p, this.c, this.n / 2, g(5), -1);
   }
}
