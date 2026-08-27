import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class dwc extends dwf {
   public static final Codec<dwc> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dwc::new));
   private final int c;
   private final int d;
   private final int e;
   private final hk<cqt> f;

   private static P9<Mu<dwc>, ib, dwf.c, Float, Integer, Optional<dwf.a>, Integer, Integer, Integer, hk<cqt>> b(Instance<dwc> $$0) {
      P5<Mu<dwc>, ib, dwf.c, Float, Integer, Optional<dwf.a>> $$1 = a($$0);
      P4<Mu<dwc>, Integer, Integer, Integer, hk<cqt>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(dwc::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(dwc::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(dwc::c),
         hv.a(je.ap).fieldOf("preferred_biomes").forGetter(dwc::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public dwc(ib $$0, dwf.c $$1, float $$2, int $$3, Optional<dwf.a> $$4, int $$5, int $$6, int $$7, hk<cqt> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public dwc(int $$0, int $$1, int $$2, hk<cqt> $$3) {
      this(ib.g, dwf.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public hk<cqt> d() {
      return this.f;
   }

   @Override
   protected boolean a(dhh $$0, int $$1, int $$2) {
      List<cpc> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new cpc($$1, $$2));
   }

   @Override
   public dwg<?> e() {
      return dwg.b;
   }
}
