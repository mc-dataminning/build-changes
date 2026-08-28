import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eiz implements eid {
   public static final Codec<eiz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eke.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               elj.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eke.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ejp.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ekb.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eke.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eje.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               ekx.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eiz::new)
   );
   public final eke b;
   public final eke c;
   public final elj d;
   public final eke e;
   public final ejp f;
   public final Optional<ekb> g;
   public final eje h;
   public final List<ekx> i;
   public final boolean j;
   public final boolean k;

   protected eiz(eke $$0, elj $$1, eke $$2, ejp $$3, Optional<ekb> $$4, eke $$5, eje $$6, List<ekx> $$7, boolean $$8, boolean $$9) {
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
      public final eke a;
      private final elj c;
      public final eke b;
      private final ejp d;
      private final Optional<ekb> e;
      private eke f;
      private final eje g;
      private List<ekx> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eke $$0, elj $$1, eke $$2, ejp $$3, Optional<ekb> $$4, eje $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eke.a(djp.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eke $$0, elj $$1, eke $$2, ejp $$3, eje $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public eiz.a a(eke $$0) {
         this.f = $$0;
         return this;
      }

      public eiz.a a(List<ekx> $$0) {
         this.h = $$0;
         return this;
      }

      public eiz.a a() {
         this.i = true;
         return this;
      }

      public eiz.a b() {
         this.j = true;
         return this;
      }

      public eiz c() {
         return new eiz(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
