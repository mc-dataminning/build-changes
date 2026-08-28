import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class edz implements edd {
   public static final Codec<edz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efe.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               egh.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               efe.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eep.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               efb.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               efe.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eee.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               efv.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, edz::new)
   );
   public final efe b;
   public final efe c;
   public final egh d;
   public final efe e;
   public final eep f;
   public final Optional<efb> g;
   public final eee h;
   public final List<efv> i;
   public final boolean j;
   public final boolean k;

   protected edz(efe $$0, egh $$1, efe $$2, eep $$3, Optional<efb> $$4, efe $$5, eee $$6, List<efv> $$7, boolean $$8, boolean $$9) {
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
      public final efe a;
      private final egh c;
      public final efe b;
      private final eep d;
      private final Optional<efb> e;
      private efe f;
      private final eee g;
      private List<efv> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(efe $$0, egh $$1, efe $$2, eep $$3, Optional<efb> $$4, eee $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = efe.a(dfc.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(efe $$0, egh $$1, efe $$2, eep $$3, eee $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public edz.a a(efe $$0) {
         this.f = $$0;
         return this;
      }

      public edz.a a(List<efv> $$0) {
         this.h = $$0;
         return this;
      }

      public edz.a a() {
         this.i = true;
         return this;
      }

      public edz.a b() {
         this.j = true;
         return this;
      }

      public edz c() {
         return new edz(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
