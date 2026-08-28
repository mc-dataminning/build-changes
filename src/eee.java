import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eee implements edi {
   public static final Codec<eee> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efj.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               egm.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               efj.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eeu.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               efg.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               efj.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eej.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               ega.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eee::new)
   );
   public final efj b;
   public final efj c;
   public final egm d;
   public final efj e;
   public final eeu f;
   public final Optional<efg> g;
   public final eej h;
   public final List<ega> i;
   public final boolean j;
   public final boolean k;

   protected eee(efj $$0, egm $$1, efj $$2, eeu $$3, Optional<efg> $$4, efj $$5, eej $$6, List<ega> $$7, boolean $$8, boolean $$9) {
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
      public final efj a;
      private final egm c;
      public final efj b;
      private final eeu d;
      private final Optional<efg> e;
      private efj f;
      private final eej g;
      private List<ega> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(efj $$0, egm $$1, efj $$2, eeu $$3, Optional<efg> $$4, eej $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = efj.a(dfh.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(efj $$0, egm $$1, efj $$2, eeu $$3, eej $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public eee.a a(efj $$0) {
         this.f = $$0;
         return this;
      }

      public eee.a a(List<ega> $$0) {
         this.h = $$0;
         return this;
      }

      public eee.a a() {
         this.i = true;
         return this;
      }

      public eee.a b() {
         this.j = true;
         return this;
      }

      public eee c() {
         return new eee(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
