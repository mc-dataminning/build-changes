import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class enx implements enb {
   public static final Codec<enx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               epc.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eqj.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               epc.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eon.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eoz.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               epc.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eoc.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               epx.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, enx::new)
   );
   public final epc b;
   public final epc c;
   public final eqj d;
   public final epc e;
   public final eon f;
   public final Optional<eoz> g;
   public final eoc h;
   public final List<epx> i;
   public final boolean j;
   public final boolean k;

   protected enx(epc $$0, eqj $$1, epc $$2, eon $$3, Optional<eoz> $$4, epc $$5, eoc $$6, List<epx> $$7, boolean $$8, boolean $$9) {
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
      public final epc a;
      private final eqj c;
      public final epc b;
      private final eon d;
      private final Optional<eoz> e;
      private epc f;
      private final eoc g;
      private List<epx> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(epc $$0, eqj $$1, epc $$2, eon $$3, Optional<eoz> $$4, eoc $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = epc.a(dnq.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(epc $$0, eqj $$1, epc $$2, eon $$3, eoc $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public enx.a a(epc $$0) {
         this.f = $$0;
         return this;
      }

      public enx.a a(List<epx> $$0) {
         this.h = $$0;
         return this;
      }

      public enx.a a() {
         this.i = true;
         return this;
      }

      public enx.a b() {
         this.j = true;
         return this;
      }

      public enx c() {
         return new enx(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
