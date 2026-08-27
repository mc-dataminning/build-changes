import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class ebg extends dzg {
   public static final int d = 128;
   public static final int e = 20;
   public static final Codec<ebg> f = atw.<ebg>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     eap.b.fieldOf("start_pool").forGetter($$0x -> $$0x.g),
                     ahg.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.h),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.i),
                     dxn.c.fieldOf("start_height").forGetter($$0x -> $$0x.j),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.k),
                     doq.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.l),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.m),
                     Codec.list(ear.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.n)
                  )
                  .apply($$0, ebg::new)
         ),
         ebg::a
      )
      .codec();
   private final ih<eap> g;
   private final Optional<ahg> h;
   private final int i;
   private final dxn j;
   private final boolean k;
   private final Optional<doq.a> l;
   private final int m;
   private final List<ear> n;

   private static DataResult<ebg> a(ebg $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.m + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public ebg(dzg.c $$0, ih<eap> $$1, Optional<ahg> $$2, int $$3, dxn $$4, boolean $$5, Optional<doq.a> $$6, int $$7, List<ear> $$8) {
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

   public ebg(dzg.c $$0, ih<eap> $$1, int $$2, dxn $$3, boolean $$4, doq.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public ebg(dzg.c $$0, ih<eap> $$1, int $$2, dxn $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<dzg.b> a(dzg.a $$0) {
      csw $$1 = $$0.h();
      int $$2 = this.j.a($$0.f(), new dpn($$0.b(), $$0.i()));
      hx $$3 = new hx($$1.d(), $$2, $$1.e());
      return eaj.a($$0, this.g, this.h, this.i, $$3, this.k, this.l, this.m, eat.create(this.n, $$3, $$0.g()));
   }

   @Override
   public dzp<?> e() {
      return dzp.f;
   }

   public List<ear> f() {
      return this.n;
   }
}
