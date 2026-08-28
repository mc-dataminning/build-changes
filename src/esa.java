import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class esa extends erp {
   public static final MapCodec<esa> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqb.e.fieldOf("component").forGetter($$0x -> $$0x.b), eqr.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, esa::new)
   );
   private final eqa<?> b;
   private final List<eqt> c;

   esa(List<etn> $$0, eqa<?> $$1, List<eqt> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public err<esa> b() {
      return ers.t;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Builder<cuk> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eqi.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(eqj $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static esa.a a(eqa<?> $$0) {
      return new esa.a($$0);
   }

   public static class a extends erp.a<esa.a> {
      private final com.google.common.collect.ImmutableList.Builder<eqt> a = ImmutableList.builder();
      private final eqa<?> b;

      public a(eqa<?> $$0) {
         this.b = $$0;
      }

      protected esa.a a() {
         return this;
      }

      public esa.a a(eqt.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public erq b() {
         return new esa(this.g(), this.b, this.a.build());
      }
   }
}
