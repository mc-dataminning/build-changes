import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class foc extends fop {
   private static final xe a = xe.c("options.online.title");
   @Nullable
   private final fgm<Unit> u;

   public static foc a(fgj $$0, fon $$1, fgn $$2) {
      List<fgm<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      fgm<Unit> $$4 = y.a(
         $$0.r,
         $$0x -> {
            bpx $$1x = $$0x.al();
            return new fgm<>(
               "options.difficulty.online",
               fgm.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fgm.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new foc($$1, $$2, $$3.toArray(new fgm[0]), $$4);
   }

   private foc(fon $$0, fgn $$1, fgm<?>[] $$2, @Nullable fgm<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.u = $$3;
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.u != null) {
         fil $$0 = this.s.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fil $$1 = this.s.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.m.D();
      }
   }
}
