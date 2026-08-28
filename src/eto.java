import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eto extends ern {
   public static final esn d = esn.b;
   public static final euz e = euz.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<eto> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  esx.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  alg.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  epu.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  egs.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(esz.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  esn.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  euz.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, eto::new)
      )
      .validate(eto::a);
   private final jf<esx> j;
   private final Optional<alg> k;
   private final int l;
   private final epu m;
   private final boolean n;
   private final Optional<egs.a> o;
   private final int p;
   private final List<esz> q;
   private final esn r;
   private final euz s;

   private static DataResult<eto> a(eto $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eto(ern.c $$0, jf<esx> $$1, Optional<alg> $$2, int $$3, epu $$4, boolean $$5, Optional<egs.a> $$6, int $$7, List<esz> $$8, esn $$9, euz $$10) {
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

   public eto(ern.c $$0, jf<esx> $$1, int $$2, epu $$3, boolean $$4, egs.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public eto(ern.c $$0, jf<esx> $$1, int $$2, epu $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      dir $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new ehp($$0.b(), $$0.i()));
      iv $$3 = new iv($$1.d(), $$2, $$1.e());
      return esr.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, etb.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public erw<?> e() {
      return erw.f;
   }

   @VisibleForTesting
   public jf<esx> f() {
      return this.j;
   }

   @VisibleForTesting
   public List<esz> g() {
      return this.q;
   }
}
