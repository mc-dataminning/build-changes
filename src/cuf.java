import javax.annotation.Nullable;

public interface cuf {
   boolean a(hx var1, djp var2, int var3, int var4);

   default boolean a(hx $$0, djp $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hx var1, boolean var2);

   default boolean b(hx $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(hx $$0, boolean $$1, @Nullable blw $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hx var1, boolean var2, @Nullable blw var3, int var4);

   default boolean b(blw $$0) {
      return false;
   }
}
