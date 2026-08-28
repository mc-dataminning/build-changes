import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class end extends elc {
   public static final emc d = emc.b;
   public static final eoo e = eoo.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<end> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  emm.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  alc.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  ejj.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  eak.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(emo.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  emc.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  eoo.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, end::new)
      )
      .validate(end::a);
   private final jn<emm> j;
   private final Optional<alc> k;
   private final int l;
   private final ejj m;
   private final boolean n;
   private final Optional<eak.a> o;
   private final int p;
   private final List<emo> q;
   private final emc r;
   private final eoo s;

   private static DataResult<end> a(end $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public end(elc.c $$0, jn<emm> $$1, Optional<alc> $$2, int $$3, ejj $$4, boolean $$5, Optional<eak.a> $$6, int $$7, List<emo> $$8, emc $$9, eoo $$10) {
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

   public end(elc.c $$0, jn<emm> $$1, int $$2, ejj $$3, boolean $$4, eak.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public end(elc.c $$0, jn<emm> $$1, int $$2, ejj $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      ddm $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new ebh($$0.b(), $$0.i()));
      je $$3 = new je($$1.d(), $$2, $$1.e());
      return emg.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, emq.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public ell<?> e() {
      return ell.f;
   }
}
