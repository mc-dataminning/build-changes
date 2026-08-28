import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class epl extends enk {
   public static final eok d = eok.b;
   public static final eqw e = eqw.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<epl> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  eou.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  aku.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  elr.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  ecq.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(eow.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  eok.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  eqw.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, epl::new)
      )
      .validate(epl::a);
   private final jr<eou> j;
   private final Optional<aku> k;
   private final int l;
   private final elr m;
   private final boolean n;
   private final Optional<ecq.a> o;
   private final int p;
   private final List<eow> q;
   private final eok r;
   private final eqw s;

   private static DataResult<epl> a(epl $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public epl(enk.c $$0, jr<eou> $$1, Optional<aku> $$2, int $$3, elr $$4, boolean $$5, Optional<ecq.a> $$6, int $$7, List<eow> $$8, eok $$9, eqw $$10) {
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

   public epl(enk.c $$0, jr<eou> $$1, int $$2, elr $$3, boolean $$4, ecq.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public epl(enk.c $$0, jr<eou> $$1, int $$2, elr $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      dfm $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new edn($$0.b(), $$0.i()));
      ji $$3 = new ji($$1.d(), $$2, $$1.e());
      return eoo.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, eoy.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public ent<?> e() {
      return ent.f;
   }
}
