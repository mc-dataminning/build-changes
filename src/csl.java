import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface csl {
   void f(@Nullable cfh var1);

   @Nullable
   cfh ge();

   csn gg();

   void a(csn var1);

   void a(csm var1);

   void l(cmx var1);

   int w();

   void t(int var1);

   boolean gh();

   arq gi();

   default boolean gq() {
      return false;
   }

   default void a(cfh $$0, vf $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bkj(($$0x, $$1x, $$2x) -> new cjj($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         csn $$4 = this.gg();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.w(), this.gh(), this.gq());
         }
      }
   }

   boolean gm();
}
