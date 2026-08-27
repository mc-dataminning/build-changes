import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekw extends eko {
   public static final Codec<ekw> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(kf.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), ejt.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, ekw::new)
   );
   private final ij<diz<?>> b;
   private final List<ejv> c;

   ekw(List<emb> $$0, ij<diz<?>> $$1, List<ejv> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public ekq b() {
      return ekr.p;
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         is<cpd> $$2 = is.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ejk.a($$1.d(), $$2::add), $$1)));
         sw $$3 = new sw();
         blq.a($$3, $$2);
         sw $$4 = cmw.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cmw.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(ejl $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static ekw.a a(diz<?> $$0) {
      return new ekw.a($$0);
   }

   public static class a extends eko.a<ekw.a> {
      private final Builder<ejv> a = ImmutableList.builder();
      private final diz<?> b;

      public a(diz<?> $$0) {
         this.b = $$0;
      }

      protected ekw.a a() {
         return this;
      }

      public ekw.a a(ejv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ekp b() {
         return new ekw(this.g(), this.b.a(), this.a.build());
      }
   }
}
