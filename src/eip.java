import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eip extends eii {
   private static final Codec<Pair<ih<dgm>, clm>> b = Codec.mapPair(kd.am.r().fieldOf("pattern"), clm.q.fieldOf("color")).codec();
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, eip::new)
   );
   private final List<Pair<ih<dgm>, clm>> c;
   private final boolean d;

   eip(List<ejv> $$0, List<Pair<ih<dgm>, clm>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cmy a(cmy $$0, egw $$1) {
      sn $$2 = ckr.a($$0);
      if ($$2 == null) {
         $$2 = new sn();
      }

      dgm.a $$3 = new dgm.a();
      this.c.forEach($$3::a);
      st $$4 = $$3.a();
      st $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      ckr.a($$0, dgx.t, $$2);
      return $$0;
   }

   @Override
   public eik b() {
      return eil.y;
   }

   public static eip.a a(boolean $$0) {
      return new eip.a($$0);
   }

   public static class a extends eii.a<eip.a> {
      private final Builder<Pair<ih<dgm>, clm>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eip.a a() {
         return this;
      }

      @Override
      public eij b() {
         return new eip(this.g(), this.a.build(), this.b);
      }

      public eip.a a(ahf<dgm> $$0, clm $$1) {
         return this.a(kd.am.f($$0), $$1);
      }

      public eip.a a(ih<dgm> $$0, clm $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
