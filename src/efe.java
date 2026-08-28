import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class efe implements eei {
   public static final Codec<efe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egj.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               ehm.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               egj.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               efu.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               egg.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               egj.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               efj.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eha.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, efe::new)
   );
   public final egj b;
   public final egj c;
   public final ehm d;
   public final egj e;
   public final efu f;
   public final Optional<egg> g;
   public final efj h;
   public final List<eha> i;
   public final boolean j;
   public final boolean k;

   protected efe(egj $$0, ehm $$1, egj $$2, efu $$3, Optional<egg> $$4, egj $$5, efj $$6, List<eha> $$7, boolean $$8, boolean $$9) {
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
      public final egj a;
      private final ehm c;
      public final egj b;
      private final efu d;
      private final Optional<egg> e;
      private egj f;
      private final efj g;
      private List<eha> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(egj $$0, ehm $$1, egj $$2, efu $$3, Optional<egg> $$4, efj $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = egj.a(dga.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(egj $$0, ehm $$1, egj $$2, efu $$3, efj $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public efe.a a(egj $$0) {
         this.f = $$0;
         return this;
      }

      public efe.a a(List<eha> $$0) {
         this.h = $$0;
         return this;
      }

      public efe.a a() {
         this.i = true;
         return this;
      }

      public efe.a b() {
         this.j = true;
         return this;
      }

      public efe c() {
         return new efe(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
