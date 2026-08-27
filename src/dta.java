import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dta implements dse {
   public static final Codec<dta> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               duf.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               dvi.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               duf.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dtq.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               duc.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               duf.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dtf.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               duw.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dta::new)
   );
   public final duf b;
   public final duf c;
   public final dvi d;
   public final duf e;
   public final dtq f;
   public final Optional<duc> g;
   public final dtf h;
   public final List<duw> i;
   public final boolean j;
   public final boolean k;

   protected dta(duf $$0, dvi $$1, duf $$2, dtq $$3, Optional<duc> $$4, duf $$5, dtf $$6, List<duw> $$7, boolean $$8, boolean $$9) {
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
      public final duf a;
      private final dvi c;
      public final duf b;
      private final dtq d;
      private final Optional<duc> e;
      private duf f;
      private final dtf g;
      private List<duw> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(duf $$0, dvi $$1, duf $$2, dtq $$3, Optional<duc> $$4, dtf $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = duf.a(cvh.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(duf $$0, dvi $$1, duf $$2, dtq $$3, dtf $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dta.a a(duf $$0) {
         this.f = $$0;
         return this;
      }

      public dta.a a(List<duw> $$0) {
         this.h = $$0;
         return this;
      }

      public dta.a a() {
         this.i = true;
         return this;
      }

      public dta.a b() {
         this.j = true;
         return this;
      }

      public dta c() {
         return new dta(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
