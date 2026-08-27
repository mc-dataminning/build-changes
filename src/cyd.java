import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cyd {
   void f(@Nullable cka var1);

   @Nullable
   cka gn();

   cyf gp();

   void a(cyf var1);

   void a(cye var1);

   void n(crs var1);

   int u();

   void u(int var1);

   boolean gq();

   aun gr();

   default boolean gz() {
      return false;
   }

   default void a(cka $$0, wi $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bop(($$0x, $$1x, $$2x) -> new cof($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cyf $$4 = this.gp();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gq(), this.gz());
         }
      }
   }

   boolean gv();
}
