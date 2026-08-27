import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cxu {
   void f(@Nullable cjt var1);

   @Nullable
   cjt gn();

   cxw gp();

   void a(cxw var1);

   void a(cxv var1);

   void n(crj var1);

   int u();

   void u(int var1);

   boolean gq();

   aul gr();

   default boolean gz() {
      return false;
   }

   default void a(cjt $$0, wg $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bok(($$0x, $$1x, $$2x) -> new cny($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cxw $$4 = this.gp();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gq(), this.gz());
         }
      }
   }

   boolean gv();
}
