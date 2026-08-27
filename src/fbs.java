import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class fbs extends fce {
   @Nullable
   private final eun<Unit> l;

   public static fbs a(euk $$0, fcc $$1, euo $$2) {
      List<eun<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.Q());
      $$3.add($$2.R());
      eun<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bji $$1x = $$0x.aj();
            return new eun<>(
               "options.difficulty.online",
               eun.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new eun.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fbs($$1, $$2, $$3.toArray(new eun[0]), $$4);
   }

   private fbs(fcc $$0, euo $$1, eun<?>[] $$2, @Nullable eun<Unit> $$3) {
      super($$0, $$1, vb.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aP_() {
      super.aP_();
      if (this.l != null) {
         ewf $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.i = false;
         }
      }

      ewf $$1 = this.k.b(this.b.af());
      if ($$1 != null) {
         $$1.i = this.f.A();
      }
   }
}
