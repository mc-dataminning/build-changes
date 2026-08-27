import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqg extends epw {
   public static final Codec<eqg> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ld.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), eoz.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, eqg::new)
   );
   private final iw<dno<?>> b;
   private final List<epb> c;

   eqg(List<erq> $$0, iw<dno<?>> $$1, List<epb> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public epy b() {
      return epz.s;
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         jf<csz> $$2 = jf.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eoq.a($$1.d(), $$2::add), $$1)));
         $$0.b(ka.X, cvt.a($$2));
         return $$0;
      }
   }

   @Override
   public void a(eor $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static eqg.a a(dno<?> $$0) {
      return new eqg.a($$0);
   }

   public static class a extends epw.a<eqg.a> {
      private final Builder<epb> a = ImmutableList.builder();
      private final dno<?> b;

      public a(dno<?> $$0) {
         this.b = $$0;
      }

      protected eqg.a a() {
         return this;
      }

      public eqg.a a(epb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public epx b() {
         return new eqg(this.g(), this.b.a(), this.a.build());
      }
   }
}
