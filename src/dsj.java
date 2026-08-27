import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dsj implements drn {
   public static final Codec<dsj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dto.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dur.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dto.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dsz.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dtl.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dto.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dso.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               duf.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dsj::new)
   );
   public final dto b;
   public final dto c;
   public final dur d;
   public final dto e;
   public final dsz f;
   public final Optional<dtl> g;
   public final dso h;
   public final List<duf> i;
   public final boolean j;
   public final boolean k;

   protected dsj(dto $$0, dur $$1, dto $$2, dsz $$3, Optional<dtl> $$4, dto $$5, dso $$6, List<duf> $$7, boolean $$8, boolean $$9) {
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
      public final dto a;
      private final dur c;
      public final dto b;
      private final dsz d;
      private final Optional<dtl> e;
      private dto f;
      private final dso g;
      private List<duf> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dto $$0, dur $$1, dto $$2, dsz $$3, Optional<dtl> $$4, dso $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dto.a(cuv.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dto $$0, dur $$1, dto $$2, dsz $$3, dso $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dsj.a a(dto $$0) {
         this.f = $$0;
         return this;
      }

      public dsj.a a(List<duf> $$0) {
         this.h = $$0;
         return this;
      }

      public dsj.a a() {
         this.i = true;
         return this;
      }

      public dsj.a b() {
         this.j = true;
         return this;
      }

      public dsj c() {
         return new dsj(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
