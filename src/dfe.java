import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dfe {
   void a(@Nullable cox var1);

   @Nullable
   cox gs();

   dfg gu();

   void a(dfg var1);

   void a(dff var1);

   void i(cwp var1);

   int x();

   void s(int var1);

   boolean gv();

   avz gw();

   default boolean gE() {
      return false;
   }

   default void a(cox $$0, wp $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bss(($$0x, $$1x, $$2x) -> new ctn($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dfg $$4 = this.gu();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.x(), this.gv(), this.gE());
         }
      }
   }

   boolean gA();

   boolean f(cox var1);
}
