import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dro implements dqs {
   public static final Codec<dro> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dst.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dtw.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dst.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dse.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dsq.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dst.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               drt.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               dtk.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dro::new)
   );
   public final dst b;
   public final dst c;
   public final dtw d;
   public final dst e;
   public final dse f;
   public final Optional<dsq> g;
   public final drt h;
   public final List<dtk> i;
   public final boolean j;
   public final boolean k;

   protected dro(dst $$0, dtw $$1, dst $$2, dse $$3, Optional<dsq> $$4, dst $$5, drt $$6, List<dtk> $$7, boolean $$8, boolean $$9) {
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
      public final dst a;
      private final dtw c;
      public final dst b;
      private final dse d;
      private final Optional<dsq> e;
      private dst f;
      private final drt g;
      private List<dtk> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dst $$0, dtw $$1, dst $$2, dse $$3, Optional<dsq> $$4, drt $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dst.a(cuc.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dst $$0, dtw $$1, dst $$2, dse $$3, drt $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dro.a a(dst $$0) {
         this.f = $$0;
         return this;
      }

      public dro.a a(List<dtk> $$0) {
         this.h = $$0;
         return this;
      }

      public dro.a a() {
         this.i = true;
         return this;
      }

      public dro.a b() {
         this.j = true;
         return this;
      }

      public dro c() {
         return new dro(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
