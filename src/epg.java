import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epg extends eox {
   public static final Codec<epg> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(kt.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), eob.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, epg::new)
   );
   private final in<dmq<?>> b;
   private final List<eod> c;

   epg(List<eql> $$0, in<dmq<?>> $$1, List<eod> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eoz b() {
      return epa.q;
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         iw<crs> $$2 = iw.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(ens.a($$1.d(), $$2::add), $$1)));
         $$0.b(jr.Q, cuj.a($$2));
         return $$0;
      }
   }

   @Override
   public void a(ent $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static epg.a a(dmq<?> $$0) {
      return new epg.a($$0);
   }

   public static class a extends eox.a<epg.a> {
      private final Builder<eod> a = ImmutableList.builder();
      private final dmq<?> b;

      public a(dmq<?> $$0) {
         this.b = $$0;
      }

      protected epg.a a() {
         return this;
      }

      public epg.a a(eod.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eoy b() {
         return new epg(this.g(), this.b.a(), this.a.build());
      }
   }
}
