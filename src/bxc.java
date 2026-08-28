import java.util.function.Consumer;

public enum bxc {
   a($$0 -> {
      $$0.p(true);
      if ($$0.dI()) {
         $$0.k(Math.min($$0.cw(), $$0.ct() + 1));
      }
   }),
   b(dlz::a),
   c(bwi::aB),
   d(bwi::aF);

   private final Consumer<bwi> e;

   private bxc(final Consumer<bwi> $$0) {
      this.e = $$0;
   }

   public Consumer<bwi> a() {
      return this.e;
   }
}
