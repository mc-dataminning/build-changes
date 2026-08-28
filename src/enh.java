import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class enh extends elg {
   public static final emg d = emg.b;
   public static final eos e = eos.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<enh> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  emq.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
                  ale.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
                  ejn.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
                  eao.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
                  Codec.list(ems.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
                  emg.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
                  eos.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
               )
               .apply($$0, enh::new)
      )
      .validate(enh::a);
   private final jo<emq> j;
   private final Optional<ale> k;
   private final int l;
   private final ejn m;
   private final boolean n;
   private final Optional<eao.a> o;
   private final int p;
   private final List<ems> q;
   private final emg r;
   private final eos s;

   private static DataResult<enh> a(enh $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public enh(elg.c $$0, jo<emq> $$1, Optional<ale> $$2, int $$3, ejn $$4, boolean $$5, Optional<eao.a> $$6, int $$7, List<ems> $$8, emg $$9, eos $$10) {
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

   public enh(elg.c $$0, jo<emq> $$1, int $$2, ejn $$3, boolean $$4, eao.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public enh(elg.c $$0, jo<emq> $$1, int $$2, ejn $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      ddp $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new ebl($$0.b(), $$0.i()));
      jf $$3 = new jf($$1.d(), $$2, $$1.e());
      return emk.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, emu.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public elp<?> e() {
      return elp.f;
   }
}
