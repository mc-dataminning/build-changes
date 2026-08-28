import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface diu {
   void a(@Nullable crz var1);

   @Nullable
   crz x();

   diw gv();

   void a(diw var1);

   void a(div var1);

   void i(daa var1);

   int t();

   void s(int var1);

   boolean gw();

   awq gx();

   default boolean gF() {
      return false;
   }

   default void a(crz $$0, xc $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bvb(($$0x, $$1x, $$2x) -> new cxd($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         diw $$4 = this.gv();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gw(), this.gF());
         }
      }
   }

   boolean gB();

   boolean e(crz var1);
}
