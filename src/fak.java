import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class fak extends faa {
   public static final MapCodec<fak> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyl.e.fieldOf("component").forGetter($$0x -> $$0x.b), ezb.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, fak::new)
   );
   private final eyk<?> b;
   private final List<ezd> c;

   fak(List<fbw> $$0, eyk<?> $$1, List<ezd> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fac<fak> b() {
      return fad.t;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cys> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eys.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(eyt $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static fak.a a(eyk<?> $$0) {
      return new fak.a($$0);
   }

   public static class a extends faa.a<fak.a> {
      private final com.google.common.collect.ImmutableList.Builder<ezd> a = ImmutableList.builder();
      private final eyk<?> b;

      public a(eyk<?> $$0) {
         this.b = $$0;
      }

      protected fak.a a() {
         return this;
      }

      public fak.a a(ezd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fab b() {
         return new fak(this.g(), this.b, this.a.build());
      }
   }
}
