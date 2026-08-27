import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eip extends egp {
   public static final int d = 128;
   public static final int e = 0;
   public static final int f = 20;
   public static final Codec<eip> g = axh.<eip>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     ehy.b.fieldOf("start_pool").forGetter($$0x -> $$0x.h),
                     akh.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.i),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.j),
                     eew.c.fieldOf("start_height").forGetter($$0x -> $$0x.k),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.l),
                     dvz.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.m),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.n),
                     Codec.list(eia.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.o)
                  )
                  .apply($$0, eip::new)
         ),
         eip::a
      )
      .codec();
   private final iw<ehy> h;
   private final Optional<akh> i;
   private final int j;
   private final eew k;
   private final boolean l;
   private final Optional<dvz.a> m;
   private final int n;
   private final List<eia> o;

   private static DataResult<eip> a(eip $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.n + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eip(egp.c $$0, iw<ehy> $$1, Optional<akh> $$2, int $$3, eew $$4, boolean $$5, Optional<dvz.a> $$6, int $$7, List<eia> $$8) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
      this.m = $$6;
      this.n = $$7;
      this.o = $$8;
   }

   public eip(egp.c $$0, iw<ehy> $$1, int $$2, eew $$3, boolean $$4, dvz.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public eip(egp.c $$0, iw<ehy> $$1, int $$2, eew $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<egp.b> a(egp.a $$0) {
      czk $$1 = $$0.h();
      int $$2 = this.k.a($$0.f(), new dww($$0.b(), $$0.i()));
      in $$3 = new in($$1.d(), $$2, $$1.e());
      return ehs.a($$0, this.h, this.i, this.j, $$3, this.l, this.m, this.n, eic.create(this.o, $$3, $$0.g()));
   }

   @Override
   public egy<?> e() {
      return egy.f;
   }

   public List<eia> f() {
      return this.o;
   }
}
