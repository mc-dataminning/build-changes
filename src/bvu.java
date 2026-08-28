import javax.annotation.Nullable;

public record bvu(bvv a, boolean b, boolean c, @Nullable few d) {
   public static bvu a(bxb $$0, boolean $$1, boolean $$2) {
      return new bvu(bvv.a, $$1, $$2, $$0.cr());
   }

   @FunctionalInterface
   public interface a<T extends bxb> {
      void finalizeConversion(T var1);
   }
}
