import javax.annotation.Nullable;

public record bva(bvb a, boolean b, boolean c, @Nullable fcs d) {
   public static bva a(bwd $$0, boolean $$1, boolean $$2) {
      return new bva(bvb.a, $$1, $$2, $$0.cr());
   }

   @FunctionalInterface
   public interface a<T extends bwd> {
      void finalizeConversion(T var1);
   }
}
