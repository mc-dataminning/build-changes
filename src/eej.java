import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eej extends eec {
   private static final Codec<Pair<hg<dcm>, cht>> b = Codec.mapPair(jd.al.r().fieldOf("pattern"), cht.q.fieldOf("color")).codec();
   public static final Codec<eej> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, eej::new)
   );
   private final List<Pair<hg<dcm>, cht>> c;
   private final boolean d;

   eej(List<efp> $$0, List<Pair<hg<dcm>, cht>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cjf a(cjf $$0, ecq $$1) {
      qy $$2 = cgy.a($$0);
      if ($$2 == null) {
         $$2 = new qy();
      }

      dcm.a $$3 = new dcm.a();
      this.c.forEach($$3::a);
      re $$4 = $$3.a();
      re $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cgy.a($$0, dcx.t, $$2);
      return $$0;
   }

   @Override
   public eee b() {
      return eef.y;
   }

   public static eej.a a(boolean $$0) {
      return new eej.a($$0);
   }

   public static class a extends eec.a<eej.a> {
      private final Builder<Pair<hg<dcm>, cht>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eej.a a() {
         return this;
      }

      @Override
      public eed b() {
         return new eej(this.g(), this.a.build(), this.b);
      }

      public eej.a a(aew<dcm> $$0, cht $$1) {
         return this.a(jd.al.f($$0), $$1);
      }

      public eej.a a(hg<dcm> $$0, cht $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
