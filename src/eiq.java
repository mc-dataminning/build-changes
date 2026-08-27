import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eiq extends eii {
   public static final Codec<eiq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(kd.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), ehn.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eiq::new)
   );
   private final ih<dgx<?>> b;
   private final List<ehp> c;

   eiq(List<ejv> $$0, ih<dgx<?>> $$1, List<ehp> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eik b() {
      return eil.p;
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         iq<cmy> $$2 = iq.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ehe.a($$1.d(), $$2::add), $$1)));
         sn $$3 = new sn();
         bjv.a($$3, $$2);
         sn $$4 = ckr.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         ckr.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(ehf $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eiq.a a(dgx<?> $$0) {
      return new eiq.a($$0);
   }

   public static class a extends eii.a<eiq.a> {
      private final Builder<ehp> a = ImmutableList.builder();
      private final dgx<?> b;

      public a(dgx<?> $$0) {
         this.b = $$0;
      }

      protected eiq.a a() {
         return this;
      }

      public eiq.a a(ehp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eij b() {
         return new eiq(this.g(), this.b.a(), this.a.build());
      }
   }
}
