import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwa extends duz implements dvt {
   public static final MapCodec<dwa> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eao.a.fieldOf("block_set_type").forGetter(duz::q), dvt.a.e.fieldOf("weathering_state").forGetter(dwa::r), t()).apply($$0, dwa::new)
   );
   private final dvt.a h;

   @Override
   public MapCodec<dwa> a() {
      return g;
   }

   protected dwa(eao $$0, dvt.a $$1, dzy.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dzz $$0) {
      return dvt.c($$0.b()).isPresent();
   }

   public dvt.a r() {
      return this.h;
   }
}
