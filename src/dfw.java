import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dfw {
   void a(@Nullable cps var1);

   @Nullable
   cps gm();

   dfy go();

   void a(dfy var1);

   void a(dfx var1);

   void i(cxk var1);

   int x();

   void s(int var1);

   boolean gp();

   axe gq();

   default boolean gy() {
      return false;
   }

   default void a(cps $$0, xv $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new btm(($$0x, $$1x, $$2x) -> new cui($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dfy $$4 = this.go();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.x(), this.gp(), this.gy());
         }
      }
   }

   boolean gu();
}
