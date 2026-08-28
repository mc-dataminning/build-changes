import javax.annotation.Nullable;

public interface dhh {
   boolean a(ji var1, dxq var2, int var3, int var4);

   default boolean a(ji $$0, dxq $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ji var1, boolean var2);

   default boolean b(ji $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(ji $$0, boolean $$1, @Nullable bva $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ji var1, boolean var2, @Nullable bva var3, int var4);

   default boolean b(bva $$0) {
      return false;
   }
}
