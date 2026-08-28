import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxj extends dmq {
   public static final MapCodec<dxj> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.e), ebt.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dxj::new)
   );
   public static final ece d = ebu.aW;
   private final int e;

   @Override
   public MapCodec<dxj> a() {
      return c;
   }

   protected dxj(int $$0, ebt $$1, ebd.d $$2) {
      super($$2, $$1);
      this.l(this.C.b().b(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(djx $$0, iv $$1) {
      int $$2 = Math.min(a($$0, a.a($$1), bwt.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return azo.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(ebe $$0) {
      return $$0.c(d);
   }

   @Override
   protected ebe a(ebe $$0, int $$1) {
      return $$0.b(d, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(d);
   }
}
