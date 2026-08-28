import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ejp implements eit {
   public static final Codec<ejp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eku.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               elz.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eku.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ekf.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ekr.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eku.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eju.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eln.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ejp::new)
   );
   public final eku b;
   public final eku c;
   public final elz d;
   public final eku e;
   public final ekf f;
   public final Optional<ekr> g;
   public final eju h;
   public final List<eln> i;
   public final boolean j;
   public final boolean k;

   protected ejp(eku $$0, elz $$1, eku $$2, ekf $$3, Optional<ekr> $$4, eku $$5, eju $$6, List<eln> $$7, boolean $$8, boolean $$9) {
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
      public final eku a;
      private final elz c;
      public final eku b;
      private final ekf d;
      private final Optional<ekr> e;
      private eku f;
      private final eju g;
      private List<eln> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eku $$0, elz $$1, eku $$2, ekf $$3, Optional<ekr> $$4, eju $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eku.a(dkf.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eku $$0, elz $$1, eku $$2, ekf $$3, eju $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ejp.a a(eku $$0) {
         this.f = $$0;
         return this;
      }

      public ejp.a a(List<eln> $$0) {
         this.h = $$0;
         return this;
      }

      public ejp.a a() {
         this.i = true;
         return this;
      }

      public ejp.a b() {
         this.j = true;
         return this;
      }

      public ejp c() {
         return new ejp(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
