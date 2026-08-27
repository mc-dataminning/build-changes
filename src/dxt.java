import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public final class dxt extends dwa {
   public static final int d = 128;
   public static final Codec<dxt> e = asg.<dxt>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     dxj.b.fieldOf("start_pool").forGetter($$0x -> $$0x.f),
                     afw.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.g),
                     Codec.intRange(0, 7).fieldOf("size").forGetter($$0x -> $$0x.h),
                     duh.c.fieldOf("start_height").forGetter($$0x -> $$0x.i),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.j),
                     dlk.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.k),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.l)
                  )
                  .apply($$0, dxt::new)
         ),
         dxt::a
      )
      .codec();
   private final ib<dxj> f;
   private final Optional<afw> g;
   private final int h;
   private final duh i;
   private final boolean j;
   private final Optional<dlk.a> k;
   private final int l;

   private static DataResult<dxt> a(dxt $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.l + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public dxt(dwa.c $$0, ib<dxj> $$1, Optional<afw> $$2, int $$3, duh $$4, boolean $$5, Optional<dlk.a> $$6, int $$7) {
      super($$0);
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.j = $$5;
      this.k = $$6;
      this.l = $$7;
   }

   public dxt(dwa.c $$0, ib<dxj> $$1, int $$2, duh $$3, boolean $$4, dlk.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80);
   }

   public dxt(dwa.c $$0, ib<dxj> $$1, int $$2, duh $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80);
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      cqg $$1 = $$0.h();
      int $$2 = this.i.a($$0.f(), new dmh($$0.b(), $$0.i()));
      ht $$3 = new ht($$1.d(), $$2, $$1.e());
      return dxd.a($$0, this.f, this.g, this.h, $$3, this.j, this.k, this.l);
   }

   @Override
   public dwj<?> e() {
      return dwj.f;
   }
}
