import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface ddc {
   void a(@Nullable cnu var1);

   @Nullable
   cnu gp();

   dde gr();

   void a(dde var1);

   void a(ddd var1);

   void m(cvp var1);

   int t();

   void t(int var1);

   boolean gs();

   awd gt();

   default boolean gB() {
      return false;
   }

   default void a(cnu $$0, xd $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new brx(($$0x, $$1x, $$2x) -> new csh($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dde $$4 = this.gr();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gs(), this.gB());
         }
      }
   }

   boolean gx();
}
