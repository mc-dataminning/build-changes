import javax.annotation.Nullable;

public record bwy(bwz a, boolean b, boolean c, @Nullable fhc d) {
   public static bwy a(byh $$0, boolean $$1, boolean $$2) {
      return new bwy(bwz.a, $$1, $$2, $$0.cq());
   }

   @FunctionalInterface
   public interface a<T extends byh> {
      void finalizeConversion(T var1);
   }
}
