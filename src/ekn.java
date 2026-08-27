import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class ekn extends ekq {
   public static final Codec<ekn> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ekn::new));
   private final int c;
   private final int d;
   private final int e;
   private final je<dcz> f;

   private static P9<Mu<ekn>, jv, ekq.c, Float, Integer, Optional<ekq.a>, Integer, Integer, Integer, je<dcz>> b(Instance<ekn> $$0) {
      P5<Mu<ekn>, jv, ekq.c, Float, Integer, Optional<ekq.a>> $$1 = a($$0);
      P4<Mu<ekn>, Integer, Integer, Integer, je<dcz>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(ekn::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(ekn::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(ekn::c),
         jp.a(li.az).fieldOf("preferred_biomes").forGetter(ekn::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public ekn(jv $$0, ekq.c $$1, float $$2, int $$3, Optional<ekq.a> $$4, int $$5, int $$6, int $$7, je<dcz> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public ekn(int $$0, int $$1, int $$2, je<dcz> $$3) {
      this(jv.g, ekq.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public je<dcz> d() {
      return this.f;
   }

   @Override
   protected boolean a(dva $$0, int $$1, int $$2) {
      List<dbh> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new dbh($$1, $$2));
   }

   @Override
   public ekr<?> e() {
      return ekr.b;
   }
}
