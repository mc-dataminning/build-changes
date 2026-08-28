import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dbr {
   void f(@Nullable cmv var1);

   @Nullable
   cmv gm();

   dbt go();

   void a(dbt var1);

   void a(dbs var1);

   void n(cuo var1);

   int t();

   void t(int var1);

   boolean gp();

   avn gq();

   default boolean gy() {
      return false;
   }

   default void a(cmv $$0, wy $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bra(($$0x, $$1x, $$2x) -> new crc($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dbt $$4 = this.go();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gp(), this.gy());
         }
      }
   }

   boolean gu();
}
