import javax.annotation.Nullable;

public interface dac {
   boolean a(im var1, dpy var2, int var3, int var4);

   default boolean a(im $$0, dpy $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(im var1, boolean var2);

   default boolean b(im $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(im $$0, boolean $$1, @Nullable bql $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(im var1, boolean var2, @Nullable bql var3, int var4);

   default boolean b(bql $$0) {
      return false;
   }
}
