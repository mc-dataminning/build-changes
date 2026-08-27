import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eea extends eds {
   public static final Codec<eea> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(jb.l.r().fieldOf("type").forGetter($$0x -> $$0x.b), ecx.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eea::new)
   );
   private final he<dcn<?>> b;
   private final List<ecz> c;

   eea(List<eff> $$0, he<dcn<?>> $$1, List<ecz> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public edu b() {
      return edv.p;
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         hn<cix> $$2 = hn.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eco.a($$1.d(), $$2::add), $$1)));
         qr $$3 = new qr();
         bgk.a($$3, $$2);
         qr $$4 = cgq.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cgq.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(ecp $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   public static eea.a a(dcn<?> $$0) {
      return new eea.a($$0);
   }

   public static class a extends eds.a<eea.a> {
      private final Builder<ecz> a = ImmutableList.builder();
      private final dcn<?> b;

      public a(dcn<?> $$0) {
         this.b = $$0;
      }

      protected eea.a a() {
         return this;
      }

      public eea.a a(ecz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edt b() {
         return new eea(this.g(), this.b.a(), this.a.build());
      }
   }
}
