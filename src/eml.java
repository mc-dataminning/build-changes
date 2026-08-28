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

public class eml extends emo {
   public static final MapCodec<eml> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eml::new));
   private final int c;
   private final int d;
   private final int e;
   private final jt<dfw> f;

   private static P9<Mu<eml>, kk, emo.c, Float, Integer, Optional<emo.a>, Integer, Integer, Integer, jt<dfw>> b(Instance<eml> $$0) {
      P5<Mu<eml>, kk, emo.c, Float, Integer, Optional<emo.a>> $$1 = a($$0);
      P4<Mu<eml>, Integer, Integer, Integer, jt<dfw>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eml::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eml::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eml::c),
         ke.a(ly.aG).fieldOf("preferred_biomes").forGetter(eml::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eml(kk $$0, emo.c $$1, float $$2, int $$3, Optional<emo.a> $$4, int $$5, int $$6, int $$7, jt<dfw> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eml(int $$0, int $$1, int $$2, jt<dfw> $$3) {
      this(kk.g, emo.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jt<dfw> d() {
      return this.f;
   }

   @Override
   protected boolean a(dxb $$0, int $$1, int $$2) {
      List<deb> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new deb($$1, $$2));
   }

   @Override
   public emp<?> e() {
      return emp.b;
   }
}
