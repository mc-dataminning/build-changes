import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cou {
   void f(@Nullable cbw var1);

   @Nullable
   cbw gd();

   cow gf();

   void a(cow var1);

   void a(cov var1);

   void l(cjh var1);

   int t();

   void t(int var1);

   boolean gg();

   ape gh();

   default boolean gp() {
      return false;
   }

   default void a(cbw $$0, tn $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bhi(($$0x, $$1x, $$2x) -> new cfu($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cow $$4 = this.gf();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gg(), this.gp());
         }
      }
   }

   boolean gl();
}
