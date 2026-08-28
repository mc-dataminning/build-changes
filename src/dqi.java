import javax.annotation.Nullable;

public interface dqi {
   @Nullable
   dyo a(iw var1, ebq var2);

   @Nullable
   default <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return null;
   }

   @Nullable
   default <T extends dyo> egs a(asb $$0, T $$1) {
      return $$1 instanceof egs.b<?> $$2 ? $$2.c() : null;
   }
}
