import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class elt extends ejt {
   public static final int d = 128;
   public static final int e = 0;
   public static final int f = 20;
   public static final Codec<elt> g = axu.<elt>a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     a($$0),
                     elc.b.fieldOf("start_pool").forGetter($$0x -> $$0x.h),
                     akt.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.i),
                     Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.j),
                     ehz.c.fieldOf("start_height").forGetter($$0x -> $$0x.k),
                     Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.l),
                     dyu.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.m),
                     Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.n),
                     Codec.list(ele.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.o)
                  )
                  .apply($$0, elt::new)
         ),
         elt::a
      )
      .codec();
   private final ja<elc> h;
   private final Optional<akt> i;
   private final int j;
   private final ehz k;
   private final boolean l;
   private final Optional<dyu.a> m;
   private final int n;
   private final List<ele> o;

   private static DataResult<elt> a(elt $$0) {
      int $$1 = switch ($$0.e()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.n + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public elt(ejt.d $$0, ja<elc> $$1, Optional<akt> $$2, int $$3, ehz $$4, boolean $$5, Optional<dyu.a> $$6, int $$7, List<ele> $$8) {
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

   public elt(ejt.d $$0, ja<elc> $$1, int $$2, ehz $$3, boolean $$4, dyu.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of());
   }

   public elt(ejt.d $$0, ja<elc> $$1, int $$2, ehz $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of());
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      dbh $$1 = $$0.h();
      int $$2 = this.k.a($$0.f(), new dzr($$0.b(), $$0.i()));
      ir $$3 = new ir($$1.d(), $$2, $$1.e());
      return ekw.a($$0, this.h, this.i, this.j, $$3, this.l, this.m, this.n, elg.create(this.o, $$3, $$0.g()));
   }

   @Override
   public ekc<?> f() {
      return ekc.f;
   }

   public List<ele> g() {
      return this.o;
   }
}
