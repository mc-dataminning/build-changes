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

public class ejj extends eir {
   private static final Codec<List<ejj.b>> b = atx.a(ejj.b.a.listOf(), (Function<List<ejj.b>, DataResult<List<ejj.b>>>)($$0 -> {
      Set<ih<blh>> $$1 = new ObjectOpenHashSet();

      for (ejj.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<ejj> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(atx.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ejj::new)
   );
   private final List<ejj.b> c;

   ejj(List<eke> $$0, List<ejj.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eit b() {
      return eiu.n;
   }

   @Override
   public Set<ejn<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      if ($$0.a(cnj.vQ) && !this.c.isEmpty()) {
         ejj.b $$2 = ac.a(this.c, $$1.b());
         ih<blh> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cor.b($$0, List.of(new dez.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ejj.a c() {
      return new ejj.a();
   }

   public static class a extends eir.a<ejj.a> {
      private final Builder<ejj.b> a = ImmutableList.builder();

      protected ejj.a a() {
         return this;
      }

      public ejj.a a(ih<blh> $$0, ekz $$1) {
         this.a.add(new ejj.b($$0, $$1));
         return this;
      }

      @Override
      public eis b() {
         return new ejj(this.g(), this.a.build());
      }
   }

   static record b(ih<blh> b, ekz c) {
      public static final Codec<ejj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kd.d.r().fieldOf("type").forGetter(ejj.b::a), ela.a.fieldOf("duration").forGetter(ejj.b::b)).apply($$0, ejj.b::new)
      );

      public ih<blh> a() {
         return this.b;
      }

      public ekz b() {
         return this.c;
      }
   }
}
