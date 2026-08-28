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

public class ejc extends ejf {
   public static final MapCodec<ejc> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ejc::new));
   private final int c;
   private final int d;
   private final int e;
   private final jm<dcv> f;

   private static P9<Mu<ejc>, kd, ejf.c, Float, Integer, Optional<ejf.a>, Integer, Integer, Integer, jm<dcv>> b(Instance<ejc> $$0) {
      P5<Mu<ejc>, kd, ejf.c, Float, Integer, Optional<ejf.a>> $$1 = a($$0);
      P4<Mu<ejc>, Integer, Integer, Integer, jm<dcv>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(ejc::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(ejc::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(ejc::c),
         jx.a(lq.az).fieldOf("preferred_biomes").forGetter(ejc::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public ejc(kd $$0, ejf.c $$1, float $$2, int $$3, Optional<ejf.a> $$4, int $$5, int $$6, int $$7, jm<dcv> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public ejc(int $$0, int $$1, int $$2, jm<dcv> $$3) {
      this(kd.g, ejf.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jm<dcv> d() {
      return this.f;
   }

   @Override
   protected boolean a(dty $$0, int $$1, int $$2) {
      List<dbd> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dbd($$1, $$2));
   }

   @Override
   public ejg<?> e() {
      return ejg.b;
   }
}
