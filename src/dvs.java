import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class dvs extends dvv {
   public static final Codec<dvs> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dvs::new));
   private final int c;
   private final int d;
   private final int e;
   private final hi<cqj> f;

   private static P9<Mu<dvs>, hz, dvv.c, Float, Integer, Optional<dvv.a>, Integer, Integer, Integer, hi<cqj>> b(Instance<dvs> $$0) {
      P5<Mu<dvs>, hz, dvv.c, Float, Integer, Optional<dvv.a>> $$1 = a($$0);
      P4<Mu<dvs>, Integer, Integer, Integer, hi<cqj>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(dvs::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(dvs::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(dvs::c),
         ht.a(jc.ap).fieldOf("preferred_biomes").forGetter(dvs::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public dvs(hz $$0, dvv.c $$1, float $$2, int $$3, Optional<dvv.a> $$4, int $$5, int $$6, int $$7, hi<cqj> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public dvs(int $$0, int $$1, int $$2, hi<cqj> $$3) {
      this(hz.g, dvv.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public hi<cqj> d() {
      return this.f;
   }

   @Override
   protected boolean a(dgx $$0, int $$1, int $$2) {
      List<cos> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new cos($$1, $$2));
   }

   @Override
   public dvw<?> e() {
      return dvw.b;
   }
}
