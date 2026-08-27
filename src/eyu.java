import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class eyu extends ezf {
   @Nullable
   private final err<Unit> l;

   public static eyu a(ero $$0, ezd $$1, ers $$2) {
      List<err<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.P());
      $$3.add($$2.Q());
      err<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bhy $$1x = $$0x.ai();
            return new err<>(
               "options.difficulty.online",
               err.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new err.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new eyu($$1, $$2, $$3.toArray(new err[0]), $$4);
   }

   private eyu(ezd $$0, ers $$1, err<?>[] $$2, @Nullable err<Unit> $$3) {
      super($$0, $$1, ui.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aM_() {
      super.aM_();
      if (this.l != null) {
         eth $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.i = false;
         }
      }

      eth $$1 = this.k.b(this.b.ae());
      if ($$1 != null) {
         $$1.i = this.f.B();
      }
   }
}
