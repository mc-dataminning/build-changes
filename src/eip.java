import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eip extends eih {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(kd.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), ehm.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eip::new)
   );
   private final ih<dgw<?>> b;
   private final List<eho> c;

   eip(List<eju> $$0, ih<dgw<?>> $$1, List<eho> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eij b() {
      return eik.p;
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         iq<cmx> $$2 = iq.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ehd.a($$1.d(), $$2::add), $$1)));
         sn $$3 = new sn();
         bju.a($$3, $$2);
         sn $$4 = ckq.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         ckq.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(ehe $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eip.a a(dgw<?> $$0) {
      return new eip.a($$0);
   }

   public static class a extends eih.a<eip.a> {
      private final Builder<eho> a = ImmutableList.builder();
      private final dgw<?> b;

      public a(dgw<?> $$0) {
         this.b = $$0;
      }

      protected eip.a a() {
         return this;
      }

      public eip.a a(eho.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eii b() {
         return new eip(this.g(), this.b.a(), this.a.build());
      }
   }
}
