import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsg extends die {
   public static final MapCodec<dsg> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dwk.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dsg::new)
   );
   public static final dwu f = dwl.aT;
   private final int g;

   @Override
   public MapCodec<dsg> a() {
      return e;
   }

   protected dsg(int $$0, dwk $$1, dvu.d $$2) {
      super($$2, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dfm $$0, jh $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bul.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return azm.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dvv $$0) {
      return $$0.c(f);
   }

   @Override
   protected dvv a(dvv $$0, int $$1) {
      return $$0.b(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(f);
   }
}
