import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egf extends efx {
   public static final Codec<egf> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(jy.l.r().fieldOf("type").forGetter($$0x -> $$0x.b), efc.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, egf::new)
   );
   private final ib<det<?>> b;
   private final List<efe> c;

   egf(List<ehk> $$0, ib<det<?>> $$1, List<efe> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public efz b() {
      return ega.p;
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         il<clb> $$2 = il.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eet.a($$1.d(), $$2::add), $$1)));
         rz $$3 = new rz();
         bik.a($$3, $$2);
         rz $$4 = ciu.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         ciu.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(eeu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   public static egf.a a(det<?> $$0) {
      return new egf.a($$0);
   }

   public static class a extends efx.a<egf.a> {
      private final Builder<efe> a = ImmutableList.builder();
      private final det<?> b;

      public a(det<?> $$0) {
         this.b = $$0;
      }

      protected egf.a a() {
         return this;
      }

      public egf.a a(efe.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public efy b() {
         return new egf(this.g(), this.b.a(), this.a.build());
      }
   }
}
