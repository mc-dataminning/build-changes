import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class emy implements emc {
   public static final Codec<emy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eod.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               epj.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               eod.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               eno.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eoa.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               eod.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               end.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eox.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, emy::new)
   );
   public final eod b;
   public final eod c;
   public final epj d;
   public final eod e;
   public final eno f;
   public final Optional<eoa> g;
   public final end h;
   public final List<eox> i;
   public final boolean j;
   public final boolean k;

   protected emy(eod $$0, epj $$1, eod $$2, eno $$3, Optional<eoa> $$4, eod $$5, end $$6, List<eox> $$7, boolean $$8, boolean $$9) {
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
      public final eod a;
      private final epj c;
      public final eod b;
      private final eno d;
      private final Optional<eoa> e;
      private eod f;
      private final end g;
      private List<eox> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(eod $$0, epj $$1, eod $$2, eno $$3, Optional<eoa> $$4, end $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = eod.a(dmt.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(eod $$0, epj $$1, eod $$2, eno $$3, end $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public emy.a a(eod $$0) {
         this.f = $$0;
         return this;
      }

      public emy.a a(List<eox> $$0) {
         this.h = $$0;
         return this;
      }

      public emy.a a() {
         this.i = true;
         return this;
      }

      public emy.a b() {
         this.j = true;
         return this;
      }

      public emy c() {
         return new emy(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
