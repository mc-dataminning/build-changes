import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fmu extends fng {
   private static final xp a = xp.c("options.online.title");
   @Nullable
   private final ffj<Unit> u;

   public static fmu a(ffg $$0, fne $$1, ffk $$2) {
      List<ffj<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      ffj<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bqs $$1x = $$0x.al();
            return new ffj<>(
               "options.difficulty.online",
               ffj.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new ffj.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fmu($$1, $$2, $$3.toArray(new ffj[0]), $$4);
   }

   private fmu(fne $$0, ffk $$1, ffj<?>[] $$2, @Nullable ffj<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.u = $$3;
   }

   @Override
   protected void aM_() {
      super.aM_();
      if (this.u != null) {
         fhd $$0 = this.s.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fhd $$1 = this.s.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.m.D();
      }
   }
}
