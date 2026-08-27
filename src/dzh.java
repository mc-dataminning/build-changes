import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class dzh extends dxh {
   public static final int d = 128;
   public static final Codec<dzh> e = asu.<dzh>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     dyq.b.fieldOf("start_pool").forGetter($$0x -> $$0x.f),
                     agi.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.g),
                     Codec.intRange(0, 7).fieldOf("size").forGetter($$0x -> $$0x.h),
                     dvo.c.fieldOf("start_height").forGetter($$0x -> $$0x.i),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.j),
                     dmr.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.k),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.l),
                     Codec.list(dys.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.m)
                  )
                  .apply($$0, dzh::new)
         ),
         dzh::a
      )
      .codec();
   private final ib<dyq> f;
   private final Optional<agi> g;
   private final int h;
   private final dvo i;
   private final boolean j;
   private final Optional<dmr.a> k;
   private final int l;
   private final List<dys> m;

   private static DataResult<dzh> a(dzh $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.l + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public dzh(dxh.c $$0, ib<dyq> $$1, Optional<agi> $$2, int $$3, dvo $$4, boolean $$5, Optional<dmr.a> $$6, int $$7, List<dys> $$8) {
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

   public dzh(dxh.c $$0, ib<dyq> $$1, int $$2, dvo $$3, boolean $$4, dmr.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public dzh(dxh.c $$0, ib<dyq> $$1, int $$2, dvo $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<dxh.b> a(dxh.a $$0) {
      crh $$1 = $$0.h();
      int $$2 = this.i.a($$0.f(), new dno($$0.b(), $$0.i()));
      ht $$3 = new ht($$1.d(), $$2, $$1.e());
      return dyk.a($$0, this.f, this.g, this.h, $$3, this.j, this.k, this.l, dyu.create(this.m, $$3, $$0.g()));
   }

   @Override
   public dxq<?> e() {
      return dxq.f;
   }

   public List<dys> f() {
      return this.m;
   }
}
