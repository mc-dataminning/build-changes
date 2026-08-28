import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dei {
   void a(@Nullable cou var1);

   @Nullable
   cou gm();

   dek go();

   void a(dek var1);

   void a(dej var1);

   void i(cwm var1);

   int q();

   void s(int var1);

   boolean gp();

   awm gq();

   default boolean gy() {
      return false;
   }

   default void a(cou $$0, xj $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bss(($$0x, $$1x, $$2x) -> new ctk($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dek $$4 = this.go();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.q(), this.gp(), this.gy());
         }
      }
   }

   boolean gu();
}
