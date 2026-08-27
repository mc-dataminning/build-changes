import javax.annotation.Nullable;

public interface cpu {
   boolean a(gu var1, dfa var2, int var3, int var4);

   default boolean a(gu $$0, dfa $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(gu var1, boolean var2);

   default boolean b(gu $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(gu $$0, boolean $$1, @Nullable bii $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(gu var1, boolean var2, @Nullable bii var3, int var4);

   default boolean b(bii $$0) {
      return false;
   }
}
