import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dat {
   void f(@Nullable cmv var1);

   @Nullable
   cmv gq();

   dav gs();

   void a(dav var1);

   void a(dau var1);

   void n(cun var1);

   int u();

   void u(int var1);

   boolean gt();

   avy gu();

   default boolean gC() {
      return false;
   }

   default void a(cmv $$0, xo $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new brc(($$0x, $$1x, $$2x) -> new crb($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dav $$4 = this.gs();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gt(), this.gC());
         }
      }
   }

   boolean gy();
}
