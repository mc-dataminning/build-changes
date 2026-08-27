import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eed extends edw {
   private static final Codec<Pair<he<dcq>, chz>> b = Codec.mapPair(jb.am.r().fieldOf("pattern"), chz.q.fieldOf("color")).codec();
   public static final Codec<eed> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, eed::new)
   );
   private final List<Pair<he<dcq>, chz>> c;
   private final boolean d;

   eed(List<efj> $$0, List<Pair<he<dcq>, chz>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cjl a(cjl $$0, eck $$1) {
      qw $$2 = che.a($$0);
      if ($$2 == null) {
         $$2 = new qw();
      }

      dcq.a $$3 = new dcq.a();
      this.c.forEach($$3::a);
      rc $$4 = $$3.a();
      rc $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      che.a($$0, ddb.t, $$2);
      return $$0;
   }

   @Override
   public edy b() {
      return edz.y;
   }

   public static eed.a a(boolean $$0) {
      return new eed.a($$0);
   }

   public static class a extends edw.a<eed.a> {
      private final Builder<Pair<he<dcq>, chz>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eed.a a() {
         return this;
      }

      @Override
      public edx b() {
         return new eed(this.g(), this.a.build(), this.b);
      }

      public eed.a a(aey<dcq> $$0, chz $$1) {
         return this.a(jb.am.f($$0), $$1);
      }

      public eed.a a(he<dcq> $$0, chz $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
