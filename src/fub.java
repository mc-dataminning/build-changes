import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fub extends fud {
   private static final xi a = xi.c("options.online.title");
   @Nullable
   private fjl<Unit> u;

   public fub(fra $$0, fjm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aR_() {
      super.aR_();
      if (this.u != null) {
         flf $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fjl<?>[] a(fjm $$0, fji $$1) {
      List<fjl<?>> $$2 = new ArrayList<>();
      $$2.add($$0.V());
      $$2.add($$0.W());
      fjl<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            bsa $$1x = $$0x.ak();
            return new fjl<>(
               "options.difficulty.online",
               fjl.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fjl.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$3 != null) {
         this.u = $$3;
         $$2.add($$3);
      }

      return $$2.toArray(new fjl[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
