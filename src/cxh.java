import javax.annotation.Nullable;

public interface cxh {
   boolean a(ib var1, dmz var2, int var3, int var4);

   default boolean a(ib $$0, dmz $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ib var1, boolean var2);

   default boolean b(ib $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(ib $$0, boolean $$1, @Nullable bow $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ib var1, boolean var2, @Nullable bow var3, int var4);

   default boolean b(bow $$0) {
      return false;
   }
}
