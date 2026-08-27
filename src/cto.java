import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cto extends cth implements ctf.a {
   public static final Codec<cto> b = ctd.c.fieldOf("biome").xmap(cto::new, $$0 -> $$0.c).stable().codec();
   private final ig<ctd> c;

   public cto(ig<ctd> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ig<ctd>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cth> a() {
      return b;
   }

   @Override
   public ig<ctd> getNoiseBiome(int $$0, int $$1, int $$2, ctm.f $$3) {
      return this.c;
   }

   @Override
   public ig<ctd> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<hx, ig<ctd>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ig<ctd>> $$5, atw $$6, boolean $$7, ctm.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new hx($$0, $$1, $$2), this.c) : Pair.of(new hx($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<hx, ig<ctd>> a(hx $$0, int $$1, int $$2, int $$3, Predicate<ig<ctd>> $$4, ctm.f $$5, csi $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ig<ctd>> a(int $$0, int $$1, int $$2, int $$3, ctm.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
