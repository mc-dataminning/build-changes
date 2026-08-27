import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dqw implements dqa {
   public static final Codec<dqw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsb.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dte.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dsb.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               drm.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dry.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dsb.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               drb.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dss.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dqw::new)
   );
   public final dsb b;
   public final dsb c;
   public final dte d;
   public final dsb e;
   public final drm f;
   public final Optional<dry> g;
   public final drb h;
   public final List<dss> i;
   public final boolean j;
   public final boolean k;

   protected dqw(dsb $$0, dte $$1, dsb $$2, drm $$3, Optional<dry> $$4, dsb $$5, drb $$6, List<dss> $$7, boolean $$8, boolean $$9) {
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
      public final dsb a;
      private final dte c;
      public final dsb b;
      private final drm d;
      private final Optional<dry> e;
      private dsb f;
      private final drb g;
      private List<dss> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dsb $$0, dte $$1, dsb $$2, drm $$3, Optional<dry> $$4, drb $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dsb.a(csw.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dsb $$0, dte $$1, dsb $$2, drm $$3, drb $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dqw.a a(dsb $$0) {
         this.f = $$0;
         return this;
      }

      public dqw.a a(List<dss> $$0) {
         this.h = $$0;
         return this;
      }

      public dqw.a a() {
         this.i = true;
         return this;
      }

      public dqw.a b() {
         this.j = true;
         return this;
      }

      public dqw c() {
         return new dqw(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
