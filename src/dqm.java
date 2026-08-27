import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dqm implements dpq {
   public static final Codec<dqm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drr.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dsu.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               drr.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               drc.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dro.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               drr.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dqr.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dsi.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dqm::new)
   );
   public final drr b;
   public final drr c;
   public final dsu d;
   public final drr e;
   public final drc f;
   public final Optional<dro> g;
   public final dqr h;
   public final List<dsi> i;
   public final boolean j;
   public final boolean k;

   protected dqm(drr $$0, dsu $$1, drr $$2, drc $$3, Optional<dro> $$4, drr $$5, dqr $$6, List<dsi> $$7, boolean $$8, boolean $$9) {
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
      public final drr a;
      private final dsu c;
      public final drr b;
      private final drc d;
      private final Optional<dro> e;
      private drr f;
      private final dqr g;
      private List<dsi> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(drr $$0, dsu $$1, drr $$2, drc $$3, Optional<dro> $$4, dqr $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = drr.a(csm.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(drr $$0, dsu $$1, drr $$2, drc $$3, dqr $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dqm.a a(drr $$0) {
         this.f = $$0;
         return this;
      }

      public dqm.a a(List<dsi> $$0) {
         this.h = $$0;
         return this;
      }

      public dqm.a a() {
         this.i = true;
         return this;
      }

      public dqm.a b() {
         this.j = true;
         return this;
      }

      public dqm c() {
         return new dqm(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
