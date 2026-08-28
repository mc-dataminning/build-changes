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

public class eoh extends eok {
   public static final MapCodec<eoh> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eoh::new));
   private final int c;
   private final int d;
   private final int e;
   private final jv<dhl> f;

   private static P9<Mu<eoh>, km, eok.c, Float, Integer, Optional<eok.a>, Integer, Integer, Integer, jv<dhl>> b(Instance<eoh> $$0) {
      P5<Mu<eoh>, km, eok.c, Float, Integer, Optional<eok.a>> $$1 = a($$0);
      P4<Mu<eoh>, Integer, Integer, Integer, jv<dhl>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eoh::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eoh::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eoh::c),
         kg.a(mc.aI).fieldOf("preferred_biomes").forGetter(eoh::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eoh(km $$0, eok.c $$1, float $$2, int $$3, Optional<eok.a> $$4, int $$5, int $$6, int $$7, jv<dhl> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eoh(int $$0, int $$1, int $$2, jv<dhl> $$3) {
      this(km.h, eok.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jv<dhl> d() {
      return this.f;
   }

   @Override
   protected boolean a(dyv $$0, int $$1, int $$2) {
      List<dfp> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dfp($$1, $$2));
   }

   @Override
   public eol<?> e() {
      return eol.b;
   }
}
