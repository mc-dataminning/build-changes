import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class eiv extends eii {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eiv> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekr.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, eiv::new)
   );
   private final ekq c;
   private final boolean d;

   private eiv(List<ejv> $$0, ekq $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eik b() {
      return eil.j;
   }

   @Override
   public Set<eje<?>> a() {
      return this.c.a();
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      if ($$0.i()) {
         int $$2 = $$0.l();
         float $$3 = this.d ? 1.0F - (float)$$0.k() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - auo.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(auo.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static eii.a<?> a(ekq $$0) {
      return a($$1 -> new eiv($$1, $$0, false));
   }

   public static eii.a<?> a(ekq $$0, boolean $$1) {
      return a($$2 -> new eiv($$2, $$0, $$1));
   }
}
