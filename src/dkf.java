import javax.annotation.Nullable;

public interface dkf {
   boolean a(iv var1, ebe var2, int var3, int var4);

   default boolean a(iv $$0, ebe $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iv var1, boolean var2);

   default boolean b(iv $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(iv $$0, boolean $$1, @Nullable bwt $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iv var1, boolean var2, @Nullable bwt var3, int var4);

   default boolean b(bwt $$0) {
      return false;
   }
}
