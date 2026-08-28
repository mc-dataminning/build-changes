import java.util.function.Consumer;

public enum bxp {
   a($$0 -> {
      $$0.p(true);
      if ($$0.dJ()) {
         $$0.k(Math.min($$0.cx(), $$0.cu() + 1));
      }
   }),
   b(dmr::a),
   c(bwv::aB),
   d(bwv::aF);

   private final Consumer<bwv> e;

   private bxp(final Consumer<bwv> $$0) {
      this.e = $$0;
   }

   public Consumer<bwv> a() {
      return this.e;
   }
}
