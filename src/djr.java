import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djr extends czq {
   public static final MapCodec<djr> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dnq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, djr::new)
   );
   public static final dob f = dnr.aT;
   private final int g;

   @Override
   public MapCodec<djr> a() {
      return e;
   }

   protected djr(int $$0, dnq $$1, dna.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(cxb $$0, ib $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), box.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return aww.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dnb $$0) {
      return $$0.c(f);
   }

   @Override
   protected dnb a(dnb $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(f);
   }
}
