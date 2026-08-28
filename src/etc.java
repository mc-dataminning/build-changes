import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class etc extends erb {
   public static final esb d = esb.b;
   public static final eun e = eun.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<etc> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  esl.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  alg.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  epi.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  egg.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(esn.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  esb.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  eun.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, etc::new)
      )
      .validate(etc::a);
   private final je<esl> j;
   private final Optional<alg> k;
   private final int l;
   private final epi m;
   private final boolean n;
   private final Optional<egg.a> o;
   private final int p;
   private final List<esn> q;
   private final esb r;
   private final eun s;

   private static DataResult<etc> a(etc $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public etc(erb.c $$0, je<esl> $$1, Optional<alg> $$2, int $$3, epi $$4, boolean $$5, Optional<egg.a> $$6, int $$7, List<esn> $$8, esb $$9, eun $$10) {
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

   public etc(erb.c $$0, je<esl> $$1, int $$2, epi $$3, boolean $$4, egg.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public etc(erb.c $$0, je<esl> $$1, int $$2, epi $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      dih $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new ehd($$0.b(), $$0.i()));
      iu $$3 = new iu($$1.d(), $$2, $$1.e());
      return esf.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, esp.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public erk<?> e() {
      return erk.f;
   }
}
