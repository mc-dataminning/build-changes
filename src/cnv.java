import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cnv extends cno implements cnm.a {
   public static final Codec<cnv> b = cnk.c.fieldOf("biome").xmap(cnv::new, $$0 -> $$0.c).stable().codec();
   private final he<cnk> c;

   public cnv(he<cnk> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<he<cnk>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cno> a() {
      return b;
   }

   @Override
   public he<cnk> getNoiseBiome(int $$0, int $$1, int $$2, cnt.f $$3) {
      return this.c;
   }

   @Override
   public he<cnk> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<gu, he<cnk>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<he<cnk>> $$5, apf $$6, boolean $$7, cnt.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new gu($$0, $$1, $$2), this.c) : Pair.of(new gu($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<gu, he<cnk>> a(gu $$0, int $$1, int $$2, int $$3, Predicate<he<cnk>> $$4, cnt.f $$5, cmp $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<he<cnk>> a(int $$0, int $$1, int $$2, int $$3, cnt.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
