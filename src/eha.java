import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class eha extends ehd {
   public static final Codec<eha> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, eha::new));
   private final int c;
   private final int d;
   private final int e;
   private final iz<dat> f;

   private static P9<Mu<eha>, jq, ehd.c, Float, Integer, Optional<ehd.a>, Integer, Integer, Integer, iz<dat>> b(Instance<eha> $$0) {
      P5<Mu<eha>, jq, ehd.c, Float, Integer, Optional<ehd.a>> $$1 = a($$0);
      P4<Mu<eha>, Integer, Integer, Integer, iz<dat>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(eha::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(eha::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(eha::c),
         jk.a(ld.ay).fieldOf("preferred_biomes").forGetter(eha::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public eha(jq $$0, ehd.c $$1, float $$2, int $$3, Optional<ehd.a> $$4, int $$5, int $$6, int $$7, iz<dat> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public eha(int $$0, int $$1, int $$2, iz<dat> $$3) {
      this(jq.g, ehd.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
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

   public iz<dat> d() {
      return this.f;
   }

   @Override
   protected boolean a(drw $$0, int $$1, int $$2) {
      List<czb> $$3 = $$0.a(this);
      return $$3 == null ? false : $$3.contains(new czb($$1, $$2));
   }

   @Override
   public ehe<?> e() {
      return ehe.b;
   }
}
