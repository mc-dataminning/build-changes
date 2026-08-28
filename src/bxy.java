import java.util.function.Consumer;

public enum bxy {
   a($$0 -> {
      $$0.p(true);
      if ($$0.dJ()) {
         $$0.k(Math.min($$0.cx(), $$0.cu() + 1));
      }
   }),
   b(dnb::a),
   c(bxe::aB),
   d(bxe::aF);

   private final Consumer<bxe> e;

   private bxy(final Consumer<bxe> $$0) {
      this.e = $$0;
   }

   public Consumer<bxe> a() {
      return this.e;
   }
}
