import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dyq implements dxu {
   public static final Codec<dyq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzv.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eay.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dzv.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dzg.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dzs.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dzv.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dyv.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eam.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dyq::new)
   );
   public final dzv b;
   public final dzv c;
   public final eay d;
   public final dzv e;
   public final dzg f;
   public final Optional<dzs> g;
   public final dyv h;
   public final List<eam> i;
   public final boolean j;
   public final boolean k;

   protected dyq(dzv $$0, eay $$1, dzv $$2, dzg $$3, Optional<dzs> $$4, dzv $$5, dyv $$6, List<eam> $$7, boolean $$8, boolean $$9) {
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
      public final dzv a;
      private final eay c;
      public final dzv b;
      private final dzg d;
      private final Optional<dzs> e;
      private dzv f;
      private final dyv g;
      private List<eam> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dzv $$0, eay $$1, dzv $$2, dzg $$3, Optional<dzs> $$4, dyv $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dzv.a(dac.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dzv $$0, eay $$1, dzv $$2, dzg $$3, dyv $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dyq.a a(dzv $$0) {
         this.f = $$0;
         return this;
      }

      public dyq.a a(List<eam> $$0) {
         this.h = $$0;
         return this;
      }

      public dyq.a a() {
         this.i = true;
         return this;
      }

      public dyq.a b() {
         this.j = true;
         return this;
      }

      public dyq c() {
         return new dyq(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
