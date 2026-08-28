import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eii {
   public static final Codec<eii> a = lp.T.q().dispatch(eii::e, eir::codec);
   public static final Codec<ji<eii>> b = ala.a(lq.aJ, a);
   protected final eii.c c;

   public static <S extends eii> RecordCodecBuilder<S, eii.c> a(Instance<S> $$0) {
      return eii.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eii> MapCodec<S> a(Function<eii.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eii(eii.c $$0) {
      this.c = $$0;
   }

   public jm<dcv> a() {
      return this.c.b;
   }

   public Map<btq, eip> b() {
      return this.c.c;
   }

   public dxo.b c() {
      return this.c.d;
   }

   public eit d() {
      return this.c.e;
   }

   public eia a(eia $$0) {
      return this.d() != eit.a ? $$0.a(12) : $$0;
   }

   public eiq a(jw $$0, dtx $$1, dcz $$2, dyg $$3, emj $$4, long $$5, dbd $$6, int $$7, dby $$8, Predicate<ji<dcv>> $$9) {
      eii.a $$10 = new eii.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eii.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         eja $$12 = $$11.get().a();
         eiq $$13 = new eiq(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eiq.b;
   }

   protected static Optional<eii.b> a(eii.a $$0, dxs.a $$1, Consumer<eja> $$2) {
      dbd $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eii.b(new iz($$4, $$6, $$5), $$2));
   }

   private static boolean a(eii.b $$0, eii.a $$1) {
      iz $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(jt.a($$2.u()), jt.a($$2.v()), jt.a($$2.w()), $$1.d.b()));
   }

   public void a(dcr $$0, dcp $$1, dtx $$2, azf $$3, eia $$4, dbd $$5, eix $$6) {
   }

   private static int[] b(eii.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dtx $$5 = $$0.b();
      dby $$6 = $$0.i();
      dyg $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dxs.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dxs.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dxs.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dxs.a.a, $$6, $$7)
      };
   }

   protected static int a(eii.a $$0, int $$1, int $$2) {
      dbd $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(eii.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected iz a(eii.a $$0, dlk $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dlk.b) {
         $$2 = -5;
      } else if ($$1 == dlk.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dlk.d) {
         $$3 = -5;
      }

      dbd $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new iz($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eii.b> a(eii.a var1);

   public Optional<eii.b> b(eii.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eir<?> e();

   public static record a(jw a, dtx b, dcz c, dyg d, emj e, dyr f, long g, dbd h, dby i, Predicate<ji<dcv>> j) {

      public a(jw $$0, dtx $$1, dcz $$2, dyg $$3, emj $$4, long $$5, dbd $$6, dby $$7, Predicate<ji<dcv>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dyr a(long $$0, dbd $$1) {
         dyr $$2 = new dyr(new dxt(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(iz a, Either<Consumer<eja>, eja> b) {
      public b(iz $$0, Consumer<eja> $$1) {
         this($$0, Either.left($$1));
      }

      public eja a() {
         return (eja)this.b.map($$0 -> {
            eja $$1 = new eja();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public iz b() {
         return this.a;
      }

      public Either<Consumer<eja>, eja> c() {
         return this.b;
      }
   }

   public static record c(jm<dcv> b, Map<btq, eip> c, dxo.b d, eit e) {
      public static final MapCodec<eii.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jx.a(lq.az).fieldOf("biomes").forGetter(eii.c::a),
                  Codec.simpleMap(btq.i, eip.a, azs.a(btq.values())).fieldOf("spawn_overrides").forGetter(eii.c::b),
                  dxo.b.l.fieldOf("step").forGetter(eii.c::c),
                  eit.f.optionalFieldOf("terrain_adaptation", eit.a).forGetter(eii.c::d)
               )
               .apply($$0, eii.c::new)
      );

      public jm<dcv> a() {
         return this.b;
      }

      public Map<btq, eip> b() {
         return this.c;
      }

      public dxo.b c() {
         return this.d;
      }

      public eit d() {
         return this.e;
      }
   }
}
