import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class elt implements ekx {
   public static final Codec<elt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emy.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eoe.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               emy.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               emj.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               emv.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               emy.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ely.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               ens.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, elt::new)
   );
   public final emy b;
   public final emy c;
   public final eoe d;
   public final emy e;
   public final emj f;
   public final Optional<emv> g;
   public final ely h;
   public final List<ens> i;
   public final boolean j;
   public final boolean k;

   protected elt(emy $$0, eoe $$1, emy $$2, emj $$3, Optional<emv> $$4, emy $$5, ely $$6, List<ens> $$7, boolean $$8, boolean $$9) {
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
      public final emy a;
      private final eoe c;
      public final emy b;
      private final emj d;
      private final Optional<emv> e;
      private emy f;
      private final ely g;
      private List<ens> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(emy $$0, eoe $$1, emy $$2, emj $$3, Optional<emv> $$4, ely $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = emy.a(dlw.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(emy $$0, eoe $$1, emy $$2, emj $$3, ely $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public elt.a a(emy $$0) {
         this.f = $$0;
         return this;
      }

      public elt.a a(List<ens> $$0) {
         this.h = $$0;
         return this;
      }

      public elt.a a() {
         this.i = true;
         return this;
      }

      public elt.a b() {
         this.j = true;
         return this;
      }

      public elt c() {
         return new elt(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
