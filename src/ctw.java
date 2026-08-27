import javax.annotation.Nullable;

public interface ctw {
   boolean a(hx var1, djg var2, int var3, int var4);

   default boolean a(hx $$0, djg $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hx var1, boolean var2);

   default boolean b(hx $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(hx $$0, boolean $$1, @Nullable blu $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hx var1, boolean var2, @Nullable blu var3, int var4);

   default boolean b(blu $$0) {
      return false;
   }
}
