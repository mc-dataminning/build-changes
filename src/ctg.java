import javax.annotation.Nullable;

public interface ctg {
   boolean a(hv var1, dip var2, int var3, int var4);

   default boolean a(hv $$0, dip $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hv var1, boolean var2);

   default boolean b(hv $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(hv $$0, boolean $$1, @Nullable blf $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(hv var1, boolean var2, @Nullable blf var3, int var4);

   default boolean b(blf $$0) {
      return false;
   }
}
