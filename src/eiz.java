import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eiz extends eir {
   public static final Codec<eiz> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(kd.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), ehw.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eiz::new)
   );
   private final ih<dhf<?>> b;
   private final List<ehy> c;

   eiz(List<eke> $$0, ih<dhf<?>> $$1, List<ehy> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eit b() {
      return eiu.p;
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         iq<cng> $$2 = iq.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ehn.a($$1.d(), $$2::add), $$1)));
         so $$3 = new so();
         bjw.a($$3, $$2);
         so $$4 = cla.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cla.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(eho $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eiz.a a(dhf<?> $$0) {
      return new eiz.a($$0);
   }

   public static class a extends eir.a<eiz.a> {
      private final Builder<ehy> a = ImmutableList.builder();
      private final dhf<?> b;

      public a(dhf<?> $$0) {
         this.b = $$0;
      }

      protected eiz.a a() {
         return this;
      }

      public eiz.a a(ehy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eis b() {
         return new eiz(this.g(), this.b.a(), this.a.build());
      }
   }
}
