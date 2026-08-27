import javax.annotation.Nullable;

public interface cps {
   boolean a(gv var1, dey var2, int var3, int var4);

   default boolean a(gv $$0, dey $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(gv var1, boolean var2);

   default boolean b(gv $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(gv $$0, boolean $$1, @Nullable big $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(gv var1, boolean var2, @Nullable big var3, int var4);

   default boolean b(big $$0) {
      return false;
   }
}
