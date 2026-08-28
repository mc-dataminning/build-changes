import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dge {
   void a(@Nullable cpx var1);

   @Nullable
   cpx go();

   dgg gq();

   void a(dgg var1);

   void a(dgf var1);

   void i(cxp var1);

   int x();

   void s(int var1);

   boolean gr();

   axe gs();

   default boolean gA() {
      return false;
   }

   default void a(cpx $$0, xv $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new btr(($$0x, $$1x, $$2x) -> new cun($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dgg $$4 = this.gq();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.x(), this.gr(), this.gA());
         }
      }
   }

   boolean gw();
}
