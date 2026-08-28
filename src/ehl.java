import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ehl implements egp {
   public static final Codec<ehl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eiq.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               ejt.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eiq.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eib.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ein.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eiq.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ehq.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               ejh.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ehl::new)
   );
   public final eiq b;
   public final eiq c;
   public final ejt d;
   public final eiq e;
   public final eib f;
   public final Optional<ein> g;
   public final ehq h;
   public final List<ejh> i;
   public final boolean j;
   public final boolean k;

   protected ehl(eiq $$0, ejt $$1, eiq $$2, eib $$3, Optional<ein> $$4, eiq $$5, ehq $$6, List<ejh> $$7, boolean $$8, boolean $$9) {
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
      public final eiq a;
      private final ejt c;
      public final eiq b;
      private final eib d;
      private final Optional<ein> e;
      private eiq f;
      private final ehq g;
      private List<ejh> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eiq $$0, ejt $$1, eiq $$2, eib $$3, Optional<ein> $$4, ehq $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eiq.a(dig.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eiq $$0, ejt $$1, eiq $$2, eib $$3, ehq $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ehl.a a(eiq $$0) {
         this.f = $$0;
         return this;
      }

      public ehl.a a(List<ejh> $$0) {
         this.h = $$0;
         return this;
      }

      public ehl.a a() {
         this.i = true;
         return this;
      }

      public ehl.a b() {
         this.j = true;
         return this;
      }

      public ehl c() {
         return new ehl(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
