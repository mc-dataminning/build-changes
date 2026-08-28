import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dfc {
   void a(@Nullable cov var1);

   @Nullable
   cov gp();

   dfe gr();

   void a(dfe var1);

   void a(dfd var1);

   void i(cwn var1);

   int x();

   void s(int var1);

   boolean gs();

   avy gt();

   default boolean gB() {
      return false;
   }

   default void a(cov $$0, wo $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bsq(($$0x, $$1x, $$2x) -> new ctl($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dfe $$4 = this.gr();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.x(), this.gs(), this.gB());
         }
      }
   }

   boolean gx();

   boolean f(cov var1);
}
