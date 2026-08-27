import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehy extends ehq {
   public static final Codec<ehy> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(kb.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), egv.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, ehy::new)
   );
   private final ie<dgf<?>> b;
   private final List<egx> c;

   ehy(List<ejd> $$0, ie<dgf<?>> $$1, List<egx> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public ehs b() {
      return eht.p;
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         io<cmh> $$2 = io.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(egm.a($$1.d(), $$2::add), $$1)));
         sj $$3 = new sj();
         bjf.a($$3, $$2);
         sj $$4 = cka.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cka.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(egn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static ehy.a a(dgf<?> $$0) {
      return new ehy.a($$0);
   }

   public static class a extends ehq.a<ehy.a> {
      private final Builder<egx> a = ImmutableList.builder();
      private final dgf<?> b;

      public a(dgf<?> $$0) {
         this.b = $$0;
      }

      protected ehy.a a() {
         return this;
      }

      public ehy.a a(egx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ehr b() {
         return new ehy(this.g(), this.b.a(), this.a.build());
      }
   }
}
