import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dhm {
   void a(@Nullable cqs var1);

   @Nullable
   cqs x();

   dho gr();

   void a(dho var1);

   void a(dhn var1);

   void j(cys var1);

   int t();

   void s(int var1);

   boolean gs();

   awk gt();

   default boolean gB() {
      return false;
   }

   default void a(cqs $$0, ww $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bug(($$0x, $$1x, $$2x) -> new cvv($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dho $$4 = this.gr();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gs(), this.gB());
         }
      }
   }

   boolean gx();

   boolean e(cqs var1);
}
