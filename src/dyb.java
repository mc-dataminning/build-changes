import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class dyb extends dye {
   public static final Codec<dyb> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dyb::new));
   private final int c;
   private final int d;
   private final int e;
   private final ig<csy> f;

   private static P9<Mu<dyb>, iw, dye.c, Float, Integer, Optional<dye.a>, Integer, Integer, Integer, ig<csy>> b(Instance<dyb> $$0) {
      P5<Mu<dyb>, iw, dye.c, Float, Integer, Optional<dye.a>> $$1 = a($$0);
      P4<Mu<dyb>, Integer, Integer, Integer, ig<csy>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(dyb::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(dyb::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(dyb::c),
         iq.a(jz.ar).fieldOf("preferred_biomes").forGetter(dyb::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public dyb(iw $$0, dye.c $$1, float $$2, int $$3, Optional<dye.a> $$4, int $$5, int $$6, int $$7, ig<csy> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public dyb(int $$0, int $$1, int $$2, ig<csy> $$3) {
      this(iw.g, dye.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ig<csy> d() {
      return this.f;
   }

   @Override
   protected boolean a(djg $$0, int $$1, int $$2) {
      List<crh> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new crh($$1, $$2));
   }

   @Override
   public dyf<?> e() {
      return dyf.b;
   }
}
