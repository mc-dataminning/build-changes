import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ecd implements ebh {
   public static final Codec<ecd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edi.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eel.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               edi.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ect.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               edf.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               edi.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               eci.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               edz.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ecd::new)
   );
   public final edi b;
   public final edi c;
   public final eel d;
   public final edi e;
   public final ect f;
   public final Optional<edf> g;
   public final eci h;
   public final List<edz> i;
   public final boolean j;
   public final boolean k;

   protected ecd(edi $$0, eel $$1, edi $$2, ect $$3, Optional<edf> $$4, edi $$5, eci $$6, List<edz> $$7, boolean $$8, boolean $$9) {
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
      public final edi a;
      private final eel c;
      public final edi b;
      private final ect d;
      private final Optional<edf> e;
      private edi f;
      private final eci g;
      private List<edz> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(edi $$0, eel $$1, edi $$2, ect $$3, Optional<edf> $$4, eci $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = edi.a(ddg.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(edi $$0, eel $$1, edi $$2, ect $$3, eci $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ecd.a a(edi $$0) {
         this.f = $$0;
         return this;
      }

      public ecd.a a(List<edz> $$0) {
         this.h = $$0;
         return this;
      }

      public ecd.a a() {
         this.i = true;
         return this;
      }

      public ecd.a b() {
         this.j = true;
         return this;
      }

      public ecd c() {
         return new ecd(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
