import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dih {
   void a(@Nullable crm var1);

   @Nullable
   crm x();

   dij gu();

   void a(dij var1);

   void a(dii var1);

   void i(czn var1);

   int t();

   void s(int var1);

   boolean gv();

   awm gw();

   default boolean gE() {
      return false;
   }

   default void a(crm $$0, wy $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new buo(($$0x, $$1x, $$2x) -> new cwq($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dij $$4 = this.gu();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gv(), this.gE());
         }
      }
   }

   boolean gA();

   boolean e(crm var1);
}
