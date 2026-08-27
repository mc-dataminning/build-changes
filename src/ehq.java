import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class ehq extends efq {
   public static final int d = 128;
   public static final int e = 0;
   public static final int f = 20;
   public static final Codec<ehq> g = awu.<ehq>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     egz.b.fieldOf("start_pool").forGetter($$0x -> $$0x.h),
                     ajv.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.i),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.j),
                     edx.c.fieldOf("start_height").forGetter($$0x -> $$0x.k),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.l),
                     dva.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.m),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.n),
                     Codec.list(ehb.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.o)
                  )
                  .apply($$0, ehq::new)
         ),
         ehq::a
      )
      .codec();
   private final in<egz> h;
   private final Optional<ajv> i;
   private final int j;
   private final edx k;
   private final boolean l;
   private final Optional<dva.a> m;
   private final int n;
   private final List<ehb> o;

   private static DataResult<ehq> a(ehq $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.n + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public ehq(efq.c $$0, in<egz> $$1, Optional<ajv> $$2, int $$3, edx $$4, boolean $$5, Optional<dva.a> $$6, int $$7, List<ehb> $$8) {
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

   public ehq(efq.c $$0, in<egz> $$1, int $$2, edx $$3, boolean $$4, dva.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public ehq(efq.c $$0, in<egz> $$1, int $$2, edx $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<efq.b> a(efq.a $$0) {
      cyn $$1 = $$0.h();
      int $$2 = this.k.a($$0.f(), new dvx($$0.b(), $$0.i()));
      id $$3 = new id($$1.d(), $$2, $$1.e());
      return egt.a($$0, this.h, this.i, this.j, $$3, this.l, this.m, this.n, ehd.create(this.o, $$3, $$0.g()));
   }

   @Override
   public efz<?> e() {
      return efz.f;
   }

   public List<ehb> f() {
      return this.o;
   }
}
