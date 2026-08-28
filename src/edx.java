import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class edx implements edb {
   public static final Codec<edx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efc.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               egf.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               efc.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               een.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eez.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               efc.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eec.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eft.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, edx::new)
   );
   public final efc b;
   public final efc c;
   public final egf d;
   public final efc e;
   public final een f;
   public final Optional<eez> g;
   public final eec h;
   public final List<eft> i;
   public final boolean j;
   public final boolean k;

   protected edx(efc $$0, egf $$1, efc $$2, een $$3, Optional<eez> $$4, efc $$5, eec $$6, List<eft> $$7, boolean $$8, boolean $$9) {
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
      public final efc a;
      private final egf c;
      public final efc b;
      private final een d;
      private final Optional<eez> e;
      private efc f;
      private final eec g;
      private List<eft> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(efc $$0, egf $$1, efc $$2, een $$3, Optional<eez> $$4, eec $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = efc.a(dfa.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(efc $$0, egf $$1, efc $$2, een $$3, eec $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public edx.a a(efc $$0) {
         this.f = $$0;
         return this;
      }

      public edx.a a(List<eft> $$0) {
         this.h = $$0;
         return this;
      }

      public edx.a a() {
         this.i = true;
         return this;
      }

      public edx.a b() {
         this.j = true;
         return this;
      }

      public edx c() {
         return new edx(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
