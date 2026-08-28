import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class esg extends erv {
   public static final MapCodec<esg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqh.e.fieldOf("component").forGetter($$0x -> $$0x.b), eqx.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, esg::new)
   );
   private final eqg<?> b;
   private final List<eqz> c;

   esg(List<ett> $$0, eqg<?> $$1, List<eqz> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public erx<esg> b() {
      return ery.t;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Builder<cuq> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eqo.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(eqp $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static esg.a a(eqg<?> $$0) {
      return new esg.a($$0);
   }

   public static class a extends erv.a<esg.a> {
      private final com.google.common.collect.ImmutableList.Builder<eqz> a = ImmutableList.builder();
      private final eqg<?> b;

      public a(eqg<?> $$0) {
         this.b = $$0;
      }

      protected esg.a a() {
         return this;
      }

      public esg.a a(eqz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public erw b() {
         return new esg(this.g(), this.b, this.a.build());
      }
   }
}
