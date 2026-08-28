import javax.annotation.Nullable;

public record bwn(bwo a, boolean b, boolean c, @Nullable fgq d) {
   public static bwn a(bxw $$0, boolean $$1, boolean $$2) {
      return new bwn(bwo.a, $$1, $$2, $$0.cq());
   }

   @FunctionalInterface
   public interface a<T extends bxw> {
      void finalizeConversion(T var1);
   }
}
