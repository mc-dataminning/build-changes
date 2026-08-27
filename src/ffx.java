import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class ffx extends fgj {
   @Nullable
   private final eyn<Unit> l;

   public static ffx a(eyk $$0, fgh $$1, eyo $$2) {
      List<eyn<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.Q());
      $$3.add($$2.R());
      eyn<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bmi $$1x = $$0x.aj();
            return new eyn<>(
               "options.difficulty.online",
               eyn.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new eyn.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new ffx($$1, $$2, $$3.toArray(new eyn[0]), $$4);
   }

   private ffx(fgh $$0, eyo $$1, eyn<?>[] $$2, @Nullable eyn<Unit> $$3) {
      super($$0, $$1, vs.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aP_() {
      super.aP_();
      if (this.l != null) {
         fai $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fai $$1 = this.k.b(this.b.af());
      if ($$1 != null) {
         $$1.j = this.f.C();
      }
   }
}
