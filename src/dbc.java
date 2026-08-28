import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dbc {
   void f(@Nullable cmk var1);

   @Nullable
   cmk go();

   dbe gq();

   void a(dbe var1);

   void a(dbd var1);

   void n(cuc var1);

   int u();

   void t(int var1);

   boolean gr();

   avg gs();

   default boolean gA() {
      return false;
   }

   default void a(cmk $$0, wu $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bqq(($$0x, $$1x, $$2x) -> new cqr($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dbe $$4 = this.gq();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gr(), this.gA());
         }
      }
   }

   boolean gw();
}
