import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class duc implements dtg {
   public static final Codec<duc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvh.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dwk.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dvh.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dus.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dve.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dvh.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               duh.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dvy.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, duc::new)
   );
   public final dvh b;
   public final dvh c;
   public final dwk d;
   public final dvh e;
   public final dus f;
   public final Optional<dve> g;
   public final duh h;
   public final List<dvy> i;
   public final boolean j;
   public final boolean k;

   protected duc(dvh $$0, dwk $$1, dvh $$2, dus $$3, Optional<dve> $$4, dvh $$5, duh $$6, List<dvy> $$7, boolean $$8, boolean $$9) {
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
      public final dvh a;
      private final dwk c;
      public final dvh b;
      private final dus d;
      private final Optional<dve> e;
      private dvh f;
      private final duh g;
      private List<dvy> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dvh $$0, dwk $$1, dvh $$2, dus $$3, Optional<dve> $$4, duh $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dvh.a(cwb.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dvh $$0, dwk $$1, dvh $$2, dus $$3, duh $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public duc.a a(dvh $$0) {
         this.f = $$0;
         return this;
      }

      public duc.a a(List<dvy> $$0) {
         this.h = $$0;
         return this;
      }

      public duc.a a() {
         this.i = true;
         return this;
      }

      public duc.a b() {
         this.j = true;
         return this;
      }

      public duc c() {
         return new duc(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
