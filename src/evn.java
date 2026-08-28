import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class evn extends euu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<evn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(exp.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, evn::new)
   );
   private final exo c;
   private final boolean d;

   private evn(List<ews> $$0, exo $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public euw<evn> b() {
      return eux.n;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.c.a();
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      if ($$0.m()) {
         int $$2 = $$0.p();
         float $$3 = this.d ? 1.0F - (float)$$0.o() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - azd.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(azd.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static euu.a<?> a(exo $$0) {
      return a($$1 -> new evn($$1, $$0, false));
   }

   public static euu.a<?> a(exo $$0, boolean $$1) {
      return a($$2 -> new evn($$2, $$0, $$1));
   }
}
