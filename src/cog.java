import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cog {
   void f(@Nullable cbl var1);

   @Nullable
   cbl fZ();

   coi gb();

   void a(coi var1);

   void a(coh var1);

   void l(ciw var1);

   int q();

   void t(int var1);

   boolean gc();

   aot gd();

   default boolean gl() {
      return false;
   }

   default void a(cbl $$0, te $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bgw(($$0x, $$1x, $$2x) -> new cfj($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         coi $$4 = this.gb();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.q(), this.gc(), this.gl());
         }
      }
   }

   boolean gh();
}
