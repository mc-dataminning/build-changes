import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwy extends dmf {
   public static final MapCodec<dwy> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.e), ebi.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dwy::new)
   );
   public static final ebt d = ebj.aW;
   private final int e;

   @Override
   public MapCodec<dwy> a() {
      return c;
   }

   protected dwy(int $$0, ebi $$1, eas.d $$2) {
      super($$2, $$1);
      this.l(this.C.b().b(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(djm $$0, iv $$1) {
      int $$2 = Math.min(a($$0, a.a($$1), bwi.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return azm.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(eat $$0) {
      return $$0.c(d);
   }

   @Override
   protected eat a(eat $$0, int $$1) {
      return $$0.b(d, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(d);
   }
}
