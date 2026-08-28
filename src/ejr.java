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

public class ejr extends eju {
   public static final MapCodec<ejr> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ejr::new));
   private final int c;
   private final int d;
   private final int e;
   private final jn<ddg> f;

   private static P9<Mu<ejr>, ke, eju.c, Float, Integer, Optional<eju.a>, Integer, Integer, Integer, jn<ddg>> b(Instance<ejr> $$0) {
      P5<Mu<ejr>, ke, eju.c, Float, Integer, Optional<eju.a>> $$1 = a($$0);
      P4<Mu<ejr>, Integer, Integer, Integer, jn<ddg>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(ejr::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(ejr::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(ejr::c),
         jy.a(lr.aE).fieldOf("preferred_biomes").forGetter(ejr::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public ejr(ke $$0, eju.c $$1, float $$2, int $$3, Optional<eju.a> $$4, int $$5, int $$6, int $$7, jn<ddg> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public ejr(int $$0, int $$1, int $$2, jn<ddg> $$3) {
      this(ke.g, eju.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public jn<ddg> d() {
      return this.f;
   }

   @Override
   protected boolean a(duj $$0, int $$1, int $$2) {
      List<dbn> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dbn($$1, $$2));
   }

   @Override
   public ejv<?> e() {
      return ejv.b;
   }
}
