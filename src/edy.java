import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class edy implements edc {
   public static final Codec<edy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efd.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               egg.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               efd.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eeo.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               efa.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               efd.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eed.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               efu.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, edy::new)
   );
   public final efd b;
   public final efd c;
   public final egg d;
   public final efd e;
   public final eeo f;
   public final Optional<efa> g;
   public final eed h;
   public final List<efu> i;
   public final boolean j;
   public final boolean k;

   protected edy(efd $$0, egg $$1, efd $$2, eeo $$3, Optional<efa> $$4, efd $$5, eed $$6, List<efu> $$7, boolean $$8, boolean $$9) {
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
      public final efd a;
      private final egg c;
      public final efd b;
      private final eeo d;
      private final Optional<efa> e;
      private efd f;
      private final eed g;
      private List<efu> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(efd $$0, egg $$1, efd $$2, eeo $$3, Optional<efa> $$4, eed $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = efd.a(dfb.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(efd $$0, egg $$1, efd $$2, eeo $$3, eed $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public edy.a a(efd $$0) {
         this.f = $$0;
         return this;
      }

      public edy.a a(List<efu> $$0) {
         this.h = $$0;
         return this;
      }

      public edy.a a() {
         this.i = true;
         return this;
      }

      public edy.a b() {
         this.j = true;
         return this;
      }

      public edy c() {
         return new edy(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
