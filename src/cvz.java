import javax.annotation.Nullable;

public interface cvz {
   boolean a(hz var1, dlj var2, int var3, int var4);

   default boolean a(hz $$0, dlj $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hz var1, boolean var2);

   default boolean b(hz $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(hz $$0, boolean $$1, @Nullable bnq $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hz var1, boolean var2, @Nullable bnq var3, int var4);

   default boolean b(bnq $$0) {
      return false;
   }
}
