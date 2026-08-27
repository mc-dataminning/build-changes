import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class ebf extends dzf {
   public static final int d = 128;
   public static final int e = 20;
   public static final Codec<ebf> f = atv.<ebf>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     eao.b.fieldOf("start_pool").forGetter($$0x -> $$0x.g),
                     ahg.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.h),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.i),
                     dxm.c.fieldOf("start_height").forGetter($$0x -> $$0x.j),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.k),
                     dop.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.l),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.m),
                     Codec.list(eaq.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.n)
                  )
                  .apply($$0, ebf::new)
         ),
         ebf::a
      )
      .codec();
   private final ih<eao> g;
   private final Optional<ahg> h;
   private final int i;
   private final dxm j;
   private final boolean k;
   private final Optional<dop.a> l;
   private final int m;
   private final List<eaq> n;

   private static DataResult<ebf> a(ebf $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.m + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public ebf(dzf.c $$0, ih<eao> $$1, Optional<ahg> $$2, int $$3, dxm $$4, boolean $$5, Optional<dop.a> $$6, int $$7, List<eaq> $$8) {
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

   public ebf(dzf.c $$0, ih<eao> $$1, int $$2, dxm $$3, boolean $$4, dop.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public ebf(dzf.c $$0, ih<eao> $$1, int $$2, dxm $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      csv $$1 = $$0.h();
      int $$2 = this.j.a($$0.f(), new dpm($$0.b(), $$0.i()));
      hx $$3 = new hx($$1.d(), $$2, $$1.e());
      return eai.a($$0, this.g, this.h, this.i, $$3, this.k, this.l, this.m, eas.create(this.n, $$3, $$0.g()));
   }

   @Override
   public dzo<?> e() {
      return dzo.f;
   }

   public List<eaq> f() {
      return this.n;
   }
}
