import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwm extends dlt {
   public static final MapCodec<dwm> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.e), eaw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dwm::new)
   );
   public static final ebh d = eax.aW;
   private final int e;

   @Override
   public MapCodec<dwm> a() {
      return c;
   }

   protected dwm(int $$0, eaw $$1, eag.d $$2) {
      super($$2, $$1);
      this.l(this.C.b().b(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(dja $$0, iu $$1) {
      int $$2 = Math.min(a($$0, a.a($$1), bwf.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return azm.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(eah $$0) {
      return $$0.c(d);
   }

   @Override
   protected eah a(eah $$0, int $$1) {
      return $$0.b(d, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(d);
   }
}
