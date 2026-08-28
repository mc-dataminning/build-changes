import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class esn extends ert {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eun.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, esn::new)
   );
   private final eum c;
   private final boolean d;

   private esn(List<etr> $$0, eum $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public erv<esn> b() {
      return erw.n;
   }

   @Override
   public Set<eta<?>> a() {
      return this.c.a();
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      if ($$0.l()) {
         int $$2 = $$0.o();
         float $$3 = this.d ? 1.0F - (float)$$0.n() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - ayy.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(ayy.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static ert.a<?> a(eum $$0) {
      return a($$1 -> new esn($$1, $$0, false));
   }

   public static ert.a<?> a(eum $$0, boolean $$1) {
      return a($$2 -> new esn($$2, $$0, $$1));
   }
}
