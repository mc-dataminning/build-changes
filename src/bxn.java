import java.util.function.Consumer;

public enum bxn {
   a($$0 -> {
      $$0.p(true);
      if ($$0.dJ()) {
         $$0.k(Math.min($$0.cx(), $$0.cu() + 1));
      }
   }),
   b(dmp::a),
   c(bwt::aB),
   d(bwt::aF);

   private final Consumer<bwt> e;

   private bxn(final Consumer<bwt> $$0) {
      this.e = $$0;
   }

   public Consumer<bwt> a() {
      return this.e;
   }
}
