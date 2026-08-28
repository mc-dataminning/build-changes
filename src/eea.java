import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eea implements ede {
   public static final Codec<eea> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eff.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               egi.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eff.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eeq.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               efc.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eff.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eef.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               efw.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eea::new)
   );
   public final eff b;
   public final eff c;
   public final egi d;
   public final eff e;
   public final eeq f;
   public final Optional<efc> g;
   public final eef h;
   public final List<efw> i;
   public final boolean j;
   public final boolean k;

   protected eea(eff $$0, egi $$1, eff $$2, eeq $$3, Optional<efc> $$4, eff $$5, eef $$6, List<efw> $$7, boolean $$8, boolean $$9) {
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
      public final eff a;
      private final egi c;
      public final eff b;
      private final eeq d;
      private final Optional<efc> e;
      private eff f;
      private final eef g;
      private List<efw> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eff $$0, egi $$1, eff $$2, eeq $$3, Optional<efc> $$4, eef $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eff.a(dfd.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eff $$0, egi $$1, eff $$2, eeq $$3, eef $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public eea.a a(eff $$0) {
         this.f = $$0;
         return this;
      }

      public eea.a a(List<efw> $$0) {
         this.h = $$0;
         return this;
      }

      public eea.a a() {
         this.i = true;
         return this;
      }

      public eea.a b() {
         this.j = true;
         return this;
      }

      public eea c() {
         return new eea(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
