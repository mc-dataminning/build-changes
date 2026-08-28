import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class eyl extends eyb {
   public static final MapCodec<eyl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ewm.e.fieldOf("component").forGetter($$0x -> $$0x.b), exc.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eyl::new)
   );
   private final ewl<?> b;
   private final List<exe> c;

   eyl(List<ezx> $$0, ewl<?> $$1, List<exe> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eyd<eyl> b() {
      return eye.t;
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cxh> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ewt.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(ewu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eyl.a a(ewl<?> $$0) {
      return new eyl.a($$0);
   }

   public static class a extends eyb.a<eyl.a> {
      private final com.google.common.collect.ImmutableList.Builder<exe> a = ImmutableList.builder();
      private final ewl<?> b;

      public a(ewl<?> $$0) {
         this.b = $$0;
      }

      protected eyl.a a() {
         return this;
      }

      public eyl.a a(exe.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eyc b() {
         return new eyl(this.g(), this.b, this.a.build());
      }
   }
}
