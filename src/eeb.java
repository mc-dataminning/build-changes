import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eeb extends edt {
   public static final Codec<eeb> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(jb.l.r().fieldOf("type").forGetter($$0x -> $$0x.b), ecy.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eeb::new)
   );
   private final he<dco<?>> b;
   private final List<eda> c;

   eeb(List<efg> $$0, he<dco<?>> $$1, List<eda> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public edv b() {
      return edw.p;
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         hn<ciy> $$2 = hn.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ecp.a($$1.d(), $$2::add), $$1)));
         qr $$3 = new qr();
         bgk.a($$3, $$2);
         qr $$4 = cgr.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cgr.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(ecq $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   public static eeb.a a(dco<?> $$0) {
      return new eeb.a($$0);
   }

   public static class a extends edt.a<eeb.a> {
      private final Builder<eda> a = ImmutableList.builder();
      private final dco<?> b;

      public a(dco<?> $$0) {
         this.b = $$0;
      }

      protected eeb.a a() {
         return this;
      }

      public eeb.a a(eda.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edu b() {
         return new eeb(this.g(), this.b.a(), this.a.build());
      }
   }
}
