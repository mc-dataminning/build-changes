import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dhs {
   void a(@Nullable cqy var1);

   @Nullable
   cqy x();

   dhu gr();

   void a(dhu var1);

   void a(dht var1);

   void j(cyy var1);

   int t();

   void s(int var1);

   boolean gs();

   awm gt();

   default boolean gB() {
      return false;
   }

   default void a(cqy $$0, wy $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new buj(($$0x, $$1x, $$2x) -> new cwb($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dhu $$4 = this.gr();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gs(), this.gB());
         }
      }
   }

   boolean gx();

   boolean e(cqy var1);
}
