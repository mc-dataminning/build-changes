import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elr extends elk {
   private static final Codec<Pair<il<djc>, cog>> b = Codec.mapPair(kh.am.r().fieldOf("pattern"), cog.q.fieldOf("color")).codec();
   public static final Codec<elr> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, elr::new)
   );
   private final List<Pair<il<djc>, cog>> c;
   private final boolean d;

   elr(List<emx> $$0, List<Pair<il<djc>, cog>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cpq a(cpq $$0, ejy $$1) {
      sy $$2 = cnl.a($$0);
      if ($$2 == null) {
         $$2 = new sy();
      }

      djc.a $$3 = new djc.a();
      this.c.forEach($$3::a);
      te $$4 = $$3.a();
      te $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cnl.a($$0, djn.t, $$2);
      return $$0;
   }

   @Override
   public elm b() {
      return eln.y;
   }

   public static elr.a a(boolean $$0) {
      return new elr.a($$0);
   }

   public static class a extends elk.a<elr.a> {
      private final Builder<Pair<il<djc>, cog>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected elr.a a() {
         return this;
      }

      @Override
      public ell b() {
         return new elr(this.g(), this.a.build(), this.b);
      }

      public elr.a a(ajb<djc> $$0, cog $$1) {
         return this.a(kh.am.f($$0), $$1);
      }

      public elr.a a(il<djc> $$0, cog $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
