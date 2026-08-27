import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eii extends eib {
   private static final Codec<Pair<ih<dgf>, clf>> b = Codec.mapPair(kd.am.r().fieldOf("pattern"), clf.q.fieldOf("color")).codec();
   public static final Codec<eii> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, eii::new)
   );
   private final List<Pair<ih<dgf>, clf>> c;
   private final boolean d;

   eii(List<ejo> $$0, List<Pair<ih<dgf>, clf>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cmr a(cmr $$0, egp $$1) {
      sl $$2 = ckk.a($$0);
      if ($$2 == null) {
         $$2 = new sl();
      }

      dgf.a $$3 = new dgf.a();
      this.c.forEach($$3::a);
      sr $$4 = $$3.a();
      sr $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      ckk.a($$0, dgq.t, $$2);
      return $$0;
   }

   @Override
   public eid b() {
      return eie.y;
   }

   public static eii.a a(boolean $$0) {
      return new eii.a($$0);
   }

   public static class a extends eib.a<eii.a> {
      private final Builder<Pair<ih<dgf>, clf>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eii.a a() {
         return this;
      }

      @Override
      public eic b() {
         return new eii(this.g(), this.a.build(), this.b);
      }

      public eii.a a(ahc<dgf> $$0, clf $$1) {
         return this.a(kd.am.f($$0), $$1);
      }

      public eii.a a(ih<dgf> $$0, clf $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
