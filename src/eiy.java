import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eiy implements eic {
   public static final Codec<eiy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekd.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eli.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               ekd.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ejo.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eka.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               ekd.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ejd.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               ekw.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eiy::new)
   );
   public final ekd b;
   public final ekd c;
   public final eli d;
   public final ekd e;
   public final ejo f;
   public final Optional<eka> g;
   public final ejd h;
   public final List<ekw> i;
   public final boolean j;
   public final boolean k;

   protected eiy(ekd $$0, eli $$1, ekd $$2, ejo $$3, Optional<eka> $$4, ekd $$5, ejd $$6, List<ekw> $$7, boolean $$8, boolean $$9) {
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
      public final ekd a;
      private final eli c;
      public final ekd b;
      private final ejo d;
      private final Optional<eka> e;
      private ekd f;
      private final ejd g;
      private List<ekw> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(ekd $$0, eli $$1, ekd $$2, ejo $$3, Optional<eka> $$4, ejd $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = ekd.a(djo.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(ekd $$0, eli $$1, ekd $$2, ejo $$3, ejd $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public eiy.a a(ekd $$0) {
         this.f = $$0;
         return this;
      }

      public eiy.a a(List<ekw> $$0) {
         this.h = $$0;
         return this;
      }

      public eiy.a a() {
         this.i = true;
         return this;
      }

      public eiy.a b() {
         this.j = true;
         return this;
      }

      public eiy c() {
         return new eiy(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
