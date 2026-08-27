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

public class eid extends eig {
   public static final MapCodec<eid> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eid::new));
   private final int c;
   private final int d;
   private final int e;
   private final jb<dbw> f;

   private static P9<Mu<eid>, js, eig.c, Float, Integer, Optional<eig.a>, Integer, Integer, Integer, jb<dbw>> b(Instance<eid> $$0) {
      P5<Mu<eid>, js, eig.c, Float, Integer, Optional<eig.a>> $$1 = a($$0);
      P4<Mu<eid>, Integer, Integer, Integer, jb<dbw>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eid::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eid::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eid::c),
         jm.a(lf.az).fieldOf("preferred_biomes").forGetter(eid::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eid(js $$0, eig.c $$1, float $$2, int $$3, Optional<eig.a> $$4, int $$5, int $$6, int $$7, jb<dbw> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eid(int $$0, int $$1, int $$2, jb<dbw> $$3) {
      this(js.g, eig.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jb<dbw> d() {
      return this.f;
   }

   @Override
   protected boolean a(dsz $$0, int $$1, int $$2) {
      List<dae> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dae($$1, $$2));
   }

   @Override
   public eih<?> e() {
      return eih.b;
   }
}
