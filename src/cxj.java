import javax.annotation.Nullable;

public interface cxj {
   boolean a(ib var1, dnb var2, int var3, int var4);

   default boolean a(ib $$0, dnb $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ib var1, boolean var2);

   default boolean b(ib $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(ib $$0, boolean $$1, @Nullable box $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ib var1, boolean var2, @Nullable box var3, int var4);

   default boolean b(box $$0) {
      return false;
   }
}
