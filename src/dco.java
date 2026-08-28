import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dco {
   void a(@Nullable cnp var1);

   @Nullable
   cnp go();

   dcq gq();

   void a(dcq var1);

   void a(dcp var1);

   void o(cvl var1);

   int t();

   void t(int var1);

   boolean gr();

   awc gs();

   default boolean gA() {
      return false;
   }

   default void a(cnp $$0, xd $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new brs(($$0x, $$1x, $$2x) -> new csb($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dcq $$4 = this.gq();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gr(), this.gA());
         }
      }
   }

   boolean gw();
}
