import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class ecf extends eci {
   public static final Codec<ecf> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ecf::new));
   private final int c;
   private final int d;
   private final int e;
   private final in<cwq> f;

   private static P9<Mu<ecf>, jd, eci.c, Float, Integer, Optional<eci.a>, Integer, Integer, Integer, in<cwq>> b(Instance<ecf> $$0) {
      P5<Mu<ecf>, jd, eci.c, Float, Integer, Optional<eci.a>> $$1 = a($$0);
      P4<Mu<ecf>, Integer, Integer, Integer, in<cwq>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(ecf::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(ecf::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(ecf::c),
         ix.a(kg.at).fieldOf("preferred_biomes").forGetter(ecf::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public ecf(jd $$0, eci.c $$1, float $$2, int $$3, Optional<eci.a> $$4, int $$5, int $$6, int $$7, in<cwq> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public ecf(int $$0, int $$1, int $$2, in<cwq> $$3) {
      this(jd.g, eci.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public in<cwq> d() {
      return this.f;
   }

   @Override
   protected boolean a(dnh $$0, int $$1, int $$2) {
      List<cuy> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new cuy($$1, $$2));
   }

   @Override
   public ecj<?> e() {
      return ecj.b;
   }
}
