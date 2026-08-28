import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eqe extends eod {
   public static final epd d = epd.b;
   public static final erp e = erp.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<eqe> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  epn.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  alp.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  emk.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  edj.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(epp.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  epd.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  erp.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, eqe::new)
      )
      .validate(eqe::a);
   private final jq<epn> j;
   private final Optional<alp> k;
   private final int l;
   private final emk m;
   private final boolean n;
   private final Optional<edj.a> o;
   private final int p;
   private final List<epp> q;
   private final epd r;
   private final erp s;

   private static DataResult<eqe> a(eqe $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eqe(eod.c $$0, jq<epn> $$1, Optional<alp> $$2, int $$3, emk $$4, boolean $$5, Optional<edj.a> $$6, int $$7, List<epp> $$8, epd $$9, erp $$10) {
      super($$0);
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
      this.m = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
      this.q = $$8;
      this.r = $$9;
      this.s = $$10;
   }

   public eqe(eod.c $$0, jq<epn> $$1, int $$2, emk $$3, boolean $$4, edj.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public eqe(eod.c $$0, jq<epn> $$1, int $$2, emk $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      dgf $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new eeg($$0.b(), $$0.i()));
      jh $$3 = new jh($$1.d(), $$2, $$1.e());
      return eph.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, epr.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public eom<?> e() {
      return eom.f;
   }
}
