import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class flp extends fmb {
   private static final wx a = wx.c("options.online.title");
   @Nullable
   private final fee<Unit> u;

   public static flp a(feb $$0, flz $$1, fef $$2) {
      List<fee<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      fee<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bpt $$1x = $$0x.ak();
            return new fee<>(
               "options.difficulty.online",
               fee.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fee.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new flp($$1, $$2, $$3.toArray(new fee[0]), $$4);
   }

   private flp(flz $$0, fef $$1, fee<?>[] $$2, @Nullable fee<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.u = $$3;
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.u != null) {
         ffy $$0 = this.s.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      ffy $$1 = this.s.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.m.D();
      }
   }
}
