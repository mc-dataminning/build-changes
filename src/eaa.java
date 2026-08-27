import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class eaa extends ead {
   public static final Codec<eaa> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, eaa::new));
   private final int c;
   private final int d;
   private final int e;
   private final il<cuo> f;

   private static P9<Mu<eaa>, jb, ead.c, Float, Integer, Optional<ead.a>, Integer, Integer, Integer, il<cuo>> b(Instance<eaa> $$0) {
      P5<Mu<eaa>, jb, ead.c, Float, Integer, Optional<ead.a>> $$1 = a($$0);
      P4<Mu<eaa>, Integer, Integer, Integer, il<cuo>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eaa::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eaa::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eaa::c),
         iv.a(ke.at).fieldOf("preferred_biomes").forGetter(eaa::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eaa(jb $$0, ead.c $$1, float $$2, int $$3, Optional<ead.a> $$4, int $$5, int $$6, int $$7, il<cuo> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eaa(int $$0, int $$1, int $$2, il<cuo> $$3) {
      this(jb.g, ead.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public il<cuo> d() {
      return this.f;
   }

   @Override
   protected boolean a(dlf $$0, int $$1, int $$2) {
      List<csw> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new csw($$1, $$2));
   }

   @Override
   public eae<?> e() {
      return eae.b;
   }
}
