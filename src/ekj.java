import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class ekj extends eij {
   public static final int d = 128;
   public static final int e = 0;
   public static final int f = 20;
   public static final MapCodec<ekj> g = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  ejs.b.fieldOf("start_pool").forGetter($$0x -> $$0x.h),
                  ale.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.i),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.j),
                  egq.c.fieldOf("start_height").forGetter($$0x -> $$0x.k),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.l),
                  dxt.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.m),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.n),
                  Codec.list(eju.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.o)
               )
               .apply($$0, ekj::new)
      )
      .validate(ekj::a);
   private final ji<ejs> h;
   private final Optional<ale> i;
   private final int j;
   private final egq k;
   private final boolean l;
   private final Optional<dxt.a> m;
   private final int n;
   private final List<eju> o;

   private static DataResult<ekj> a(ekj $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.n + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public ekj(eij.c $$0, ji<ejs> $$1, Optional<ale> $$2, int $$3, egq $$4, boolean $$5, Optional<dxt.a> $$6, int $$7, List<eju> $$8) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
      this.m = $$6;
      this.n = $$7;
      this.o = $$8;
   }

   public ekj(eij.c $$0, ji<ejs> $$1, int $$2, egq $$3, boolean $$4, dxt.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public ekj(eij.c $$0, ji<ejs> $$1, int $$2, egq $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      dbe $$1 = $$0.h();
      int $$2 = this.k.a($$0.f(), new dyq($$0.b(), $$0.i()));
      iz $$3 = new iz($$1.d(), $$2, $$1.e());
      return ejm.a($$0, this.h, this.i, this.j, $$3, this.l, this.m, this.n, ejw.create(this.o, $$3, $$0.g()));
   }

   @Override
   public eis<?> e() {
      return eis.f;
   }

   public List<eju> f() {
      return this.o;
   }
}
