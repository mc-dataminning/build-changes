import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dje {
   void a(@Nullable csi var1);

   @Nullable
   csi x();

   djg gv();

   void a(djg var1);

   void a(djf var1);

   void i(dak var1);

   int t();

   void s(int var1);

   boolean gw();

   awx gx();

   default boolean gF() {
      return false;
   }

   default void a(csi $$0, xg $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bvk(($$0x, $$1x, $$2x) -> new cxm($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         djg $$4 = this.gv();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gw(), this.gF());
         }
      }
   }

   boolean gB();

   boolean e(csi var1);
}
