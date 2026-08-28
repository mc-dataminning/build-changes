import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class epn extends enm {
   public static final eom d = eom.b;
   public static final eqy e = eqy.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<epn> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  eow.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  akv.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  elt.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  ecs.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(eoy.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  eom.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  eqy.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, epn::new)
      )
      .validate(epn::a);
   private final jr<eow> j;
   private final Optional<akv> k;
   private final int l;
   private final elt m;
   private final boolean n;
   private final Optional<ecs.a> o;
   private final int p;
   private final List<eoy> q;
   private final eom r;
   private final eqy s;

   private static DataResult<epn> a(epn $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public epn(enm.c $$0, jr<eow> $$1, Optional<akv> $$2, int $$3, elt $$4, boolean $$5, Optional<ecs.a> $$6, int $$7, List<eoy> $$8, eom $$9, eqy $$10) {
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

   public epn(enm.c $$0, jr<eow> $$1, int $$2, elt $$3, boolean $$4, ecs.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public epn(enm.c $$0, jr<eow> $$1, int $$2, elt $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<enm.b> a(enm.a $$0) {
      dfo $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new edp($$0.b(), $$0.i()));
      ji $$3 = new ji($$1.d(), $$2, $$1.e());
      return eoq.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, epa.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public env<?> e() {
      return env.f;
   }
}
