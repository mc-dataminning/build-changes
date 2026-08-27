import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egq extends egj {
   private static final Codec<Pair<ib<deu>, cjx>> b = Codec.mapPair(jy.an.r().fieldOf("pattern"), cjx.q.fieldOf("color")).codec();
   public static final Codec<egq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, egq::new)
   );
   private final List<Pair<ib<deu>, cjx>> c;
   private final boolean d;

   egq(List<ehw> $$0, List<Pair<ib<deu>, cjx>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected clj a(clj $$0, eex $$1) {
      rz $$2 = cjc.a($$0);
      if ($$2 == null) {
         $$2 = new rz();
      }

      deu.a $$3 = new deu.a();
      this.c.forEach($$3::a);
      sf $$4 = $$3.a();
      sf $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cjc.a($$0, dff.t, $$2);
      return $$0;
   }

   @Override
   public egl b() {
      return egm.y;
   }

   public static egq.a a(boolean $$0) {
      return new egq.a($$0);
   }

   public static class a extends egj.a<egq.a> {
      private final Builder<Pair<ib<deu>, cjx>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected egq.a a() {
         return this;
      }

      @Override
      public egk b() {
         return new egq(this.g(), this.a.build(), this.b);
      }

      public egq.a a(agh<deu> $$0, cjx $$1) {
         return this.a(jy.an.f($$0), $$1);
      }

      public egq.a a(ib<deu> $$0, cjx $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
