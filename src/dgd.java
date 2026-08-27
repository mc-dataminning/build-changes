import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgd extends cwd {
   public static final MapCodec<dgd> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.g), djv.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dgd::new)
   );
   public static final dkg f = djw.aT;
   private final int g;

   @Override
   public MapCodec<dgd> a() {
      return e;
   }

   protected dgd(int $$0, djv $$1, djf.d $$2) {
      super($$2, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)));
      this.g = $$0;
   }

   @Override
   protected int b(cto $$0, hx $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), blu.class), this.g);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.g, $$2) / (float)this.g;
         return aun.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(djg $$0) {
      return $$0.c(f);
   }

   @Override
   protected djg a(djg $$0, int $$1) {
      return $$0.a(f, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(f);
   }
}
