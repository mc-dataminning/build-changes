import javax.annotation.Nullable;

public interface ctx {
   boolean a(hx var1, djh var2, int var3, int var4);

   default boolean a(hx $$0, djh $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hx var1, boolean var2);

   default boolean b(hx $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(hx $$0, boolean $$1, @Nullable blv $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hx var1, boolean var2, @Nullable blv var3, int var4);

   default boolean b(blv $$0) {
      return false;
   }
}
