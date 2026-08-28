import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class est extends esj {
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(equ.e.fieldOf("component").forGetter($$0x -> $$0x.b), erk.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, est::new)
   );
   private final eqt<?> b;
   private final List<erm> c;

   est(List<euh> $$0, eqt<?> $$1, List<erm> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public esl<est> b() {
      return esm.t;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Builder<cud> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(erb.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(erc $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static est.a a(eqt<?> $$0) {
      return new est.a($$0);
   }

   public static class a extends esj.a<est.a> {
      private final com.google.common.collect.ImmutableList.Builder<erm> a = ImmutableList.builder();
      private final eqt<?> b;

      public a(eqt<?> $$0) {
         this.b = $$0;
      }

      protected est.a a() {
         return this;
      }

      public est.a a(erm.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esk b() {
         return new est(this.g(), this.b, this.a.build());
      }
   }
}
