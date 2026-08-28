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

public class ejk extends ejn {
   public static final MapCodec<ejk> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ejk::new));
   private final int c;
   private final int d;
   private final int e;
   private final jn<ddd> f;

   private static P9<Mu<ejk>, ke, ejn.c, Float, Integer, Optional<ejn.a>, Integer, Integer, Integer, jn<ddd>> b(Instance<ejk> $$0) {
      P5<Mu<ejk>, ke, ejn.c, Float, Integer, Optional<ejn.a>> $$1 = a($$0);
      P4<Mu<ejk>, Integer, Integer, Integer, jn<ddd>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(ejk::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(ejk::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(ejk::c),
         jy.a(lr.aE).fieldOf("preferred_biomes").forGetter(ejk::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public ejk(ke $$0, ejn.c $$1, float $$2, int $$3, Optional<ejn.a> $$4, int $$5, int $$6, int $$7, jn<ddd> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public ejk(int $$0, int $$1, int $$2, jn<ddd> $$3) {
      this(ke.g, ejn.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jn<ddd> d() {
      return this.f;
   }

   @Override
   protected boolean a(duf $$0, int $$1, int $$2) {
      List<dbk> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dbk($$1, $$2));
   }

   @Override
   public ejo<?> e() {
      return ejo.b;
   }
}
