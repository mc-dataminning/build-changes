import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class egc implements efg {
   public static final Codec<egc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehh.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eik.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               ehh.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               egs.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               ehe.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               ehh.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               egh.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               ehy.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, egc::new)
   );
   public final ehh b;
   public final ehh c;
   public final eik d;
   public final ehh e;
   public final egs f;
   public final Optional<ehe> g;
   public final egh h;
   public final List<ehy> i;
   public final boolean j;
   public final boolean k;

   protected egc(ehh $$0, eik $$1, ehh $$2, egs $$3, Optional<ehe> $$4, ehh $$5, egh $$6, List<ehy> $$7, boolean $$8, boolean $$9) {
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
      public final ehh a;
      private final eik c;
      public final ehh b;
      private final egs d;
      private final Optional<ehe> e;
      private ehh f;
      private final egh g;
      private List<ehy> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(ehh $$0, eik $$1, ehh $$2, egs $$3, Optional<ehe> $$4, egh $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = ehh.a(dgx.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(ehh $$0, eik $$1, ehh $$2, egs $$3, egh $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public egc.a a(ehh $$0) {
         this.f = $$0;
         return this;
      }

      public egc.a a(List<ehy> $$0) {
         this.h = $$0;
         return this;
      }

      public egc.a a() {
         this.i = true;
         return this;
      }

      public egc.a b() {
         this.j = true;
         return this;
      }

      public egc c() {
         return new egc(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
