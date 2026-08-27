import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cyr {
   void f(@Nullable ckl var1);

   @Nullable
   ckl gp();

   cyt gr();

   void a(cyt var1);

   void a(cys var1);

   void n(csd var1);

   int u();

   void u(int var1);

   boolean gs();

   auy gt();

   default boolean gB() {
      return false;
   }

   default void a(ckl $$0, ws $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bpa(($$0x, $$1x, $$2x) -> new cor($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cyt $$4 = this.gr();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gs(), this.gB());
         }
      }
   }

   boolean gx();
}
