import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface clj {
   void f(@Nullable byo var1);

   @Nullable
   byo fY();

   cll ga();

   void a(cll var1);

   void a(clk var1);

   void l(cfz var1);

   int r();

   void t(int var1);

   boolean gb();

   amg gc();

   default boolean gk() {
      return false;
   }

   default void a(byo $$0, sw $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bef(($$0x, $$1x, $$2x) -> new ccm($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cll $$4 = this.ga();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.r(), this.gb(), this.gk());
         }
      }
   }

   boolean gg();
}
