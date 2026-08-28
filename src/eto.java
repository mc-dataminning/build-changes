import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class eto extends ete {
   public static final MapCodec<eto> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(erp.e.fieldOf("component").forGetter($$0x -> $$0x.b), esf.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eto::new)
   );
   private final ero<?> b;
   private final List<esh> c;

   eto(List<evc> $$0, ero<?> $$1, List<esh> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public etg<eto> b() {
      return eth.t;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Builder<cuq> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(erw.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(erx $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eto.a a(ero<?> $$0) {
      return new eto.a($$0);
   }

   public static class a extends ete.a<eto.a> {
      private final com.google.common.collect.ImmutableList.Builder<esh> a = ImmutableList.builder();
      private final ero<?> b;

      public a(ero<?> $$0) {
         this.b = $$0;
      }

      protected eto.a a() {
         return this;
      }

      public eto.a a(esh.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public etf b() {
         return new eto(this.g(), this.b, this.a.build());
      }
   }
}
