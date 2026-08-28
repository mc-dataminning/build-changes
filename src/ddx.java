import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface ddx {
   void a(@Nullable com var1);

   @Nullable
   com gu();

   ddz gw();

   void a(ddz var1);

   void a(ddy var1);

   void k(cwb var1);

   int t();

   void t(int var1);

   boolean gx();

   awk gy();

   default boolean gG() {
      return false;
   }

   default void a(com $$0, xi $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bsl(($$0x, $$1x, $$2x) -> new csz($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         ddz $$4 = this.gw();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gx(), this.gG());
         }
      }
   }

   boolean gC();
}
