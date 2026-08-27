import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class elx extends elk {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<elx> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ent.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, elx::new)
   );
   private final ens c;
   private final boolean d;

   private elx(List<emx> $$0, ens $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public elm b() {
      return eln.j;
   }

   @Override
   public Set<emg<?>> a() {
      return this.c.a();
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      if ($$0.i()) {
         int $$2 = $$0.m();
         float $$3 = this.d ? 1.0F - (float)$$0.l() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - awm.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(awm.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static elk.a<?> a(ens $$0) {
      return a($$1 -> new elx($$1, $$0, false));
   }

   public static elk.a<?> a(ens $$0, boolean $$1) {
      return a($$2 -> new elx($$2, $$0, $$1));
   }
}
