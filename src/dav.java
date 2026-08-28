import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dav {
   void f(@Nullable cmx var1);

   @Nullable
   cmx gq();

   dax gs();

   void a(dax var1);

   void a(daw var1);

   void n(cup var1);

   int u();

   void u(int var1);

   boolean gt();

   avz gu();

   default boolean gC() {
      return false;
   }

   default void a(cmx $$0, xp $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bre(($$0x, $$1x, $$2x) -> new crd($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dax $$4 = this.gs();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gt(), this.gC());
         }
      }
   }

   boolean gy();
}
