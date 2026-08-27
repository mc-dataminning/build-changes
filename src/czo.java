import javax.annotation.Nullable;

public interface czo {
   boolean a(id var1, dpi var2, int var3, int var4);

   default boolean a(id $$0, dpi $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(id var1, boolean var2);

   default boolean b(id $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(id $$0, boolean $$1, @Nullable bqa $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(id var1, boolean var2, @Nullable bqa var3, int var4);

   default boolean b(bqa $$0) {
      return false;
   }
}
