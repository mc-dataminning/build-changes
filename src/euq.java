import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class euq extends eug {
   public static final MapCodec<euq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(esr.e.fieldOf("component").forGetter($$0x -> $$0x.b), eth.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, euq::new)
   );
   private final esq<?> b;
   private final List<etj> c;

   euq(List<ewe> $$0, esq<?> $$1, List<etj> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eui<euq> b() {
      return euj.t;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cvl> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(esy.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(esz $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static euq.a a(esq<?> $$0) {
      return new euq.a($$0);
   }

   public static class a extends eug.a<euq.a> {
      private final com.google.common.collect.ImmutableList.Builder<etj> a = ImmutableList.builder();
      private final esq<?> b;

      public a(esq<?> $$0) {
         this.b = $$0;
      }

      protected euq.a a() {
         return this;
      }

      public euq.a a(etj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public euh b() {
         return new euq(this.g(), this.b, this.a.build());
      }
   }
}
