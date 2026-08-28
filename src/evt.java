import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class evt extends evj {
   public static final MapCodec<evt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(etu.e.fieldOf("component").forGetter($$0x -> $$0x.b), euk.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, evt::new)
   );
   private final ett<?> b;
   private final List<eum> c;

   evt(List<exh> $$0, ett<?> $$1, List<eum> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public evl<evt> b() {
      return evm.t;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cvx> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eub.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(euc $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static evt.a a(ett<?> $$0) {
      return new evt.a($$0);
   }

   public static class a extends evj.a<evt.a> {
      private final com.google.common.collect.ImmutableList.Builder<eum> a = ImmutableList.builder();
      private final ett<?> b;

      public a(ett<?> $$0) {
         this.b = $$0;
      }

      protected evt.a a() {
         return this;
      }

      public evt.a a(eum.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public evk b() {
         return new evt(this.g(), this.b, this.a.build());
      }
   }
}
