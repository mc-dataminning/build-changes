import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class etj extends eri {
   public static final esi d = esi.b;
   public static final euu e = euu.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<etj> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  ess.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  alg.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  epp.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  egn.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(esu.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  esi.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  euu.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, etj::new)
      )
      .validate(etj::a);
   private final jf<ess> j;
   private final Optional<alg> k;
   private final int l;
   private final epp m;
   private final boolean n;
   private final Optional<egn.a> o;
   private final int p;
   private final List<esu> q;
   private final esi r;
   private final euu s;

   private static DataResult<etj> a(etj $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public etj(eri.c $$0, jf<ess> $$1, Optional<alg> $$2, int $$3, epp $$4, boolean $$5, Optional<egn.a> $$6, int $$7, List<esu> $$8, esi $$9, euu $$10) {
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

   public etj(eri.c $$0, jf<ess> $$1, int $$2, epp $$3, boolean $$4, egn.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public etj(eri.c $$0, jf<ess> $$1, int $$2, epp $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<eri.b> a(eri.a $$0) {
      dio $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new ehk($$0.b(), $$0.i()));
      iv $$3 = new iv($$1.d(), $$2, $$1.e());
      return esm.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, esw.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public err<?> e() {
      return err.f;
   }

   @VisibleForTesting
   public jf<ess> f() {
      return this.j;
   }

   @VisibleForTesting
   public List<esu> g() {
      return this.q;
   }
}
