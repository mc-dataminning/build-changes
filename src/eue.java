import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eue extends esd {
   public static final etd d = etd.b;
   public static final evp e = evp.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<eue> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  etn.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  alk.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  eqk.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  ehf.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(etp.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  etd.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  evp.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, eue::new)
      )
      .validate(eue::a);
   private final jg<etn> j;
   private final Optional<alk> k;
   private final int l;
   private final eqk m;
   private final boolean n;
   private final Optional<ehf.a> o;
   private final int p;
   private final List<etp> q;
   private final etd r;
   private final evp s;

   private static DataResult<eue> a(eue $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eue(esd.c $$0, jg<etn> $$1, Optional<alk> $$2, int $$3, eqk $$4, boolean $$5, Optional<ehf.a> $$6, int $$7, List<etp> $$8, etd $$9, evp $$10) {
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

   public eue(esd.c $$0, jg<etn> $$1, int $$2, eqk $$3, boolean $$4, ehf.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public eue(esd.c $$0, jg<etn> $$1, int $$2, eqk $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      dje $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new eic($$0.b(), $$0.i()));
      iw $$3 = new iw($$1.d(), $$2, $$1.e());
      return eth.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, etr.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public esm<?> e() {
      return esm.f;
   }

   @VisibleForTesting
   public jg<etn> f() {
      return this.j;
   }

   @VisibleForTesting
   public List<etp> g() {
      return this.q;
   }
}
