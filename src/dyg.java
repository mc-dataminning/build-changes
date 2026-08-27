import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class dyg extends dyj {
   public static final Codec<dyg> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dyg::new));
   private final int c;
   private final int d;
   private final int e;
   private final ik<ctd> f;

   private static P9<Mu<dyg>, ja, dyj.c, Float, Integer, Optional<dyj.a>, Integer, Integer, Integer, ik<ctd>> b(Instance<dyg> $$0) {
      P5<Mu<dyg>, ja, dyj.c, Float, Integer, Optional<dyj.a>> $$1 = a($$0);
      P4<Mu<dyg>, Integer, Integer, Integer, ik<ctd>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(dyg::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(dyg::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(dyg::c),
         iu.a(kd.ar).fieldOf("preferred_biomes").forGetter(dyg::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public dyg(ja $$0, dyj.c $$1, float $$2, int $$3, Optional<dyj.a> $$4, int $$5, int $$6, int $$7, ik<ctd> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public dyg(int $$0, int $$1, int $$2, ik<ctd> $$3) {
      this(ja.g, dyj.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ik<ctd> d() {
      return this.f;
   }

   @Override
   protected boolean a(djl $$0, int $$1, int $$2) {
      List<crm> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new crm($$1, $$2));
   }

   @Override
   public dyk<?> e() {
      return dyk.b;
   }
}
