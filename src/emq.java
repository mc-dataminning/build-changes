import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emq extends emi {
   public static final Codec<emq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ki.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), eln.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, emq::new)
   );
   private final il<dkk<?>> b;
   private final List<elp> c;

   emq(List<env> $$0, il<dkk<?>> $$1, List<elp> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public emk b() {
      return eml.p;
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         iu<cqm> $$2 = iu.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ele.a($$1.d(), $$2::add), $$1)));
         ta $$3 = new ta();
         bmx.a($$3, $$2);
         ta $$4 = coh.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         coh.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(elf $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static emq.a a(dkk<?> $$0) {
      return new emq.a($$0);
   }

   public static class a extends emi.a<emq.a> {
      private final Builder<elp> a = ImmutableList.builder();
      private final dkk<?> b;

      public a(dkk<?> $$0) {
         this.b = $$0;
      }

      protected emq.a a() {
         return this;
      }

      public emq.a a(elp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public emj b() {
         return new emq(this.g(), this.b.a(), this.a.build());
      }
   }
}
