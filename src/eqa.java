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

public class eqa extends eqd {
   public static final MapCodec<eqa> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eqa::new));
   private final int c;
   private final int d;
   private final int e;
   private final jw<dis> f;

   private static P9<Mu<eqa>, kn, eqd.c, Float, Integer, Optional<eqd.a>, Integer, Integer, Integer, jw<dis>> b(Instance<eqa> $$0) {
      P5<Mu<eqa>, kn, eqd.c, Float, Integer, Optional<eqd.a>> $$1 = a($$0);
      P4<Mu<eqa>, Integer, Integer, Integer, jw<dis>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eqa::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eqa::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eqa::c),
         kh.a(me.aM).fieldOf("preferred_biomes").forGetter(eqa::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eqa(kn $$0, eqd.c $$1, float $$2, int $$3, Optional<eqd.a> $$4, int $$5, int $$6, int $$7, jw<dis> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eqa(int $$0, int $$1, int $$2, jw<dis> $$3) {
      this(kn.i, eqd.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jw<dis> d() {
      return this.f;
   }

   @Override
   protected boolean a(eal $$0, int $$1, int $$2) {
      List<dgw> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dgw($$1, $$2));
   }

   @Override
   public eqe<?> e() {
      return eqe.b;
   }
}
