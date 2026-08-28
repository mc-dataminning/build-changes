import javax.annotation.Nullable;

public record bwc(bwd a, boolean b, boolean c, @Nullable fgc d) {
   public static bwc a(bxl $$0, boolean $$1, boolean $$2) {
      return new bwc(bwd.a, $$1, $$2, $$0.cp());
   }

   @FunctionalInterface
   public interface a<T extends bxl> {
      void finalizeConversion(T var1);
   }
}
