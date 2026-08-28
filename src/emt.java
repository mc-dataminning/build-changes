import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class emt implements elx {
   public static final Codec<emt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eny.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               epe.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eny.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               enj.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               env.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eny.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               emy.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eos.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, emt::new)
   );
   public final eny b;
   public final eny c;
   public final epe d;
   public final eny e;
   public final enj f;
   public final Optional<env> g;
   public final emy h;
   public final List<eos> i;
   public final boolean j;
   public final boolean k;

   protected emt(eny $$0, epe $$1, eny $$2, enj $$3, Optional<env> $$4, eny $$5, emy $$6, List<eos> $$7, boolean $$8, boolean $$9) {
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
      public final eny a;
      private final epe c;
      public final eny b;
      private final enj d;
      private final Optional<env> e;
      private eny f;
      private final emy g;
      private List<eos> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eny $$0, epe $$1, eny $$2, enj $$3, Optional<env> $$4, emy $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eny.a(dmo.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eny $$0, epe $$1, eny $$2, enj $$3, emy $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public emt.a a(eny $$0) {
         this.f = $$0;
         return this;
      }

      public emt.a a(List<eos> $$0) {
         this.h = $$0;
         return this;
      }

      public emt.a a() {
         this.i = true;
         return this;
      }

      public emt.a b() {
         this.j = true;
         return this;
      }

      public emt c() {
         return new emt(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
