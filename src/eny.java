import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eny extends elx {
   public static final emx d = emx.b;
   public static final epj e = epj.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<eny> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  enh.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  ali.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  eke.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  ebf.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(enj.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  emx.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  epj.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, eny::new)
      )
      .validate(eny::a);
   private final jq<enh> j;
   private final Optional<ali> k;
   private final int l;
   private final eke m;
   private final boolean n;
   private final Optional<ebf.a> o;
   private final int p;
   private final List<enj> q;
   private final emx r;
   private final epj s;

   private static DataResult<eny> a(eny $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eny(elx.c $$0, jq<enh> $$1, Optional<ali> $$2, int $$3, eke $$4, boolean $$5, Optional<ebf.a> $$6, int $$7, List<enj> $$8, emx $$9, epj $$10) {
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

   public eny(elx.c $$0, jq<enh> $$1, int $$2, eke $$3, boolean $$4, ebf.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public eny(elx.c $$0, jq<enh> $$1, int $$2, eke $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      deh $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new ecc($$0.b(), $$0.i()));
      jh $$3 = new jh($$1.d(), $$2, $$1.e());
      return enb.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, enl.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public emg<?> e() {
      return emg.f;
   }
}
