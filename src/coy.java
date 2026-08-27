import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface coy {
   void f(@Nullable cca var1);

   @Nullable
   cca ge();

   cpa gg();

   void a(cpa var1);

   void a(coz var1);

   void l(cjl var1);

   int t();

   void t(int var1);

   boolean gh();

   apf gi();

   default boolean gq() {
      return false;
   }

   default void a(cca $$0, tl $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bhm(($$0x, $$1x, $$2x) -> new cfy($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cpa $$4 = this.gg();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gh(), this.gq());
         }
      }
   }

   boolean gm();
}
