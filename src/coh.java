import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface coh {
   void f(@Nullable cbm var1);

   @Nullable
   cbm ga();

   coj gc();

   void a(coj var1);

   void a(coi var1);

   void l(cix var1);

   int q();

   void t(int var1);

   boolean gd();

   aov ge();

   default boolean gm() {
      return false;
   }

   default void a(cbm $$0, tf $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bgy(($$0x, $$1x, $$2x) -> new cfk($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         coj $$4 = this.gc();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.q(), this.gd(), this.gm());
         }
      }
   }

   boolean gi();
}
