import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class efa implements eee {
   public static final Codec<efa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egf.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               ehi.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               egf.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               efq.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               egc.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               egf.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eff.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               egw.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, efa::new)
   );
   public final egf b;
   public final egf c;
   public final ehi d;
   public final egf e;
   public final efq f;
   public final Optional<egc> g;
   public final eff h;
   public final List<egw> i;
   public final boolean j;
   public final boolean k;

   protected efa(egf $$0, ehi $$1, egf $$2, efq $$3, Optional<egc> $$4, egf $$5, eff $$6, List<egw> $$7, boolean $$8, boolean $$9) {
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
      public final egf a;
      private final ehi c;
      public final egf b;
      private final efq d;
      private final Optional<egc> e;
      private egf f;
      private final eff g;
      private List<egw> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(egf $$0, ehi $$1, egf $$2, efq $$3, Optional<egc> $$4, eff $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = egf.a(dfy.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(egf $$0, ehi $$1, egf $$2, efq $$3, eff $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public efa.a a(egf $$0) {
         this.f = $$0;
         return this;
      }

      public efa.a a(List<egw> $$0) {
         this.h = $$0;
         return this;
      }

      public efa.a a() {
         this.i = true;
         return this;
      }

      public efa.a b() {
         this.j = true;
         return this;
      }

      public efa c() {
         return new efa(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
