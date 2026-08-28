import javax.annotation.Nullable;

public record buf(bug a, boolean b, boolean c, @Nullable fca d) {
   public static buf a(bvi $$0, boolean $$1, boolean $$2) {
      return new buf(bug.a, $$1, $$2, $$0.cr());
   }

   @FunctionalInterface
   public interface a<T extends bvi> {
      void finalizeConversion(T var1);
   }
}
