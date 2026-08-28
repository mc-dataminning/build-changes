import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eel implements edp {
   public static final Codec<eel> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efq.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               egt.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               efq.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               efb.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               efn.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               efq.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eeq.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               egh.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eel::new)
   );
   public final efq b;
   public final efq c;
   public final egt d;
   public final efq e;
   public final efb f;
   public final Optional<efn> g;
   public final eeq h;
   public final List<egh> i;
   public final boolean j;
   public final boolean k;

   protected eel(efq $$0, egt $$1, efq $$2, efb $$3, Optional<efn> $$4, efq $$5, eeq $$6, List<egh> $$7, boolean $$8, boolean $$9) {
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
      public final efq a;
      private final egt c;
      public final efq b;
      private final efb d;
      private final Optional<efn> e;
      private efq f;
      private final eeq g;
      private List<egh> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(efq $$0, egt $$1, efq $$2, efb $$3, Optional<efn> $$4, eeq $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = efq.a(dfk.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(efq $$0, egt $$1, efq $$2, efb $$3, eeq $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public eel.a a(efq $$0) {
         this.f = $$0;
         return this;
      }

      public eel.a a(List<egh> $$0) {
         this.h = $$0;
         return this;
      }

      public eel.a a() {
         this.i = true;
         return this;
      }

      public eel.a b() {
         this.j = true;
         return this;
      }

      public eel c() {
         return new eel(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
