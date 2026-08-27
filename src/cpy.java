import javax.annotation.Nullable;

public interface cpy {
   boolean a(gw var1, dfe var2, int var3, int var4);

   default boolean a(gw $$0, dfe $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(gw var1, boolean var2);

   default boolean b(gw $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(gw $$0, boolean $$1, @Nullable bil $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(gw var1, boolean var2, @Nullable bil var3, int var4);

   default boolean b(bil $$0) {
      return false;
   }
}
