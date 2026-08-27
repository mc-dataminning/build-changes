import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class epm extends eox {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<epm> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(erh.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, epm::new)
   );
   private final erg c;
   private final boolean d;

   private epm(List<eql> $$0, erg $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eoz b() {
      return epa.k;
   }

   @Override
   public Set<epu<?>> a() {
      return this.c.a();
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      if ($$0.k()) {
         int $$2 = $$0.n();
         float $$3 = this.d ? 1.0F - (float)$$0.m() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - axm.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(axm.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static eox.a<?> a(erg $$0) {
      return a($$1 -> new epm($$1, $$0, false));
   }

   public static eox.a<?> a(erg $$0, boolean $$1) {
      return a($$2 -> new epm($$2, $$0, $$1));
   }
}
