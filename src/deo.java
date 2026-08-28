import javax.annotation.Nullable;

public interface deo {
   boolean a(je var1, duo var2, int var3, int var4);

   default boolean a(je $$0, duo $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(je var1, boolean var2);

   default boolean b(je $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(je $$0, boolean $$1, @Nullable bto $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(je var1, boolean var2, @Nullable bto var3, int var4);

   default boolean b(bto $$0) {
      return false;
   }
}
