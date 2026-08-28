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

public class eow extends eoz {
   public static final MapCodec<eow> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eow::new));
   private final int c;
   private final int d;
   private final int e;
   private final ju<dic> f;

   private static P9<Mu<eow>, kl, eoz.c, Float, Integer, Optional<eoz.a>, Integer, Integer, Integer, ju<dic>> b(Instance<eow> $$0) {
      P5<Mu<eow>, kl, eoz.c, Float, Integer, Optional<eoz.a>> $$1 = a($$0);
      P4<Mu<eow>, Integer, Integer, Integer, ju<dic>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eow::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eow::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eow::c),
         kf.a(mb.aH).fieldOf("preferred_biomes").forGetter(eow::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eow(kl $$0, eoz.c $$1, float $$2, int $$3, Optional<eoz.a> $$4, int $$5, int $$6, int $$7, ju<dic> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eow(int $$0, int $$1, int $$2, ju<dic> $$3) {
      this(kl.g, eoz.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ju<dic> d() {
      return this.f;
   }

   @Override
   protected boolean a(dzk $$0, int $$1, int $$2) {
      List<dgg> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dgg($$1, $$2));
   }

   @Override
   public epa<?> e() {
      return epa.b;
   }
}
