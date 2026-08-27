import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eek extends eec {
   public static final Codec<eek> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(jd.l.r().fieldOf("type").forGetter($$0x -> $$0x.b), edh.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eek::new)
   );
   private final hg<dcx<?>> b;
   private final List<edj> c;

   eek(List<efp> $$0, hg<dcx<?>> $$1, List<edj> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eee b() {
      return eef.p;
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         hp<cjf> $$2 = hp.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ecy.a($$1.d(), $$2::add), $$1)));
         qy $$3 = new qy();
         bgs.a($$3, $$2);
         qy $$4 = cgy.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cgy.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(ecz $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   public static eek.a a(dcx<?> $$0) {
      return new eek.a($$0);
   }

   public static class a extends eec.a<eek.a> {
      private final Builder<edj> a = ImmutableList.builder();
      private final dcx<?> b;

      public a(dcx<?> $$0) {
         this.b = $$0;
      }

      protected eek.a a() {
         return this;
      }

      public eek.a a(edj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eed b() {
         return new eek(this.g(), this.b.a(), this.a.build());
      }
   }
}
