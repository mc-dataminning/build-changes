import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eky extends eix {
   public static final ejx d = ejx.b;
   public static final int e = 128;
   public static final int f = 0;
   public static final int g = 20;
   public static final MapCodec<eky> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  ekh.b.fieldOf("start_pool").forGetter($$0x -> $$0x.i),
                  akk.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.j),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.k),
                  ehe.c.fieldOf("start_height").forGetter($$0x -> $$0x.l),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.m),
                  dyg.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.n),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.o),
                  Codec.list(ekj.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.p),
                  ejx.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.q)
               )
               .apply($$0, eky::new)
      )
      .validate(eky::a);
   private final jj<ekh> i;
   private final Optional<akk> j;
   private final int k;
   private final ehe l;
   private final boolean m;
   private final Optional<dyg.a> n;
   private final int o;
   private final List<ekj> p;
   private final ejx q;

   private static DataResult<eky> a(eky $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.o + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eky(eix.c $$0, jj<ekh> $$1, Optional<akk> $$2, int $$3, ehe $$4, boolean $$5, Optional<dyg.a> $$6, int $$7, List<ekj> $$8, ejx $$9) {
      super($$0);
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
      this.l = $$4;
      this.m = $$5;
      this.n = $$6;
      this.o = $$7;
      this.p = $$8;
      this.q = $$9;
   }

   public eky(eix.c $$0, jj<ekh> $$1, int $$2, ehe $$3, boolean $$4, dyg.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d);
   }

   public eky(eix.c $$0, jj<ekh> $$1, int $$2, ehe $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d);
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      dbn $$1 = $$0.h();
      int $$2 = this.l.a($$0.f(), new dzd($$0.b(), $$0.i()));
      ja $$3 = new ja($$1.d(), $$2, $$1.e());
      return ekb.a($$0, this.i, this.j, this.k, $$3, this.m, this.n, this.o, ekl.create(this.p, $$3, $$0.g()), this.q);
   }

   @Override
   public ejg<?> e() {
      return ejg.f;
   }
}
