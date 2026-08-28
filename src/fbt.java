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

public class fbt extends fau {
   private static final Codec<List<fbt.b>> b = fbt.b.a.listOf().validate($$0 -> {
      Set<je<bvh>> $$1 = new ObjectOpenHashSet();

      for (fbt.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<fbt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, fbt::new)
   );
   private final List<fbt.b> c;

   fbt(List<fcq> $$0, List<fbt.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public faw<fbt> b() {
      return fax.r;
   }

   @Override
   public Set<bax<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      if ($$0.a(czh.xh) && !this.c.isEmpty()) {
         fbt.b $$2 = af.a(this.c, $$1.b());
         je<bvh> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         dcf.a $$5 = new dcf.a($$3, $$4);
         $$0.a(kj.T, dcf.a, $$5, dcf::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static fbt.a c() {
      return new fbt.a();
   }

   public static class a extends fau.a<fbt.a> {
      private final Builder<fbt.b> a = ImmutableList.builder();

      protected fbt.a a() {
         return this;
      }

      public fbt.a a(je<bvh> $$0, fdm $$1) {
         this.a.add(new fbt.b($$0, $$1));
         return this;
      }

      @Override
      public fav b() {
         return new fbt(this.g(), this.a.build());
      }
   }

   static record b(je<bvh> b, fdm c) {
      public static final Codec<fbt.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvh.a.fieldOf("type").forGetter(fbt.b::a), fdn.a.fieldOf("duration").forGetter(fbt.b::b)).apply($$0, fbt.b::new)
      );

      public je<bvh> a() {
         return this.b;
      }

      public fdm b() {
         return this.c;
      }
   }
}
