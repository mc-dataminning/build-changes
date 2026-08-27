import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dun implements dtr {
   public static final Codec<dun> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvs.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dwv.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dvs.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dvd.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dvp.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dvs.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dus.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dwj.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dun::new)
   );
   public final dvs b;
   public final dvs c;
   public final dwv d;
   public final dvs e;
   public final dvd f;
   public final Optional<dvp> g;
   public final dus h;
   public final List<dwj> i;
   public final boolean j;
   public final boolean k;

   protected dun(dvs $$0, dwv $$1, dvs $$2, dvd $$3, Optional<dvp> $$4, dvs $$5, dus $$6, List<dwj> $$7, boolean $$8, boolean $$9) {
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
      public final dvs a;
      private final dwv c;
      public final dvs b;
      private final dvd d;
      private final Optional<dvp> e;
      private dvs f;
      private final dus g;
      private List<dwj> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dvs $$0, dwv $$1, dvs $$2, dvd $$3, Optional<dvp> $$4, dus $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dvs.a(cwl.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dvs $$0, dwv $$1, dvs $$2, dvd $$3, dus $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dun.a a(dvs $$0) {
         this.f = $$0;
         return this;
      }

      public dun.a a(List<dwj> $$0) {
         this.h = $$0;
         return this;
      }

      public dun.a a() {
         this.i = true;
         return this;
      }

      public dun.a b() {
         this.j = true;
         return this;
      }

      public dun c() {
         return new dun(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
