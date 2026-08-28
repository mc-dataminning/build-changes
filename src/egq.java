import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class egq implements efu {
   public static final Codec<egq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehv.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eiy.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               ehv.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ehg.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ehs.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               ehv.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               egv.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eim.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, egq::new)
   );
   public final ehv b;
   public final ehv c;
   public final eiy d;
   public final ehv e;
   public final ehg f;
   public final Optional<ehs> g;
   public final egv h;
   public final List<eim> i;
   public final boolean j;
   public final boolean k;

   protected egq(ehv $$0, eiy $$1, ehv $$2, ehg $$3, Optional<ehs> $$4, ehv $$5, egv $$6, List<eim> $$7, boolean $$8, boolean $$9) {
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
      public final ehv a;
      private final eiy c;
      public final ehv b;
      private final ehg d;
      private final Optional<ehs> e;
      private ehv f;
      private final egv g;
      private List<eim> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(ehv $$0, eiy $$1, ehv $$2, ehg $$3, Optional<ehs> $$4, egv $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = ehv.a(dhl.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(ehv $$0, eiy $$1, ehv $$2, ehg $$3, egv $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public egq.a a(ehv $$0) {
         this.f = $$0;
         return this;
      }

      public egq.a a(List<eim> $$0) {
         this.h = $$0;
         return this;
      }

      public egq.a a() {
         this.i = true;
         return this;
      }

      public egq.a b() {
         this.j = true;
         return this;
      }

      public egq c() {
         return new egq(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
