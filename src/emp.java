import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emp extends emi {
   private static final Codec<Pair<il<djz>, cpd>> b = Codec.mapPair(ki.am.r().fieldOf("pattern"), cpd.q.fieldOf("color")).codec();
   public static final Codec<emp> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, emp::new)
   );
   private final List<Pair<il<djz>, cpd>> c;
   private final boolean d;

   emp(List<env> $$0, List<Pair<il<djz>, cpd>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cqm a(cqm $$0, ekw $$1) {
      ta $$2 = coh.a($$0);
      if ($$2 == null) {
         $$2 = new ta();
      }

      djz.a $$3 = new djz.a();
      this.c.forEach($$3::a);
      tg $$4 = $$3.a();
      tg $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      coh.a($$0, dkk.t, $$2);
      return $$0;
   }

   @Override
   public emk b() {
      return eml.y;
   }

   public static emp.a a(boolean $$0) {
      return new emp.a($$0);
   }

   public static class a extends emi.a<emp.a> {
      private final Builder<Pair<il<djz>, cpd>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected emp.a a() {
         return this;
      }

      @Override
      public emj b() {
         return new emp(this.g(), this.a.build(), this.b);
      }

      public emp.a a(ajg<djz> $$0, cpd $$1) {
         return this.a(ki.am.g($$0), $$1);
      }

      public emp.a a(il<djz> $$0, cpd $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
