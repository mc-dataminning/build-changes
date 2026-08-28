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

public class eth extends etk {
   public static final MapCodec<eth> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eth::new));
   private final int c;
   private final int d;
   private final int e;
   private final jk<dlm> f;

   private static P9<Mu<eth>, kb, etk.c, Float, Integer, Optional<etk.a>, Integer, Integer, Integer, jk<dlm>> b(Instance<eth> $$0) {
      P5<Mu<eth>, kb, etk.c, Float, Integer, Optional<etk.a>> $$1 = a($$0);
      P4<Mu<eth>, Integer, Integer, Integer, jk<dlm>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eth::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eth::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eth::c),
         jv.a(mi.aG).fieldOf("preferred_biomes").forGetter(eth::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eth(kb $$0, etk.c $$1, float $$2, int $$3, Optional<etk.a> $$4, int $$5, int $$6, int $$7, jk<dlm> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eth(int $$0, int $$1, int $$2, jk<dlm> $$3) {
      this(kb.i, etk.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jk<dlm> d() {
      return this.f;
   }

   @Override
   protected boolean a(edp $$0, int $$1, int $$2) {
      List<djo> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new djo($$1, $$2));
   }

   @Override
   public etl<?> e() {
      return etl.b;
   }
}
