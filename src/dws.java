import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dws implements dvw {
   public static final Codec<dws> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxx.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dza.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dxx.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dxi.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dxu.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dxx.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dwx.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dyo.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dws::new)
   );
   public final dxx b;
   public final dxx c;
   public final dza d;
   public final dxx e;
   public final dxi f;
   public final Optional<dxu> g;
   public final dwx h;
   public final List<dyo> i;
   public final boolean j;
   public final boolean k;

   protected dws(dxx $$0, dza $$1, dxx $$2, dxi $$3, Optional<dxu> $$4, dxx $$5, dwx $$6, List<dyo> $$7, boolean $$8, boolean $$9) {
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
      public final dxx a;
      private final dza c;
      public final dxx b;
      private final dxi d;
      private final Optional<dxu> e;
      private dxx f;
      private final dwx g;
      private List<dyo> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dxx $$0, dza $$1, dxx $$2, dxi $$3, Optional<dxu> $$4, dwx $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dxx.a(cyq.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dxx $$0, dza $$1, dxx $$2, dxi $$3, dwx $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dws.a a(dxx $$0) {
         this.f = $$0;
         return this;
      }

      public dws.a a(List<dyo> $$0) {
         this.h = $$0;
         return this;
      }

      public dws.a a() {
         this.i = true;
         return this;
      }

      public dws.a b() {
         this.j = true;
         return this;
      }

      public dws c() {
         return new dws(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
