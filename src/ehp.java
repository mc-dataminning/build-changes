import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ehp implements egt {
   public static final Codec<ehp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eiu.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               ejx.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eiu.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eif.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eir.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eiu.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ehu.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               ejl.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ehp::new)
   );
   public final eiu b;
   public final eiu c;
   public final ejx d;
   public final eiu e;
   public final eif f;
   public final Optional<eir> g;
   public final ehu h;
   public final List<ejl> i;
   public final boolean j;
   public final boolean k;

   protected ehp(eiu $$0, ejx $$1, eiu $$2, eif $$3, Optional<eir> $$4, eiu $$5, ehu $$6, List<ejl> $$7, boolean $$8, boolean $$9) {
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
      public final eiu a;
      private final ejx c;
      public final eiu b;
      private final eif d;
      private final Optional<eir> e;
      private eiu f;
      private final ehu g;
      private List<ejl> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eiu $$0, ejx $$1, eiu $$2, eif $$3, Optional<eir> $$4, ehu $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eiu.a(dil.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eiu $$0, ejx $$1, eiu $$2, eif $$3, ehu $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ehp.a a(eiu $$0) {
         this.f = $$0;
         return this;
      }

      public ehp.a a(List<ejl> $$0) {
         this.h = $$0;
         return this;
      }

      public ehp.a a() {
         this.i = true;
         return this;
      }

      public ehp.a b() {
         this.j = true;
         return this;
      }

      public ehp c() {
         return new ehp(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
