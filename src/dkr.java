import javax.annotation.Nullable;

public interface dkr {
   boolean a(iw var1, ebq var2, int var3, int var4);

   default boolean a(iw $$0, ebq $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iw var1, boolean var2);

   default boolean b(iw $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(iw $$0, boolean $$1, @Nullable bxe $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iw var1, boolean var2, @Nullable bxe var3, int var4);

   default boolean b(bxe $$0) {
      return false;
   }
}
