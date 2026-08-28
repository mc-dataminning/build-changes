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

public class ern extends erq {
   public static final MapCodec<ern> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ern::new));
   private final int c;
   private final int d;
   private final int e;
   private final ji<djy> f;

   private static P9<Mu<ern>, jz, erq.c, Float, Integer, Optional<erq.a>, Integer, Integer, Integer, ji<djy>> b(Instance<ern> $$0) {
      P5<Mu<ern>, jz, erq.c, Float, Integer, Optional<erq.a>> $$1 = a($$0);
      P4<Mu<ern>, Integer, Integer, Integer, ji<djy>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(ern::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(ern::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(ern::c),
         jt.a(mg.aG).fieldOf("preferred_biomes").forGetter(ern::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public ern(jz $$0, erq.c $$1, float $$2, int $$3, Optional<erq.a> $$4, int $$5, int $$6, int $$7, ji<djy> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public ern(int $$0, int $$1, int $$2, ji<djy> $$3) {
      this(jz.i, erq.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ji<djy> d() {
      return this.f;
   }

   @Override
   protected boolean a(eby $$0, int $$1, int $$2) {
      List<dic> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dic($$1, $$2));
   }

   @Override
   public err<?> e() {
      return err.b;
   }
}
