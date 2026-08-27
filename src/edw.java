import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class edw extends edz {
   public static final Codec<edw> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, edw::new));
   private final int c;
   private final int d;
   private final int e;
   private final ip<cxy> f;

   private static P9<Mu<edw>, jg, edz.c, Float, Integer, Optional<edz.a>, Integer, Integer, Integer, ip<cxy>> b(Instance<edw> $$0) {
      P5<Mu<edw>, jg, edz.c, Float, Integer, Optional<edz.a>> $$1 = a($$0);
      P4<Mu<edw>, Integer, Integer, Integer, ip<cxy>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(edw::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(edw::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(edw::c),
         ja.a(kj.au).fieldOf("preferred_biomes").forGetter(edw::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public edw(jg $$0, edz.c $$1, float $$2, int $$3, Optional<edz.a> $$4, int $$5, int $$6, int $$7, ip<cxy> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public edw(int $$0, int $$1, int $$2, ip<cxy> $$3) {
      this(jg.g, edz.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public ip<cxy> d() {
      return this.f;
   }

   @Override
   protected boolean a(dox $$0, int $$1, int $$2) {
      List<cwg> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new cwg($$1, $$2));
   }

   @Override
   public eea<?> e() {
      return eea.b;
   }
}
