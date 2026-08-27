import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dge extends cwe {
   public static final MapCodec<dge> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), djw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dge::new)
   );
   public static final dkh f = djx.aT;
   private final int g;

   @Override
   public MapCodec<dge> a() {
      return e;
   }

   protected dge(int $$0, djw $$1, djg.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(ctp $$0, hx $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), blv.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return auo.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(djh $$0) {
      return $$0.c(f);
   }

   @Override
   protected djh a(djh $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(f);
   }
}
