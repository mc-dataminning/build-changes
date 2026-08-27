import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eem extends eee {
   public static final Codec<eem> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(jd.l.r().fieldOf("type").forGetter($$0x -> $$0x.b), edj.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eem::new)
   );
   private final hg<dcz<?>> b;
   private final List<edl> c;

   eem(List<efr> $$0, hg<dcz<?>> $$1, List<edl> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eeg b() {
      return eeh.p;
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         hp<cjh> $$2 = hp.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eda.a($$1.d(), $$2::add), $$1)));
         qy $$3 = new qy();
         bgu.a($$3, $$2);
         qy $$4 = cha.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cha.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(edb $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   public static eem.a a(dcz<?> $$0) {
      return new eem.a($$0);
   }

   public static class a extends eee.a<eem.a> {
      private final Builder<edl> a = ImmutableList.builder();
      private final dcz<?> b;

      public a(dcz<?> $$0) {
         this.b = $$0;
      }

      protected eem.a a() {
         return this;
      }

      public eem.a a(edl.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eef b() {
         return new eem(this.g(), this.b.a(), this.a.build());
      }
   }
}
