import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface daq {
   void f(@Nullable cms var1);

   @Nullable
   cms gq();

   das gs();

   void a(das var1);

   void a(dar var1);

   void n(cuk var1);

   int u();

   void u(int var1);

   boolean gt();

   avv gu();

   default boolean gC() {
      return false;
   }

   default void a(cms $$0, xl $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bqz(($$0x, $$1x, $$2x) -> new cqy($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         das $$4 = this.gs();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gt(), this.gC());
         }
      }
   }

   boolean gy();
}
