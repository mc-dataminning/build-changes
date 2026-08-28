import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ehf implements egj {
   public static final Codec<ehf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eik.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               ejn.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eik.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ehv.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eih.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eik.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ehk.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               ejb.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ehf::new)
   );
   public final eik b;
   public final eik c;
   public final ejn d;
   public final eik e;
   public final ehv f;
   public final Optional<eih> g;
   public final ehk h;
   public final List<ejb> i;
   public final boolean j;
   public final boolean k;

   protected ehf(eik $$0, ejn $$1, eik $$2, ehv $$3, Optional<eih> $$4, eik $$5, ehk $$6, List<ejb> $$7, boolean $$8, boolean $$9) {
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
      public final eik a;
      private final ejn c;
      public final eik b;
      private final ehv d;
      private final Optional<eih> e;
      private eik f;
      private final ehk g;
      private List<ejb> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eik $$0, ejn $$1, eik $$2, ehv $$3, Optional<eih> $$4, ehk $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eik.a(dia.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eik $$0, ejn $$1, eik $$2, ehv $$3, ehk $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ehf.a a(eik $$0) {
         this.f = $$0;
         return this;
      }

      public ehf.a a(List<ejb> $$0) {
         this.h = $$0;
         return this;
      }

      public ehf.a a() {
         this.i = true;
         return this;
      }

      public ehf.a b() {
         this.j = true;
         return this;
      }

      public ehf c() {
         return new ehf(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
