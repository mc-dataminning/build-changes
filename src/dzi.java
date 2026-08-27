import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class dzi extends dzl {
   public static final Codec<dzi> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dzi::new));
   private final int c;
   private final int d;
   private final int e;
   private final ij<ctx> f;

   private static P9<Mu<dzi>, iz, dzl.c, Float, Integer, Optional<dzl.a>, Integer, Integer, Integer, ij<ctx>> b(Instance<dzi> $$0) {
      P5<Mu<dzi>, iz, dzl.c, Float, Integer, Optional<dzl.a>> $$1 = a($$0);
      P4<Mu<dzi>, Integer, Integer, Integer, ij<ctx>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(dzi::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(dzi::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(dzi::c),
         it.a(kc.as).fieldOf("preferred_biomes").forGetter(dzi::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public dzi(iz $$0, dzl.c $$1, float $$2, int $$3, Optional<dzl.a> $$4, int $$5, int $$6, int $$7, ij<ctx> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public dzi(int $$0, int $$1, int $$2, ij<ctx> $$3) {
      this(iz.g, dzl.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ij<ctx> d() {
      return this.f;
   }

   @Override
   protected boolean a(dkn $$0, int $$1, int $$2) {
      List<csf> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new csf($$1, $$2));
   }

   @Override
   public dzm<?> e() {
      return dzm.b;
   }
}
