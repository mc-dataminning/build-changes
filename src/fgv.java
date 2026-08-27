import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class fgv extends fhh {
   @Nullable
   private final ezj<Unit> l;

   public static fgv a(ezg $$0, fhf $$1, ezk $$2) {
      List<ezj<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.R());
      $$3.add($$2.S());
      ezj<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bmz $$1x = $$0x.aj();
            return new ezj<>(
               "options.difficulty.online",
               ezj.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new ezj.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fgv($$1, $$2, $$3.toArray(new ezj[0]), $$4);
   }

   private fgv(fhf $$0, ezk $$1, ezj<?>[] $$2, @Nullable ezj<Unit> $$3) {
      super($$0, $$1, vu.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aO_() {
      super.aO_();
      if (this.l != null) {
         fbe $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fbe $$1 = this.k.b(this.b.ag());
      if ($$1 != null) {
         $$1.j = this.f.D();
      }
   }
}
