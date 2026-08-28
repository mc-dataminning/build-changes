import javax.annotation.Nullable;

public interface dhq {
   boolean a(jh var1, dxv var2, int var3, int var4);

   default boolean a(jh $$0, dxv $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jh var1, boolean var2);

   default boolean b(jh $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(jh $$0, boolean $$1, @Nullable bvk $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jh var1, boolean var2, @Nullable bvk var3, int var4);

   default boolean b(bvk $$0) {
      return false;
   }
}
