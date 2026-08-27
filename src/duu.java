import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class duu implements dty {
   public static final Codec<duu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvz.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dxc.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dvz.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dvk.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dvw.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dvz.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               duz.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dwq.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, duu::new)
   );
   public final dvz b;
   public final dvz c;
   public final dxc d;
   public final dvz e;
   public final dvk f;
   public final Optional<dvw> g;
   public final duz h;
   public final List<dwq> i;
   public final boolean j;
   public final boolean k;

   protected duu(dvz $$0, dxc $$1, dvz $$2, dvk $$3, Optional<dvw> $$4, dvz $$5, duz $$6, List<dwq> $$7, boolean $$8, boolean $$9) {
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
      public final dvz a;
      private final dxc c;
      public final dvz b;
      private final dvk d;
      private final Optional<dvw> e;
      private dvz f;
      private final duz g;
      private List<dwq> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dvz $$0, dxc $$1, dvz $$2, dvk $$3, Optional<dvw> $$4, duz $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dvz.a(cws.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dvz $$0, dxc $$1, dvz $$2, dvk $$3, duz $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public duu.a a(dvz $$0) {
         this.f = $$0;
         return this;
      }

      public duu.a a(List<dwq> $$0) {
         this.h = $$0;
         return this;
      }

      public duu.a a() {
         this.i = true;
         return this;
      }

      public duu.a b() {
         this.j = true;
         return this;
      }

      public duu c() {
         return new duu(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
