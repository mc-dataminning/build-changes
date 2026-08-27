import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehx extends ehq {
   private static final Codec<Pair<ie<dfu>, ckv>> b = Codec.mapPair(kb.am.r().fieldOf("pattern"), ckv.q.fieldOf("color")).codec();
   public static final Codec<ehx> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, ehx::new)
   );
   private final List<Pair<ie<dfu>, ckv>> c;
   private final boolean d;

   ehx(List<ejd> $$0, List<Pair<ie<dfu>, ckv>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cmh a(cmh $$0, ege $$1) {
      sj $$2 = cka.a($$0);
      if ($$2 == null) {
         $$2 = new sj();
      }

      dfu.a $$3 = new dfu.a();
      this.c.forEach($$3::a);
      sp $$4 = $$3.a();
      sp $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cka.a($$0, dgf.t, $$2);
      return $$0;
   }

   @Override
   public ehs b() {
      return eht.y;
   }

   public static ehx.a a(boolean $$0) {
      return new ehx.a($$0);
   }

   public static class a extends ehq.a<ehx.a> {
      private final Builder<Pair<ie<dfu>, ckv>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected ehx.a a() {
         return this;
      }

      @Override
      public ehr b() {
         return new ehx(this.g(), this.a.build(), this.b);
      }

      public ehx.a a(ags<dfu> $$0, ckv $$1) {
         return this.a(kb.am.f($$0), $$1);
      }

      public ehx.a a(ie<dfu> $$0, ckv $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
