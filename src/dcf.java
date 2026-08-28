import javax.annotation.Nullable;

public interface dcf {
   boolean a(iz var1, dsb var2, int var3, int var4);

   default boolean a(iz $$0, dsb $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iz var1, boolean var2);

   default boolean b(iz $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(iz $$0, boolean $$1, @Nullable bst $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iz var1, boolean var2, @Nullable bst var3, int var4);

   default boolean b(bst $$0) {
      return false;
   }
}
