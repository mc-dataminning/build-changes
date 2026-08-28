import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class enl implements emp {
   public static final Codec<enl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eoq.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               epx.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eoq.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eob.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eon.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eoq.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               enq.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               epl.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, enl::new)
   );
   public final eoq b;
   public final eoq c;
   public final epx d;
   public final eoq e;
   public final eob f;
   public final Optional<eon> g;
   public final enq h;
   public final List<epl> i;
   public final boolean j;
   public final boolean k;

   protected enl(eoq $$0, epx $$1, eoq $$2, eob $$3, Optional<eon> $$4, eoq $$5, enq $$6, List<epl> $$7, boolean $$8, boolean $$9) {
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
      public final eoq a;
      private final epx c;
      public final eoq b;
      private final eob d;
      private final Optional<eon> e;
      private eoq f;
      private final enq g;
      private List<epl> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eoq $$0, epx $$1, eoq $$2, eob $$3, Optional<eon> $$4, enq $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eoq.a(dne.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eoq $$0, epx $$1, eoq $$2, eob $$3, enq $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public enl.a a(eoq $$0) {
         this.f = $$0;
         return this;
      }

      public enl.a a(List<epl> $$0) {
         this.h = $$0;
         return this;
      }

      public enl.a a() {
         this.i = true;
         return this;
      }

      public enl.a b() {
         this.j = true;
         return this;
      }

      public enl c() {
         return new enl(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
