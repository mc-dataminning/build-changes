import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dxu implements dwy {
   public static final Codec<dxu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyz.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eac.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dyz.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dyk.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dyw.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dyz.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dxz.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dzq.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dxu::new)
   );
   public final dyz b;
   public final dyz c;
   public final eac d;
   public final dyz e;
   public final dyk f;
   public final Optional<dyw> g;
   public final dxz h;
   public final List<dzq> i;
   public final boolean j;
   public final boolean k;

   protected dxu(dyz $$0, eac $$1, dyz $$2, dyk $$3, Optional<dyw> $$4, dyz $$5, dxz $$6, List<dzq> $$7, boolean $$8, boolean $$9) {
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
      public final dyz a;
      private final eac c;
      public final dyz b;
      private final dyk d;
      private final Optional<dyw> e;
      private dyz f;
      private final dxz g;
      private List<dzq> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dyz $$0, eac $$1, dyz $$2, dyk $$3, Optional<dyw> $$4, dxz $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dyz.a(czh.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dyz $$0, eac $$1, dyz $$2, dyk $$3, dxz $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dxu.a a(dyz $$0) {
         this.f = $$0;
         return this;
      }

      public dxu.a a(List<dzq> $$0) {
         this.h = $$0;
         return this;
      }

      public dxu.a a() {
         this.i = true;
         return this;
      }

      public dxu.a b() {
         this.j = true;
         return this;
      }

      public dxu c() {
         return new dxu(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
