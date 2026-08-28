import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fmv extends fnh {
   private static final xp a = xp.c("options.online.title");
   @Nullable
   private final ffk<Unit> u;

   public static fmv a(ffh $$0, fnf $$1, ffl $$2) {
      List<ffk<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      ffk<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bqt $$1x = $$0x.al();
            return new ffk<>(
               "options.difficulty.online",
               ffk.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new ffk.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fmv($$1, $$2, $$3.toArray(new ffk[0]), $$4);
   }

   private fmv(fnf $$0, ffl $$1, ffk<?>[] $$2, @Nullable ffk<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.u = $$3;
   }

   @Override
   protected void aM_() {
      super.aM_();
      if (this.u != null) {
         fhe $$0 = this.s.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fhe $$1 = this.s.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.m.D();
      }
   }
}
