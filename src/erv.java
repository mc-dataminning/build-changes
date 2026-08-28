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

public class erv extends ery {
   public static final MapCodec<erv> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, erv::new));
   private final int c;
   private final int d;
   private final int e;
   private final ji<dkd> f;

   private static P9<Mu<erv>, jz, ery.c, Float, Integer, Optional<ery.a>, Integer, Integer, Integer, ji<dkd>> b(Instance<erv> $$0) {
      P5<Mu<erv>, jz, ery.c, Float, Integer, Optional<ery.a>> $$1 = a($$0);
      P4<Mu<erv>, Integer, Integer, Integer, ji<dkd>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(erv::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(erv::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(erv::c),
         jt.a(mg.aG).fieldOf("preferred_biomes").forGetter(erv::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public erv(jz $$0, ery.c $$1, float $$2, int $$3, Optional<ery.a> $$4, int $$5, int $$6, int $$7, ji<dkd> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public erv(int $$0, int $$1, int $$2, ji<dkd> $$3) {
      this(jz.i, ery.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ji<dkd> d() {
      return this.f;
   }

   @Override
   protected boolean a(ecg $$0, int $$1, int $$2) {
      List<dih> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dih($$1, $$2));
   }

   @Override
   public erz<?> e() {
      return erz.b;
   }
}
