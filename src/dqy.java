import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dqy implements dqc {
   public static final Codec<dqy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsd.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dtg.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dsd.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dro.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dsa.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dsd.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               drd.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dsu.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dqy::new)
   );
   public final dsd b;
   public final dsd c;
   public final dtg d;
   public final dsd e;
   public final dro f;
   public final Optional<dsa> g;
   public final drd h;
   public final List<dsu> i;
   public final boolean j;
   public final boolean k;

   protected dqy(dsd $$0, dtg $$1, dsd $$2, dro $$3, Optional<dsa> $$4, dsd $$5, drd $$6, List<dsu> $$7, boolean $$8, boolean $$9) {
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
      public final dsd a;
      private final dtg c;
      public final dsd b;
      private final dro d;
      private final Optional<dsa> e;
      private dsd f;
      private final drd g;
      private List<dsu> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dsd $$0, dtg $$1, dsd $$2, dro $$3, Optional<dsa> $$4, drd $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dsd.a(csy.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dsd $$0, dtg $$1, dsd $$2, dro $$3, drd $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dqy.a a(dsd $$0) {
         this.f = $$0;
         return this;
      }

      public dqy.a a(List<dsu> $$0) {
         this.h = $$0;
         return this;
      }

      public dqy.a a() {
         this.i = true;
         return this;
      }

      public dqy.a b() {
         this.j = true;
         return this;
      }

      public dqy c() {
         return new dqy(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
