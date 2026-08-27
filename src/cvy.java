import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cvy {
   void f(@Nullable ciu var1);

   @Nullable
   ciu gn();

   cwa gp();

   void a(cwa var1);

   void a(cvz var1);

   void n(cqm var1);

   int s();

   void u(int var1);

   boolean gq();

   atx gr();

   default boolean gz() {
      return false;
   }

   default void a(ciu $$0, vu $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bnn(($$0x, $$1x, $$2x) -> new cmz($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cwa $$4 = this.gp();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.s(), this.gq(), this.gz());
         }
      }
   }

   boolean gv();
}
