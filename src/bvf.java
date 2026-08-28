import javax.annotation.Nullable;

public record bvf(bvg a, boolean b, boolean c, @Nullable fcy d) {
   public static bvf a(bwi $$0, boolean $$1, boolean $$2) {
      return new bvf(bvg.a, $$1, $$2, $$0.cr());
   }

   @FunctionalInterface
   public interface a<T extends bwi> {
      void finalizeConversion(T var1);
   }
}
