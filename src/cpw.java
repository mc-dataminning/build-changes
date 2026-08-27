import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cpw {
   void f(@Nullable ccx var1);

   @Nullable
   ccx ge();

   cpy gg();

   void a(cpy var1);

   void a(cpx var1);

   void l(ckj var1);

   int t();

   void t(int var1);

   boolean gh();

   aqc gi();

   default boolean gq() {
      return false;
   }

   default void a(ccx $$0, ui $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bij(($$0x, $$1x, $$2x) -> new cgw($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cpy $$4 = this.gg();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gh(), this.gq());
         }
      }
   }

   boolean gm();
}
