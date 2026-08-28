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

public class emv extends emy {
   public static final MapCodec<emv> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, emv::new));
   private final int c;
   private final int d;
   private final int e;
   private final ju<dgh> f;

   private static P9<Mu<emv>, kl, emy.c, Float, Integer, Optional<emy.a>, Integer, Integer, Integer, ju<dgh>> b(Instance<emv> $$0) {
      P5<Mu<emv>, kl, emy.c, Float, Integer, Optional<emy.a>> $$1 = a($$0);
      P4<Mu<emv>, Integer, Integer, Integer, ju<dgh>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(emv::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(emv::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(emv::c),
         kf.a(ma.aG).fieldOf("preferred_biomes").forGetter(emv::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public emv(kl $$0, emy.c $$1, float $$2, int $$3, Optional<emy.a> $$4, int $$5, int $$6, int $$7, ju<dgh> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public emv(int $$0, int $$1, int $$2, ju<dgh> $$3) {
      this(kl.g, emy.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ju<dgh> d() {
      return this.f;
   }

   @Override
   protected boolean a(dxl $$0, int $$1, int $$2) {
      List<del> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new del($$1, $$2));
   }

   @Override
   public emz<?> e() {
      return emz.b;
   }
}
