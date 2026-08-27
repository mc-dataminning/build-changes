import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class fcq extends fdc {
   @Nullable
   private final evk<Unit> l;

   public static fcq a(evh $$0, fda $$1, evl $$2) {
      List<evk<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.Q());
      $$3.add($$2.R());
      evk<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bjx $$1x = $$0x.ak();
            return new evk<>(
               "options.difficulty.online",
               evk.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new evk.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fcq($$1, $$2, $$3.toArray(new evk[0]), $$4);
   }

   private fcq(fda $$0, evl $$1, evk<?>[] $$2, @Nullable evk<Unit> $$3) {
      super($$0, $$1, vf.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.l != null) {
         exd $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      exd $$1 = this.k.b(this.b.af());
      if ($$1 != null) {
         $$1.j = this.f.B();
      }
   }
}
