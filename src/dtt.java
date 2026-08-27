import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public final class dtt extends dsa {
   public static final int d = 128;
   public static final Codec<dtt> e = aoi.<dtt>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     dtj.b.fieldOf("start_pool").forGetter($$0x -> $$0x.f),
                     acq.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.g),
                     Codec.intRange(0, 7).fieldOf("size").forGetter($$0x -> $$0x.h),
                     dqh.c.fieldOf("start_height").forGetter($$0x -> $$0x.i),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.j),
                     dhk.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.k),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.l)
                  )
                  .apply($$0, dtt::new)
         ),
         dtt::a
      )
      .codec();
   private final he<dtj> f;
   private final Optional<acq> g;
   private final int h;
   private final dqh i;
   private final boolean j;
   private final Optional<dhk.a> k;
   private final int l;

   private static DataResult<dtt> a(dtt $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.l + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public dtt(dsa.c $$0, he<dtj> $$1, Optional<acq> $$2, int $$3, dqh $$4, boolean $$5, Optional<dhk.a> $$6, int $$7) {
      super($$0);
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.j = $$5;
      this.k = $$6;
      this.l = $$7;
   }

   public dtt(dsa.c $$0, he<dtj> $$1, int $$2, dqh $$3, boolean $$4, dhk.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80);
   }

   public dtt(dsa.c $$0, he<dtj> $$1, int $$2, dqh $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80);
   }

   @Override
   public Optional<dsa.b> a(dsa.a $$0) {
      clt $$1 = $$0.h();
      int $$2 = this.i.a($$0.f(), new dih($$0.b(), $$0.i()));
      gu $$3 = new gu($$1.d(), $$2, $$1.e());
      return dtd.a($$0, this.f, this.g, this.h, $$3, this.j, this.k, this.l);
   }

   @Override
   public dsj<?> e() {
      return dsj.f;
   }
}
