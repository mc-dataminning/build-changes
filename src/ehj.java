import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class ehj extends ehm {
   public static final Codec<ehj> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ehj::new));
   private final int c;
   private final int d;
   private final int e;
   private final ja<dbc> f;

   private static P9<Mu<ehj>, jr, ehm.c, Float, Integer, Optional<ehm.a>, Integer, Integer, Integer, ja<dbc>> b(Instance<ehj> $$0) {
      P5<Mu<ehj>, jr, ehm.c, Float, Integer, Optional<ehm.a>> $$1 = a($$0);
      P4<Mu<ehj>, Integer, Integer, Integer, ja<dbc>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(ehj::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(ehj::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(ehj::c),
         jl.a(le.az).fieldOf("preferred_biomes").forGetter(ehj::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public ehj(jr $$0, ehm.c $$1, float $$2, int $$3, Optional<ehm.a> $$4, int $$5, int $$6, int $$7, ja<dbc> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public ehj(int $$0, int $$1, int $$2, ja<dbc> $$3) {
      this(jr.g, ehm.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ja<dbc> d() {
      return this.f;
   }

   @Override
   protected boolean a(dsf $$0, int $$1, int $$2) {
      List<czk> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new czk($$1, $$2));
   }

   @Override
   public ehn<?> e() {
      return ehn.b;
   }
}
