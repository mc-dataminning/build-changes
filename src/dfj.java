import javax.annotation.Nullable;

public interface dfj {
   boolean a(jh var1, dvj var2, int var3, int var4);

   default boolean a(jh $$0, dvj $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jh var1, boolean var2);

   default boolean b(jh $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(jh $$0, boolean $$1, @Nullable bue $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jh var1, boolean var2, @Nullable bue var3, int var4);

   default boolean b(bue $$0) {
      return false;
   }
}
