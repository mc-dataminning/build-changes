import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnq extends ddo {
   public static final MapCodec<dnq> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), drs.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dnq::new)
   );
   public static final dsd f = drt.aT;
   private final int g;

   @Override
   public MapCodec<dnq> a() {
      return e;
   }

   protected dnq(int $$0, drs $$1, drc.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(daz $$0, io $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), brw.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayf.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(drd $$0) {
      return $$0.c(f);
   }

   @Override
   protected drd a(drd $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(f);
   }
}
