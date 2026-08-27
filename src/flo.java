import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class flo extends fma {
   private static final wx a = wx.c("options.online.title");
   @Nullable
   private final fec<Unit> u;

   public static flo a(fdz $$0, fly $$1, fed $$2) {
      List<fec<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      fec<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bpr $$1x = $$0x.ak();
            return new fec<>(
               "options.difficulty.online",
               fec.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fec.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new flo($$1, $$2, $$3.toArray(new fec[0]), $$4);
   }

   private flo(fly $$0, fed $$1, fec<?>[] $$2, @Nullable fec<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.u = $$3;
   }

   @Override
   protected void aM_() {
      super.aM_();
      if (this.u != null) {
         ffx $$0 = this.s.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      ffx $$1 = this.s.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.m.D();
      }
   }
}
