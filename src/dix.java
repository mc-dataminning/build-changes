import javax.annotation.Nullable;

public interface dix {
   boolean a(iu var1, dzo var2, int var3, int var4);

   default boolean a(iu $$0, dzo $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iu var1, boolean var2);

   default boolean b(iu $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(iu $$0, boolean $$1, @Nullable bwa $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(iu var1, boolean var2, @Nullable bwa var3, int var4);

   default boolean b(bwa $$0) {
      return false;
   }
}
