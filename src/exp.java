import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class exp extends eyb {
   @Nullable
   private final eqp<Unit> l;

   public static exp a(eqm $$0, exz $$1, eqq $$2) {
      List<eqp<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.O());
      $$3.add($$2.P());
      eqp<Unit> $$4 = x.a(
         $$0.u,
         $$0x -> {
            bgn $$1x = $$0x.ai();
            return new eqp<>(
               "options.difficulty.online",
               eqp.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new eqp.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new exp($$1, $$2, $$3.toArray(new eqp[0]), $$4);
   }

   private exp(exz $$0, eqq $$1, eqp<?>[] $$2, @Nullable eqp<Unit> $$3) {
      super($$0, $$1, tf.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aE_() {
      super.aE_();
      if (this.l != null) {
         esf $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.i = false;
         }
      }

      esf $$1 = this.k.b(this.b.ad());
      if ($$1 != null) {
         $$1.i = this.f.B();
      }
   }
}
