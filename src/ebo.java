import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class ebo extends dzo {
   public static final int d = 128;
   public static final int e = 20;
   public static final Codec<ebo> f = atx.<ebo>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     eax.b.fieldOf("start_pool").forGetter($$0x -> $$0x.g),
                     ahh.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.h),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.i),
                     dxv.c.fieldOf("start_height").forGetter($$0x -> $$0x.j),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.k),
                     doy.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.l),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.m),
                     Codec.list(eaz.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.n)
                  )
                  .apply($$0, ebo::new)
         ),
         ebo::a
      )
      .codec();
   private final ih<eax> g;
   private final Optional<ahh> h;
   private final int i;
   private final dxv j;
   private final boolean k;
   private final Optional<doy.a> l;
   private final int m;
   private final List<eaz> n;

   private static DataResult<ebo> a(ebo $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.m + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public ebo(dzo.c $$0, ih<eax> $$1, Optional<ahh> $$2, int $$3, dxv $$4, boolean $$5, Optional<doy.a> $$6, int $$7, List<eaz> $$8) {
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

   public ebo(dzo.c $$0, ih<eax> $$1, int $$2, dxv $$3, boolean $$4, doy.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public ebo(dzo.c $$0, ih<eax> $$1, int $$2, dxv $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      cte $$1 = $$0.h();
      int $$2 = this.j.a($$0.f(), new dpv($$0.b(), $$0.i()));
      hx $$3 = new hx($$1.d(), $$2, $$1.e());
      return ear.a($$0, this.g, this.h, this.i, $$3, this.k, this.l, this.m, ebb.create(this.n, $$3, $$0.g()));
   }

   @Override
   public dzx<?> e() {
      return dzx.f;
   }

   public List<eaz> f() {
      return this.n;
   }
}
