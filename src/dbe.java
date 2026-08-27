import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dbe extends dax implements dav.a {
   public static final Codec<dbe> b = dat.c.fieldOf("biome").xmap(dbe::new, $$0 -> $$0.c).stable().codec();
   private final iv<dat> c;

   public dbe(iv<dat> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<iv<dat>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends dax> a() {
      return b;
   }

   @Override
   public iv<dat> getNoiseBiome(int $$0, int $$1, int $$2, dbc.f $$3) {
      return this.c;
   }

   @Override
   public iv<dat> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<im, iv<dat>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<iv<dat>> $$5, ayd $$6, boolean $$7, dbc.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new im($$0, $$1, $$2), this.c) : Pair.of(new im($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<im, iv<dat>> a(im $$0, int $$1, int $$2, int $$3, Predicate<iv<dat>> $$4, dbc.f $$5, czx $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<iv<dat>> a(int $$0, int $$1, int $$2, int $$3, dbc.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
