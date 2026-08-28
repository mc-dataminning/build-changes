import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dbd {
   void f(@Nullable cml var1);

   @Nullable
   cml gn();

   dbf gp();

   void a(dbf var1);

   void a(dbe var1);

   void n(cud var1);

   int t();

   void t(int var1);

   boolean gq();

   avg gr();

   default boolean gz() {
      return false;
   }

   default void a(cml $$0, wu $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bqr(($$0x, $$1x, $$2x) -> new cqs($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         dbf $$4 = this.gp();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gq(), this.gz());
         }
      }
   }

   boolean gv();
}
