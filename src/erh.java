import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class erh extends epg {
   public static final eqg d = eqg.b;
   public static final ess e = ess.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<erh> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  eqq.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  ald.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  enn.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  eel.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(eqs.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  eqg.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  ess.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, erh::new)
      )
      .validate(erh::a);
   private final js<eqq> j;
   private final Optional<ald> k;
   private final int l;
   private final enn m;
   private final boolean n;
   private final Optional<eel.a> o;
   private final int p;
   private final List<eqs> q;
   private final eqg r;
   private final ess s;

   private static DataResult<erh> a(erh $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public erh(epg.c $$0, js<eqq> $$1, Optional<ald> $$2, int $$3, enn $$4, boolean $$5, Optional<eel.a> $$6, int $$7, List<eqs> $$8, eqg $$9, ess $$10) {
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

   public erh(epg.c $$0, js<eqq> $$1, int $$2, enn $$3, boolean $$4, eel.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public erh(epg.c $$0, js<eqq> $$1, int $$2, enn $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      dgw $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new efi($$0.b(), $$0.i()));
      jj $$3 = new jj($$1.d(), $$2, $$1.e());
      return eqk.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, equ.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public epp<?> e() {
      return epp.f;
   }
}
