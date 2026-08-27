import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class edl extends ebl {
   public static final int d = 128;
   public static final int e = 20;
   public static final Codec<edl> f = avq.<edl>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     ecu.b.fieldOf("start_pool").forGetter($$0x -> $$0x.g),
                     aiy.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.h),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.i),
                     dzs.c.fieldOf("start_height").forGetter($$0x -> $$0x.j),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.k),
                     dqv.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.l),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.m),
                     Codec.list(ecw.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.n)
                  )
                  .apply($$0, edl::new)
         ),
         edl::a
      )
      .codec();
   private final ij<ecu> g;
   private final Optional<aiy> h;
   private final int i;
   private final dzs j;
   private final boolean k;
   private final Optional<dqv.a> l;
   private final int m;
   private final List<ecw> n;

   private static DataResult<edl> a(edl $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.m + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public edl(ebl.c $$0, ij<ecu> $$1, Optional<aiy> $$2, int $$3, dzs $$4, boolean $$5, Optional<dqv.a> $$6, int $$7, List<ecw> $$8) {
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

   public edl(ebl.c $$0, ij<ecu> $$1, int $$2, dzs $$3, boolean $$4, dqv.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public edl(ebl.c $$0, ij<ecu> $$1, int $$2, dzs $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<ebl.b> a(ebl.a $$0) {
      cuy $$1 = $$0.h();
      int $$2 = this.j.a($$0.f(), new drs($$0.b(), $$0.i()));
      hz $$3 = new hz($$1.d(), $$2, $$1.e());
      return eco.a($$0, this.g, this.h, this.i, $$3, this.k, this.l, this.m, ecy.create(this.n, $$3, $$0.g()));
   }

   @Override
   public ebu<?> e() {
      return ebu.f;
   }

   public List<ecw> f() {
      return this.n;
   }
}
