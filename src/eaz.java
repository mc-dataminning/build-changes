import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eaz extends dyz {
   public static final int d = 128;
   public static final int e = 20;
   public static final Codec<eaz> f = atq.<eaz>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     eai.b.fieldOf("start_pool").forGetter($$0x -> $$0x.g),
                     ahd.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.h),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.i),
                     dxg.c.fieldOf("start_height").forGetter($$0x -> $$0x.j),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.k),
                     doj.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.l),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.m),
                     Codec.list(eak.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.n)
                  )
                  .apply($$0, eaz::new)
         ),
         eaz::a
      )
      .codec();
   private final ih<eai> g;
   private final Optional<ahd> h;
   private final int i;
   private final dxg j;
   private final boolean k;
   private final Optional<doj.a> l;
   private final int m;
   private final List<eak> n;

   private static DataResult<eaz> a(eaz $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.m + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eaz(dyz.c $$0, ih<eai> $$1, Optional<ahd> $$2, int $$3, dxg $$4, boolean $$5, Optional<doj.a> $$6, int $$7, List<eak> $$8) {
      super($$0);
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.m = $$7;
      this.n = $$8;
   }

   public eaz(dyz.c $$0, ih<eai> $$1, int $$2, dxg $$3, boolean $$4, doj.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public eaz(dyz.c $$0, ih<eai> $$1, int $$2, dxg $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<dyz.b> a(dyz.a $$0) {
      csp $$1 = $$0.h();
      int $$2 = this.j.a($$0.f(), new dpg($$0.b(), $$0.i()));
      hx $$3 = new hx($$1.d(), $$2, $$1.e());
      return eac.a($$0, this.g, this.h, this.i, $$3, this.k, this.l, this.m, eam.create(this.n, $$3, $$0.g()));
   }

   @Override
   public dzi<?> e() {
      return dzi.f;
   }

   public List<eak> f() {
      return this.n;
   }
}
