import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqm extends dgj {
   public static final MapCodec<dqm> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dup.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dqm::new)
   );
   public static final dva f = duq.aT;
   private final int g;

   @Override
   public MapCodec<dqm> a() {
      return e;
   }

   protected dqm(int $$0, dup $$1, dtz.d $$2) {
      super($$2, $$1);
      this.l(this.E.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dds $$0, je $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), btj.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return azc.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dua $$0) {
      return $$0.c(f);
   }

   @Override
   protected dua a(dua $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(f);
   }
}
