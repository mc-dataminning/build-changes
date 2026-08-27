import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddg extends cto {
   public static final MapCodec<ddg> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), dgq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t())
            .apply($$0, ddg::new)
   );
   public static final dhb f = dgr.aT;
   private final int g;

   @Override
   public MapCodec<ddg> a() {
      return e;
   }

   protected ddg(int $$0, dgq $$1, dga.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(cqz $$0, ht $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bjt.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return asy.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dgb $$0) {
      return $$0.c(f);
   }

   @Override
   protected dgb a(dgb $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(f);
   }
}
