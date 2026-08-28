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

public class ejf extends eji {
   public static final MapCodec<ejf> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ejf::new));
   private final int c;
   private final int d;
   private final int e;
   private final jm<dcy> f;

   private static P9<Mu<ejf>, kd, eji.c, Float, Integer, Optional<eji.a>, Integer, Integer, Integer, jm<dcy>> b(Instance<ejf> $$0) {
      P5<Mu<ejf>, kd, eji.c, Float, Integer, Optional<eji.a>> $$1 = a($$0);
      P4<Mu<ejf>, Integer, Integer, Integer, jm<dcy>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(ejf::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(ejf::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(ejf::c),
         jx.a(lq.az).fieldOf("preferred_biomes").forGetter(ejf::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public ejf(kd $$0, eji.c $$1, float $$2, int $$3, Optional<eji.a> $$4, int $$5, int $$6, int $$7, jm<dcy> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public ejf(int $$0, int $$1, int $$2, jm<dcy> $$3) {
      this(kd.g, eji.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jm<dcy> d() {
      return this.f;
   }

   @Override
   protected boolean a(dub $$0, int $$1, int $$2) {
      List<dbg> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dbg($$1, $$2));
   }

   @Override
   public ejj<?> e() {
      return ejj.b;
   }
}
