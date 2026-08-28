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

public class eoe extends eoh {
   public static final MapCodec<eoe> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eoe::new));
   private final int c;
   private final int d;
   private final int e;
   private final jv<dhi> f;

   private static P9<Mu<eoe>, km, eoh.c, Float, Integer, Optional<eoh.a>, Integer, Integer, Integer, jv<dhi>> b(Instance<eoe> $$0) {
      P5<Mu<eoe>, km, eoh.c, Float, Integer, Optional<eoh.a>> $$1 = a($$0);
      P4<Mu<eoe>, Integer, Integer, Integer, jv<dhi>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eoe::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eoe::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eoe::c),
         kg.a(mc.aI).fieldOf("preferred_biomes").forGetter(eoe::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eoe(km $$0, eoh.c $$1, float $$2, int $$3, Optional<eoh.a> $$4, int $$5, int $$6, int $$7, jv<dhi> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eoe(int $$0, int $$1, int $$2, jv<dhi> $$3) {
      this(km.h, eoh.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jv<dhi> d() {
      return this.f;
   }

   @Override
   protected boolean a(dys $$0, int $$1, int $$2) {
      List<dfm> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dfm($$1, $$2));
   }

   @Override
   public eoi<?> e() {
      return eoi.b;
   }
}
