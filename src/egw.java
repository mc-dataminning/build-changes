import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egw extends ego {
   public static final Codec<egw> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(kc.l.r().fieldOf("type").forGetter($$0x -> $$0x.b), eft.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, egw::new)
   );
   private final ig<dfk<?>> b;
   private final List<efv> c;

   egw(List<eib> $$0, ig<dfk<?>> $$1, List<efv> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public egq b() {
      return egr.p;
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         ip<clo> $$2 = ip.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(efk.a($$1.d(), $$2::add), $$1)));
         sd $$3 = new sd();
         biv.a($$3, $$2);
         sd $$4 = cjh.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cjh.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(efl $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   public static egw.a a(dfk<?> $$0) {
      return new egw.a($$0);
   }

   public static class a extends ego.a<egw.a> {
      private final Builder<efv> a = ImmutableList.builder();
      private final dfk<?> b;

      public a(dfk<?> $$0) {
         this.b = $$0;
      }

      protected egw.a a() {
         return this;
      }

      public egw.a a(efv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public egp b() {
         return new egw(this.g(), this.b.a(), this.a.build());
      }
   }
}
