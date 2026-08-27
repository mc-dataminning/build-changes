import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egr extends egj {
   public static final Codec<egr> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(jy.l.r().fieldOf("type").forGetter($$0x -> $$0x.b), efo.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, egr::new)
   );
   private final ib<dff<?>> b;
   private final List<efq> c;

   egr(List<ehw> $$0, ib<dff<?>> $$1, List<efq> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public egl b() {
      return egm.p;
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         il<clj> $$2 = il.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eff.a($$1.d(), $$2::add), $$1)));
         rz $$3 = new rz();
         bir.a($$3, $$2);
         rz $$4 = cjc.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cjc.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(efg $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   public static egr.a a(dff<?> $$0) {
      return new egr.a($$0);
   }

   public static class a extends egj.a<egr.a> {
      private final Builder<efq> a = ImmutableList.builder();
      private final dff<?> b;

      public a(dff<?> $$0) {
         this.b = $$0;
      }

      protected egr.a a() {
         return this;
      }

      public egr.a a(efq.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public egk b() {
         return new egr(this.g(), this.b.a(), this.a.build());
      }
   }
}
