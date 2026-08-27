import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class era extends eqq {
   public static final MapCodec<era> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(le.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), ept.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, era::new)
   );
   private final ix<doi<?>> b;
   private final List<epv> c;

   era(List<esl> $$0, ix<doi<?>> $$1, List<epv> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eqs b() {
      return eqt.s;
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         jg<cto> $$2 = jg.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(epk.a($$1.d(), $$2::add), $$1)));
         $$0.b(kb.Z, cwk.a($$2));
         return $$0;
      }
   }

   @Override
   public void a(epl $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static era.a a(doi<?> $$0) {
      return new era.a($$0);
   }

   public static class a extends eqq.a<era.a> {
      private final Builder<epv> a = ImmutableList.builder();
      private final doi<?> b;

      public a(doi<?> $$0) {
         this.b = $$0;
      }

      protected era.a a() {
         return this;
      }

      public era.a a(epv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqr b() {
         return new era(this.g(), this.b.a(), this.a.build());
      }
   }
}
