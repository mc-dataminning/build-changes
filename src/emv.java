import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class emv extends emi {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<emv> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eor.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, emv::new)
   );
   private final eoq c;
   private final boolean d;

   private emv(List<env> $$0, eoq $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public emk b() {
      return eml.j;
   }

   @Override
   public Set<ene<?>> a() {
      return this.c.a();
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      if ($$0.i()) {
         int $$2 = $$0.m();
         float $$3 = this.d ? 1.0F - (float)$$0.l() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - aww.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(aww.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static emi.a<?> a(eoq $$0) {
      return a($$1 -> new emv($$1, $$0, false));
   }

   public static emi.a<?> a(eoq $$0, boolean $$1) {
      return a($$2 -> new emv($$2, $$0, $$1));
   }
}
