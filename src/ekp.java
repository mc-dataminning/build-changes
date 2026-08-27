import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekp extends ekh {
   public static final Codec<ekp> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(kf.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), ejm.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, ekp::new)
   );
   private final ij<div<?>> b;
   private final List<ejo> c;

   ekp(List<elu> $$0, ij<div<?>> $$1, List<ejo> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public ekj b() {
      return ekk.p;
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         is<coz> $$2 = is.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ejd.a($$1.d(), $$2::add), $$1)));
         sw $$3 = new sw();
         blo.a($$3, $$2);
         sw $$4 = cms.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cms.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(eje $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static ekp.a a(div<?> $$0) {
      return new ekp.a($$0);
   }

   public static class a extends ekh.a<ekp.a> {
      private final Builder<ejo> a = ImmutableList.builder();
      private final div<?> b;

      public a(div<?> $$0) {
         this.b = $$0;
      }

      protected ekp.a a() {
         return this;
      }

      public ekp.a a(ejo.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eki b() {
         return new ekp(this.g(), this.b.a(), this.a.build());
      }
   }
}
