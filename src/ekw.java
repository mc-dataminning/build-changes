import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class ekw extends eiw {
   public static final int d = 128;
   public static final int e = 0;
   public static final int f = 20;
   public static final MapCodec<ekw> g = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  ekf.b.fieldOf("start_pool").forGetter($$0x -> $$0x.i),
                  akk.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.j),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.k),
                  ehd.c.fieldOf("start_height").forGetter($$0x -> $$0x.l),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.m),
                  dyf.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.n),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.o),
                  Codec.list(ekh.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.p),
                  Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("dimension_padding", 0).forGetter($$0x -> $$0x.q)
               )
               .apply($$0, ekw::new)
      )
      .validate(ekw::a);
   public static final int h = 0;
   private final jj<ekf> i;
   private final Optional<akk> j;
   private final int k;
   private final ehd l;
   private final boolean m;
   private final Optional<dyf.a> n;
   private final int o;
   private final List<ekh> p;
   private final int q;

   private static DataResult<ekw> a(ekw $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.o + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public ekw(eiw.c $$0, jj<ekf> $$1, Optional<akk> $$2, int $$3, ehd $$4, boolean $$5, Optional<dyf.a> $$6, int $$7, List<ekh> $$8, int $$9) {
      super($$0);
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
      this.l = $$4;
      this.m = $$5;
      this.n = $$6;
      this.o = $$7;
      this.p = $$8;
      this.q = $$9;
   }

   public ekw(eiw.c $$0, jj<ekf> $$1, int $$2, ehd $$3, boolean $$4, dyf.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), 0);
   }

   public ekw(eiw.c $$0, jj<ekf> $$1, int $$2, ehd $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), 0);
   }

   @Override
   public Optional<eiw.b> a(eiw.a $$0) {
      dbm $$1 = $$0.h();
      int $$2 = this.l.a($$0.f(), new dzc($$0.b(), $$0.i()));
      ja $$3 = new ja($$1.d(), $$2, $$1.e());
      return ejz.a($$0, this.i, this.j, this.k, $$3, this.m, this.n, this.o, ekj.create(this.p, $$3, $$0.g()), this.q);
   }

   @Override
   public ejf<?> e() {
      return ejf.f;
   }
}
