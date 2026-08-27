import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class eph extends eoo {
   private static final Codec<List<eph.b>> b = aws.b(eph.b.a.listOf(), (Function<List<eph.b>, DataResult<List<eph.b>>>)($$0 -> {
      Set<il<bpf>> $$1 = new ObjectOpenHashSet();

      for (eph.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eph> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aws.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eph::new)
   );
   private final List<eph.b> c;

   eph(List<eqc> $$0, List<eph.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eoq b() {
      return eor.o;
   }

   @Override
   public Set<epl<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      if ($$0.a(crm.vS) && !this.c.isEmpty()) {
         eph.b $$2 = ac.a(this.c, $$1.b());
         il<bpf> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cui.a $$5 = new cui.a($$3, $$4);
         $$0.a(jp.y, cui.a, $$5, cui::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eph.a c() {
      return new eph.a();
   }

   public static class a extends eoo.a<eph.a> {
      private final Builder<eph.b> a = ImmutableList.builder();

      protected eph.a a() {
         return this;
      }

      public eph.a a(il<bpf> $$0, eqx $$1) {
         this.a.add(new eph.b($$0, $$1));
         return this;
      }

      @Override
      public eop b() {
         return new eph(this.g(), this.a.build());
      }
   }

   static record b(il<bpf> b, eqx c) {
      public static final Codec<eph.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kr.d.r().fieldOf("type").forGetter(eph.b::a), eqy.a.fieldOf("duration").forGetter(eph.b::b)).apply($$0, eph.b::new)
      );

      public il<bpf> a() {
         return this.b;
      }

      public eqx b() {
         return this.c;
      }
   }
}
