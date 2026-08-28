import javax.annotation.Nullable;

public interface dcg {
   boolean a(iz var1, dsc var2, int var3, int var4);

   default boolean a(iz $$0, dsc $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iz var1, boolean var2);

   default boolean b(iz $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(iz $$0, boolean $$1, @Nullable bsu $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iz var1, boolean var2, @Nullable bsu var3, int var4);

   default boolean b(bsu $$0) {
      return false;
   }
}
