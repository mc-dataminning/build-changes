import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class edt implements ecx {
   public static final Codec<edt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eey.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               egb.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eey.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eej.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eev.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eey.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               edy.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               efp.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, edt::new)
   );
   public final eey b;
   public final eey c;
   public final egb d;
   public final eey e;
   public final eej f;
   public final Optional<eev> g;
   public final edy h;
   public final List<efp> i;
   public final boolean j;
   public final boolean k;

   protected edt(eey $$0, egb $$1, eey $$2, eej $$3, Optional<eev> $$4, eey $$5, edy $$6, List<efp> $$7, boolean $$8, boolean $$9) {
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
      public final eey a;
      private final egb c;
      public final eey b;
      private final eej d;
      private final Optional<eev> e;
      private eey f;
      private final edy g;
      private List<efp> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eey $$0, egb $$1, eey $$2, eej $$3, Optional<eev> $$4, edy $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eey.a(dew.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eey $$0, egb $$1, eey $$2, eej $$3, edy $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public edt.a a(eey $$0) {
         this.f = $$0;
         return this;
      }

      public edt.a a(List<efp> $$0) {
         this.h = $$0;
         return this;
      }

      public edt.a a() {
         this.i = true;
         return this;
      }

      public edt.a b() {
         this.j = true;
         return this;
      }

      public edt c() {
         return new edt(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
