import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class ewk extends ewa {
   public static final MapCodec<ewk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eul.e.fieldOf("component").forGetter($$0x -> $$0x.b), evb.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewk::new)
   );
   private final euk<?> b;
   private final List<evd> c;

   ewk(List<exy> $$0, euk<?> $$1, List<evd> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public ewc<ewk> b() {
      return ewd.t;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cwm> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eus.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(eut $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static ewk.a a(euk<?> $$0) {
      return new ewk.a($$0);
   }

   public static class a extends ewa.a<ewk.a> {
      private final com.google.common.collect.ImmutableList.Builder<evd> a = ImmutableList.builder();
      private final euk<?> b;

      public a(euk<?> $$0) {
         this.b = $$0;
      }

      protected ewk.a a() {
         return this;
      }

      public ewk.a a(evd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewb b() {
         return new ewk(this.g(), this.b, this.a.build());
      }
   }
}
