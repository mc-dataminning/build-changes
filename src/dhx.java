import javax.annotation.Nullable;

public interface dhx {
   boolean a(jj var1, dym var2, int var3, int var4);

   default boolean a(jj $$0, dym $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jj var1, boolean var2);

   default boolean b(jj $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(jj $$0, boolean $$1, @Nullable bvs $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jj var1, boolean var2, @Nullable bvs var3, int var4);

   default boolean b(bvs $$0) {
      return false;
   }
}
