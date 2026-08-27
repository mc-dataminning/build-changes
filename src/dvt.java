import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class dvt extends dvw {
   public static final Codec<dvt> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dvt::new));
   private final int c;
   private final int d;
   private final int e;
   private final hi<cqk> f;

   private static P9<Mu<dvt>, hz, dvw.c, Float, Integer, Optional<dvw.a>, Integer, Integer, Integer, hi<cqk>> b(Instance<dvt> $$0) {
      P5<Mu<dvt>, hz, dvw.c, Float, Integer, Optional<dvw.a>> $$1 = a($$0);
      P4<Mu<dvt>, Integer, Integer, Integer, hi<cqk>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(dvt::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(dvt::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(dvt::c),
         ht.a(jc.ap).fieldOf("preferred_biomes").forGetter(dvt::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public dvt(hz $$0, dvw.c $$1, float $$2, int $$3, Optional<dvw.a> $$4, int $$5, int $$6, int $$7, hi<cqk> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public dvt(int $$0, int $$1, int $$2, hi<cqk> $$3) {
      this(hz.g, dvw.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public hi<cqk> d() {
      return this.f;
   }

   @Override
   protected boolean a(dgy $$0, int $$1, int $$2) {
      List<cot> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new cot($$1, $$2));
   }

   @Override
   public dvx<?> e() {
      return dvx.b;
   }
}
