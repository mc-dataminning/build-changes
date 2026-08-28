import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dfd {
   void a(@Nullable cow var1);

   @Nullable
   cow gs();

   dff gu();

   void a(dff var1);

   void a(dfe var1);

   void i(cwo var1);

   int x();

   void s(int var1);

   boolean gv();

   avz gw();

   default boolean gE() {
      return false;
   }

   default void a(cow $$0, wp $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bsr(($$0x, $$1x, $$2x) -> new ctm($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dff $$4 = this.gu();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.x(), this.gv(), this.gE());
         }
      }
   }

   boolean gA();

   boolean f(cow var1);
}
