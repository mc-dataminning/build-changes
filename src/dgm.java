import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dgm {
   void a(@Nullable cqi var1);

   @Nullable
   cqi x();

   dgo gr();

   void a(dgo var1);

   void a(dgn var1);

   void j(cxy var1);

   int t();

   void s(int var1);

   boolean gs();

   awj gt();

   default boolean gB() {
      return false;
   }

   default void a(cqi $$0, wv $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bty(($$0x, $$1x, $$2x) -> new cuy($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dgo $$4 = this.gr();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gs(), this.gB());
         }
      }
   }

   boolean gx();

   boolean e(cqi var1);
}
