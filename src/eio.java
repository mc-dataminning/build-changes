import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eio extends eih {
   private static final Codec<Pair<ih<dgl>, cll>> b = Codec.mapPair(kd.am.r().fieldOf("pattern"), cll.q.fieldOf("color")).codec();
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, eio::new)
   );
   private final List<Pair<ih<dgl>, cll>> c;
   private final boolean d;

   eio(List<eju> $$0, List<Pair<ih<dgl>, cll>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cmx a(cmx $$0, egv $$1) {
      sn $$2 = ckq.a($$0);
      if ($$2 == null) {
         $$2 = new sn();
      }

      dgl.a $$3 = new dgl.a();
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
      ckq.a($$0, dgw.t, $$2);
      return $$0;
   }

   @Override
   public eij b() {
      return eik.y;
   }

   public static eio.a a(boolean $$0) {
      return new eio.a($$0);
   }

   public static class a extends eih.a<eio.a> {
      private final Builder<Pair<ih<dgl>, cll>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eio.a a() {
         return this;
      }

      @Override
      public eii b() {
         return new eio(this.g(), this.a.build(), this.b);
      }

      public eio.a a(ahf<dgl> $$0, cll $$1) {
         return this.a(kd.am.f($$0), $$1);
      }

      public eio.a a(ih<dgl> $$0, cll $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
