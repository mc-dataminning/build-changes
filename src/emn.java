import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emn extends emg {
   private static final Codec<Pair<il<djx>, cpb>> b = Codec.mapPair(ki.am.r().fieldOf("pattern"), cpb.q.fieldOf("color")).codec();
   public static final Codec<emn> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, emn::new)
   );
   private final List<Pair<il<djx>, cpb>> c;
   private final boolean d;

   emn(List<ent> $$0, List<Pair<il<djx>, cpb>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cqk a(cqk $$0, eku $$1) {
      ta $$2 = cof.a($$0);
      if ($$2 == null) {
         $$2 = new ta();
      }

      djx.a $$3 = new djx.a();
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
      cof.a($$0, dki.t, $$2);
      return $$0;
   }

   @Override
   public emi b() {
      return emj.y;
   }

   public static emn.a a(boolean $$0) {
      return new emn.a($$0);
   }

   public static class a extends emg.a<emn.a> {
      private final Builder<Pair<il<djx>, cpb>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected emn.a a() {
         return this;
      }

      @Override
      public emh b() {
         return new emn(this.g(), this.a.build(), this.b);
      }

      public emn.a a(ajg<djx> $$0, cpb $$1) {
         return this.a(ki.am.g($$0), $$1);
      }

      public emn.a a(il<djx> $$0, cpb $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
