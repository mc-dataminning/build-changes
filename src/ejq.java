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

public class ejq extends ejt {
   public static final MapCodec<ejq> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ejq::new));
   private final int c;
   private final int d;
   private final int e;
   private final jn<ddf> f;

   private static P9<Mu<ejq>, ke, ejt.c, Float, Integer, Optional<ejt.a>, Integer, Integer, Integer, jn<ddf>> b(Instance<ejq> $$0) {
      P5<Mu<ejq>, ke, ejt.c, Float, Integer, Optional<ejt.a>> $$1 = a($$0);
      P4<Mu<ejq>, Integer, Integer, Integer, jn<ddf>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(ejq::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(ejq::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(ejq::c),
         jy.a(lr.aE).fieldOf("preferred_biomes").forGetter(ejq::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public ejq(ke $$0, ejt.c $$1, float $$2, int $$3, Optional<ejt.a> $$4, int $$5, int $$6, int $$7, jn<ddf> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public ejq(int $$0, int $$1, int $$2, jn<ddf> $$3) {
      this(ke.g, ejt.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jn<ddf> d() {
      return this.f;
   }

   @Override
   protected boolean a(dui $$0, int $$1, int $$2) {
      List<dbm> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dbm($$1, $$2));
   }

   @Override
   public eju<?> e() {
      return eju.b;
   }
}
