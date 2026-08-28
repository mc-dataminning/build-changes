import javax.annotation.Nullable;

public interface dji {
   boolean a(iu var1, eah var2, int var3, int var4);

   default boolean a(iu $$0, eah $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iu var1, boolean var2);

   default boolean b(iu $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(iu $$0, boolean $$1, @Nullable bwf $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iu var1, boolean var2, @Nullable bwf var3, int var4);

   default boolean b(bwf $$0) {
      return false;
   }
}
