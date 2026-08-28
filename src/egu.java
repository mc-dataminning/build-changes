import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class egu implements efy {
   public static final Codec<egu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehz.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               ejc.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               ehz.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ehk.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ehw.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               ehz.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               egz.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eiq.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, egu::new)
   );
   public final ehz b;
   public final ehz c;
   public final ejc d;
   public final ehz e;
   public final ehk f;
   public final Optional<ehw> g;
   public final egz h;
   public final List<eiq> i;
   public final boolean j;
   public final boolean k;

   protected egu(ehz $$0, ejc $$1, ehz $$2, ehk $$3, Optional<ehw> $$4, ehz $$5, egz $$6, List<eiq> $$7, boolean $$8, boolean $$9) {
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
      public final ehz a;
      private final ejc c;
      public final ehz b;
      private final ehk d;
      private final Optional<ehw> e;
      private ehz f;
      private final egz g;
      private List<eiq> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(ehz $$0, ejc $$1, ehz $$2, ehk $$3, Optional<ehw> $$4, egz $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = ehz.a(dho.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(ehz $$0, ejc $$1, ehz $$2, ehk $$3, egz $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public egu.a a(ehz $$0) {
         this.f = $$0;
         return this;
      }

      public egu.a a(List<eiq> $$0) {
         this.h = $$0;
         return this;
      }

      public egu.a a() {
         this.i = true;
         return this;
      }

      public egu.a b() {
         this.j = true;
         return this;
      }

      public egu c() {
         return new egu(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
