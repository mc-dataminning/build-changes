import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eig extends egg {
   public static final int d = 128;
   public static final int e = 0;
   public static final int f = 20;
   public static final Codec<eig> g = axe.<eig>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     ehp.b.fieldOf("start_pool").forGetter($$0x -> $$0x.h),
                     akf.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.i),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.j),
                     een.c.fieldOf("start_height").forGetter($$0x -> $$0x.k),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.l),
                     dvq.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.m),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.n),
                     Codec.list(ehr.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.o)
                  )
                  .apply($$0, eig::new)
         ),
         eig::a
      )
      .codec();
   private final iv<ehp> h;
   private final Optional<akf> i;
   private final int j;
   private final een k;
   private final boolean l;
   private final Optional<dvq.a> m;
   private final int n;
   private final List<ehr> o;

   private static DataResult<eig> a(eig $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.n + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eig(egg.c $$0, iv<ehp> $$1, Optional<akf> $$2, int $$3, een $$4, boolean $$5, Optional<dvq.a> $$6, int $$7, List<ehr> $$8) {
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

   public eig(egg.c $$0, iv<ehp> $$1, int $$2, een $$3, boolean $$4, dvq.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public eig(egg.c $$0, iv<ehp> $$1, int $$2, een $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<egg.b> a(egg.a $$0) {
      czb $$1 = $$0.h();
      int $$2 = this.k.a($$0.f(), new dwn($$0.b(), $$0.i()));
      im $$3 = new im($$1.d(), $$2, $$1.e());
      return ehj.a($$0, this.h, this.i, this.j, $$3, this.l, this.m, this.n, eht.create(this.o, $$3, $$0.g()));
   }

   @Override
   public egp<?> e() {
      return egp.f;
   }

   public List<ehr> f() {
      return this.o;
   }
}
