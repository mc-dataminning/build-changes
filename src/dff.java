import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dff {
   void a(@Nullable coy var1);

   @Nullable
   coy gs();

   dfh gu();

   void a(dfh var1);

   void a(dfg var1);

   void i(cwq var1);

   int x();

   void s(int var1);

   boolean gv();

   avz gw();

   default boolean gE() {
      return false;
   }

   default void a(coy $$0, wp $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bst(($$0x, $$1x, $$2x) -> new cto($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dfh $$4 = this.gu();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.x(), this.gv(), this.gE());
         }
      }
   }

   boolean gA();

   boolean f(coy var1);
}
