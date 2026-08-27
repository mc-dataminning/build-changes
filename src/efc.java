import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efc extends eeu {
   public static final Codec<efc> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(jy.l.r().fieldOf("type").forGetter($$0x -> $$0x.b), edz.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, efc::new)
   );
   private final ib<ddz<?>> b;
   private final List<eeb> c;

   efc(List<egh> $$0, ib<ddz<?>> $$1, List<eeb> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eew b() {
      return eex.p;
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         il<ckj> $$2 = il.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(edq.a($$1.d(), $$2::add), $$1)));
         rt $$3 = new rt();
         bhv.a($$3, $$2);
         rt $$4 = cic.a($$0);
         if ($$4 == null) {
            $$4 = $$3;
         } else {
            $$4.a($$3);
         }

         cic.a($$0, this.b.a(), $$4);
         return $$0;
      }
   }

   @Override
   public void a(edr $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   public static efc.a a(ddz<?> $$0) {
      return new efc.a($$0);
   }

   public static class a extends eeu.a<efc.a> {
      private final Builder<eeb> a = ImmutableList.builder();
      private final ddz<?> b;

      public a(ddz<?> $$0) {
         this.b = $$0;
      }

      protected efc.a a() {
         return this;
      }

      public efc.a a(eeb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eev b() {
         return new efc(this.g(), this.b.a(), this.a.build());
      }
   }
}
