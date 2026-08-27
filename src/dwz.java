import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dwz implements dwd {
   public static final Codec<dwz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dye.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dzh.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dye.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dxp.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dyb.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dye.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dxe.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dyv.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dwz::new)
   );
   public final dye b;
   public final dye c;
   public final dzh d;
   public final dye e;
   public final dxp f;
   public final Optional<dyb> g;
   public final dxe h;
   public final List<dyv> i;
   public final boolean j;
   public final boolean k;

   protected dwz(dye $$0, dzh $$1, dye $$2, dxp $$3, Optional<dyb> $$4, dye $$5, dxe $$6, List<dyv> $$7, boolean $$8, boolean $$9) {
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
      public final dye a;
      private final dzh c;
      public final dye b;
      private final dxp d;
      private final Optional<dyb> e;
      private dye f;
      private final dxe g;
      private List<dyv> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dye $$0, dzh $$1, dye $$2, dxp $$3, Optional<dyb> $$4, dxe $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dye.a(cyu.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dye $$0, dzh $$1, dye $$2, dxp $$3, dxe $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dwz.a a(dye $$0) {
         this.f = $$0;
         return this;
      }

      public dwz.a a(List<dyv> $$0) {
         this.h = $$0;
         return this;
      }

      public dwz.a a() {
         this.i = true;
         return this;
      }

      public dwz.a b() {
         this.j = true;
         return this;
      }

      public dwz c() {
         return new dwz(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
