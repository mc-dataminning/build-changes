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

public class epq extends eox {
   private static final Codec<List<epq.b>> b = awu.b(epq.b.a.listOf(), (Function<List<epq.b>, DataResult<List<epq.b>>>)($$0 -> {
      Set<in<bpk>> $$1 = new ObjectOpenHashSet();

      for (epq.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<epq> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(awu.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, epq::new)
   );
   private final List<epq.b> c;

   epq(List<eql> $$0, List<epq.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eoz b() {
      return epa.o;
   }

   @Override
   public Set<epu<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      if ($$0.a(crv.vS) && !this.c.isEmpty()) {
         epq.b $$2 = ac.a(this.c, $$1.b());
         in<bpk> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cur.a $$5 = new cur.a($$3, $$4);
         $$0.a(jr.y, cur.a, $$5, cur::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static epq.a c() {
      return new epq.a();
   }

   public static class a extends eox.a<epq.a> {
      private final Builder<epq.b> a = ImmutableList.builder();

      protected epq.a a() {
         return this;
      }

      public epq.a a(in<bpk> $$0, erg $$1) {
         this.a.add(new epq.b($$0, $$1));
         return this;
      }

      @Override
      public eoy b() {
         return new epq(this.g(), this.a.build());
      }
   }

   static record b(in<bpk> b, erg c) {
      public static final Codec<epq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kt.d.r().fieldOf("type").forGetter(epq.b::a), erh.a.fieldOf("duration").forGetter(epq.b::b)).apply($$0, epq.b::new)
      );

      public in<bpk> a() {
         return this.b;
      }

      public erg b() {
         return this.c;
      }
   }
}
