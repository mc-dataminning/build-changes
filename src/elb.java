import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class elb extends eko {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<elb> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(emx.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, elb::new)
   );
   private final emw c;
   private final boolean d;

   private elb(List<emb> $$0, emw $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ekq b() {
      return ekr.j;
   }

   @Override
   public Set<elk<?>> a() {
      return this.c.a();
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      if ($$0.i()) {
         int $$2 = $$0.m();
         float $$3 = this.d ? 1.0F - (float)$$0.l() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - awi.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(awi.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static eko.a<?> a(emw $$0) {
      return a($$1 -> new elb($$1, $$0, false));
   }

   public static eko.a<?> a(emw $$0, boolean $$1) {
      return a($$2 -> new elb($$2, $$0, $$1));
   }
}
