import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class dzt extends dzw {
   public static final Codec<dzt> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dzt::new));
   private final int c;
   private final int d;
   private final int e;
   private final il<cuh> f;

   private static P9<Mu<dzt>, jb, dzw.c, Float, Integer, Optional<dzw.a>, Integer, Integer, Integer, il<cuh>> b(Instance<dzt> $$0) {
      P5<Mu<dzt>, jb, dzw.c, Float, Integer, Optional<dzw.a>> $$1 = a($$0);
      P4<Mu<dzt>, Integer, Integer, Integer, il<cuh>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(dzt::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(dzt::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(dzt::c),
         iv.a(ke.at).fieldOf("preferred_biomes").forGetter(dzt::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public dzt(jb $$0, dzw.c $$1, float $$2, int $$3, Optional<dzw.a> $$4, int $$5, int $$6, int $$7, il<cuh> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public dzt(int $$0, int $$1, int $$2, il<cuh> $$3) {
      this(jb.g, dzw.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public il<cuh> d() {
      return this.f;
   }

   @Override
   protected boolean a(dky $$0, int $$1, int $$2) {
      List<csp> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new csp($$1, $$2));
   }

   @Override
   public dzx<?> e() {
      return dzx.b;
   }
}
