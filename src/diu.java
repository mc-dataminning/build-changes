import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class diu extends cyt {
   public static final MapCodec<diu> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dmt.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, diu::new)
   );
   public static final dne f = dmu.aT;
   private final int g;

   @Override
   public MapCodec<diu> a() {
      return e;
   }

   protected diu(int $$0, dmt $$1, dmd.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(cwe $$0, ib $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bof.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return awm.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dme $$0) {
      return $$0.c(f);
   }

   @Override
   protected dme a(dme $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(f);
   }
}
