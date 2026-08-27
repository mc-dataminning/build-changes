import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ecx implements ecb {
   public static final Codec<ecx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eec.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eff.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eec.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               edn.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               edz.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eec.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               edc.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eet.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ecx::new)
   );
   public final eec b;
   public final eec c;
   public final eff d;
   public final eec e;
   public final edn f;
   public final Optional<edz> g;
   public final edc h;
   public final List<eet> i;
   public final boolean j;
   public final boolean k;

   protected ecx(eec $$0, eff $$1, eec $$2, edn $$3, Optional<edz> $$4, eec $$5, edc $$6, List<eet> $$7, boolean $$8, boolean $$9) {
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
      public final eec a;
      private final eff c;
      public final eec b;
      private final edn d;
      private final Optional<edz> e;
      private eec f;
      private final edc g;
      private List<eet> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eec $$0, eff $$1, eec $$2, edn $$3, Optional<edz> $$4, edc $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eec.a(dea.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eec $$0, eff $$1, eec $$2, edn $$3, edc $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ecx.a a(eec $$0) {
         this.f = $$0;
         return this;
      }

      public ecx.a a(List<eet> $$0) {
         this.h = $$0;
         return this;
      }

      public ecx.a a() {
         this.i = true;
         return this;
      }

      public ecx.a b() {
         this.j = true;
         return this;
      }

      public ecx c() {
         return new ecx(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
