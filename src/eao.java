import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eao extends dyo {
   public static final int d = 128;
   public static final int e = 20;
   public static final Codec<eao> f = atg.<eao>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     dzx.b.fieldOf("start_pool").forGetter($$0x -> $$0x.g),
                     agt.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.h),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.i),
                     dwv.c.fieldOf("start_height").forGetter($$0x -> $$0x.j),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.k),
                     dny.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.l),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.m),
                     Codec.list(dzz.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.n)
                  )
                  .apply($$0, eao::new)
         ),
         eao::a
      )
      .codec();
   private final ie<dzx> g;
   private final Optional<agt> h;
   private final int i;
   private final dwv j;
   private final boolean k;
   private final Optional<dny.a> l;
   private final int m;
   private final List<dzz> n;

   private static DataResult<eao> a(eao $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.m + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eao(dyo.c $$0, ie<dzx> $$1, Optional<agt> $$2, int $$3, dwv $$4, boolean $$5, Optional<dny.a> $$6, int $$7, List<dzz> $$8) {
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

   public eao(dyo.c $$0, ie<dzx> $$1, int $$2, dwv $$3, boolean $$4, dny.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public eao(dyo.c $$0, ie<dzx> $$1, int $$2, dwv $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<dyo.b> a(dyo.a $$0) {
      csf $$1 = $$0.h();
      int $$2 = this.j.a($$0.f(), new dov($$0.b(), $$0.i()));
      hv $$3 = new hv($$1.d(), $$2, $$1.e());
      return dzr.a($$0, this.g, this.h, this.i, $$3, this.k, this.l, this.m, eab.create(this.n, $$3, $$0.g()));
   }

   @Override
   public dyx<?> e() {
      return dyx.f;
   }

   public List<dzz> f() {
      return this.n;
   }
}
