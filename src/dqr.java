import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dqr implements dpv {
   public static final Codec<dqr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drw.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dsz.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               drw.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               drh.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               drt.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               drw.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dqw.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dsn.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dqr::new)
   );
   public final drw b;
   public final drw c;
   public final dsz d;
   public final drw e;
   public final drh f;
   public final Optional<drt> g;
   public final dqw h;
   public final List<dsn> i;
   public final boolean j;
   public final boolean k;

   protected dqr(drw $$0, dsz $$1, drw $$2, drh $$3, Optional<drt> $$4, drw $$5, dqw $$6, List<dsn> $$7, boolean $$8, boolean $$9) {
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
      public final drw a;
      private final dsz c;
      public final drw b;
      private final drh d;
      private final Optional<drt> e;
      private drw f;
      private final dqw g;
      private List<dsn> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(drw $$0, dsz $$1, drw $$2, drh $$3, Optional<drt> $$4, dqw $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = drw.a(csr.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(drw $$0, dsz $$1, drw $$2, drh $$3, dqw $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dqr.a a(drw $$0) {
         this.f = $$0;
         return this;
      }

      public dqr.a a(List<dsn> $$0) {
         this.h = $$0;
         return this;
      }

      public dqr.a a() {
         this.i = true;
         return this;
      }

      public dqr.a b() {
         this.j = true;
         return this;
      }

      public dqr c() {
         return new dqr(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
