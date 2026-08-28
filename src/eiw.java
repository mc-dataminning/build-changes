import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eiw implements eia {
   public static final Codec<eiw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekb.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               elg.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               ekb.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ejm.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ejy.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               ekb.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ejb.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eku.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eiw::new)
   );
   public final ekb b;
   public final ekb c;
   public final elg d;
   public final ekb e;
   public final ejm f;
   public final Optional<ejy> g;
   public final ejb h;
   public final List<eku> i;
   public final boolean j;
   public final boolean k;

   protected eiw(ekb $$0, elg $$1, ekb $$2, ejm $$3, Optional<ejy> $$4, ekb $$5, ejb $$6, List<eku> $$7, boolean $$8, boolean $$9) {
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
      public final ekb a;
      private final elg c;
      public final ekb b;
      private final ejm d;
      private final Optional<ejy> e;
      private ekb f;
      private final ejb g;
      private List<eku> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(ekb $$0, elg $$1, ekb $$2, ejm $$3, Optional<ejy> $$4, ejb $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = ekb.a(djm.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(ekb $$0, elg $$1, ekb $$2, ejm $$3, ejb $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public eiw.a a(ekb $$0) {
         this.f = $$0;
         return this;
      }

      public eiw.a a(List<eku> $$0) {
         this.h = $$0;
         return this;
      }

      public eiw.a a() {
         this.i = true;
         return this;
      }

      public eiw.a b() {
         this.j = true;
         return this;
      }

      public eiw c() {
         return new eiw(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
