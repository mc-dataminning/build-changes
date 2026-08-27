import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eee extends edw {
   public static final Codec<eee> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(jb.l.r().fieldOf("type").forGetter($$0x -> $$0x.b), edb.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eee::new)
   );
   private final he<ddb<?>> b;
   private final List<edd> c;

   eee(List<efj> $$0, he<ddb<?>> $$1, List<edd> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public edy b() {
      return edz.p;
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         hn<cjl> $$2 = hn.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ecs.a($$1.d(), $$2::add), $$1)));
         qw $$3 = new qw();
         bgy.a($$3, $$2);
         qw $$4 = che.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         che.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(ect $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   public static eee.a a(ddb<?> $$0) {
      return new eee.a($$0);
   }

   public static class a extends edw.a<eee.a> {
      private final Builder<edd> a = ImmutableList.builder();
      private final ddb<?> b;

      public a(ddb<?> $$0) {
         this.b = $$0;
      }

      protected eee.a a() {
         return this;
      }

      public eee.a a(edd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edx b() {
         return new eee(this.g(), this.b.a(), this.a.build());
      }
   }
}
