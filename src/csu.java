import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface csu {
   void f(@Nullable cfq var1);

   @Nullable
   cfq gf();

   csw gh();

   void a(csw var1);

   void a(csv var1);

   void l(cng var1);

   int w();

   void t(int var1);

   boolean gi();

   ars gj();

   default boolean gr() {
      return false;
   }

   default void a(cfq $$0, vg $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bkm(($$0x, $$1x, $$2x) -> new cjs($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         csw $$4 = this.gh();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.w(), this.gi(), this.gr());
         }
      }
   }

   boolean gn();
}
