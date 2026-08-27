import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cuk {
   void f(@Nullable chh var1);

   @Nullable
   chh gg();

   cum gi();

   void a(cum var1);

   void a(cul var1);

   void l(coz var1);

   int w();

   void u(int var1);

   boolean gj();

   atj gk();

   default boolean gs() {
      return false;
   }

   default void a(chh $$0, vq $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bme(($$0x, $$1x, $$2x) -> new clk($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cum $$4 = this.gi();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.w(), this.gj(), this.gs());
         }
      }
   }

   boolean go();
}
