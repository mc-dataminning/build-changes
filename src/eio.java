import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class eio extends eib {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekk.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, eio::new)
   );
   private final ekj c;
   private final boolean d;

   private eio(List<ejo> $$0, ekj $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eid b() {
      return eie.j;
   }

   @Override
   public Set<eix<?>> a() {
      return this.c.a();
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      if ($$0.i()) {
         int $$2 = $$0.l();
         float $$3 = this.d ? 1.0F - (float)$$0.k() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - aui.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(aui.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static eib.a<?> a(ekj $$0) {
      return a($$1 -> new eio($$1, $$0, false));
   }

   public static eib.a<?> a(ekj $$0, boolean $$1) {
      return a($$2 -> new eio($$2, $$0, $$1));
   }
}
