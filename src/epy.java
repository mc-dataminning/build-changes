import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epy extends epo {
   public static final Codec<epy> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(lc.k.r().fieldOf("type").forGetter($$0x -> $$0x.b), eor.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
            .apply($$0, epy::new)
   );
   private final iv<dnf<?>> b;
   private final List<eot> c;

   epy(List<erh> $$0, iv<dnf<?>> $$1, List<eot> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public epq b() {
      return epr.q;
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         je<csd> $$2 = je.a();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(eoi.a($$1.d(), $$2::add), $$1)));
         $$0.b(jz.Q, cux.a($$2));
         return $$0;
      }
   }

   @Override
   public void a(eoj $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   public static epy.a a(dnf<?> $$0) {
      return new epy.a($$0);
   }

   public static class a extends epo.a<epy.a> {
      private final Builder<eot> a = ImmutableList.builder();
      private final dnf<?> b;

      public a(dnf<?> $$0) {
         this.b = $$0;
      }

      protected epy.a a() {
         return this;
      }

      public epy.a a(eot.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public epp b() {
         return new epy(this.g(), this.b.a(), this.a.build());
      }
   }
}
