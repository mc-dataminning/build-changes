import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class ezi extends eyy {
   public static final MapCodec<ezi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(exj.e.fieldOf("component").forGetter($$0x -> $$0x.b), exz.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, ezi::new)
   );
   private final exi<?> b;
   private final List<eyb> c;

   ezi(List<fau> $$0, exi<?> $$1, List<eyb> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eza<ezi> b() {
      return ezb.t;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cxy> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(exq.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(exr $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static ezi.a a(exi<?> $$0) {
      return new ezi.a($$0);
   }

   public static class a extends eyy.a<ezi.a> {
      private final com.google.common.collect.ImmutableList.Builder<eyb> a = ImmutableList.builder();
      private final exi<?> b;

      public a(exi<?> $$0) {
         this.b = $$0;
      }

      protected ezi.a a() {
         return this;
      }

      public ezi.a a(eyb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eyz b() {
         return new ezi(this.g(), this.b, this.a.build());
      }
   }
}
