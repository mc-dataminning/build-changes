import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eea extends edt {
   private static final Codec<Pair<he<dcd>, chm>> b = Codec.mapPair(jb.al.r().fieldOf("pattern"), chm.q.fieldOf("color")).codec();
   public static final Codec<eea> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, eea::new)
   );
   private final List<Pair<he<dcd>, chm>> c;
   private final boolean d;

   eea(List<efg> $$0, List<Pair<he<dcd>, chm>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected ciy a(ciy $$0, ech $$1) {
      qr $$2 = cgr.a($$0);
      if ($$2 == null) {
         $$2 = new qr();
      }

      dcd.a $$3 = new dcd.a();
      this.c.forEach($$3::a);
      qx $$4 = $$3.a();
      qx $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cgr.a($$0, dco.t, $$2);
      return $$0;
   }

   @Override
   public edv b() {
      return edw.y;
   }

   public static eea.a a(boolean $$0) {
      return new eea.a($$0);
   }

   public static class a extends edt.a<eea.a> {
      private final Builder<Pair<he<dcd>, chm>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected eea.a a() {
         return this;
      }

      @Override
      public edu b() {
         return new eea(this.g(), this.a.build(), this.b);
      }

      public eea.a a(aeq<dcd> $$0, chm $$1) {
         return this.a(jb.al.f($$0), $$1);
      }

      public eea.a a(he<dcd> $$0, chm $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
