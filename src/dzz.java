import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class dzz extends eac {
   public static final Codec<dzz> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dzz::new));
   private final int c;
   private final int d;
   private final int e;
   private final il<cun> f;

   private static P9<Mu<dzz>, jb, eac.c, Float, Integer, Optional<eac.a>, Integer, Integer, Integer, il<cun>> b(Instance<dzz> $$0) {
      P5<Mu<dzz>, jb, eac.c, Float, Integer, Optional<eac.a>> $$1 = a($$0);
      P4<Mu<dzz>, Integer, Integer, Integer, il<cun>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(dzz::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(dzz::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(dzz::c),
         iv.a(ke.at).fieldOf("preferred_biomes").forGetter(dzz::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public dzz(jb $$0, eac.c $$1, float $$2, int $$3, Optional<eac.a> $$4, int $$5, int $$6, int $$7, il<cun> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public dzz(int $$0, int $$1, int $$2, il<cun> $$3) {
      this(jb.g, eac.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public il<cun> d() {
      return this.f;
   }

   @Override
   protected boolean a(dle $$0, int $$1, int $$2) {
      List<csv> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new csv($$1, $$2));
   }

   @Override
   public ead<?> e() {
      return ead.b;
   }
}
