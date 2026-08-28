import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class faw extends fam {
   public static final MapCodec<faw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyx.e.fieldOf("component").forGetter($$0x -> $$0x.b), ezn.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, faw::new)
   );
   private final eyw<?> b;
   private final List<ezp> c;

   faw(List<fci> $$0, eyw<?> $$1, List<ezp> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fao<faw> b() {
      return fap.t;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cyy> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eze.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(ezf $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static faw.a a(eyw<?> $$0) {
      return new faw.a($$0);
   }

   public static class a extends fam.a<faw.a> {
      private final com.google.common.collect.ImmutableList.Builder<ezp> a = ImmutableList.builder();
      private final eyw<?> b;

      public a(eyw<?> $$0) {
         this.b = $$0;
      }

      protected faw.a a() {
         return this;
      }

      public faw.a a(ezp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fan b() {
         return new faw(this.g(), this.b, this.a.build());
      }
   }
}
