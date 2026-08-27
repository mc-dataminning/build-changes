import javax.annotation.Nullable;

public interface dal {
   boolean a(in var1, dqh var2, int var3, int var4);

   default boolean a(in $$0, dqh $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(in var1, boolean var2);

   default boolean b(in $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(in $$0, boolean $$1, @Nullable brh $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(in var1, boolean var2, @Nullable brh var3, int var4);

   default boolean b(brh $$0) {
      return false;
   }
}
