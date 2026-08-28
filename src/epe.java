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

public class epe extends eph {
   public static final MapCodec<epe> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, epe::new));
   private final int c;
   private final int d;
   private final int e;
   private final ju<dik> f;

   private static P9<Mu<epe>, kl, eph.c, Float, Integer, Optional<eph.a>, Integer, Integer, Integer, ju<dik>> b(Instance<epe> $$0) {
      P5<Mu<epe>, kl, eph.c, Float, Integer, Optional<eph.a>> $$1 = a($$0);
      P4<Mu<epe>, Integer, Integer, Integer, ju<dik>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(epe::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(epe::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(epe::c),
         kf.a(mb.aI).fieldOf("preferred_biomes").forGetter(epe::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public epe(kl $$0, eph.c $$1, float $$2, int $$3, Optional<eph.a> $$4, int $$5, int $$6, int $$7, ju<dik> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public epe(int $$0, int $$1, int $$2, ju<dik> $$3) {
      this(kl.h, eph.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ju<dik> d() {
      return this.f;
   }

   @Override
   protected boolean a(dzs $$0, int $$1, int $$2) {
      List<dgo> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dgo($$1, $$2));
   }

   @Override
   public epi<?> e() {
      return epi.b;
   }
}
