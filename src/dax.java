import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dax {
   void f(@Nullable cmz var1);

   @Nullable
   cmz gq();

   daz gs();

   void a(daz var1);

   void a(day var1);

   void n(cur var1);

   int u();

   void u(int var1);

   boolean gt();

   avz gu();

   default boolean gC() {
      return false;
   }

   default void a(cmz $$0, xp $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new brg(($$0x, $$1x, $$2x) -> new crf($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         daz $$4 = this.gs();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gt(), this.gC());
         }
      }
   }

   boolean gy();
}
