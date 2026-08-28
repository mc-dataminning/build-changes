import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class esl extends esb {
   public static final MapCodec<esl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eqm.e.fieldOf("component").forGetter($$0x -> $$0x.b), erc.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, esl::new)
   );
   private final eql<?> b;
   private final List<ere> c;

   esl(List<etz> $$0, eql<?> $$1, List<ere> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public esd<esl> b() {
      return ese.t;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Builder<cua> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eqt.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(equ $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static esl.a a(eql<?> $$0) {
      return new esl.a($$0);
   }

   public static class a extends esb.a<esl.a> {
      private final com.google.common.collect.ImmutableList.Builder<ere> a = ImmutableList.builder();
      private final eql<?> b;

      public a(eql<?> $$0) {
         this.b = $$0;
      }

      protected esl.a a() {
         return this;
      }

      public esl.a a(ere.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esc b() {
         return new esl(this.g(), this.b, this.a.build());
      }
   }
}
