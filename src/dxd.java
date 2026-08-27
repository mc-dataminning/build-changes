import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public final class dxd extends dvk {
   public static final int d = 128;
   public static final Codec<dxd> e = arh.<dxd>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     dwt.b.fieldOf("start_pool").forGetter($$0x -> $$0x.f),
                     aey.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.g),
                     Codec.intRange(0, 7).fieldOf("size").forGetter($$0x -> $$0x.h),
                     dtr.c.fieldOf("start_height").forGetter($$0x -> $$0x.i),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.j),
                     dku.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.k),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.l)
                  )
                  .apply($$0, dxd::new)
         ),
         dxd::a
      )
      .codec();
   private final hg<dwt> f;
   private final Optional<aey> g;
   private final int h;
   private final dtr i;
   private final boolean j;
   private final Optional<dku.a> k;
   private final int l;

   private static DataResult<dxd> a(dxd $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.l + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public dxd(dvk.c $$0, hg<dwt> $$1, Optional<aey> $$2, int $$3, dtr $$4, boolean $$5, Optional<dku.a> $$6, int $$7) {
      super($$0);
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.j = $$5;
      this.k = $$6;
      this.l = $$7;
   }

   public dxd(dvk.c $$0, hg<dwt> $$1, int $$2, dtr $$3, boolean $$4, dku.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80);
   }

   public dxd(dvk.c $$0, hg<dwt> $$1, int $$2, dtr $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80);
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      cpe $$1 = $$0.h();
      int $$2 = this.i.a($$0.f(), new dlr($$0.b(), $$0.i()));
      gw $$3 = new gw($$1.d(), $$2, $$1.e());
      return dwn.a($$0, this.f, this.g, this.h, $$3, this.j, this.k, this.l);
   }

   @Override
   public dvt<?> e() {
      return dvt.f;
   }
}
