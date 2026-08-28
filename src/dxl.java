import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxl extends dms {
   public static final MapCodec<dxl> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.e), ebv.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dxl::new)
   );
   public static final ecg d = ebw.aW;
   private final int e;

   @Override
   public MapCodec<dxl> a() {
      return c;
   }

   protected dxl(int $$0, ebv $$1, ebf.d $$2) {
      super($$2, $$1);
      this.l(this.C.b().b(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(djz $$0, iw $$1) {
      int $$2 = Math.min(a($$0, a.a($$1), bwv.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return azq.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(ebg $$0) {
      return $$0.c(d);
   }

   @Override
   protected ebg a(ebg $$0, int $$1) {
      return $$0.b(d, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(d);
   }
}
