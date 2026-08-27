import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class eda extends edd {
   public static final Codec<eda> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, eda::new));
   private final int c;
   private final int d;
   private final int e;
   private final ip<cxd> f;

   private static P9<Mu<eda>, jf, edd.c, Float, Integer, Optional<edd.a>, Integer, Integer, Integer, ip<cxd>> b(Instance<eda> $$0) {
      P5<Mu<eda>, jf, edd.c, Float, Integer, Optional<edd.a>> $$1 = a($$0);
      P4<Mu<eda>, Integer, Integer, Integer, ip<cxd>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eda::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eda::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eda::c),
         iz.a(ki.au).fieldOf("preferred_biomes").forGetter(eda::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eda(jf $$0, edd.c $$1, float $$2, int $$3, Optional<edd.a> $$4, int $$5, int $$6, int $$7, ip<cxd> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eda(int $$0, int $$1, int $$2, ip<cxd> $$3) {
      this(jf.g, edd.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ip<cxd> d() {
      return this.f;
   }

   @Override
   protected boolean a(doc $$0, int $$1, int $$2) {
      List<cvl> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new cvl($$1, $$2));
   }

   @Override
   public ede<?> e() {
      return ede.b;
   }
}
