import javax.annotation.Nullable;

public record bwp(bwq a, boolean b, boolean c, @Nullable fgs d) {
   public static bwp a(bxy $$0, boolean $$1, boolean $$2) {
      return new bwp(bwq.a, $$1, $$2, $$0.cq());
   }

   @FunctionalInterface
   public interface a<T extends bxy> {
      void finalizeConversion(T var1);
   }
}
