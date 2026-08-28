import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eju implements eiy {
   public static final Codec<eju> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekz.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               emf.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               ekz.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ekk.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ekw.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               ekz.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ejz.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               elt.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eju::new)
   );
   public final ekz b;
   public final ekz c;
   public final emf d;
   public final ekz e;
   public final ekk f;
   public final Optional<ekw> g;
   public final ejz h;
   public final List<elt> i;
   public final boolean j;
   public final boolean k;

   protected eju(ekz $$0, emf $$1, ekz $$2, ekk $$3, Optional<ekw> $$4, ekz $$5, ejz $$6, List<elt> $$7, boolean $$8, boolean $$9) {
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
      public final ekz a;
      private final emf c;
      public final ekz b;
      private final ekk d;
      private final Optional<ekw> e;
      private ekz f;
      private final ejz g;
      private List<elt> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(ekz $$0, emf $$1, ekz $$2, ekk $$3, Optional<ekw> $$4, ejz $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = ekz.a(dkg.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(ekz $$0, emf $$1, ekz $$2, ekk $$3, ejz $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public eju.a a(ekz $$0) {
         this.f = $$0;
         return this;
      }

      public eju.a a(List<elt> $$0) {
         this.h = $$0;
         return this;
      }

      public eju.a a() {
         this.i = true;
         return this;
      }

      public eju.a b() {
         this.j = true;
         return this;
      }

      public eju c() {
         return new eju(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
