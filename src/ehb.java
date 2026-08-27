import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class ehb extends ego {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ehb> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eix.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, ehb::new)
   );
   private final eiw c;
   private final boolean d;

   private ehb(List<eib> $$0, eiw $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public egq b() {
      return egr.j;
   }

   @Override
   public Set<ehk<?>> a() {
      return this.c.a();
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      if ($$0.i()) {
         int $$2 = $$0.l();
         float $$3 = this.d ? 1.0F - (float)$$0.k() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - atq.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(atq.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static ego.a<?> a(eiw $$0) {
      return a($$1 -> new ehb($$1, $$0, false));
   }

   public static ego.a<?> a(eiw $$0, boolean $$1) {
      return a($$2 -> new ehb($$2, $$0, $$1));
   }
}
