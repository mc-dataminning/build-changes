import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eln extends ejm {
   public static final ekm d = ekm.b;
   public static final int e = 128;
   public static final int f = 0;
   public static final int g = 20;
   public static final MapCodec<eln> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  ekw.b.fieldOf("start_pool").forGetter($$0x -> $$0x.i),
                  akq.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.j),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.k),
                  eht.c.fieldOf("start_height").forGetter($$0x -> $$0x.l),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.m),
                  dyv.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.n),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.o),
                  Codec.list(eky.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.p),
                  ekm.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.q)
               )
               .apply($$0, eln::new)
      )
      .validate(eln::a);
   private final jm<ekw> i;
   private final Optional<akq> j;
   private final int k;
   private final eht l;
   private final boolean m;
   private final Optional<dyv.a> n;
   private final int o;
   private final List<eky> p;
   private final ekm q;

   private static DataResult<eln> a(eln $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.o + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eln(ejm.c $$0, jm<ekw> $$1, Optional<akq> $$2, int $$3, eht $$4, boolean $$5, Optional<dyv.a> $$6, int $$7, List<eky> $$8, ekm $$9) {
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

   public eln(ejm.c $$0, jm<ekw> $$1, int $$2, eht $$3, boolean $$4, dyv.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d);
   }

   public eln(ejm.c $$0, jm<ekw> $$1, int $$2, eht $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d);
   }

   @Override
   public Optional<ejm.b> a(ejm.a $$0) {
      dcb $$1 = $$0.h();
      int $$2 = this.l.a($$0.f(), new dzs($$0.b(), $$0.i()));
      jd $$3 = new jd($$1.d(), $$2, $$1.e());
      return ekq.a($$0, this.i, this.j, this.k, $$3, this.m, this.n, this.o, ela.create(this.p, $$3, $$0.g()), this.q);
   }

   @Override
   public ejv<?> e() {
      return ejv.f;
   }
}
