import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class epj extends eox {
   public static final Codec<epj> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awu.a(Codec.unboundedMap(kt.f.r(), erh.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, epj::new)
   );
   private final Map<in<cwz>, erg> b;
   private final boolean c;

   epj(List<eql> $$0, Map<in<cwz>, erg> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eoz b() {
      return epa.f;
   }

   @Override
   public Set<epu<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      Object2IntMap<cwz> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((cwz)$$2x.a(), $$3.a($$1)));
      if ($$0.a(crv.qO)) {
         $$0 = $$0.a(crv.uu, $$0.G());
         $$0.b(jr.p, $$0.c(jr.f));
      }

      cxa.a($$0, $$1x -> {
         if (this.c) {
            $$2.forEach(($$1xx, $$2x) -> $$1x.a($$1xx, $$1x.a($$1xx) + $$2x));
         } else {
            $$2.forEach($$1x::a);
         }
      });
      return $$0;
   }

   public static class a extends eox.a<epj.a> {
      private final Builder<in<cwz>, erg> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected epj.a a() {
         return this;
      }

      public epj.a a(cwz $$0, erg $$1) {
         this.a.put($$0.k(), $$1);
         return this;
      }

      @Override
      public eoy b() {
         return new epj(this.g(), this.a.build(), this.b);
      }
   }
}
