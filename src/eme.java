import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eme implements eli {
   public static final Codec<eme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enj.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eop.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               enj.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               emu.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eng.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               enj.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               emj.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eod.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, eme::new)
   );
   public final enj b;
   public final enj c;
   public final eop d;
   public final enj e;
   public final emu f;
   public final Optional<eng> g;
   public final emj h;
   public final List<eod> i;
   public final boolean j;
   public final boolean k;

   protected eme(enj $$0, eop $$1, enj $$2, emu $$3, Optional<eng> $$4, enj $$5, emj $$6, List<eod> $$7, boolean $$8, boolean $$9) {
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
      public final enj a;
      private final eop c;
      public final enj b;
      private final emu d;
      private final Optional<eng> e;
      private enj f;
      private final emj g;
      private List<eod> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(enj $$0, eop $$1, enj $$2, emu $$3, Optional<eng> $$4, emj $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = enj.a(dmc.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(enj $$0, eop $$1, enj $$2, emu $$3, emj $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public eme.a a(enj $$0) {
         this.f = $$0;
         return this;
      }

      public eme.a a(List<eod> $$0) {
         this.h = $$0;
         return this;
      }

      public eme.a a() {
         this.i = true;
         return this;
      }

      public eme.a b() {
         this.j = true;
         return this;
      }

      public eme c() {
         return new eme(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
