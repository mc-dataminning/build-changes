import javax.annotation.Nullable;

public interface dju {
   boolean a(iv var1, eat var2, int var3, int var4);

   default boolean a(iv $$0, eat $$1, int $$2) {
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
