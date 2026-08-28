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

public class esh extends esk {
   public static final MapCodec<esh> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, esh::new));
   private final int c;
   private final int d;
   private final int e;
   private final jj<dkp> f;

   private static P9<Mu<esh>, ka, esk.c, Float, Integer, Optional<esk.a>, Integer, Integer, Integer, jj<dkp>> b(Instance<esh> $$0) {
      P5<Mu<esh>, ka, esk.c, Float, Integer, Optional<esk.a>> $$1 = a($$0);
      P4<Mu<esh>, Integer, Integer, Integer, jj<dkp>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(esh::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(esh::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(esh::c),
         ju.a(mh.aG).fieldOf("preferred_biomes").forGetter(esh::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public esh(ka $$0, esk.c $$1, float $$2, int $$3, Optional<esk.a> $$4, int $$5, int $$6, int $$7, jj<dkp> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public esh(int $$0, int $$1, int $$2, jj<dkp> $$3) {
      this(ka.i, esk.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jj<dkp> d() {
      return this.f;
   }

   @Override
   protected boolean a(ecs $$0, int $$1, int $$2) {
      List<dir> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dir($$1, $$2));
   }

   @Override
   public esl<?> e() {
      return esl.b;
   }
}
