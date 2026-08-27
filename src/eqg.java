import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class eqg extends epo {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eqg> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(esd.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, eqg::new)
   );
   private final esc c;
   private final boolean d;

   private eqg(List<erh> $$0, esc $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public epq b() {
      return epr.k;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.c.a();
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      if ($$0.k()) {
         int $$2 = $$0.n();
         float $$3 = this.d ? 1.0F - (float)$$0.m() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - axw.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(axw.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static epo.a<?> a(esc $$0) {
      return a($$1 -> new eqg($$1, $$0, false));
   }

   public static epo.a<?> a(esc $$0, boolean $$1) {
      return a($$2 -> new eqg($$2, $$0, $$1));
   }
}
