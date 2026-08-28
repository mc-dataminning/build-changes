import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class etm extends etc {
   public static final MapCodec<etm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ern.e.fieldOf("component").forGetter($$0x -> $$0x.b), esd.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, etm::new)
   );
   private final erm<?> b;
   private final List<esf> c;

   etm(List<eva> $$0, erm<?> $$1, List<esf> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public ete<etm> b() {
      return etf.t;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Builder<cuq> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eru.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(erv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static etm.a a(erm<?> $$0) {
      return new etm.a($$0);
   }

   public static class a extends etc.a<etm.a> {
      private final com.google.common.collect.ImmutableList.Builder<esf> a = ImmutableList.builder();
      private final erm<?> b;

      public a(erm<?> $$0) {
         this.b = $$0;
      }

      protected etm.a a() {
         return this;
      }

      public etm.a a(esf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public etd b() {
         return new etm(this.g(), this.b, this.a.build());
      }
   }
}
