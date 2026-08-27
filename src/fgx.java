import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class fgx extends fhj {
   @Nullable
   private final ezl<Unit> l;

   public static fgx a(ezi $$0, fhh $$1, ezm $$2) {
      List<ezl<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.R());
      $$3.add($$2.S());
      ezl<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bna $$1x = $$0x.aj();
            return new ezl<>(
               "options.difficulty.online",
               ezl.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new ezl.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fgx($$1, $$2, $$3.toArray(new ezl[0]), $$4);
   }

   private fgx(fhh $$0, ezm $$1, ezl<?>[] $$2, @Nullable ezl<Unit> $$3) {
      super($$0, $$1, vu.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aO_() {
      super.aO_();
      if (this.l != null) {
         fbg $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fbg $$1 = this.k.b(this.b.ag());
      if ($$1 != null) {
         $$1.j = this.f.D();
      }
   }
}
