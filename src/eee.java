import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eee extends edx {
   private static final Codec<Pair<hg<dch>, cho>> b = Codec.mapPair(jd.al.r().fieldOf("pattern"), cho.q.fieldOf("color")).codec();
   public static final Codec<eee> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, eee::new)
   );
   private final List<Pair<hg<dch>, cho>> c;
   private final boolean d;

   eee(List<efk> $$0, List<Pair<hg<dch>, cho>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cja a(cja $$0, ecl $$1) {
      qu $$2 = cgt.a($$0);
      if ($$2 == null) {
         $$2 = new qu();
      }

      dch.a $$3 = new dch.a();
      this.c.forEach($$3::a);
      ra $$4 = $$3.a();
      ra $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cgt.a($$0, dcs.t, $$2);
      return $$0;
   }

   @Override
   public edz b() {
      return eea.y;
   }

   public static eee.a a(boolean $$0) {
      return new eee.a($$0);
   }

   public static class a extends edx.a<eee.a> {
      private final Builder<Pair<hg<dch>, cho>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eee.a a() {
         return this;
      }

      @Override
      public edy b() {
         return new eee(this.g(), this.a.build(), this.b);
      }

      public eee.a a(aet<dch> $$0, cho $$1) {
         return this.a(jd.al.f($$0), $$1);
      }

      public eee.a a(hg<dch> $$0, cho $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
