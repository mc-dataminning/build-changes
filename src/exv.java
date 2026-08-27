import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class exv extends eyg {
   @Nullable
   private final eqs<Unit> l;

   public static exv a(eqp $$0, eye $$1, eqt $$2) {
      List<eqs<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.P());
      $$3.add($$2.Q());
      eqs<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bhb $$1x = $$0x.ai();
            return new eqs<>(
               "options.difficulty.online",
               eqs.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new eqs.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new exv($$1, $$2, $$3.toArray(new eqs[0]), $$4);
   }

   private exv(eye $$0, eqt $$1, eqs<?>[] $$2, @Nullable eqs<Unit> $$3) {
      super($$0, $$1, tl.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aH_() {
      super.aH_();
      if (this.l != null) {
         esi $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.i = false;
         }
      }

      esi $$1 = this.k.b(this.b.ae());
      if ($$1 != null) {
         $$1.i = this.f.B();
      }
   }
}
