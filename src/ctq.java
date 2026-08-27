import javax.annotation.Nullable;

public interface ctq {
   boolean a(hx var1, dja var2, int var3, int var4);

   default boolean a(hx $$0, dja $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hx var1, boolean var2);

   default boolean b(hx $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(hx $$0, boolean $$1, @Nullable blp $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hx var1, boolean var2, @Nullable blp var3, int var4);

   default boolean b(blp $$0) {
      return false;
   }
}
