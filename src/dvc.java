import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dvc implements dug {
   public static final Codec<dvc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwh.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dxk.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dwh.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dvs.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dwe.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dwh.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dvh.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dwy.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dvc::new)
   );
   public final dwh b;
   public final dwh c;
   public final dxk d;
   public final dwh e;
   public final dvs f;
   public final Optional<dwe> g;
   public final dvh h;
   public final List<dwy> i;
   public final boolean j;
   public final boolean k;

   protected dvc(dwh $$0, dxk $$1, dwh $$2, dvs $$3, Optional<dwe> $$4, dwh $$5, dvh $$6, List<dwy> $$7, boolean $$8, boolean $$9) {
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
      public final dwh a;
      private final dxk c;
      public final dwh b;
      private final dvs d;
      private final Optional<dwe> e;
      private dwh f;
      private final dvh g;
      private List<dwy> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dwh $$0, dxk $$1, dwh $$2, dvs $$3, Optional<dwe> $$4, dvh $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dwh.a(cxa.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dwh $$0, dxk $$1, dwh $$2, dvs $$3, dvh $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dvc.a a(dwh $$0) {
         this.f = $$0;
         return this;
      }

      public dvc.a a(List<dwy> $$0) {
         this.h = $$0;
         return this;
      }

      public dvc.a a() {
         this.i = true;
         return this;
      }

      public dvc.a b() {
         this.j = true;
         return this;
      }

      public dvc c() {
         return new dvc(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
