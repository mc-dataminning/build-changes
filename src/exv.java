import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class exv extends eyh {
   @Nullable
   private final eqt<Unit> l;

   public static exv a(eqq $$0, eyf $$1, equ $$2) {
      List<eqt<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.P());
      $$3.add($$2.Q());
      eqt<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bgq $$1x = $$0x.ai();
            return new eqt<>(
               "options.difficulty.online",
               eqt.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new eqt.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new exv($$1, $$2, $$3.toArray(new eqt[0]), $$4);
   }

   private exv(eyf $$0, equ $$1, eqt<?>[] $$2, @Nullable eqt<Unit> $$3) {
      super($$0, $$1, ti.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aD_() {
      super.aD_();
      if (this.l != null) {
         esj $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.i = false;
         }
      }

      esj $$1 = this.k.b(this.b.ae());
      if ($$1 != null) {
         $$1.i = this.f.B();
      }
   }
}
