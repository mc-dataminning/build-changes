import javax.annotation.Nullable;

public interface dcb {
   boolean a(iz var1, drx var2, int var3, int var4);

   default boolean a(iz $$0, drx $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iz var1, boolean var2);

   default boolean b(iz $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(iz $$0, boolean $$1, @Nullable bsp $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iz var1, boolean var2, @Nullable bsp var3, int var4);

   default boolean b(bsp $$0) {
      return false;
   }
}
