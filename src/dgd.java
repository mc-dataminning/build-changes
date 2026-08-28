import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dgd {
   void a(@Nullable cpw var1);

   @Nullable
   cpw go();

   dgf gq();

   void a(dgf var1);

   void a(dge var1);

   void i(cxo var1);

   int x();

   void s(int var1);

   boolean gr();

   axe gs();

   default boolean gA() {
      return false;
   }

   default void a(cpw $$0, xv $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new btq(($$0x, $$1x, $$2x) -> new cum($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dgf $$4 = this.gq();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.x(), this.gr(), this.gA());
         }
      }
   }

   boolean gw();
}
