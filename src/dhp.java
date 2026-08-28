import javax.annotation.Nullable;

public interface dhp {
   boolean a(jh var1, dxu var2, int var3, int var4);

   default boolean a(jh $$0, dxu $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jh var1, boolean var2);

   default boolean b(jh $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(jh $$0, boolean $$1, @Nullable bvj $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jh var1, boolean var2, @Nullable bvj var3, int var4);

   default boolean b(bvj $$0) {
      return false;
   }
}
