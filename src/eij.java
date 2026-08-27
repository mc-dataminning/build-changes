import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eij extends eib {
   public static final Codec<eij> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(kd.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), ehg.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eij::new)
   );
   private final ih<dgq<?>> b;
   private final List<ehi> c;

   eij(List<ejo> $$0, ih<dgq<?>> $$1, List<ehi> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eid b() {
      return eie.p;
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         iq<cmr> $$2 = iq.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(egx.a($$1.d(), $$2::add), $$1)));
         sl $$3 = new sl();
         bjp.a($$3, $$2);
         sl $$4 = ckk.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         ckk.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(egy $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eij.a a(dgq<?> $$0) {
      return new eij.a($$0);
   }

   public static class a extends eib.a<eij.a> {
      private final Builder<ehi> a = ImmutableList.builder();
      private final dgq<?> b;

      public a(dgq<?> $$0) {
         this.b = $$0;
      }

      protected eij.a a() {
         return this;
      }

      public eij.a a(ehi.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eic b() {
         return new eij(this.g(), this.b.a(), this.a.build());
      }
   }
}
