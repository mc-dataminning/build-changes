import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ejv implements eiz {
   public static final Codec<ejv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ela.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               emf.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               ela.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ekl.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ekx.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               ela.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eka.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               elt.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ejv::new)
   );
   public final ela b;
   public final ela c;
   public final emf d;
   public final ela e;
   public final ekl f;
   public final Optional<ekx> g;
   public final eka h;
   public final List<elt> i;
   public final boolean j;
   public final boolean k;

   protected ejv(ela $$0, emf $$1, ela $$2, ekl $$3, Optional<ekx> $$4, ela $$5, eka $$6, List<elt> $$7, boolean $$8, boolean $$9) {
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
      public final ela a;
      private final emf c;
      public final ela b;
      private final ekl d;
      private final Optional<ekx> e;
      private ela f;
      private final eka g;
      private List<elt> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(ela $$0, emf $$1, ela $$2, ekl $$3, Optional<ekx> $$4, eka $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = ela.a(dkn.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(ela $$0, emf $$1, ela $$2, ekl $$3, eka $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ejv.a a(ela $$0) {
         this.f = $$0;
         return this;
      }

      public ejv.a a(List<elt> $$0) {
         this.h = $$0;
         return this;
      }

      public ejv.a a() {
         this.i = true;
         return this;
      }

      public ejv.a b() {
         this.j = true;
         return this;
      }

      public ejv c() {
         return new ejv(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
