import javax.annotation.Nullable;

public interface dgo {
   boolean a(ji var1, dwv var2, int var3, int var4);

   default boolean a(ji $$0, dwv $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ji var1, boolean var2);

   default boolean b(ji $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(ji $$0, boolean $$1, @Nullable buj $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ji var1, boolean var2, @Nullable buj var3, int var4);

   default boolean b(buj $$0) {
      return false;
   }
}
