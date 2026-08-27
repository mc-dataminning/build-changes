import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class exl extends exx {
   @Nullable
   private final eqq<Unit> l;

   public static exl a(eqn $$0, exv $$1, eqr $$2) {
      List<eqq<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.O());
      $$3.add($$2.P());
      eqq<Unit> $$4 = x.a(
         $$0.s,
         $$0x -> {
            bgl $$1x = $$0x.ai();
            return new eqq<>(
               "options.difficulty.online",
               eqq.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new eqq.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new exl($$1, $$2, $$3.toArray(new eqq[0]), $$4);
   }

   private exl(exv $$0, eqr $$1, eqq<?>[] $$2, @Nullable eqq<Unit> $$3) {
      super($$0, $$1, te.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aE_() {
      super.aE_();
      if (this.l != null) {
         esg $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.i = false;
         }
      }

      esg $$1 = this.k.b(this.b.ad());
      if ($$1 != null) {
         $$1.i = this.f.A();
      }
   }
}
