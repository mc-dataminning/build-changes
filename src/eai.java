import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class eai extends eal {
   public static final Codec<eai> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, eai::new));
   private final int c;
   private final int d;
   private final int e;
   private final il<cuw> f;

   private static P9<Mu<eai>, jb, eal.c, Float, Integer, Optional<eal.a>, Integer, Integer, Integer, il<cuw>> b(Instance<eai> $$0) {
      P5<Mu<eai>, jb, eal.c, Float, Integer, Optional<eal.a>> $$1 = a($$0);
      P4<Mu<eai>, Integer, Integer, Integer, il<cuw>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eai::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eai::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eai::c),
         iv.a(ke.at).fieldOf("preferred_biomes").forGetter(eai::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eai(jb $$0, eal.c $$1, float $$2, int $$3, Optional<eal.a> $$4, int $$5, int $$6, int $$7, il<cuw> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eai(int $$0, int $$1, int $$2, il<cuw> $$3) {
      this(jb.g, eal.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public il<cuw> d() {
      return this.f;
   }

   @Override
   protected boolean a(dln $$0, int $$1, int $$2) {
      List<cte> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new cte($$1, $$2));
   }

   @Override
   public eam<?> e() {
      return eam.b;
   }
}
