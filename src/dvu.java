import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvu extends dli {
   public static final MapCodec<dvu> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.e), ead.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dvu::new)
   );
   public static final eao d = eae.aW;
   private final int e;

   @Override
   public MapCodec<dvu> a() {
      return c;
   }

   protected dvu(int $$0, ead $$1, dzn.d $$2) {
      super($$2, $$1);
      this.l(this.B.b().b(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(dip $$0, iu $$1) {
      int $$2 = Math.min(a($$0, a.a($$1), bwa.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return azk.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dzo $$0) {
      return $$0.c(d);
   }

   @Override
   protected dzo a(dzo $$0, int $$1) {
      return $$0.b(d, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(d);
   }
}
