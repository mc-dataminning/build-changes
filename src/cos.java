import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cos {
   void f(@Nullable cbu var1);

   @Nullable
   cbu gd();

   cou gf();

   void a(cou var1);

   void a(cot var1);

   void l(cjf var1);

   int t();

   void t(int var1);

   boolean gg();

   apd gh();

   default boolean gp() {
      return false;
   }

   default void a(cbu $$0, tm $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bhg(($$0x, $$1x, $$2x) -> new cfs($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cou $$4 = this.gf();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gg(), this.gp());
         }
      }
   }

   boolean gl();
}
