import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dsv implements drz {
   public static final Codec<dsv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dua.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dvd.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dua.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dtl.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dtx.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dua.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dta.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dur.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dsv::new)
   );
   public final dua b;
   public final dua c;
   public final dvd d;
   public final dua e;
   public final dtl f;
   public final Optional<dtx> g;
   public final dta h;
   public final List<dur> i;
   public final boolean j;
   public final boolean k;

   protected dsv(dua $$0, dvd $$1, dua $$2, dtl $$3, Optional<dtx> $$4, dua $$5, dta $$6, List<dur> $$7, boolean $$8, boolean $$9) {
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
      public final dua a;
      private final dvd c;
      public final dua b;
      private final dtl d;
      private final Optional<dtx> e;
      private dua f;
      private final dta g;
      private List<dur> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dua $$0, dvd $$1, dua $$2, dtl $$3, Optional<dtx> $$4, dta $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dua.a(cvc.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dua $$0, dvd $$1, dua $$2, dtl $$3, dta $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dsv.a a(dua $$0) {
         this.f = $$0;
         return this;
      }

      public dsv.a a(List<dur> $$0) {
         this.h = $$0;
         return this;
      }

      public dsv.a a() {
         this.i = true;
         return this;
      }

      public dsv.a b() {
         this.j = true;
         return this;
      }

      public dsv c() {
         return new dsv(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
