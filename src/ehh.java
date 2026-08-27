import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class ehh extends efh {
   public static final int d = 128;
   public static final int e = 0;
   public static final int f = 20;
   public static final Codec<ehh> g = aws.<ehh>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     egq.b.fieldOf("start_pool").forGetter($$0x -> $$0x.h),
                     ajt.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.i),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.j),
                     edo.c.fieldOf("start_height").forGetter($$0x -> $$0x.k),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.l),
                     dur.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.m),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.n),
                     Codec.list(egs.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.o)
                  )
                  .apply($$0, ehh::new)
         ),
         ehh::a
      )
      .codec();
   private final il<egq> h;
   private final Optional<ajt> i;
   private final int j;
   private final edo k;
   private final boolean l;
   private final Optional<dur.a> m;
   private final int n;
   private final List<egs> o;

   private static DataResult<ehh> a(ehh $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.n + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public ehh(efh.c $$0, il<egq> $$1, Optional<ajt> $$2, int $$3, edo $$4, boolean $$5, Optional<dur.a> $$6, int $$7, List<egs> $$8) {
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

   public ehh(efh.c $$0, il<egq> $$1, int $$2, edo $$3, boolean $$4, dur.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public ehh(efh.c $$0, il<egq> $$1, int $$2, edo $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      cye $$1 = $$0.h();
      int $$2 = this.k.a($$0.f(), new dvo($$0.b(), $$0.i()));
      ib $$3 = new ib($$1.d(), $$2, $$1.e());
      return egk.a($$0, this.h, this.i, this.j, $$3, this.l, this.m, this.n, egu.create(this.o, $$3, $$0.g()));
   }

   @Override
   public efq<?> e() {
      return efq.f;
   }

   public List<egs> f() {
      return this.o;
   }
}
