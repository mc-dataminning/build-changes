import javax.annotation.Nullable;

public interface dbh {
   boolean a(io var1, drd var2, int var3, int var4);

   default boolean a(io $$0, drd $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(io var1, boolean var2);

   default boolean b(io $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(io $$0, boolean $$1, @Nullable brw $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(io var1, boolean var2, @Nullable brw var3, int var4);

   default boolean b(brw $$0) {
      return false;
   }
}
