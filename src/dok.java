import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dok extends dei {
   public static final MapCodec<dok> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dsm.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dok::new)
   );
   public static final dsx f = dsn.aT;
   private final int g;

   @Override
   public MapCodec<dok> a() {
      return e;
   }

   protected dok(int $$0, dsm $$1, drw.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dbt $$0, iz $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bsp.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayu.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(drx $$0) {
      return $$0.c(f);
   }

   @Override
   protected drx a(drx $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(f);
   }
}
