import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eob extends gew {
   protected BooleanConsumer a;
   private final ti b;
   private final ti c;

   public eob(BooleanConsumer $$0, ti $$1, ti $$2) {
      super(eqi.a);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void aD_() {
      this.d(esl.a(th.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(9), 100, 20).a());
      this.d(esl.a(th.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(9), 100, 20).a());
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b, this.g / 2, h(3), -1);
      $$0.a(this.i, this.c, this.g / 2, h(5), -1);
   }
}
