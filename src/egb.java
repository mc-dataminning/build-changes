import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class egb extends ege {
   public static final Codec<egb> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, egb::new));
   private final int c;
   private final int d;
   private final int e;
   private final ip<czw> f;

   private static P9<Mu<egb>, jg, ege.c, Float, Integer, Optional<ege.a>, Integer, Integer, Integer, ip<czw>> b(Instance<egb> $$0) {
      P5<Mu<egb>, jg, ege.c, Float, Integer, Optional<ege.a>> $$1 = a($$0);
      P4<Mu<egb>, Integer, Integer, Integer, ip<czw>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(egb::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(egb::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(egb::c),
         ja.a(ks.av).fieldOf("preferred_biomes").forGetter(egb::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public egb(jg $$0, ege.c $$1, float $$2, int $$3, Optional<ege.a> $$4, int $$5, int $$6, int $$7, ip<czw> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public egb(int $$0, int $$1, int $$2, ip<czw> $$3) {
      this(jg.g, ege.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ip<czw> d() {
      return this.f;
   }

   @Override
   protected boolean a(dqx $$0, int $$1, int $$2) {
      List<cye> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new cye($$1, $$2));
   }

   @Override
   public egf<?> e() {
      return egf.b;
   }
}
