import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface com {
   void f(@Nullable cbp var1);

   @Nullable
   cbp ga();

   cop gc();

   void a(cop var1);

   void a(coo var1);

   void l(cja var1);

   int q();

   void t(int var1);

   boolean gd();

   aoy ge();

   default boolean gm() {
      return false;
   }

   default void a(cbp $$0, ti $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bhb(($$0x, $$1x, $$2x) -> new cfn($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cop $$4 = this.gc();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.q(), this.gd(), this.gm());
         }
      }
   }

   boolean gi();
}
