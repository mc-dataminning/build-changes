import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eav implements dzz {
   public static final Codec<eav> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eca.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               edd.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eca.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ebl.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ebx.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eca.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eba.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               ecr.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eav::new)
   );
   public final eca b;
   public final eca c;
   public final edd d;
   public final eca e;
   public final ebl f;
   public final Optional<ebx> g;
   public final eba h;
   public final List<ecr> i;
   public final boolean j;
   public final boolean k;

   protected eav(eca $$0, edd $$1, eca $$2, ebl $$3, Optional<ebx> $$4, eca $$5, eba $$6, List<ecr> $$7, boolean $$8, boolean $$9) {
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
      public final eca a;
      private final edd c;
      public final eca b;
      private final ebl d;
      private final Optional<ebx> e;
      private eca f;
      private final eba g;
      private List<ecr> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eca $$0, edd $$1, eca $$2, ebl $$3, Optional<ebx> $$4, eba $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eca.a(dca.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eca $$0, edd $$1, eca $$2, ebl $$3, eba $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public eav.a a(eca $$0) {
         this.f = $$0;
         return this;
      }

      public eav.a a(List<ecr> $$0) {
         this.h = $$0;
         return this;
      }

      public eav.a a() {
         this.i = true;
         return this;
      }

      public eav.a b() {
         this.j = true;
         return this;
      }

      public eav c() {
         return new eav(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
