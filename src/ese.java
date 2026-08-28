import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class ese extends ert {
   public static final MapCodec<ese> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqf.e.fieldOf("component").forGetter($$0x -> $$0x.b), eqv.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, ese::new)
   );
   private final eqe<?> b;
   private final List<eqx> c;

   ese(List<etr> $$0, eqe<?> $$1, List<eqx> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public erv<ese> b() {
      return erw.t;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Builder<cuo> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eqm.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(eqn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static ese.a a(eqe<?> $$0) {
      return new ese.a($$0);
   }

   public static class a extends ert.a<ese.a> {
      private final com.google.common.collect.ImmutableList.Builder<eqx> a = ImmutableList.builder();
      private final eqe<?> b;

      public a(eqe<?> $$0) {
         this.b = $$0;
      }

      protected ese.a a() {
         return this;
      }

      public ese.a a(eqx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eru b() {
         return new ese(this.g(), this.b, this.a.build());
      }
   }
}
