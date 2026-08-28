import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxv extends dnc {
   public static final MapCodec<dxv> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.e), ecf.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dxv::new)
   );
   public static final ecq d = ecg.aW;
   private final int e;

   @Override
   public MapCodec<dxv> a() {
      return c;
   }

   protected dxv(int $$0, ecf $$1, ebp.d $$2) {
      super($$2, $$1);
      this.l(this.C.b().b(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(dkj $$0, iw $$1) {
      int $$2 = Math.min(a($$0, a.a($$1), bxe.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return azz.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(ebq $$0) {
      return $$0.c(d);
   }

   @Override
   protected ebq a(ebq $$0, int $$1) {
      return $$0.b(d, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(d);
   }
}
