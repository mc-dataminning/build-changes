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

public class ekg extends ekj {
   public static final MapCodec<ekg> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ekg::new));
   private final int c;
   private final int d;
   private final int e;
   private final jq<ddu> f;

   private static P9<Mu<ekg>, kh, ekj.c, Float, Integer, Optional<ekj.a>, Integer, Integer, Integer, jq<ddu>> b(Instance<ekg> $$0) {
      P5<Mu<ekg>, kh, ekj.c, Float, Integer, Optional<ekj.a>> $$1 = a($$0);
      P4<Mu<ekg>, Integer, Integer, Integer, jq<ddu>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(ekg::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(ekg::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(ekg::c),
         kb.a(lu.aF).fieldOf("preferred_biomes").forGetter(ekg::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public ekg(kh $$0, ekj.c $$1, float $$2, int $$3, Optional<ekj.a> $$4, int $$5, int $$6, int $$7, jq<ddu> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public ekg(int $$0, int $$1, int $$2, jq<ddu> $$3) {
      this(kh.g, ekj.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jq<ddu> d() {
      return this.f;
   }

   @Override
   protected boolean a(duy $$0, int $$1, int $$2) {
      List<dcb> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dcb($$1, $$2));
   }

   @Override
   public ekk<?> e() {
      return ekk.b;
   }
}
