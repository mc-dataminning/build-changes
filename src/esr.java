import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class esr extends esh {
   public static final MapCodec<esr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqs.e.fieldOf("component").forGetter($$0x -> $$0x.b), eri.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, esr::new)
   );
   private final eqr<?> b;
   private final List<erk> c;

   esr(List<euf> $$0, eqr<?> $$1, List<erk> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public esj<esr> b() {
      return esk.t;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Builder<cuc> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eqz.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(era $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static esr.a a(eqr<?> $$0) {
      return new esr.a($$0);
   }

   public static class a extends esh.a<esr.a> {
      private final com.google.common.collect.ImmutableList.Builder<erk> a = ImmutableList.builder();
      private final eqr<?> b;

      public a(eqr<?> $$0) {
         this.b = $$0;
      }

      protected esr.a a() {
         return this;
      }

      public esr.a a(erk.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esi b() {
         return new esr(this.g(), this.b, this.a.build());
      }
   }
}
