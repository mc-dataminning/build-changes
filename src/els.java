import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class els extends elk {
   public static final Codec<els> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(kh.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), ekp.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, els::new)
   );
   private final il<djn<?>> b;
   private final List<ekr> c;

   els(List<emx> $$0, il<djn<?>> $$1, List<ekr> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public elm b() {
      return eln.p;
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         iu<cpq> $$2 = iu.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ekg.a($$1.d(), $$2::add), $$1)));
         sy $$3 = new sy();
         bmf.a($$3, $$2);
         sy $$4 = cnl.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cnl.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(ekh $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static els.a a(djn<?> $$0) {
      return new els.a($$0);
   }

   public static class a extends elk.a<els.a> {
      private final Builder<ekr> a = ImmutableList.builder();
      private final djn<?> b;

      public a(djn<?> $$0) {
         this.b = $$0;
      }

      protected els.a a() {
         return this;
      }

      public els.a a(ekr.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ell b() {
         return new els(this.g(), this.b.a(), this.a.build());
      }
   }
}
