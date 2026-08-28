import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface daw {
   void f(@Nullable cmy var1);

   @Nullable
   cmy gq();

   day gs();

   void a(day var1);

   void a(dax var1);

   void n(cuq var1);

   int u();

   void u(int var1);

   boolean gt();

   avz gu();

   default boolean gC() {
      return false;
   }

   default void a(cmy $$0, xp $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new brf(($$0x, $$1x, $$2x) -> new cre($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         day $$4 = this.gs();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gt(), this.gC());
         }
      }
   }

   boolean gy();
}
