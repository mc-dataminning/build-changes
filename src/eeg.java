import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class eeg extends ecg {
   public static final int d = 128;
   public static final int e = 20;
   public static final Codec<eeg> f = avu.<eeg>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     edp.b.fieldOf("start_pool").forGetter($$0x -> $$0x.g),
                     ajc.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.h),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.i),
                     ean.c.fieldOf("start_height").forGetter($$0x -> $$0x.j),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.k),
                     drq.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.l),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.m),
                     Codec.list(edr.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.n)
                  )
                  .apply($$0, eeg::new)
         ),
         eeg::a
      )
      .codec();
   private final il<edp> g;
   private final Optional<ajc> h;
   private final int i;
   private final ean j;
   private final boolean k;
   private final Optional<drq.a> l;
   private final int m;
   private final List<edr> n;

   private static DataResult<eeg> a(eeg $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d -> 12;
      };
      return $$0.m + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public eeg(ecg.c $$0, il<edp> $$1, Optional<ajc> $$2, int $$3, ean $$4, boolean $$5, Optional<drq.a> $$6, int $$7, List<edr> $$8) {
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

   public eeg(ecg.c $$0, il<edp> $$1, int $$2, ean $$3, boolean $$4, drq.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public eeg(ecg.c $$0, il<edp> $$1, int $$2, ean $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      cvl $$1 = $$0.h();
      int $$2 = this.j.a($$0.f(), new dsn($$0.b(), $$0.i()));
      ib $$3 = new ib($$1.d(), $$2, $$1.e());
      return edj.a($$0, this.g, this.h, this.i, $$3, this.k, this.l, this.m, edt.create(this.n, $$3, $$0.g()));
   }

   @Override
   public ecp<?> e() {
      return ecp.f;
   }

   public List<edr> f() {
      return this.n;
   }
}
