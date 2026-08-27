import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class eby extends ecb {
   public static final Codec<eby> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, eby::new));
   private final int c;
   private final int d;
   private final int e;
   private final in<cwm> f;

   private static P9<Mu<eby>, jd, ecb.c, Float, Integer, Optional<ecb.a>, Integer, Integer, Integer, in<cwm>> b(Instance<eby> $$0) {
      P5<Mu<eby>, jd, ecb.c, Float, Integer, Optional<ecb.a>> $$1 = a($$0);
      P4<Mu<eby>, Integer, Integer, Integer, in<cwm>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eby::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eby::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eby::c),
         ix.a(kg.at).fieldOf("preferred_biomes").forGetter(eby::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eby(jd $$0, ecb.c $$1, float $$2, int $$3, Optional<ecb.a> $$4, int $$5, int $$6, int $$7, in<cwm> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eby(int $$0, int $$1, int $$2, in<cwm> $$3) {
      this(jd.g, ecb.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public in<cwm> d() {
      return this.f;
   }

   @Override
   protected boolean a(dnd $$0, int $$1, int $$2) {
      List<cuu> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new cuu($$1, $$2));
   }

   @Override
   public ecc<?> e() {
      return ecc.b;
   }
}
