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

public class eje extends ejh {
   public static final MapCodec<eje> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eje::new));
   private final int c;
   private final int d;
   private final int e;
   private final jm<dcx> f;

   private static P9<Mu<eje>, kd, ejh.c, Float, Integer, Optional<ejh.a>, Integer, Integer, Integer, jm<dcx>> b(Instance<eje> $$0) {
      P5<Mu<eje>, kd, ejh.c, Float, Integer, Optional<ejh.a>> $$1 = a($$0);
      P4<Mu<eje>, Integer, Integer, Integer, jm<dcx>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eje::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eje::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eje::c),
         jx.a(lq.az).fieldOf("preferred_biomes").forGetter(eje::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eje(kd $$0, ejh.c $$1, float $$2, int $$3, Optional<ejh.a> $$4, int $$5, int $$6, int $$7, jm<dcx> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eje(int $$0, int $$1, int $$2, jm<dcx> $$3) {
      this(kd.g, ejh.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jm<dcx> d() {
      return this.f;
   }

   @Override
   protected boolean a(dua $$0, int $$1, int $$2) {
      List<dbf> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dbf($$1, $$2));
   }

   @Override
   public eji<?> e() {
      return eji.b;
   }
}
