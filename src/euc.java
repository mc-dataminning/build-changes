import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class euc extends esb {
   public static final etb d = etb.b;
   public static final evn e = evn.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<euc> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  etl.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  ali.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  eqi.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  ehd.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(etn.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  etb.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  evn.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, euc::new)
      )
      .validate(euc::a);
   private final jf<etl> j;
   private final Optional<ali> k;
   private final int l;
   private final eqi m;
   private final boolean n;
   private final Optional<ehd.a> o;
   private final int p;
   private final List<etn> q;
   private final etb r;
   private final evn s;

   private static DataResult<euc> a(euc $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public euc(esb.c $$0, jf<etl> $$1, Optional<ali> $$2, int $$3, eqi $$4, boolean $$5, Optional<ehd.a> $$6, int $$7, List<etn> $$8, etb $$9, evn $$10) {
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

   public euc(esb.c $$0, jf<etl> $$1, int $$2, eqi $$3, boolean $$4, ehd.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public euc(esb.c $$0, jf<etl> $$1, int $$2, eqi $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      djc $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new eia($$0.b(), $$0.i()));
      iv $$3 = new iv($$1.d(), $$2, $$1.e());
      return etf.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, etp.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public esk<?> e() {
      return esk.f;
   }

   @VisibleForTesting
   public jf<etl> f() {
      return this.j;
   }

   @VisibleForTesting
   public List<etn> g() {
      return this.q;
   }
}
