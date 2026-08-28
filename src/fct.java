import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;

public class fct extends fbu {
   private static final Codec<List<fct.b>> b = fct.b.a.listOf().validate($$0 -> {
      Set<jf<bvv>> $$1 = new ObjectOpenHashSet();

      for (fct.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<fct> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, fct::new)
   );
   private final List<fct.b> c;

   fct(List<fdq> $$0, List<fct.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fbw<fct> b() {
      return fbx.r;
   }

   @Override
   public Set<baz<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      if ($$0.a(dac.xh) && !this.c.isEmpty()) {
         fct.b $$2 = ag.a(this.c, $$1.b());
         jf<bvv> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         dda.a $$5 = new dda.a($$3, $$4);
         $$0.a(kk.T, dda.a, $$5, dda::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static fct.a c() {
      return new fct.a();
   }

   public static class a extends fbu.a<fct.a> {
      private final Builder<fct.b> a = ImmutableList.builder();

      protected fct.a a() {
         return this;
      }

      public fct.a a(jf<bvv> $$0, fem $$1) {
         this.a.add(new fct.b($$0, $$1));
         return this;
      }

      @Override
      public fbv b() {
         return new fct(this.g(), this.a.build());
      }
   }

   static record b(jf<bvv> b, fem c) {
      public static final Codec<fct.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvv.a.fieldOf("type").forGetter(fct.b::a), fen.a.fieldOf("duration").forGetter(fct.b::b)).apply($$0, fct.b::new)
      );

      public jf<bvv> a() {
         return this.b;
      }

      public fem b() {
         return this.c;
      }
   }
}
