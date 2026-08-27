import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ebu implements eay {
   public static final Codec<ebu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecz.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eec.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               ecz.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eck.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ecw.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               ecz.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ebz.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               edq.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ebu::new)
   );
   public final ecz b;
   public final ecz c;
   public final eec d;
   public final ecz e;
   public final eck f;
   public final Optional<ecw> g;
   public final ebz h;
   public final List<edq> i;
   public final boolean j;
   public final boolean k;

   protected ebu(ecz $$0, eec $$1, ecz $$2, eck $$3, Optional<ecw> $$4, ecz $$5, ebz $$6, List<edq> $$7, boolean $$8, boolean $$9) {
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
      public final ecz a;
      private final eec c;
      public final ecz b;
      private final eck d;
      private final Optional<ecw> e;
      private ecz f;
      private final ebz g;
      private List<edq> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(ecz $$0, eec $$1, ecz $$2, eck $$3, Optional<ecw> $$4, ebz $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = ecz.a(dcx.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(ecz $$0, eec $$1, ecz $$2, eck $$3, ebz $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ebu.a a(ecz $$0) {
         this.f = $$0;
         return this;
      }

      public ebu.a a(List<edq> $$0) {
         this.h = $$0;
         return this;
      }

      public ebu.a a() {
         this.i = true;
         return this;
      }

      public ebu.a b() {
         this.j = true;
         return this;
      }

      public ebu c() {
         return new ebu(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
