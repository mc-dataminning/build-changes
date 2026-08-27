import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ege extends efx {
   private static final Codec<Pair<ib<dei>, cjp>> b = Codec.mapPair(jy.an.r().fieldOf("pattern"), cjp.q.fieldOf("color")).codec();
   public static final Codec<ege> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, ege::new)
   );
   private final List<Pair<ib<dei>, cjp>> c;
   private final boolean d;

   ege(List<ehk> $$0, List<Pair<ib<dei>, cjp>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected clb a(clb $$0, eel $$1) {
      rz $$2 = ciu.a($$0);
      if ($$2 == null) {
         $$2 = new rz();
      }

      dei.a $$3 = new dei.a();
      this.c.forEach($$3::a);
      sf $$4 = $$3.a();
      sf $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      ciu.a($$0, det.t, $$2);
      return $$0;
   }

   @Override
   public efz b() {
      return ega.y;
   }

   public static ege.a a(boolean $$0) {
      return new ege.a($$0);
   }

   public static class a extends efx.a<ege.a> {
      private final Builder<Pair<ib<dei>, cjp>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected ege.a a() {
         return this;
      }

      @Override
      public efy b() {
         return new ege(this.g(), this.a.build(), this.b);
      }

      public ege.a a(agf<dei> $$0, cjp $$1) {
         return this.a(jy.an.f($$0), $$1);
      }

      public ege.a a(ib<dei> $$0, cjp $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
