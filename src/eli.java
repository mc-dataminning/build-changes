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

public class eli extends ell {
   public static final MapCodec<eli> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eli::new));
   private final int c;
   private final int d;
   private final int e;
   private final jr<det> f;

   private static P9<Mu<eli>, ki, ell.c, Float, Integer, Optional<ell.a>, Integer, Integer, Integer, jr<det>> b(Instance<eli> $$0) {
      P5<Mu<eli>, ki, ell.c, Float, Integer, Optional<ell.a>> $$1 = a($$0);
      P4<Mu<eli>, Integer, Integer, Integer, jr<det>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eli::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eli::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eli::c),
         kc.a(lv.aF).fieldOf("preferred_biomes").forGetter(eli::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eli(ki $$0, ell.c $$1, float $$2, int $$3, Optional<ell.a> $$4, int $$5, int $$6, int $$7, jr<det> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eli(int $$0, int $$1, int $$2, jr<det> $$3) {
      this(ki.g, ell.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jr<det> d() {
      return this.f;
   }

   @Override
   protected boolean a(dvy $$0, int $$1, int $$2) {
      List<dcy> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dcy($$1, $$2));
   }

   @Override
   public elm<?> e() {
      return elm.b;
   }
}
