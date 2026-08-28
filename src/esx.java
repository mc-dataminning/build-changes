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

public class esx extends eta {
   public static final MapCodec<esx> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, esx::new));
   private final int c;
   private final int d;
   private final int e;
   private final jk<dlc> f;

   private static P9<Mu<esx>, kb, eta.c, Float, Integer, Optional<eta.a>, Integer, Integer, Integer, jk<dlc>> b(Instance<esx> $$0) {
      P5<Mu<esx>, kb, eta.c, Float, Integer, Optional<eta.a>> $$1 = a($$0);
      P4<Mu<esx>, Integer, Integer, Integer, jk<dlc>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(esx::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(esx::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(esx::c),
         jv.a(mi.aG).fieldOf("preferred_biomes").forGetter(esx::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public esx(kb $$0, eta.c $$1, float $$2, int $$3, Optional<eta.a> $$4, int $$5, int $$6, int $$7, jk<dlc> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public esx(int $$0, int $$1, int $$2, jk<dlc> $$3) {
      this(kb.i, eta.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jk<dlc> d() {
      return this.f;
   }

   @Override
   protected boolean a(edf $$0, int $$1, int $$2) {
      List<dje> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dje($$1, $$2));
   }

   @Override
   public etb<?> e() {
      return etb.b;
   }
}
