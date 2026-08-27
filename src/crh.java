import javax.annotation.Nullable;

public interface crh {
   boolean a(ht var1, dgb var2, int var3, int var4);

   default boolean a(ht $$0, dgb $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ht var1, boolean var2);

   default boolean b(ht $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(ht $$0, boolean $$1, @Nullable bjt $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ht var1, boolean var2, @Nullable bjt var3, int var4);

   default boolean b(bjt $$0) {
      return false;
   }
}
