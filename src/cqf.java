import javax.annotation.Nullable;

public interface cqf {
   boolean a(gw var1, dfl var2, int var3, int var4);

   default boolean a(gw $$0, dfl $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(gw var1, boolean var2);

   default boolean b(gw $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(gw $$0, boolean $$1, @Nullable bis $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(gw var1, boolean var2, @Nullable bis var3, int var4);

   default boolean b(bis $$0) {
      return false;
   }
}
