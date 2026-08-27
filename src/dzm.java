import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class dzm extends dxm {
   public static final int d = 128;
   public static final Codec<dzm> e = asy.<dzm>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     dyv.b.fieldOf("start_pool").forGetter($$0x -> $$0x.f),
                     agm.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.g),
                     Codec.intRange(0, 7).fieldOf("size").forGetter($$0x -> $$0x.h),
                     dvt.c.fieldOf("start_height").forGetter($$0x -> $$0x.i),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.j),
                     dmw.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.k),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.l),
                     Codec.list(dyx.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.m)
                  )
                  .apply($$0, dzm::new)
         ),
         dzm::a
      )
      .codec();
   private final ig<dyv> f;
   private final Optional<agm> g;
   private final int h;
   private final dvt i;
   private final boolean j;
   private final Optional<dmw.a> k;
   private final int l;
   private final List<dyx> m;

   private static DataResult<dzm> a(dzm $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.l + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public dzm(dxm.c $$0, ig<dyv> $$1, Optional<agm> $$2, int $$3, dvt $$4, boolean $$5, Optional<dmw.a> $$6, int $$7, List<dyx> $$8) {
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

   public dzm(dxm.c $$0, ig<dyv> $$1, int $$2, dvt $$3, boolean $$4, dmw.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public dzm(dxm.c $$0, ig<dyv> $$1, int $$2, dvt $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      crm $$1 = $$0.h();
      int $$2 = this.i.a($$0.f(), new dnt($$0.b(), $$0.i()));
      hx $$3 = new hx($$1.d(), $$2, $$1.e());
      return dyp.a($$0, this.f, this.g, this.h, $$3, this.j, this.k, this.l, dyz.create(this.m, $$3, $$0.g()));
   }

   @Override
   public dxv<?> e() {
      return dxv.f;
   }

   public List<dyx> f() {
      return this.m;
   }
}
