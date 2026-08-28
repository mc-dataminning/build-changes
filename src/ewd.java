import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class ewd extends evt {
   public static final MapCodec<ewd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eue.e.fieldOf("component").forGetter($$0x -> $$0x.b), euu.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewd::new)
   );
   private final eud<?> b;
   private final List<euw> c;

   ewd(List<exr> $$0, eud<?> $$1, List<euw> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public evv<ewd> b() {
      return evw.t;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cwf> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eul.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(eum $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static ewd.a a(eud<?> $$0) {
      return new ewd.a($$0);
   }

   public static class a extends evt.a<ewd.a> {
      private final com.google.common.collect.ImmutableList.Builder<euw> a = ImmutableList.builder();
      private final eud<?> b;

      public a(eud<?> $$0) {
         this.b = $$0;
      }

      protected ewd.a a() {
         return this;
      }

      public ewd.a a(euw.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public evu b() {
         return new ewd(this.g(), this.b, this.a.build());
      }
   }
}
