import javax.annotation.Nullable;

public interface djj<B, T extends B> {
   static <B, T extends B> djj<B, T> a(final Class<T> $$0) {
      return new djj<B, T>() {
         @Nullable
         @Override
         public T a(B $$0x) {
            return (T)($$0.isInstance($$0) ? $$0 : null);
         }

         @Override
         public Class<? extends B> a() {
            return $$0;
         }
      };
   }

   @Nullable
   T a(B var1);

   Class<? extends B> a();
}
