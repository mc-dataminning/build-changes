import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class eye extends exu {
   public static final MapCodec<eye> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ewf.e.fieldOf("component").forGetter($$0x -> $$0x.b), ewv.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eye::new)
   );
   private final ewe<?> b;
   private final List<ewx> c;

   eye(List<ezs> $$0, ewe<?> $$1, List<ewx> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public exw<eye> b() {
      return exx.t;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cxk> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ewm.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(ewn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eye.a a(ewe<?> $$0) {
      return new eye.a($$0);
   }

   public static class a extends exu.a<eye.a> {
      private final com.google.common.collect.ImmutableList.Builder<ewx> a = ImmutableList.builder();
      private final ewe<?> b;

      public a(ewe<?> $$0) {
         this.b = $$0;
      }

      protected eye.a a() {
         return this;
      }

      public eye.a a(ewx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public exv b() {
         return new eye(this.g(), this.b, this.a.build());
      }
   }
}
