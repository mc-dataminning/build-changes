import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekv extends eko {
   private static final Codec<Pair<ij<dio>, cnr>> b = Codec.mapPair(kf.am.r().fieldOf("pattern"), cnr.q.fieldOf("color")).codec();
   public static final Codec<ekv> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, ekv::new)
   );
   private final List<Pair<ij<dio>, cnr>> c;
   private final boolean d;

   ekv(List<emb> $$0, List<Pair<ij<dio>, cnr>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cpd a(cpd $$0, ejc $$1) {
      sw $$2 = cmw.a($$0);
      if ($$2 == null) {
         $$2 = new sw();
      }

      dio.a $$3 = new dio.a();
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
      cmw.a($$0, diz.t, $$2);
      return $$0;
   }

   @Override
   public ekq b() {
      return ekr.y;
   }

   public static ekv.a a(boolean $$0) {
      return new ekv.a($$0);
   }

   public static class a extends eko.a<ekv.a> {
      private final Builder<Pair<ij<dio>, cnr>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected ekv.a a() {
         return this;
      }

      @Override
      public ekp b() {
         return new ekv(this.g(), this.a.build(), this.b);
      }

      public ekv.a a(aix<dio> $$0, cnr $$1) {
         return this.a(kf.am.f($$0), $$1);
      }

      public ekv.a a(ij<dio> $$0, cnr $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
