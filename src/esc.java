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

public class esc extends esf {
   public static final MapCodec<esc> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, esc::new));
   private final int c;
   private final int d;
   private final int e;
   private final jj<dkk> f;

   private static P9<Mu<esc>, ka, esf.c, Float, Integer, Optional<esf.a>, Integer, Integer, Integer, jj<dkk>> b(Instance<esc> $$0) {
      P5<Mu<esc>, ka, esf.c, Float, Integer, Optional<esf.a>> $$1 = a($$0);
      P4<Mu<esc>, Integer, Integer, Integer, jj<dkk>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(esc::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(esc::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(esc::c),
         ju.a(mh.aG).fieldOf("preferred_biomes").forGetter(esc::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public esc(ka $$0, esf.c $$1, float $$2, int $$3, Optional<esf.a> $$4, int $$5, int $$6, int $$7, jj<dkk> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public esc(int $$0, int $$1, int $$2, jj<dkk> $$3) {
      this(ka.i, esf.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jj<dkk> d() {
      return this.f;
   }

   @Override
   protected boolean a(ecn $$0, int $$1, int $$2) {
      List<dio> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dio($$1, $$2));
   }

   @Override
   public esg<?> e() {
      return esg.b;
   }
}
