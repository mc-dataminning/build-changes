import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class efc extends edc {
   public static final int d = 128;
   public static final int e = 20;
   public static final Codec<efc> f = awe.<efc>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     eel.b.fieldOf("start_pool").forGetter($$0x -> $$0x.g),
                     ajh.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.h),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.i),
                     ebj.c.fieldOf("start_height").forGetter($$0x -> $$0x.j),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.k),
                     dsm.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.l),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.m),
                     Codec.list(een.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.n)
                  )
                  .apply($$0, efc::new)
         ),
         efc::a
      )
      .codec();
   private final il<eel> g;
   private final Optional<ajh> h;
   private final int i;
   private final ebj j;
   private final boolean k;
   private final Optional<dsm.a> l;
   private final int m;
   private final List<een> n;

   private static DataResult<efc> a(efc $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.m + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public efc(edc.c $$0, il<eel> $$1, Optional<ajh> $$2, int $$3, ebj $$4, boolean $$5, Optional<dsm.a> $$6, int $$7, List<een> $$8) {
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

   public efc(edc.c $$0, il<eel> $$1, int $$2, ebj $$3, boolean $$4, dsm.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public efc(edc.c $$0, il<eel> $$1, int $$2, ebj $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      cwg $$1 = $$0.h();
      int $$2 = this.j.a($$0.f(), new dtj($$0.b(), $$0.i()));
      ib $$3 = new ib($$1.d(), $$2, $$1.e());
      return eef.a($$0, this.g, this.h, this.i, $$3, this.k, this.l, this.m, eep.create(this.n, $$3, $$0.g()));
   }

   @Override
   public edl<?> e() {
      return edl.f;
   }

   public List<een> f() {
      return this.n;
   }
}
