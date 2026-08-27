import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface csf {
   void f(@Nullable cfb var1);

   @Nullable
   cfb ge();

   csh gg();

   void a(csh var1);

   void a(csg var1);

   void l(cmr var1);

   int w();

   void t(int var1);

   boolean gh();

   arl gi();

   default boolean gq() {
      return false;
   }

   default void a(cfb $$0, vd $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bke(($$0x, $$1x, $$2x) -> new cjd($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         csh $$4 = this.gg();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.w(), this.gh(), this.gq());
         }
      }
   }

   boolean gm();
}
