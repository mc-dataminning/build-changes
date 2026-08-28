import javax.annotation.Nullable;

public record btu(btv a, boolean b, boolean c, @Nullable fah d) {
   public static btu a(bux $$0, boolean $$1, boolean $$2) {
      return new btu(btv.a, $$1, $$2, $$0.cs());
   }

   @FunctionalInterface
   public interface a<T extends bux> {
      void finalizeConversion(T var1);
   }
}
