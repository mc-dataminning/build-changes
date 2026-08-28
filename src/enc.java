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

public class enc extends enf {
   public static final MapCodec<enc> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, enc::new));
   private final int c;
   private final int d;
   private final int e;
   private final ju<dgo> f;

   private static P9<Mu<enc>, kl, enf.c, Float, Integer, Optional<enf.a>, Integer, Integer, Integer, ju<dgo>> b(Instance<enc> $$0) {
      P5<Mu<enc>, kl, enf.c, Float, Integer, Optional<enf.a>> $$1 = a($$0);
      P4<Mu<enc>, Integer, Integer, Integer, ju<dgo>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(enc::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(enc::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(enc::c),
         kf.a(ma.aG).fieldOf("preferred_biomes").forGetter(enc::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public enc(kl $$0, enf.c $$1, float $$2, int $$3, Optional<enf.a> $$4, int $$5, int $$6, int $$7, ju<dgo> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public enc(int $$0, int $$1, int $$2, ju<dgo> $$3) {
      this(kl.g, enf.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ju<dgo> d() {
      return this.f;
   }

   @Override
   protected boolean a(dxs $$0, int $$1, int $$2) {
      List<des> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new des($$1, $$2));
   }

   @Override
   public eng<?> e() {
      return eng.b;
   }
}
