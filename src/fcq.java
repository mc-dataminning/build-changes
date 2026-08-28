import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class fcq extends fcg {
   public static final MapCodec<fcq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(far.e.fieldOf("component").forGetter($$0x -> $$0x.b), fbh.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, fcq::new)
   );
   private final faq<?> b;
   private final List<fbj> c;

   fcq(List<fec> $$0, faq<?> $$1, List<fbj> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fci<fcq> b() {
      return fcj.t;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<dak> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(fay.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(faz $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static fcq.a a(faq<?> $$0) {
      return new fcq.a($$0);
   }

   public static class a extends fcg.a<fcq.a> {
      private final com.google.common.collect.ImmutableList.Builder<fbj> a = ImmutableList.builder();
      private final faq<?> b;

      public a(faq<?> $$0) {
         this.b = $$0;
      }

      protected fcq.a a() {
         return this;
      }

      public fcq.a a(fbj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fch b() {
         return new fcq(this.g(), this.b, this.a.build());
      }
   }
}
