import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class ejj extends ehj {
   public static final int d = 128;
   public static final int e = 0;
   public static final int f = 20;
   public static final MapCodec<ejj> g = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  eis.b.fieldOf("start_pool").forGetter($$0x -> $$0x.h),
                  akm.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.i),
                  Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.j),
                  efq.c.fieldOf("start_height").forGetter($$0x -> $$0x.k),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.l),
                  dwt.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.m),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.n),
                  Codec.list(eiu.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.o)
               )
               .apply($$0, ejj::new)
      )
      .validate(ejj::a);
   private final ix<eis> h;
   private final Optional<akm> i;
   private final int j;
   private final efq k;
   private final boolean l;
   private final Optional<dwt.a> m;
   private final int n;
   private final List<eiu> o;

   private static DataResult<ejj> a(ejj $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.n + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public ejj(ehj.c $$0, ix<eis> $$1, Optional<akm> $$2, int $$3, efq $$4, boolean $$5, Optional<dwt.a> $$6, int $$7, List<eiu> $$8) {
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

   public ejj(ehj.c $$0, ix<eis> $$1, int $$2, efq $$3, boolean $$4, dwt.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public ejj(ehj.c $$0, ix<eis> $$1, int $$2, efq $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      dae $$1 = $$0.h();
      int $$2 = this.k.a($$0.f(), new dxq($$0.b(), $$0.i()));
      io $$3 = new io($$1.d(), $$2, $$1.e());
      return eim.a($$0, this.h, this.i, this.j, $$3, this.l, this.m, this.n, eiw.create(this.o, $$3, $$0.g()));
   }

   @Override
   public ehs<?> e() {
      return ehs.f;
   }

   public List<eiu> f() {
      return this.o;
   }
}
