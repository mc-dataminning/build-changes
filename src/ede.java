import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class ede extends ebe {
   public static final int d = 128;
   public static final int e = 20;
   public static final Codec<ede> f = avp.<ede>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     ecn.b.fieldOf("start_pool").forGetter($$0x -> $$0x.g),
                     aiy.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.h),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.i),
                     dzl.c.fieldOf("start_height").forGetter($$0x -> $$0x.j),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.k),
                     dqo.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.l),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.m),
                     Codec.list(ecp.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.n)
                  )
                  .apply($$0, ede::new)
         ),
         ede::a
      )
      .codec();
   private final ij<ecn> g;
   private final Optional<aiy> h;
   private final int i;
   private final dzl j;
   private final boolean k;
   private final Optional<dqo.a> l;
   private final int m;
   private final List<ecp> n;

   private static DataResult<ede> a(ede $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.m + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public ede(ebe.c $$0, ij<ecn> $$1, Optional<aiy> $$2, int $$3, dzl $$4, boolean $$5, Optional<dqo.a> $$6, int $$7, List<ecp> $$8) {
      super($$0);
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.m = $$7;
      this.n = $$8;
   }

   public ede(ebe.c $$0, ij<ecn> $$1, int $$2, dzl $$3, boolean $$4, dqo.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public ede(ebe.c $$0, ij<ecn> $$1, int $$2, dzl $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      cuu $$1 = $$0.h();
      int $$2 = this.j.a($$0.f(), new drl($$0.b(), $$0.i()));
      hz $$3 = new hz($$1.d(), $$2, $$1.e());
      return ech.a($$0, this.g, this.h, this.i, $$3, this.k, this.l, this.m, ecr.create(this.n, $$3, $$0.g()));
   }

   @Override
   public ebn<?> e() {
      return ebn.f;
   }

   public List<ecp> f() {
      return this.n;
   }
}
