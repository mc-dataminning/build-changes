import javax.annotation.Nullable;

public interface dkh {
   boolean a(iw var1, ebg var2, int var3, int var4);

   default boolean a(iw $$0, ebg $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iw var1, boolean var2);

   default boolean b(iw $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(iw $$0, boolean $$1, @Nullable bwv $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iw var1, boolean var2, @Nullable bwv var3, int var4);

   default boolean b(bwv $$0) {
      return false;
   }
}
