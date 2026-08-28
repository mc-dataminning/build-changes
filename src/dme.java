import javax.annotation.Nullable;

public interface dme {
   @Nullable
   dty a(ji var1, dww var2);

   @Nullable
   default <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return null;
   }

   @Nullable
   default <T extends dty> ebu a(ard $$0, T $$1) {
      return $$1 instanceof ebu.b<?> $$2 ? $$2.c() : null;
   }
}
