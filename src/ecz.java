import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ecz implements ecd {
   public static final Codec<ecz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eee.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               efh.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eee.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               edp.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eeb.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eee.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ede.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eev.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ecz::new)
   );
   public final eee b;
   public final eee c;
   public final efh d;
   public final eee e;
   public final edp f;
   public final Optional<eeb> g;
   public final ede h;
   public final List<eev> i;
   public final boolean j;
   public final boolean k;

   protected ecz(eee $$0, efh $$1, eee $$2, edp $$3, Optional<eeb> $$4, eee $$5, ede $$6, List<eev> $$7, boolean $$8, boolean $$9) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.c = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
   }

   public static class a {
      public final eee a;
      private final efh c;
      public final eee b;
      private final edp d;
      private final Optional<eeb> e;
      private eee f;
      private final ede g;
      private List<eev> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eee $$0, efh $$1, eee $$2, edp $$3, Optional<eeb> $$4, ede $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eee.a(dec.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eee $$0, efh $$1, eee $$2, edp $$3, ede $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ecz.a a(eee $$0) {
         this.f = $$0;
         return this;
      }

      public ecz.a a(List<eev> $$0) {
         this.h = $$0;
         return this;
      }

      public ecz.a a() {
         this.i = true;
         return this;
      }

      public ecz.a b() {
         this.j = true;
         return this;
      }

      public ecz c() {
         return new ecz(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
