import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class eti extends esy {
   public static final MapCodec<eti> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(erj.e.fieldOf("component").forGetter($$0x -> $$0x.b), erz.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eti::new)
   );
   private final eri<?> b;
   private final List<esb> c;

   eti(List<euw> $$0, eri<?> $$1, List<esb> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eta<eti> b() {
      return etb.t;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Builder<cuo> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(erq.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(err $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eti.a a(eri<?> $$0) {
      return new eti.a($$0);
   }

   public static class a extends esy.a<eti.a> {
      private final com.google.common.collect.ImmutableList.Builder<esb> a = ImmutableList.builder();
      private final eri<?> b;

      public a(eri<?> $$0) {
         this.b = $$0;
      }

      protected eti.a a() {
         return this;
      }

      public eti.a a(esb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esz b() {
         return new eti(this.g(), this.b, this.a.build());
      }
   }
}
