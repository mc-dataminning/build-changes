import javax.annotation.Nullable;

public record bvx(bvy a, boolean b, boolean c, @Nullable ffi d) {
   public static bvx a(bxe $$0, boolean $$1, boolean $$2) {
      return new bvx(bvy.a, $$1, $$2, $$0.cr());
   }

   @FunctionalInterface
   public interface a<T extends bxe> {
      void finalizeConversion(T var1);
   }
}
