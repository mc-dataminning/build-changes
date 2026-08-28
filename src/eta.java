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

public class eta extends esb {
   private static final Codec<List<eta.b>> b = eta.b.a.listOf().validate($$0 -> {
      Set<jj<brj>> $$1 = new ObjectOpenHashSet();

      for (eta.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<eta> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eta::new)
   );
   private final List<eta.b> c;

   eta(List<etz> $$0, List<eta.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public esd<eta> b() {
      return ese.r;
   }

   @Override
   public Set<eth<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      if ($$0.a(cud.vX) && !this.c.isEmpty()) {
         eta.b $$2 = ac.a(this.c, $$1.b());
         jj<brj> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxd.a $$5 = new cxd.a($$3, $$4);
         $$0.a(kn.H, cxd.a, $$5, cxd::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eta.a c() {
      return new eta.a();
   }

   public static class a extends esb.a<eta.a> {
      private final Builder<eta.b> a = ImmutableList.builder();

      protected eta.a a() {
         return this;
      }

      public eta.a a(jj<brj> $$0, euv $$1) {
         this.a.add(new eta.b($$0, $$1));
         return this;
      }

      @Override
      public esc b() {
         return new eta(this.g(), this.a.build());
      }
   }

   static record b(jj<brj> b, euv c) {
      public static final Codec<eta.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lq.d.s().fieldOf("type").forGetter(eta.b::a), euw.a.fieldOf("duration").forGetter(eta.b::b)).apply($$0, eta.b::new)
      );

      public jj<brj> a() {
         return this.b;
      }

      public euv b() {
         return this.c;
      }
   }
}
