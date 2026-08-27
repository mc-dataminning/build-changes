import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class fcr extends fdd {
   @Nullable
   private final evl<Unit> l;

   public static fcr a(evi $$0, fdb $$1, evm $$2) {
      List<evl<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.Q());
      $$3.add($$2.R());
      evl<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bjy $$1x = $$0x.ak();
            return new evl<>(
               "options.difficulty.online",
               evl.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new evl.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fcr($$1, $$2, $$3.toArray(new evl[0]), $$4);
   }

   private fcr(fdb $$0, evm $$1, evl<?>[] $$2, @Nullable evl<Unit> $$3) {
      super($$0, $$1, vf.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.l != null) {
         exe $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      exe $$1 = this.k.b(this.b.af());
      if ($$1 != null) {
         $$1.j = this.f.B();
      }
   }
}
