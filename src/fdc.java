import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class fdc extends fdo {
   @Nullable
   private final evu<Unit> l;

   public static fdc a(evr $$0, fdm $$1, evv $$2) {
      List<evu<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.Q());
      $$3.add($$2.R());
      evu<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bjz $$1x = $$0x.ak();
            return new evu<>(
               "options.difficulty.online",
               evu.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new evu.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fdc($$1, $$2, $$3.toArray(new evu[0]), $$4);
   }

   private fdc(fdm $$0, evv $$1, evu<?>[] $$2, @Nullable evu<Unit> $$3) {
      super($$0, $$1, vg.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aP_() {
      super.aP_();
      if (this.l != null) {
         exp $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      exp $$1 = this.k.b(this.b.af());
      if ($$1 != null) {
         $$1.j = this.f.B();
      }
   }
}
