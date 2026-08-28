import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface ddf {
   void a(@Nullable cnx var1);

   @Nullable
   cnx go();

   ddh gq();

   void a(ddh var1);

   void a(ddg var1);

   void m(cvs var1);

   int t();

   void t(int var1);

   boolean gr();

   awf gs();

   default boolean gA() {
      return false;
   }

   default void a(cnx $$0, xe $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bsa(($$0x, $$1x, $$2x) -> new csk($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         ddh $$4 = this.gq();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gr(), this.gA());
         }
      }
   }

   boolean gw();
}
