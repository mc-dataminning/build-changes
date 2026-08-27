import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dys implements dxw {
   public static final Codec<dys> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzx.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eba.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dzx.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dzi.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dzu.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dzx.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dyx.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eao.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dys::new)
   );
   public final dzx b;
   public final dzx c;
   public final eba d;
   public final dzx e;
   public final dzi f;
   public final Optional<dzu> g;
   public final dyx h;
   public final List<eao> i;
   public final boolean j;
   public final boolean k;

   protected dys(dzx $$0, eba $$1, dzx $$2, dzi $$3, Optional<dzu> $$4, dzx $$5, dyx $$6, List<eao> $$7, boolean $$8, boolean $$9) {
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
      public final dzx a;
      private final eba c;
      public final dzx b;
      private final dzi d;
      private final Optional<dzu> e;
      private dzx f;
      private final dyx g;
      private List<eao> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dzx $$0, eba $$1, dzx $$2, dzi $$3, Optional<dzu> $$4, dyx $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dzx.a(dae.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dzx $$0, eba $$1, dzx $$2, dzi $$3, dyx $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dys.a a(dzx $$0) {
         this.f = $$0;
         return this;
      }

      public dys.a a(List<eao> $$0) {
         this.h = $$0;
         return this;
      }

      public dys.a a() {
         this.i = true;
         return this;
      }

      public dys.a b() {
         this.j = true;
         return this;
      }

      public dys c() {
         return new dys(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
