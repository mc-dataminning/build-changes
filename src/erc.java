import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erc extends eqs {
   public static final MapCodec<erc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(le.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), epv.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, erc::new)
   );
   private final ix<dok<?>> b;
   private final List<epx> c;

   erc(List<esn> $$0, ix<dok<?>> $$1, List<epx> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public equ b() {
      return eqv.s;
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         jg<ctq> $$2 = jg.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(epm.a($$1.d(), $$2::add), $$1)));
         $$0.b(kb.Z, cwm.a($$2));
         return $$0;
      }
   }

   @Override
   public void a(epn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static erc.a a(dok<?> $$0) {
      return new erc.a($$0);
   }

   public static class a extends eqs.a<erc.a> {
      private final Builder<epx> a = ImmutableList.builder();
      private final dok<?> b;

      public a(dok<?> $$0) {
         this.b = $$0;
      }

      protected erc.a a() {
         return this;
      }

      public erc.a a(epx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqt b() {
         return new erc(this.g(), this.b.a(), this.a.build());
      }
   }
}
