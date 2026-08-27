import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface coi {
   void f(@Nullable cbn var1);

   @Nullable
   cbn fZ();

   cok gb();

   void a(cok var1);

   void a(coj var1);

   void l(ciy var1);

   int q();

   void t(int var1);

   boolean gc();

   aov gd();

   default boolean gl() {
      return false;
   }

   default void a(cbn $$0, tf $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bgy(($$0x, $$1x, $$2x) -> new cfl($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cok $$4 = this.gb();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.q(), this.gc(), this.gl());
         }
      }
   }

   boolean gh();
}
