import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class dvw extends dvz {
   public static final Codec<dvw> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dvw::new));
   private final int c;
   private final int d;
   private final int e;
   private final hi<cqz> f;

   private static P9<Mu<dvw>, hy, dvz.c, Float, Integer, Optional<dvz.a>, Integer, Integer, Integer, hi<cqz>> b(Instance<dvw> $$0) {
      P5<Mu<dvw>, hy, dvz.c, Float, Integer, Optional<dvz.a>> $$1 = a($$0);
      P4<Mu<dvw>, Integer, Integer, Integer, hi<cqz>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(dvw::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(dvw::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(dvw::c),
         hs.a(jc.aq).fieldOf("preferred_biomes").forGetter(dvw::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public dvw(hy $$0, dvz.c $$1, float $$2, int $$3, Optional<dvz.a> $$4, int $$5, int $$6, int $$7, hi<cqz> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public dvw(int $$0, int $$1, int $$2, hi<cqz> $$3) {
      this(hy.g, dvz.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public hi<cqz> d() {
      return this.f;
   }

   @Override
   protected boolean a(dhb $$0, int $$1, int $$2) {
      List<cpi> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new cpi($$1, $$2));
   }

   @Override
   public dwa<?> e() {
      return dwa.b;
   }
}
