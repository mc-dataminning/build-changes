import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface die {
   void a(@Nullable crj var1);

   @Nullable
   crj x();

   dig gu();

   void a(dig var1);

   void a(dif var1);

   void i(czk var1);

   int t();

   void s(int var1);

   boolean gv();

   awm gw();

   default boolean gE() {
      return false;
   }

   default void a(crj $$0, wy $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new buo(($$0x, $$1x, $$2x) -> new cwn($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dig $$4 = this.gu();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gv(), this.gE());
         }
      }
   }

   boolean gA();

   boolean e(crj var1);
}
