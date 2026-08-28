import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface ddr {
   void a(@Nullable coh var1);

   @Nullable
   coh gv();

   ddt gx();

   void a(ddt var1);

   void a(dds var1);

   void k(cvx var1);

   int t();

   void t(int var1);

   boolean gy();

   awj gz();

   default boolean gH() {
      return false;
   }

   default void a(coh $$0, xh $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bsg(($$0x, $$1x, $$2x) -> new csu($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         ddt $$4 = this.gx();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gy(), this.gH());
         }
      }
   }

   boolean gD();
}
