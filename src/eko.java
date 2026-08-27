import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eko extends ekh {
   private static final Codec<Pair<ij<dik>, cnn>> b = Codec.mapPair(kf.am.r().fieldOf("pattern"), cnn.q.fieldOf("color")).codec();
   public static final Codec<eko> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, eko::new)
   );
   private final List<Pair<ij<dik>, cnn>> c;
   private final boolean d;

   eko(List<elu> $$0, List<Pair<ij<dik>, cnn>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected coz a(coz $$0, eiv $$1) {
      sw $$2 = cms.a($$0);
      if ($$2 == null) {
         $$2 = new sw();
      }

      dik.a $$3 = new dik.a();
      this.c.forEach($$3::a);
      tc $$4 = $$3.a();
      tc $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cms.a($$0, div.t, $$2);
      return $$0;
   }

   @Override
   public ekj b() {
      return ekk.y;
   }

   public static eko.a a(boolean $$0) {
      return new eko.a($$0);
   }

   public static class a extends ekh.a<eko.a> {
      private final Builder<Pair<ij<dik>, cnn>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eko.a a() {
         return this;
      }

      @Override
      public eki b() {
         return new eko(this.g(), this.a.build(), this.b);
      }

      public eko.a a(aix<dik> $$0, cnn $$1) {
         return this.a(kf.am.f($$0), $$1);
      }

      public eko.a a(ij<dik> $$0, cnn $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
