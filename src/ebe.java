import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ebe implements eai {
   public static final Codec<ebe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecj.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               edm.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               ecj.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ebu.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ecg.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               ecj.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ebj.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eda.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ebe::new)
   );
   public final ecj b;
   public final ecj c;
   public final edm d;
   public final ecj e;
   public final ebu f;
   public final Optional<ecg> g;
   public final ebj h;
   public final List<eda> i;
   public final boolean j;
   public final boolean k;

   protected ebe(ecj $$0, edm $$1, ecj $$2, ebu $$3, Optional<ecg> $$4, ecj $$5, ebj $$6, List<eda> $$7, boolean $$8, boolean $$9) {
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
      public final ecj a;
      private final edm c;
      public final ecj b;
      private final ebu d;
      private final Optional<ecg> e;
      private ecj f;
      private final ebj g;
      private List<eda> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(ecj $$0, edm $$1, ecj $$2, ebu $$3, Optional<ecg> $$4, ebj $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = ecj.a(dcj.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(ecj $$0, edm $$1, ecj $$2, ebu $$3, ebj $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ebe.a a(ecj $$0) {
         this.f = $$0;
         return this;
      }

      public ebe.a a(List<eda> $$0) {
         this.h = $$0;
         return this;
      }

      public ebe.a a() {
         this.i = true;
         return this;
      }

      public ebe.a b() {
         this.j = true;
         return this;
      }

      public ebe c() {
         return new ebe(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
