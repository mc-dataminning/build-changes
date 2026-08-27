import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class fcp extends fdb {
   @Nullable
   private final evj<Unit> l;

   public static fcp a(evg $$0, fcz $$1, evk $$2) {
      List<evj<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.Q());
      $$3.add($$2.R());
      evj<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bjx $$1x = $$0x.ak();
            return new evj<>(
               "options.difficulty.online",
               evj.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new evj.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fcp($$1, $$2, $$3.toArray(new evj[0]), $$4);
   }

   private fcp(fcz $$0, evk $$1, evj<?>[] $$2, @Nullable evj<Unit> $$3) {
      super($$0, $$1, vf.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.l != null) {
         exc $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      exc $$1 = this.k.b(this.b.af());
      if ($$1 != null) {
         $$1.j = this.f.B();
      }
   }
}
