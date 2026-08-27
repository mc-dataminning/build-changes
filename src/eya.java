import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class eya extends eym {
   @Nullable
   private final eqy<Unit> l;

   public static eya a(eqv $$0, eyk $$1, eqz $$2) {
      List<eqy<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.P());
      $$3.add($$2.Q());
      eqy<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bgv $$1x = $$0x.ai();
            return new eqy<>(
               "options.difficulty.online",
               eqy.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new eqy.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new eya($$1, $$2, $$3.toArray(new eqy[0]), $$4);
   }

   private eya(eyk $$0, eqz $$1, eqy<?>[] $$2, @Nullable eqy<Unit> $$3) {
      super($$0, $$1, tm.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aI_() {
      super.aI_();
      if (this.l != null) {
         eso $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.i = false;
         }
      }

      eso $$1 = this.k.b(this.b.ae());
      if ($$1 != null) {
         $$1.i = this.f.B();
      }
   }
}
