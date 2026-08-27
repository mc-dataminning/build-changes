import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cqx {
   void f(@Nullable cdu var1);

   @Nullable
   cdu gf();

   cqz gh();

   void a(cqz var1);

   void a(cqy var1);

   void l(clj var1);

   int w();

   void t(int var1);

   boolean gi();

   aqq gj();

   default boolean gr() {
      return false;
   }

   default void a(cdu $$0, ur $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bjf(($$0x, $$1x, $$2x) -> new chv($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cqz $$4 = this.gh();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.w(), this.gi(), this.gr());
         }
      }
   }

   boolean gn();
}
