import javax.annotation.Nullable;

public interface dcl {
   boolean a(ja var1, dsh var2, int var3, int var4);

   default boolean a(ja $$0, dsh $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ja var1, boolean var2);

   default boolean b(ja $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(ja $$0, boolean $$1, @Nullable bsd $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ja var1, boolean var2, @Nullable bsd var3, int var4);

   default boolean b(bsd $$0) {
      return false;
   }
}
