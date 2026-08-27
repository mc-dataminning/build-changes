import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class eje extends eir {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eje> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ela.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, eje::new)
   );
   private final ekz c;
   private final boolean d;

   private eje(List<eke> $$0, ekz $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eit b() {
      return eiu.j;
   }

   @Override
   public Set<ejn<?>> a() {
      return this.c.a();
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      if ($$0.i()) {
         int $$2 = $$0.l();
         float $$3 = this.d ? 1.0F - (float)$$0.k() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - aup.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(aup.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static eir.a<?> a(ekz $$0) {
      return a($$1 -> new eje($$1, $$0, false));
   }

   public static eir.a<?> a(ekz $$0, boolean $$1) {
      return a($$2 -> new eje($$2, $$0, $$1));
   }
}
