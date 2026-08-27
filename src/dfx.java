import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfx extends cvx {
   public static final MapCodec<dfx> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), djp.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dfx::new)
   );
   public static final dka f = djq.aT;
   private final int g;

   @Override
   public MapCodec<dfx> a() {
      return e;
   }

   protected dfx(int $$0, djp $$1, diz.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(cti $$0, hx $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), blp.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return aui.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dja $$0) {
      return $$0.c(f);
   }

   @Override
   protected dja a(dja $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(f);
   }
}
