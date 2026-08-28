import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class eve extends euu {
   public static final MapCodec<eve> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(etf.e.fieldOf("component").forGetter($$0x -> $$0x.b), etv.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eve::new)
   );
   private final ete<?> b;
   private final List<etx> c;

   eve(List<ews> $$0, ete<?> $$1, List<etx> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public euw<eve> b() {
      return eux.t;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cvp> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(etm.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(etn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eve.a a(ete<?> $$0) {
      return new eve.a($$0);
   }

   public static class a extends euu.a<eve.a> {
      private final com.google.common.collect.ImmutableList.Builder<etx> a = ImmutableList.builder();
      private final ete<?> b;

      public a(ete<?> $$0) {
         this.b = $$0;
      }

      protected eve.a a() {
         return this;
      }

      public eve.a a(etx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public euv b() {
         return new eve(this.g(), this.b, this.a.build());
      }
   }
}
