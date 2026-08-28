import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dhx {
   void a(@Nullable crc var1);

   @Nullable
   crc x();

   dhz gs();

   void a(dhz var1);

   void a(dhy var1);

   void i(czd var1);

   int t();

   void s(int var1);

   boolean gt();

   awm gu();

   default boolean gC() {
      return false;
   }

   default void a(crc $$0, wy $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bul(($$0x, $$1x, $$2x) -> new cwg($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dhz $$4 = this.gs();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gt(), this.gC());
         }
      }
   }

   boolean gy();

   boolean e(crc var1);
}
