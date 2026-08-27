import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dut implements dtx {
   public static final Codec<dut> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvy.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dxb.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dvy.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dvj.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dvv.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dvy.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               duy.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dwp.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dut::new)
   );
   public final dvy b;
   public final dvy c;
   public final dxb d;
   public final dvy e;
   public final dvj f;
   public final Optional<dvv> g;
   public final duy h;
   public final List<dwp> i;
   public final boolean j;
   public final boolean k;

   protected dut(dvy $$0, dxb $$1, dvy $$2, dvj $$3, Optional<dvv> $$4, dvy $$5, duy $$6, List<dwp> $$7, boolean $$8, boolean $$9) {
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
      public final dvy a;
      private final dxb c;
      public final dvy b;
      private final dvj d;
      private final Optional<dvv> e;
      private dvy f;
      private final duy g;
      private List<dwp> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dvy $$0, dxb $$1, dvy $$2, dvj $$3, Optional<dvv> $$4, duy $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dvy.a(cwr.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dvy $$0, dxb $$1, dvy $$2, dvj $$3, duy $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dut.a a(dvy $$0) {
         this.f = $$0;
         return this;
      }

      public dut.a a(List<dwp> $$0) {
         this.h = $$0;
         return this;
      }

      public dut.a a() {
         this.i = true;
         return this;
      }

      public dut.a b() {
         this.j = true;
         return this;
      }

      public dut c() {
         return new dut(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
