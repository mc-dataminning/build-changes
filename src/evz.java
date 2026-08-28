import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class evz extends evp {
   public static final MapCodec<evz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eua.e.fieldOf("component").forGetter($$0x -> $$0x.b), euq.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, evz::new)
   );
   private final etz<?> b;
   private final List<eus> c;

   evz(List<exn> $$0, etz<?> $$1, List<eus> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public evr<evz> b() {
      return evs.t;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cwb> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(euh.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(eui $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static evz.a a(etz<?> $$0) {
      return new evz.a($$0);
   }

   public static class a extends evp.a<evz.a> {
      private final com.google.common.collect.ImmutableList.Builder<eus> a = ImmutableList.builder();
      private final etz<?> b;

      public a(etz<?> $$0) {
         this.b = $$0;
      }

      protected evz.a a() {
         return this;
      }

      public evz.a a(eus.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public evq b() {
         return new evz(this.g(), this.b, this.a.build());
      }
   }
}
