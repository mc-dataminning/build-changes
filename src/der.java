import javax.annotation.Nullable;

public interface der {
   boolean a(jf var1, dus var2, int var3, int var4);

   default boolean a(jf $$0, dus $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jf var1, boolean var2);

   default boolean b(jf $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(jf $$0, boolean $$1, @Nullable btr $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jf var1, boolean var2, @Nullable btr var3, int var4);

   default boolean b(btr $$0) {
      return false;
   }
}
