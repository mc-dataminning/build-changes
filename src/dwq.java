import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public final class dwq extends dux {
   public static final int d = 128;
   public static final Codec<dwq> e = aqw.<dwq>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     dwg.b.fieldOf("start_pool").forGetter($$0x -> $$0x.f),
                     aep.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.g),
                     Codec.intRange(0, 7).fieldOf("size").forGetter($$0x -> $$0x.h),
                     dte.c.fieldOf("start_height").forGetter($$0x -> $$0x.i),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.j),
                     dkh.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.k),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.l)
                  )
                  .apply($$0, dwq::new)
         ),
         dwq::a
      )
      .codec();
   private final hf<dwg> f;
   private final Optional<aep> g;
   private final int h;
   private final dte i;
   private final boolean j;
   private final Optional<dkh.a> k;
   private final int l;

   private static DataResult<dwq> a(dwq $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.l + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public dwq(dux.c $$0, hf<dwg> $$1, Optional<aep> $$2, int $$3, dte $$4, boolean $$5, Optional<dkh.a> $$6, int $$7) {
      super($$0);
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.j = $$5;
      this.k = $$6;
      this.l = $$7;
   }

   public dwq(dux.c $$0, hf<dwg> $$1, int $$2, dte $$3, boolean $$4, dkh.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80);
   }

   public dwq(dux.c $$0, hf<dwg> $$1, int $$2, dte $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80);
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      cor $$1 = $$0.h();
      int $$2 = this.i.a($$0.f(), new dle($$0.b(), $$0.i()));
      gv $$3 = new gv($$1.d(), $$2, $$1.e());
      return dwa.a($$0, this.f, this.g, this.h, $$3, this.j, this.k, this.l);
   }

   @Override
   public dvg<?> e() {
      return dvg.f;
   }
}
