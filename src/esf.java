import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class esf extends eru {
   public static final MapCodec<esf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqg.e.fieldOf("component").forGetter($$0x -> $$0x.b), eqw.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, esf::new)
   );
   private final eqf<?> b;
   private final List<eqy> c;

   esf(List<ets> $$0, eqf<?> $$1, List<eqy> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public erw<esf> b() {
      return erx.t;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Builder<cup> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eqn.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(eqo $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static esf.a a(eqf<?> $$0) {
      return new esf.a($$0);
   }

   public static class a extends eru.a<esf.a> {
      private final com.google.common.collect.ImmutableList.Builder<eqy> a = ImmutableList.builder();
      private final eqf<?> b;

      public a(eqf<?> $$0) {
         this.b = $$0;
      }

      protected esf.a a() {
         return this;
      }

      public esf.a a(eqy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public erv b() {
         return new esf(this.g(), this.b, this.a.build());
      }
   }
}
