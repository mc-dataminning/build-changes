import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class exp extends exf {
   public static final MapCodec<exp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evq.e.fieldOf("component").forGetter($$0x -> $$0x.b), ewg.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, exp::new)
   );
   private final evp<?> b;
   private final List<ewi> c;

   exp(List<ezb> $$0, evp<?> $$1, List<ewi> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public exh<exp> b() {
      return exi.t;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cwq> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(evx.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(evy $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static exp.a a(evp<?> $$0) {
      return new exp.a($$0);
   }

   public static class a extends exf.a<exp.a> {
      private final com.google.common.collect.ImmutableList.Builder<ewi> a = ImmutableList.builder();
      private final evp<?> b;

      public a(evp<?> $$0) {
         this.b = $$0;
      }

      protected exp.a a() {
         return this;
      }

      public exp.a a(ewi.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public exg b() {
         return new exp(this.g(), this.b, this.a.build());
      }
   }
}
