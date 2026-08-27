import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class dwu extends dwx {
   public static final Codec<dwu> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dwu::new));
   private final int c;
   private final int d;
   private final int e;
   private final ig<crx> f;

   private static P9<Mu<dwu>, iw, dwx.c, Float, Integer, Optional<dwx.a>, Integer, Integer, Integer, ig<crx>> b(Instance<dwu> $$0) {
      P5<Mu<dwu>, iw, dwx.c, Float, Integer, Optional<dwx.a>> $$1 = a($$0);
      P4<Mu<dwu>, Integer, Integer, Integer, ig<crx>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(dwu::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(dwu::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(dwu::c),
         iq.a(jz.aq).fieldOf("preferred_biomes").forGetter(dwu::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public dwu(iw $$0, dwx.c $$1, float $$2, int $$3, Optional<dwx.a> $$4, int $$5, int $$6, int $$7, ig<crx> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public dwu(int $$0, int $$1, int $$2, ig<crx> $$3) {
      this(iw.g, dwx.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ig<crx> d() {
      return this.f;
   }

   @Override
   protected boolean a(dhz $$0, int $$1, int $$2) {
      List<cqg> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new cqg($$1, $$2));
   }

   @Override
   public dwy<?> e() {
      return dwy.b;
   }
}
