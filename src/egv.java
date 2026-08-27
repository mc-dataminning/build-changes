import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egv extends ego {
   private static final Codec<Pair<ig<dez>, ckc>> b = Codec.mapPair(kc.an.r().fieldOf("pattern"), ckc.q.fieldOf("color")).codec();
   public static final Codec<egv> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, egv::new)
   );
   private final List<Pair<ig<dez>, ckc>> c;
   private final boolean d;

   egv(List<eib> $$0, List<Pair<ig<dez>, ckc>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected clo a(clo $$0, efc $$1) {
      sd $$2 = cjh.a($$0);
      if ($$2 == null) {
         $$2 = new sd();
      }

      dez.a $$3 = new dez.a();
      this.c.forEach($$3::a);
      sj $$4 = $$3.a();
      sj $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cjh.a($$0, dfk.t, $$2);
      return $$0;
   }

   @Override
   public egq b() {
      return egr.y;
   }

   public static egv.a a(boolean $$0) {
      return new egv.a($$0);
   }

   public static class a extends ego.a<egv.a> {
      private final Builder<Pair<ig<dez>, ckc>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected egv.a a() {
         return this;
      }

      @Override
      public egp b() {
         return new egv(this.g(), this.a.build(), this.b);
      }

      public egv.a a(agl<dez> $$0, ckc $$1) {
         return this.a(kc.an.f($$0), $$1);
      }

      public egv.a a(ig<dez> $$0, ckc $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
