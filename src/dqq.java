import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dqq implements dpu {
   public static final Codec<dqq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drv.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dsy.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               drv.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               drg.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               drs.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               drv.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dqv.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dsm.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dqq::new)
   );
   public final drv b;
   public final drv c;
   public final dsy d;
   public final drv e;
   public final drg f;
   public final Optional<drs> g;
   public final dqv h;
   public final List<dsm> i;
   public final boolean j;
   public final boolean k;

   protected dqq(drv $$0, dsy $$1, drv $$2, drg $$3, Optional<drs> $$4, drv $$5, dqv $$6, List<dsm> $$7, boolean $$8, boolean $$9) {
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
      public final drv a;
      private final dsy c;
      public final drv b;
      private final drg d;
      private final Optional<drs> e;
      private drv f;
      private final dqv g;
      private List<dsm> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(drv $$0, dsy $$1, drv $$2, drg $$3, Optional<drs> $$4, dqv $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = drv.a(cte.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(drv $$0, dsy $$1, drv $$2, drg $$3, dqv $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dqq.a a(drv $$0) {
         this.f = $$0;
         return this;
      }

      public dqq.a a(List<dsm> $$0) {
         this.h = $$0;
         return this;
      }

      public dqq.a a() {
         this.i = true;
         return this;
      }

      public dqq.a b() {
         this.j = true;
         return this;
      }

      public dqq c() {
         return new dqq(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
