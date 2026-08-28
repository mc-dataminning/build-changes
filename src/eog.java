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

public class eog extends eoj {
   public static final MapCodec<eog> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eog::new));
   private final int c;
   private final int d;
   private final int e;
   private final jv<dhk> f;

   private static P9<Mu<eog>, km, eoj.c, Float, Integer, Optional<eoj.a>, Integer, Integer, Integer, jv<dhk>> b(Instance<eog> $$0) {
      P5<Mu<eog>, km, eoj.c, Float, Integer, Optional<eoj.a>> $$1 = a($$0);
      P4<Mu<eog>, Integer, Integer, Integer, jv<dhk>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eog::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eog::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eog::c),
         kg.a(mc.aI).fieldOf("preferred_biomes").forGetter(eog::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eog(km $$0, eoj.c $$1, float $$2, int $$3, Optional<eoj.a> $$4, int $$5, int $$6, int $$7, jv<dhk> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eog(int $$0, int $$1, int $$2, jv<dhk> $$3) {
      this(km.h, eoj.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jv<dhk> d() {
      return this.f;
   }

   @Override
   protected boolean a(dyu $$0, int $$1, int $$2) {
      List<dfo> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dfo($$1, $$2));
   }

   @Override
   public eok<?> e() {
      return eok.b;
   }
}
