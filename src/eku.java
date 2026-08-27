import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class eku extends ekh {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eku> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(emq.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, eku::new)
   );
   private final emp c;
   private final boolean d;

   private eku(List<elu> $$0, emp $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ekj b() {
      return ekk.j;
   }

   @Override
   public Set<eld<?>> a() {
      return this.c.a();
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      if ($$0.i()) {
         int $$2 = $$0.m();
         float $$3 = this.d ? 1.0F - (float)$$0.l() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - awh.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(awh.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static ekh.a<?> a(emp $$0) {
      return a($$1 -> new eku($$1, $$0, false));
   }

   public static ekh.a<?> a(emp $$0, boolean $$1) {
      return a($$2 -> new eku($$2, $$0, $$1));
   }
}
