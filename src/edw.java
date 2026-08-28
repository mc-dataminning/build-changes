import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class edw implements eda {
   public static final Codec<edw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efb.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               ege.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               efb.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eem.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eey.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               efb.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eeb.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               efs.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, edw::new)
   );
   public final efb b;
   public final efb c;
   public final ege d;
   public final efb e;
   public final eem f;
   public final Optional<eey> g;
   public final eeb h;
   public final List<efs> i;
   public final boolean j;
   public final boolean k;

   protected edw(efb $$0, ege $$1, efb $$2, eem $$3, Optional<eey> $$4, efb $$5, eeb $$6, List<efs> $$7, boolean $$8, boolean $$9) {
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
      public final efb a;
      private final ege c;
      public final efb b;
      private final eem d;
      private final Optional<eey> e;
      private efb f;
      private final eeb g;
      private List<efs> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(efb $$0, ege $$1, efb $$2, eem $$3, Optional<eey> $$4, eeb $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = efb.a(dez.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(efb $$0, ege $$1, efb $$2, eem $$3, eeb $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public edw.a a(efb $$0) {
         this.f = $$0;
         return this;
      }

      public edw.a a(List<efs> $$0) {
         this.h = $$0;
         return this;
      }

      public edw.a a() {
         this.i = true;
         return this;
      }

      public edw.a b() {
         this.j = true;
         return this;
      }

      public edw c() {
         return new edw(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
