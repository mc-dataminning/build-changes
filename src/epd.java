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

public class epd extends epg {
   public static final MapCodec<epd> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, epd::new));
   private final int c;
   private final int d;
   private final int e;
   private final ju<dij> f;

   private static P9<Mu<epd>, kl, epg.c, Float, Integer, Optional<epg.a>, Integer, Integer, Integer, ju<dij>> b(Instance<epd> $$0) {
      P5<Mu<epd>, kl, epg.c, Float, Integer, Optional<epg.a>> $$1 = a($$0);
      P4<Mu<epd>, Integer, Integer, Integer, ju<dij>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(epd::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(epd::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(epd::c),
         kf.a(mb.aI).fieldOf("preferred_biomes").forGetter(epd::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public epd(kl $$0, epg.c $$1, float $$2, int $$3, Optional<epg.a> $$4, int $$5, int $$6, int $$7, ju<dij> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public epd(int $$0, int $$1, int $$2, ju<dij> $$3) {
      this(kl.h, epg.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ju<dij> d() {
      return this.f;
   }

   @Override
   protected boolean a(dzr $$0, int $$1, int $$2) {
      List<dgn> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dgn($$1, $$2));
   }

   @Override
   public eph<?> e() {
      return eph.b;
   }
}
