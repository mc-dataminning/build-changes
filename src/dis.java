import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dis {
   void a(@Nullable crx var1);

   @Nullable
   crx x();

   diu gv();

   void a(diu var1);

   void a(dit var1);

   void i(czy var1);

   int t();

   void s(int var1);

   boolean gw();

   awo gx();

   default boolean gF() {
      return false;
   }

   default void a(crx $$0, xa $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new buz(($$0x, $$1x, $$2x) -> new cxb($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         diu $$4 = this.gv();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gw(), this.gF());
         }
      }
   }

   boolean gB();

   boolean e(crx var1);
}
