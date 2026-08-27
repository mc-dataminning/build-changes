import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dno extends ddm {
   public static final MapCodec<dno> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), drq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dno::new)
   );
   public static final dsb f = drr.aT;
   private final int g;

   @Override
   public MapCodec<dno> a() {
      return e;
   }

   protected dno(int $$0, drq $$1, dra.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(dax $$0, io $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bru.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return ayd.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(drb $$0) {
      return $$0.c(f);
   }

   @Override
   protected drb a(drb $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(f);
   }
}
