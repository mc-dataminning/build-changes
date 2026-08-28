import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dfv {
   void a(@Nullable cpo var1);

   @Nullable
   cpo go();

   dfx gq();

   void a(dfx var1);

   void a(dfw var1);

   void i(cxg var1);

   int x();

   void s(int var1);

   boolean gr();

   awu gs();

   default boolean gA() {
      return false;
   }

   default void a(cpo $$0, xk $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bti(($$0x, $$1x, $$2x) -> new cue($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dfx $$4 = this.gq();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.x(), this.gr(), this.gA());
         }
      }
   }

   boolean gw();

   boolean f(cpo var1);
}
