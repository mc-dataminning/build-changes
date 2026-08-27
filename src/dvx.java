import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class dvx extends dwa {
   public static final Codec<dvx> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dvx::new));
   private final int c;
   private final int d;
   private final int e;
   private final hk<cqo> f;

   private static P9<Mu<dvx>, ib, dwa.c, Float, Integer, Optional<dwa.a>, Integer, Integer, Integer, hk<cqo>> b(Instance<dvx> $$0) {
      P5<Mu<dvx>, ib, dwa.c, Float, Integer, Optional<dwa.a>> $$1 = a($$0);
      P4<Mu<dvx>, Integer, Integer, Integer, hk<cqo>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(dvx::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(dvx::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(dvx::c),
         hv.a(je.ap).fieldOf("preferred_biomes").forGetter(dvx::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public dvx(ib $$0, dwa.c $$1, float $$2, int $$3, Optional<dwa.a> $$4, int $$5, int $$6, int $$7, hk<cqo> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public dvx(int $$0, int $$1, int $$2, hk<cqo> $$3) {
      this(ib.g, dwa.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public hk<cqo> d() {
      return this.f;
   }

   @Override
   protected boolean a(dhc $$0, int $$1, int $$2) {
      List<cox> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new cox($$1, $$2));
   }

   @Override
   public dwb<?> e() {
      return dwb.b;
   }
}
