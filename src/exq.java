import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class exq extends eyc {
   @Nullable
   private final eqo<Unit> l;

   public static exq a(eql $$0, eya $$1, eqp $$2) {
      List<eqo<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.P());
      $$3.add($$2.Q());
      eqo<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bgn $$1x = $$0x.ai();
            return new eqo<>(
               "options.difficulty.online",
               eqo.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new eqo.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new exq($$1, $$2, $$3.toArray(new eqo[0]), $$4);
   }

   private exq(eya $$0, eqp $$1, eqo<?>[] $$2, @Nullable eqo<Unit> $$3) {
      super($$0, $$1, tf.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aC_() {
      super.aC_();
      if (this.l != null) {
         ese $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.i = false;
         }
      }

      ese $$1 = this.k.b(this.b.ae());
      if ($$1 != null) {
         $$1.i = this.f.B();
      }
   }
}
