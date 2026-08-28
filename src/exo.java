import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class exo extends exe {
   public static final MapCodec<exo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evp.e.fieldOf("component").forGetter($$0x -> $$0x.b), ewf.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, exo::new)
   );
   private final evo<?> b;
   private final List<ewh> c;

   exo(List<eza> $$0, evo<?> $$1, List<ewh> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public exg<exo> b() {
      return exh.t;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cwp> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(evw.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(evx $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static exo.a a(evo<?> $$0) {
      return new exo.a($$0);
   }

   public static class a extends exe.a<exo.a> {
      private final com.google.common.collect.ImmutableList.Builder<ewh> a = ImmutableList.builder();
      private final evo<?> b;

      public a(evo<?> $$0) {
         this.b = $$0;
      }

      protected exo.a a() {
         return this;
      }

      public exo.a a(ewh.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public exf b() {
         return new exo(this.g(), this.b, this.a.build());
      }
   }
}
