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

public class ekz extends ekh {
   private static final Codec<List<ekz.b>> b = avp.a(ekz.b.a.listOf(), (Function<List<ekz.b>, DataResult<List<ekz.b>>>)($$0 -> {
      Set<ij<bmz>> $$1 = new ObjectOpenHashSet();

      for (ekz.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<ekz> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(avp.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ekz::new)
   );
   private final List<ekz.b> c;

   ekz(List<elu> $$0, List<ekz.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public ekj b() {
      return ekk.n;
   }

   @Override
   public Set<eld<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      if ($$0.a(cpc.vQ) && !this.c.isEmpty()) {
         ekz.b $$2 = ac.a(this.c, $$1.b());
         ij<bmz> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cqj.b($$0, List.of(new dgp.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ekz.a c() {
      return new ekz.a();
   }

   public static class a extends ekh.a<ekz.a> {
      private final Builder<ekz.b> a = ImmutableList.builder();

      protected ekz.a a() {
         return this;
      }

      public ekz.a a(ij<bmz> $$0, emp $$1) {
         this.a.add(new ekz.b($$0, $$1));
         return this;
      }

      @Override
      public eki b() {
         return new ekz(this.g(), this.a.build());
      }
   }

   static record b(ij<bmz> b, emp c) {
      public static final Codec<ekz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kf.d.r().fieldOf("type").forGetter(ekz.b::a), emq.a.fieldOf("duration").forGetter(ekz.b::b)).apply($$0, ekz.b::new)
      );

      public ij<bmz> a() {
         return this.b;
      }

      public emp b() {
         return this.c;
      }
   }
}
