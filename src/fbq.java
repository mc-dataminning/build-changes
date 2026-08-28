import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class fbq extends fbg {
   public static final MapCodec<fbq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezr.e.fieldOf("component").forGetter($$0x -> $$0x.b), fah.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbq::new)
   );
   private final ezq<?> b;
   private final List<faj> c;

   fbq(List<fdc> $$0, ezq<?> $$1, List<faj> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fbi<fbq> b() {
      return fbj.t;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<czn> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ezy.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(ezz $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static fbq.a a(ezq<?> $$0) {
      return new fbq.a($$0);
   }

   public static class a extends fbg.a<fbq.a> {
      private final com.google.common.collect.ImmutableList.Builder<faj> a = ImmutableList.builder();
      private final ezq<?> b;

      public a(ezq<?> $$0) {
         this.b = $$0;
      }

      protected fbq.a a() {
         return this;
      }

      public fbq.a a(faj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fbh b() {
         return new fbq(this.g(), this.b, this.a.build());
      }
   }
}
