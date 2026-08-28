import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class elq extends ejp {
   public static final ekp d = ekp.b;
   public static final enb e = enb.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<elq> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  ekz.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  akr.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  ehw.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  dyy.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(elb.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  ekp.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  enb.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, elq::new)
      )
      .validate(elq::a);
   private final jm<ekz> j;
   private final Optional<akr> k;
   private final int l;
   private final ehw m;
   private final boolean n;
   private final Optional<dyy.a> o;
   private final int p;
   private final List<elb> q;
   private final ekp r;
   private final enb s;

   private static DataResult<elq> a(elq $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public elq(ejp.c $$0, jm<ekz> $$1, Optional<akr> $$2, int $$3, ehw $$4, boolean $$5, Optional<dyy.a> $$6, int $$7, List<elb> $$8, ekp $$9, enb $$10) {
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

   public elq(ejp.c $$0, jm<ekz> $$1, int $$2, ehw $$3, boolean $$4, dyy.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public elq(ejp.c $$0, jm<ekz> $$1, int $$2, ehw $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<ejp.b> a(ejp.a $$0) {
      dcd $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new dzv($$0.b(), $$0.i()));
      jd $$3 = new jd($$1.d(), $$2, $$1.e());
      return ekt.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, eld.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public ejy<?> e() {
      return ejy.f;
   }
}
