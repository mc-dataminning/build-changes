import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface crv {
   void f(@Nullable cer var1);

   @Nullable
   cer ge();

   crx gg();

   void a(crx var1);

   void a(crw var1);

   void l(cmh var1);

   int w();

   void t(int var1);

   boolean gh();

   arb gi();

   default boolean gq() {
      return false;
   }

   default void a(cer $$0, vb $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bju(($$0x, $$1x, $$2x) -> new cit($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         crx $$4 = this.gg();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.w(), this.gh(), this.gq());
         }
      }
   }

   boolean gm();
}
