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

public class ejg extends ejj {
   public static final MapCodec<ejg> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ejg::new));
   private final int c;
   private final int d;
   private final int e;
   private final jm<dcz> f;

   private static P9<Mu<ejg>, kd, ejj.c, Float, Integer, Optional<ejj.a>, Integer, Integer, Integer, jm<dcz>> b(Instance<ejg> $$0) {
      P5<Mu<ejg>, kd, ejj.c, Float, Integer, Optional<ejj.a>> $$1 = a($$0);
      P4<Mu<ejg>, Integer, Integer, Integer, jm<dcz>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(ejg::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(ejg::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(ejg::c),
         jx.a(lq.az).fieldOf("preferred_biomes").forGetter(ejg::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public ejg(kd $$0, ejj.c $$1, float $$2, int $$3, Optional<ejj.a> $$4, int $$5, int $$6, int $$7, jm<dcz> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public ejg(int $$0, int $$1, int $$2, jm<dcz> $$3) {
      this(kd.g, ejj.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jm<dcz> d() {
      return this.f;
   }

   @Override
   protected boolean a(duc $$0, int $$1, int $$2) {
      List<dbh> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dbh($$1, $$2));
   }

   @Override
   public ejk<?> e() {
      return ejk.b;
   }
}
