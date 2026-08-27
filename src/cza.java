import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cza {
   void f(@Nullable clh var1);

   @Nullable
   clh gp();

   czc gr();

   void a(czc var1);

   void a(czb var1);

   void n(csz var1);

   int u();

   void u(int var1);

   boolean gs();

   avb gt();

   default boolean gB() {
      return false;
   }

   default void a(clh $$0, wu $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bpw(($$0x, $$1x, $$2x) -> new cpn($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         czc $$4 = this.gr();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gs(), this.gB());
         }
      }
   }

   boolean gx();
}
