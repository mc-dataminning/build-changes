import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dau {
   void f(@Nullable cmw var1);

   @Nullable
   cmw gq();

   daw gs();

   void a(daw var1);

   void a(dav var1);

   void n(cuo var1);

   int u();

   void u(int var1);

   boolean gt();

   avy gu();

   default boolean gC() {
      return false;
   }

   default void a(cmw $$0, xo $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new brd(($$0x, $$1x, $$2x) -> new crc($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         daw $$4 = this.gs();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gt(), this.gC());
         }
      }
   }

   boolean gy();
}
