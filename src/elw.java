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

public class elw extends elz {
   public static final MapCodec<elw> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, elw::new));
   private final int c;
   private final int d;
   private final int e;
   private final jr<dfh> f;

   private static P9<Mu<elw>, ki, elz.c, Float, Integer, Optional<elz.a>, Integer, Integer, Integer, jr<dfh>> b(Instance<elw> $$0) {
      P5<Mu<elw>, ki, elz.c, Float, Integer, Optional<elz.a>> $$1 = a($$0);
      P4<Mu<elw>, Integer, Integer, Integer, jr<dfh>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(elw::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(elw::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(elw::c),
         kc.a(lv.aG).fieldOf("preferred_biomes").forGetter(elw::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public elw(ki $$0, elz.c $$1, float $$2, int $$3, Optional<elz.a> $$4, int $$5, int $$6, int $$7, jr<dfh> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public elw(int $$0, int $$1, int $$2, jr<dfh> $$3) {
      this(ki.g, elz.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jr<dfh> d() {
      return this.f;
   }

   @Override
   protected boolean a(dwm $$0, int $$1, int $$2) {
      List<ddm> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new ddm($$1, $$2));
   }

   @Override
   public ema<?> e() {
      return ema.b;
   }
}
