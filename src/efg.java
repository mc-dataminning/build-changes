import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class efg implements eek {
   public static final Codec<efg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egl.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eho.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               egl.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               efw.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               egi.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               egl.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               efl.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               ehc.i.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, efg::new)
   );
   public final egl b;
   public final egl c;
   public final eho d;
   public final egl e;
   public final efw f;
   public final Optional<egi> g;
   public final efl h;
   public final List<ehc> i;
   public final boolean j;
   public final boolean k;

   protected efg(egl $$0, eho $$1, egl $$2, efw $$3, Optional<egi> $$4, egl $$5, efl $$6, List<ehc> $$7, boolean $$8, boolean $$9) {
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
      public final egl a;
      private final eho c;
      public final egl b;
      private final efw d;
      private final Optional<egi> e;
      private egl f;
      private final efl g;
      private List<ehc> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(egl $$0, eho $$1, egl $$2, efw $$3, Optional<egi> $$4, efl $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = egl.a(dfe.m);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(egl $$0, eho $$1, egl $$2, efw $$3, efl $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public efg.a a(egl $$0) {
         this.f = $$0;
         return this;
      }

      public efg.a a(List<ehc> $$0) {
         this.h = $$0;
         return this;
      }

      public efg.a a() {
         this.i = true;
         return this;
      }

      public efg.a b() {
         this.j = true;
         return this;
      }

      public efg c() {
         return new efg(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
