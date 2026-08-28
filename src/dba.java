import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dba {
   void f(@Nullable cmh var1);

   @Nullable
   cmh gn();

   dbc gp();

   void a(dbc var1);

   void a(dbb var1);

   void n(cua var1);

   int u();

   void t(int var1);

   boolean gq();

   ave gr();

   default boolean gz() {
      return false;
   }

   default void a(cmh $$0, wu $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bqn(($$0x, $$1x, $$2x) -> new cqo($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dbc $$4 = this.gp();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.u(), this.gq(), this.gz());
         }
      }
   }

   boolean gv();
}
