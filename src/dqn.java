import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dqn implements dpr {
   public static final Codec<dqn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drs.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dsv.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               drs.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               drd.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               drp.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               drs.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dqs.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dsj.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dqn::new)
   );
   public final drs b;
   public final drs c;
   public final dsv d;
   public final drs e;
   public final drd f;
   public final Optional<drp> g;
   public final dqs h;
   public final List<dsj> i;
   public final boolean j;
   public final boolean k;

   protected dqn(drs $$0, dsv $$1, drs $$2, drd $$3, Optional<drp> $$4, drs $$5, dqs $$6, List<dsj> $$7, boolean $$8, boolean $$9) {
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
      public final drs a;
      private final dsv c;
      public final drs b;
      private final drd d;
      private final Optional<drp> e;
      private drs f;
      private final dqs g;
      private List<dsj> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(drs $$0, dsv $$1, drs $$2, drd $$3, Optional<drp> $$4, dqs $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = drs.a(csn.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(drs $$0, dsv $$1, drs $$2, drd $$3, dqs $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dqn.a a(drs $$0) {
         this.f = $$0;
         return this;
      }

      public dqn.a a(List<dsj> $$0) {
         this.h = $$0;
         return this;
      }

      public dqn.a a() {
         this.i = true;
         return this;
      }

      public dqn.a b() {
         this.j = true;
         return this;
      }

      public dqn c() {
         return new dqn(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
