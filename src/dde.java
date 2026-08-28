import javax.annotation.Nullable;

public interface dde {
   boolean a(jd var1, dtc var2, int var3, int var4);

   default boolean a(jd $$0, dtc $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jd var1, boolean var2);

   default boolean b(jd $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(jd $$0, boolean $$1, @Nullable bsr $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jd var1, boolean var2, @Nullable bsr var3, int var4);

   default boolean b(bsr $$0) {
      return false;
   }
}
