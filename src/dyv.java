import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class dyv extends dwv {
   public static final int d = 128;
   public static final Codec<dyv> e = asq.<dyv>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     dye.b.fieldOf("start_pool").forGetter($$0x -> $$0x.f),
                     agg.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.g),
                     Codec.intRange(0, 7).fieldOf("size").forGetter($$0x -> $$0x.h),
                     dvc.c.fieldOf("start_height").forGetter($$0x -> $$0x.i),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.j),
                     dmf.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.k),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.l),
                     Codec.list(dyg.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.m)
                  )
                  .apply($$0, dyv::new)
         ),
         dyv::a
      )
      .codec();
   private final ib<dye> f;
   private final Optional<agg> g;
   private final int h;
   private final dvc i;
   private final boolean j;
   private final Optional<dmf.a> k;
   private final int l;
   private final List<dyg> m;

   private static DataResult<dyv> a(dyv $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.l + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public dyv(dwv.c $$0, ib<dye> $$1, Optional<agg> $$2, int $$3, dvc $$4, boolean $$5, Optional<dmf.a> $$6, int $$7, List<dyg> $$8) {
      super($$0);
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.j = $$5;
      this.k = $$6;
      this.l = $$7;
      this.m = $$8;
   }

   public dyv(dwv.c $$0, ib<dye> $$1, int $$2, dvc $$3, boolean $$4, dmf.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public dyv(dwv.c $$0, ib<dye> $$1, int $$2, dvc $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      cqz $$1 = $$0.h();
      int $$2 = this.i.a($$0.f(), new dnc($$0.b(), $$0.i()));
      ht $$3 = new ht($$1.d(), $$2, $$1.e());
      return dxy.a($$0, this.f, this.g, this.h, $$3, this.j, this.k, this.l, dyi.create(this.m, $$3, $$0.g()));
   }

   @Override
   public dxe<?> e() {
      return dxe.f;
   }

   public List<dyg> f() {
      return this.m;
   }
}
