import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface czu {
   void f(@Nullable clw var1);

   @Nullable
   clw gp();

   czw gr();

   void a(czw var1);

   void a(czv var1);

   void n(cto var1);

   int u();

   void u(int var1);

   boolean gs();

   avg gt();

   default boolean gB() {
      return false;
   }

   default void a(clw $$0, wx $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bqe(($$0x, $$1x, $$2x) -> new cqc($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         czw $$4 = this.gr();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gs(), this.gB());
         }
      }
   }

   boolean gx();
}
