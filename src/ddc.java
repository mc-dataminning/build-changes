import javax.annotation.Nullable;

public interface ddc {
   boolean a(jd var1, dta var2, int var3, int var4);

   default boolean a(jd $$0, dta $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jd var1, boolean var2);

   default boolean b(jd $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(jd $$0, boolean $$1, @Nullable bsq $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jd var1, boolean var2, @Nullable bsq var3, int var4);

   default boolean b(bsq $$0) {
      return false;
   }
}
