import javax.annotation.Nullable;

public interface dgq {
   boolean a(ji var1, dwx var2, int var3, int var4);

   default boolean a(ji $$0, dwx $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ji var1, boolean var2);

   default boolean b(ji $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(ji $$0, boolean $$1, @Nullable buk $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ji var1, boolean var2, @Nullable buk var3, int var4);

   default boolean b(buk $$0) {
      return false;
   }
}
