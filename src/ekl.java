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

public class ekl extends eko {
   public static final MapCodec<ekl> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ekl::new));
   private final int c;
   private final int d;
   private final int e;
   private final jq<ddw> f;

   private static P9<Mu<ekl>, kh, eko.c, Float, Integer, Optional<eko.a>, Integer, Integer, Integer, jq<ddw>> b(Instance<ekl> $$0) {
      P5<Mu<ekl>, kh, eko.c, Float, Integer, Optional<eko.a>> $$1 = a($$0);
      P4<Mu<ekl>, Integer, Integer, Integer, jq<ddw>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(ekl::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(ekl::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(ekl::c),
         kb.a(lu.aF).fieldOf("preferred_biomes").forGetter(ekl::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public ekl(kh $$0, eko.c $$1, float $$2, int $$3, Optional<eko.a> $$4, int $$5, int $$6, int $$7, jq<ddw> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public ekl(int $$0, int $$1, int $$2, jq<ddw> $$3) {
      this(kh.g, eko.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jq<ddw> d() {
      return this.f;
   }

   @Override
   protected boolean a(dva $$0, int $$1, int $$2) {
      List<dcd> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dcd($$1, $$2));
   }

   @Override
   public ekp<?> e() {
      return ekp.b;
   }
}
