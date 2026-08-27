import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cvw {
   void f(@Nullable cis var1);

   @Nullable
   cis gn();

   cvy gp();

   void a(cvy var1);

   void a(cvx var1);

   void n(cqk var1);

   int s();

   void u(int var1);

   boolean gq();

   atx gr();

   default boolean gz() {
      return false;
   }

   default void a(cis $$0, vu $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bnm(($$0x, $$1x, $$2x) -> new cmx($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cvy $$4 = this.gp();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.s(), this.gq(), this.gz());
         }
      }
   }

   boolean gv();
}
