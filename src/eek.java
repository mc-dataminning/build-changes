import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eek implements edo {
   public static final Codec<eek> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efp.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               egs.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               efp.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               efa.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               efm.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               efp.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eep.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               egg.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eek::new)
   );
   public final efp b;
   public final efp c;
   public final egs d;
   public final efp e;
   public final efa f;
   public final Optional<efm> g;
   public final eep h;
   public final List<egg> i;
   public final boolean j;
   public final boolean k;

   protected eek(efp $$0, egs $$1, efp $$2, efa $$3, Optional<efm> $$4, efp $$5, eep $$6, List<egg> $$7, boolean $$8, boolean $$9) {
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
      public final efp a;
      private final egs c;
      public final efp b;
      private final efa d;
      private final Optional<efm> e;
      private efp f;
      private final eep g;
      private List<egg> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(efp $$0, egs $$1, efp $$2, efa $$3, Optional<efm> $$4, eep $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = efp.a(dfj.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(efp $$0, egs $$1, efp $$2, efa $$3, eep $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public eek.a a(efp $$0) {
         this.f = $$0;
         return this;
      }

      public eek.a a(List<egg> $$0) {
         this.h = $$0;
         return this;
      }

      public eek.a a() {
         this.i = true;
         return this;
      }

      public eek.a b() {
         this.j = true;
         return this;
      }

      public eek c() {
         return new eek(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
