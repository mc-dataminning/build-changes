import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class fcn extends fbu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fcn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fen.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, fcn::new)
   );
   private final fem c;
   private final boolean d;

   private fcn(List<fdq> $$0, fem $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public fbw<fcn> b() {
      return fbx.n;
   }

   @Override
   public Set<baz<?>> a() {
      return this.c.a();
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      if ($$0.m()) {
         int $$2 = $$0.p();
         float $$3 = this.d ? 1.0F - (float)$$0.o() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - azo.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(azo.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static fbu.a<?> a(fem $$0) {
      return a($$1 -> new fcn($$1, $$0, false));
   }

   public static fbu.a<?> a(fem $$0, boolean $$1) {
      return a($$2 -> new fcn($$2, $$0, $$1));
   }
}
