import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eiy extends eir {
   private static final Codec<Pair<ih<dgu>, clv>> b = Codec.mapPair(kd.am.r().fieldOf("pattern"), clv.q.fieldOf("color")).codec();
   public static final Codec<eiy> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, eiy::new)
   );
   private final List<Pair<ih<dgu>, clv>> c;
   private final boolean d;

   eiy(List<eke> $$0, List<Pair<ih<dgu>, clv>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cng a(cng $$0, ehf $$1) {
      so $$2 = cla.a($$0);
      if ($$2 == null) {
         $$2 = new so();
      }

      dgu.a $$3 = new dgu.a();
      this.c.forEach($$3::a);
      su $$4 = $$3.a();
      su $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cla.a($$0, dhf.t, $$2);
      return $$0;
   }

   @Override
   public eit b() {
      return eiu.y;
   }

   public static eiy.a a(boolean $$0) {
      return new eiy.a($$0);
   }

   public static class a extends eir.a<eiy.a> {
      private final Builder<Pair<ih<dgu>, clv>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eiy.a a() {
         return this;
      }

      @Override
      public eis b() {
         return new eiy(this.g(), this.a.build(), this.b);
      }

      public eiy.a a(ahg<dgu> $$0, clv $$1) {
         return this.a(kd.am.f($$0), $$1);
      }

      public eiy.a a(ih<dgu> $$0, clv $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
