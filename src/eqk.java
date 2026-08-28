import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eqk extends eoj {
   public static final epj d = epj.b;
   public static final erv e = erv.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<eqk> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  ept.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  aku.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  emq.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  edo.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(epv.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  epj.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  erv.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, eqk::new)
      )
      .validate(eqk::a);
   private final jr<ept> j;
   private final Optional<aku> k;
   private final int l;
   private final emq m;
   private final boolean n;
   private final Optional<edo.a> o;
   private final int p;
   private final List<epv> q;
   private final epj r;
   private final erv s;

   private static DataResult<eqk> a(eqk $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eqk(eoj.c $$0, jr<ept> $$1, Optional<aku> $$2, int $$3, emq $$4, boolean $$5, Optional<edo.a> $$6, int $$7, List<epv> $$8, epj $$9, erv $$10) {
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

   public eqk(eoj.c $$0, jr<ept> $$1, int $$2, emq $$3, boolean $$4, edo.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public eqk(eoj.c $$0, jr<ept> $$1, int $$2, emq $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      dgg $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new eel($$0.b(), $$0.i()));
      ji $$3 = new ji($$1.d(), $$2, $$1.e());
      return epn.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, epx.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public eos<?> e() {
      return eos.f;
   }
}
