import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efb extends eeu {
   private static final Codec<Pair<ib<ddo>, cix>> b = Codec.mapPair(jy.am.r().fieldOf("pattern"), cix.q.fieldOf("color")).codec();
   public static final Codec<efb> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, efb::new)
   );
   private final List<Pair<ib<ddo>, cix>> c;
   private final boolean d;

   efb(List<egh> $$0, List<Pair<ib<ddo>, cix>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected ckj a(ckj $$0, edi $$1) {
      rt $$2 = cic.a($$0);
      if ($$2 == null) {
         $$2 = new rt();
      }

      ddo.a $$3 = new ddo.a();
      this.c.forEach($$3::a);
      rz $$4 = $$3.a();
      rz $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cic.a($$0, ddz.t, $$2);
      return $$0;
   }

   @Override
   public eew b() {
      return eex.y;
   }

   public static efb.a a(boolean $$0) {
      return new efb.a($$0);
   }

   public static class a extends eeu.a<efb.a> {
      private final Builder<Pair<ib<ddo>, cix>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected efb.a a() {
         return this;
      }

      @Override
      public eev b() {
         return new efb(this.g(), this.a.build(), this.b);
      }

      public efb.a a(afv<ddo> $$0, cix $$1) {
         return this.a(jy.am.f($$0), $$1);
      }

      public efb.a a(ib<ddo> $$0, cix $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
