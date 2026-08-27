import java.util.OptionalInt;
import javax.annotation.Nullable;

public interface cuo {
   void f(@Nullable chl var1);

   @Nullable
   chl gg();

   cuq gi();

   void a(cuq var1);

   void a(cup var1);

   void l(cpd var1);

   int w();

   void u(int var1);

   boolean gj();

   atk gk();

   default boolean gs() {
      return false;
   }

   default void a(chl $$0, vq $$1, int $$2) {
      OptionalInt $$3 = $$0.a(new bmg(($$0x, $$1x, $$2x) -> new clo($$0x, $$1x, this), $$1));
      if ($$3.isPresent()) {
         cuq $$4 = this.gi();
         if (!$$4.isEmpty()) {
            $$0.a($$3.getAsInt(), $$4, $$2, this.w(), this.gj(), this.gs());
         }
      }
   }

   boolean go();
}
