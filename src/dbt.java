import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dbt {
   void a(@Nullable cmx var1);

   @Nullable
   cmx gk();

   dbv gm();

   void a(dbv var1);

   void a(dbu var1);

   void n(cuq var1);

   int t();

   void t(int var1);

   boolean gn();

   avo go();

   default boolean gw() {
      return false;
   }

   default void a(cmx $$0, wz $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new brb(($$0x, $$1x, $$2x) -> new cre($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dbv $$4 = this.gm();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gn(), this.gw());
         }
      }
   }

   boolean gs();
}
