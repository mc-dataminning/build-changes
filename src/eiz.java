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

public class eiz extends ejc {
   public static final MapCodec<eiz> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eiz::new));
   private final int c;
   private final int d;
   private final int e;
   private final jm<dcs> f;

   private static P9<Mu<eiz>, kd, ejc.c, Float, Integer, Optional<ejc.a>, Integer, Integer, Integer, jm<dcs>> b(Instance<eiz> $$0) {
      P5<Mu<eiz>, kd, ejc.c, Float, Integer, Optional<ejc.a>> $$1 = a($$0);
      P4<Mu<eiz>, Integer, Integer, Integer, jm<dcs>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eiz::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eiz::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eiz::c),
         jx.a(lq.az).fieldOf("preferred_biomes").forGetter(eiz::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eiz(kd $$0, ejc.c $$1, float $$2, int $$3, Optional<ejc.a> $$4, int $$5, int $$6, int $$7, jm<dcs> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eiz(int $$0, int $$1, int $$2, jm<dcs> $$3) {
      this(kd.g, ejc.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jm<dcs> d() {
      return this.f;
   }

   @Override
   protected boolean a(dtv $$0, int $$1, int $$2) {
      List<dba> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dba($$1, $$2));
   }

   @Override
   public ejd<?> e() {
      return ejd.b;
   }
}
