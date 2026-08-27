import javax.annotation.Nullable;

public interface dci {
   boolean a(ir var1, dtc var2, int var3, int var4);

   default boolean a(ir $$0, dtc $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ir var1, boolean var2);

   default boolean b(ir $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(ir $$0, boolean $$1, @Nullable brv $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(ir var1, boolean var2, @Nullable brv var3, int var4);

   default boolean b(brv $$0) {
      return false;
   }
}
