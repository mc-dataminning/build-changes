import javax.annotation.Nullable;

public record bvm(bvn a, boolean b, boolean c, @Nullable fdu d) {
   public static bvm a(bwt $$0, boolean $$1, boolean $$2) {
      return new bvm(bvn.a, $$1, $$2, $$0.cr());
   }

   @FunctionalInterface
   public interface a<T extends bwt> {
      void finalizeConversion(T var1);
   }
}
