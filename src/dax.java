import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface dax {
   void f(@Nullable cly var1);

   @Nullable
   cly gy();

   daz gA();

   void a(daz var1);

   void a(day var1);

   void n(cuh var1);

   int t();

   void v(int var1);

   boolean gB();

   avn gC();

   default boolean gJ() {
      return false;
   }

   default void a(cly $$0, xe $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bqk(($$0x, $$1x, $$2x) -> new cqq($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         daz $$4 = this.gA();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.t(), this.gB(), this.gJ());
         }
      }
   }

   boolean gG();
}
