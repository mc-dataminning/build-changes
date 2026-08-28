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

public class erc extends erf {
   public static final MapCodec<erc> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, erc::new));
   private final int c;
   private final int d;
   private final int e;
   private final ji<djs> f;

   private static P9<Mu<erc>, jz, erf.c, Float, Integer, Optional<erf.a>, Integer, Integer, Integer, ji<djs>> b(Instance<erc> $$0) {
      P5<Mu<erc>, jz, erf.c, Float, Integer, Optional<erf.a>> $$1 = a($$0);
      P4<Mu<erc>, Integer, Integer, Integer, ji<djs>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(erc::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(erc::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(erc::c),
         jt.a(mg.aG).fieldOf("preferred_biomes").forGetter(erc::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public erc(jz $$0, erf.c $$1, float $$2, int $$3, Optional<erf.a> $$4, int $$5, int $$6, int $$7, ji<djs> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public erc(int $$0, int $$1, int $$2, ji<djs> $$3) {
      this(jz.i, erf.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ji<djs> d() {
      return this.f;
   }

   @Override
   protected boolean a(ebn $$0, int $$1, int $$2) {
      List<dhw> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dhw($$1, $$2));
   }

   @Override
   public erg<?> e() {
      return erg.b;
   }
}
