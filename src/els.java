import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class els extends ejr {
   public static final ekr d = ekr.b;
   public static final end e = end.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<els> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  elb.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  akr.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  ehx.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  dyy.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(eld.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  ekr.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  end.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, els::new)
      )
      .validate(els::a);
   private final jm<elb> j;
   private final Optional<akr> k;
   private final int l;
   private final ehx m;
   private final boolean n;
   private final Optional<dyy.a> o;
   private final int p;
   private final List<eld> q;
   private final ekr r;
   private final end s;

   private static DataResult<els> a(els $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public els(ejr.c $$0, jm<elb> $$1, Optional<akr> $$2, int $$3, ehx $$4, boolean $$5, Optional<dyy.a> $$6, int $$7, List<eld> $$8, ekr $$9, end $$10) {
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

   public els(ejr.c $$0, jm<elb> $$1, int $$2, ehx $$3, boolean $$4, dyy.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public els(ejr.c $$0, jm<elb> $$1, int $$2, ehx $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<ejr.b> a(ejr.a $$0) {
      dcd $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new dzv($$0.b(), $$0.i()));
      jd $$3 = new jd($$1.d(), $$2, $$1.e());
      return ekv.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, elf.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public eka<?> e() {
      return eka.f;
   }
}
