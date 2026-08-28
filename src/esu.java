import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class esu extends eqt {
   public static final ert d = ert.b;
   public static final euf e = euf.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<esu> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  esd.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  alg.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  epa.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  efy.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(esf.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  ert.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  euf.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, esu::new)
      )
      .validate(esu::a);
   private final je<esd> j;
   private final Optional<alg> k;
   private final int l;
   private final epa m;
   private final boolean n;
   private final Optional<efy.a> o;
   private final int p;
   private final List<esf> q;
   private final ert r;
   private final euf s;

   private static DataResult<esu> a(esu $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public esu(eqt.c $$0, je<esd> $$1, Optional<alg> $$2, int $$3, epa $$4, boolean $$5, Optional<efy.a> $$6, int $$7, List<esf> $$8, ert $$9, euf $$10) {
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

   public esu(eqt.c $$0, je<esd> $$1, int $$2, epa $$3, boolean $$4, efy.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public esu(eqt.c $$0, je<esd> $$1, int $$2, epa $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<eqt.b> a(eqt.a $$0) {
      dic $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new egv($$0.b(), $$0.i()));
      iu $$3 = new iu($$1.d(), $$2, $$1.e());
      return erx.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, esh.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public erc<?> e() {
      return erc.f;
   }
}
