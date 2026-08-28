import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class eym extends eyc {
   public static final MapCodec<eym> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ewn.e.fieldOf("component").forGetter($$0x -> $$0x.b), exd.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eym::new)
   );
   private final ewm<?> b;
   private final List<exf> c;

   eym(List<ezy> $$0, ewm<?> $$1, List<exf> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eye<eym> b() {
      return eyf.t;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<cxp> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ewu.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(ewv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eym.a a(ewm<?> $$0) {
      return new eym.a($$0);
   }

   public static class a extends eyc.a<eym.a> {
      private final com.google.common.collect.ImmutableList.Builder<exf> a = ImmutableList.builder();
      private final ewm<?> b;

      public a(ewm<?> $$0) {
         this.b = $$0;
      }

      protected eym.a a() {
         return this;
      }

      public eym.a a(exf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eyd b() {
         return new eym(this.g(), this.b, this.a.build());
      }
   }
}
