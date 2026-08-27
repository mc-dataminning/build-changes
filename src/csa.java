import javax.annotation.Nullable;

public interface csa {
   boolean a(ht var1, dgw var2, int var3, int var4);

   default boolean a(ht $$0, dgw $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ht var1, boolean var2);

   default boolean b(ht $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(ht $$0, boolean $$1, @Nullable bki $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ht var1, boolean var2, @Nullable bki var3, int var4);

   default boolean b(bki $$0) {
      return false;
   }
}
