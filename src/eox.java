import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eox extends eoo {
   public static final Codec<eox> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(kr.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), ens.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eox::new)
   );
   private final il<dmh<?>> b;
   private final List<enu> c;

   eox(List<eqc> $$0, il<dmh<?>> $$1, List<enu> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eoq b() {
      return eor.q;
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         iu<crj> $$2 = iu.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(enj.a($$1.d(), $$2::add), $$1)));
         tm $$3 = new tm();
         bnu.a($$3, $$2, $$1.d().H_());
         cph.a($$0, this.b.a(), $$1x -> $$1x.a($$3));
         return $$0;
      }
   }

   @Override
   public void a(enk $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eox.a a(dmh<?> $$0) {
      return new eox.a($$0);
   }

   public static class a extends eoo.a<eox.a> {
      private final Builder<enu> a = ImmutableList.builder();
      private final dmh<?> b;

      public a(dmh<?> $$0) {
         this.b = $$0;
      }

      protected eox.a a() {
         return this;
      }

      public eox.a a(enu.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eop b() {
         return new eox(this.g(), this.b.a(), this.a.build());
      }
   }
}
