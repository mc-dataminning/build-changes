import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class ekf extends eif {
   public static final int d = 128;
   public static final int e = 0;
   public static final int f = 20;
   public static final MapCodec<ekf> g = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  ejo.b.fieldOf("start_pool").forGetter($$0x -> $$0x.h),
                  alb.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.i),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.j),
                  egm.c.fieldOf("start_height").forGetter($$0x -> $$0x.k),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.l),
                  dxp.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.m),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.n),
                  Codec.list(ejq.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.o)
               )
               .apply($$0, ekf::new)
      )
      .validate(ekf::a);
   private final ji<ejo> h;
   private final Optional<alb> i;
   private final int j;
   private final egm k;
   private final boolean l;
   private final Optional<dxp.a> m;
   private final int n;
   private final List<ejq> o;

   private static DataResult<ekf> a(ekf $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.n + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public ekf(eif.c $$0, ji<ejo> $$1, Optional<alb> $$2, int $$3, egm $$4, boolean $$5, Optional<dxp.a> $$6, int $$7, List<ejq> $$8) {
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

   public ekf(eif.c $$0, ji<ejo> $$1, int $$2, egm $$3, boolean $$4, dxp.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public ekf(eif.c $$0, ji<ejo> $$1, int $$2, egm $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      dba $$1 = $$0.h();
      int $$2 = this.k.a($$0.f(), new dym($$0.b(), $$0.i()));
      iz $$3 = new iz($$1.d(), $$2, $$1.e());
      return eji.a($$0, this.h, this.i, this.j, $$3, this.l, this.m, this.n, ejs.create(this.o, $$3, $$0.g()));
   }

   @Override
   public eio<?> e() {
      return eio.f;
   }

   public List<ejq> f() {
      return this.o;
   }
}
