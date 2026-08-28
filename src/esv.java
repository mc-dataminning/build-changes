import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class esv extends esy {
   public static final MapCodec<esv> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, esv::new));
   private final int c;
   private final int d;
   private final int e;
   private final jj<dla> f;

   private static P9<Mu<esv>, ka, esy.c, Float, Integer, Optional<esy.a>, Integer, Integer, Integer, jj<dla>> b(Instance<esv> $$0) {
      P5<Mu<esv>, ka, esy.c, Float, Integer, Optional<esy.a>> $$1 = a($$0);
      P4<Mu<esv>, Integer, Integer, Integer, jj<dla>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(esv::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(esv::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(esv::c),
         ju.a(mh.aG).fieldOf("preferred_biomes").forGetter(esv::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public esv(ka $$0, esy.c $$1, float $$2, int $$3, Optional<esy.a> $$4, int $$5, int $$6, int $$7, jj<dla> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public esv(int $$0, int $$1, int $$2, jj<dla> $$3) {
      this(ka.i, esy.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public jj<dla> d() {
      return this.f;
   }

   @Override
   protected boolean a(edd $$0, int $$1, int $$2) {
      List<djc> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new djc($$1, $$2));
   }

   @Override
   public esz<?> e() {
      return esz.b;
   }
}
