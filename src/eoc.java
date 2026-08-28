import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eoc extends emb {
   public static final enb d = enb.b;
   public static final epn e = epn.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<eoc> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  enl.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  all.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  eki.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  ebj.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(enn.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  enb.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  epn.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, eoc::new)
      )
      .validate(eoc::a);
   private final jq<enl> j;
   private final Optional<all> k;
   private final int l;
   private final eki m;
   private final boolean n;
   private final Optional<ebj.a> o;
   private final int p;
   private final List<enn> q;
   private final enb r;
   private final epn s;

   private static DataResult<eoc> a(eoc $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eoc(emb.c $$0, jq<enl> $$1, Optional<all> $$2, int $$3, eki $$4, boolean $$5, Optional<ebj.a> $$6, int $$7, List<enn> $$8, enb $$9, epn $$10) {
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

   public eoc(emb.c $$0, jq<enl> $$1, int $$2, eki $$3, boolean $$4, ebj.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public eoc(emb.c $$0, jq<enl> $$1, int $$2, eki $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      del $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new ecg($$0.b(), $$0.i()));
      jh $$3 = new jh($$1.d(), $$2, $$1.e());
      return enf.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, enp.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public emk<?> e() {
      return emk.f;
   }
}
