import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eef extends edx {
   public static final Codec<eef> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(jd.l.r().fieldOf("type").forGetter($$0x -> $$0x.b), edc.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eef::new)
   );
   private final hg<dcs<?>> b;
   private final List<ede> c;

   eef(List<efk> $$0, hg<dcs<?>> $$1, List<ede> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public edz b() {
      return eea.p;
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         hp<cja> $$2 = hp.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ect.a($$1.d(), $$2::add), $$1)));
         qu $$3 = new qu();
         bgn.a($$3, $$2);
         qu $$4 = cgt.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cgt.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(ecu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   public static eef.a a(dcs<?> $$0) {
      return new eef.a($$0);
   }

   public static class a extends edx.a<eef.a> {
      private final Builder<ede> a = ImmutableList.builder();
      private final dcs<?> b;

      public a(dcs<?> $$0) {
         this.b = $$0;
      }

      protected eef.a a() {
         return this;
      }

      public eef.a a(ede.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edy b() {
         return new eef(this.g(), this.b.a(), this.a.build());
      }
   }
}
