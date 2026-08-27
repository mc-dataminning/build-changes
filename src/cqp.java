import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cqp {
   void f(@Nullable cdm var1);

   @Nullable
   cdm ge();

   cqr gg();

   void a(cqr var1);

   void a(cqq var1);

   void l(clb var1);

   int t();

   void t(int var1);

   boolean gh();

   aqm gi();

   default boolean gq() {
      return false;
   }

   default void a(cdm $$0, ur $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new biy(($$0x, $$1x, $$2x) -> new chn($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cqr $$4 = this.gg();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gh(), this.gq());
         }
      }
   }

   boolean gm();
}
