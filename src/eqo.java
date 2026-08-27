import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class eqo extends epw {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eqo> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(esm.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, eqo::new)
   );
   private final esl c;
   private final boolean d;

   private eqo(List<erq> $$0, esl $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public epy b() {
      return epz.m;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.c.a();
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      if ($$0.k()) {
         int $$2 = $$0.n();
         float $$3 = this.d ? 1.0F - (float)$$0.m() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - axz.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(axz.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static epw.a<?> a(esl $$0) {
      return a($$1 -> new eqo($$1, $$0, false));
   }

   public static epw.a<?> a(esl $$0, boolean $$1) {
      return a($$2 -> new eqo($$2, $$0, $$1));
   }
}
