import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ehw implements eha {
   public static final Codec<ehw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejb.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eke.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               ejb.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eim.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eiy.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               ejb.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eib.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               ejs.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ehw::new)
   );
   public final ejb b;
   public final ejb c;
   public final eke d;
   public final ejb e;
   public final eim f;
   public final Optional<eiy> g;
   public final eib h;
   public final List<ejs> i;
   public final boolean j;
   public final boolean k;

   protected ehw(ejb $$0, eke $$1, ejb $$2, eim $$3, Optional<eiy> $$4, ejb $$5, eib $$6, List<ejs> $$7, boolean $$8, boolean $$9) {
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
      public final ejb a;
      private final eke c;
      public final ejb b;
      private final eim d;
      private final Optional<eiy> e;
      private ejb f;
      private final eib g;
      private List<ejs> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(ejb $$0, eke $$1, ejb $$2, eim $$3, Optional<eiy> $$4, eib $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = ejb.a(dis.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(ejb $$0, eke $$1, ejb $$2, eim $$3, eib $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ehw.a a(ejb $$0) {
         this.f = $$0;
         return this;
      }

      public ehw.a a(List<ejs> $$0) {
         this.h = $$0;
         return this;
      }

      public ehw.a a() {
         this.i = true;
         return this;
      }

      public ehw.a b() {
         this.j = true;
         return this;
      }

      public ehw c() {
         return new ehw(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
