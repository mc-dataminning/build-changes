import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etk extends eta {
   public static final Codec<etk> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(lh.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), esd.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, etk::new)
   );
   private final ja<dqe<?>> b;
   private final List<esf> c;

   etk(List<euu> $$0, ja<dqe<?>> $$1, List<esf> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public etc b() {
      return etd.s;
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         jj<cuh> $$2 = jj.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eru.a($$1.d(), $$2::add), $$1)));
         $$0.b(ke.Z, cxm.a($$2));
         return $$0;
      }
   }

   @Override
   public void a(erv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static etk.a a(dqe<?> $$0) {
      return new etk.a($$0);
   }

   public static class a extends eta.a<etk.a> {
      private final Builder<esf> a = ImmutableList.builder();
      private final dqe<?> b;

      public a(dqe<?> $$0) {
         this.b = $$0;
      }

      protected etk.a a() {
         return this;
      }

      public etk.a a(esf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public etb b() {
         return new etk(this.g(), this.b.a(), this.a.build());
      }
   }
}
