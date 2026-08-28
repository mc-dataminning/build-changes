import javax.annotation.Nullable;

public interface djp {
   boolean a(iv var1, eao var2, int var3, int var4);

   default boolean a(iv $$0, eao $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iv var1, boolean var2);

   default boolean b(iv $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(iv $$0, boolean $$1, @Nullable bwi $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iv var1, boolean var2, @Nullable bwi var3, int var4);

   default boolean b(bwi $$0) {
      return false;
   }
}
