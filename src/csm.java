import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface csm {
   void f(@Nullable cfi var1);

   @Nullable
   cfi ge();

   cso gg();

   void a(cso var1);

   void a(csn var1);

   void l(cmy var1);

   int w();

   void t(int var1);

   boolean gh();

   arr gi();

   default boolean gq() {
      return false;
   }

   default void a(cfi $$0, vf $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bkk(($$0x, $$1x, $$2x) -> new cjk($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cso $$4 = this.gg();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.w(), this.gh(), this.gq());
         }
      }
   }

   boolean gm();
}
