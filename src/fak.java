import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class fak extends faw {
   @Nullable
   private final etg<Unit> l;

   public static fak a(etd $$0, fau $$1, eth $$2) {
      List<etg<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.Q());
      $$3.add($$2.R());
      etg<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            biu $$1x = $$0x.aj();
            return new etg<>(
               "options.difficulty.online",
               etg.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new etg.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fak($$1, $$2, $$3.toArray(new etg[0]), $$4);
   }

   private fak(fau $$0, eth $$1, etg<?>[] $$2, @Nullable etg<Unit> $$3) {
      super($$0, $$1, ur.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aP_() {
      super.aP_();
      if (this.l != null) {
         eux $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.i = false;
         }
      }

      eux $$1 = this.k.b(this.b.af());
      if ($$1 != null) {
         $$1.i = this.f.A();
      }
   }
}
