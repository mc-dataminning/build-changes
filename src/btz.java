import javax.annotation.Nullable;

public record btz(bua a, boolean b, boolean c, @Nullable fan d) {
   public static btz a(bvc $$0, boolean $$1, boolean $$2) {
      return new btz(bua.a, $$1, $$2, $$0.cs());
   }

   @FunctionalInterface
   public interface a<T extends bvc> {
      void finalizeConversion(T var1);
   }
}
