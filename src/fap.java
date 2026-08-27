import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class fap extends fbb {
   @Nullable
   private final etl<Unit> l;

   public static fap a(eti $$0, faz $$1, etm $$2) {
      List<etl<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.Q());
      $$3.add($$2.R());
      etl<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            biy $$1x = $$0x.aj();
            return new etl<>(
               "options.difficulty.online",
               etl.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new etl.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fap($$1, $$2, $$3.toArray(new etl[0]), $$4);
   }

   private fap(faz $$0, etm $$1, etl<?>[] $$2, @Nullable etl<Unit> $$3) {
      super($$0, $$1, uv.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      if (this.l != null) {
         evc $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.i = false;
         }
      }

      evc $$1 = this.k.b(this.b.af());
      if ($$1 != null) {
         $$1.i = this.f.A();
      }
   }
}
