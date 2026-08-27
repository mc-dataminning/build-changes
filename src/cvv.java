import javax.annotation.Nullable;

public interface cvv {
   boolean a(hz var1, dlf var2, int var3, int var4);

   default boolean a(hz $$0, dlf $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hz var1, boolean var2);

   default boolean b(hz $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(hz $$0, boolean $$1, @Nullable bno $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hz var1, boolean var2, @Nullable bno var3, int var4);

   default boolean b(bno $$0) {
      return false;
   }
}
