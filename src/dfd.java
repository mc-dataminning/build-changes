import javax.annotation.Nullable;

public interface dfd {
   boolean a(jg var1, dvd var2, int var3, int var4);

   default boolean a(jg $$0, dvd $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jg var1, boolean var2);

   default boolean b(jg $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(jg $$0, boolean $$1, @Nullable btz $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jg var1, boolean var2, @Nullable btz var3, int var4);

   default boolean b(btz $$0) {
      return false;
   }
}
