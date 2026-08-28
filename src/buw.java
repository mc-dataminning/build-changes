import javax.annotation.Nullable;

public record buw(bux a, boolean b, boolean c, @Nullable fcr d) {
   public static buw a(bvz $$0, boolean $$1, boolean $$2) {
      return new buw(bux.a, $$1, $$2, $$0.cr());
   }

   @FunctionalInterface
   public interface a<T extends bvz> {
      void finalizeConversion(T var1);
   }
}
