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

public abstract class dvk {
   public static final Codec<dvk> a = jd.U.q().dispatch(dvk::e, dvt::codec);
   public static final Codec<hg<dvk>> b = aeu.a(je.az, a);
   protected final dvk.c c;

   public static <S extends dvk> RecordCodecBuilder<S, dvk.c> a(Instance<S> $$0) {
      return dvk.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dvk> Codec<S> a(Function<dvk.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dvk(dvk.c $$0) {
      this.c = $$0;
   }

   public hk<cqv> a() {
      return this.c.b;
   }

   public Map<bjl, dvr> b() {
      return this.c.c;
   }

   public dkq.b c() {
      return this.c.d;
   }

   public dvv d() {
      return this.c.e;
   }

   public dvc a(dvc $$0) {
      return this.d() != dvv.a ? $$0.a(12) : $$0;
   }

   public dvs a(hu $$0, dhi $$1, cqz $$2, dli $$3, dze $$4, long $$5, cpe $$6, int $$7, cpz $$8, Predicate<hg<cqv>> $$9) {
      dvk.a $$10 = new dvk.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dvk.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dwc $$12 = $$11.get().a();
         dvs $$13 = new dvs(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dvs.b;
   }

   protected static Optional<dvk.b> a(dvk.a $$0, dku.a $$1, Consumer<dwc> $$2) {
      cpe $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dvk.b(new gw($$4, $$6, $$5), $$2));
   }

   private static boolean a(dvk.b $$0, dvk.a $$1) {
      gw $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(hs.a($$2.u()), hs.a($$2.v()), hs.a($$2.w()), $$1.d.b()));
   }

   public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, dvz $$6) {
   }

   private static int[] b(dvk.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dhi $$5 = $$0.b();
      cpz $$6 = $$0.i();
      dli $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dku.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dku.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dku.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dku.a.a, $$6, $$7)
      };
   }

   protected static int a(dvk.a $$0, int $$1, int $$2) {
      cpe $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dvk.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected gw a(dvk.a $$0, czj $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == czj.b) {
         $$2 = -5;
      } else if ($$1 == czj.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == czj.d) {
         $$3 = -5;
      }

      cpe $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new gw($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dvk.b> a(dvk.a var1);

   public Optional<dvk.b> b(dvk.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dvt<?> e();

   public static record a(hu a, dhi b, cqz c, dli d, dze e, dlt f, long g, cpe h, cpz i, Predicate<hg<cqv>> j) {

      public a(hu $$0, dhi $$1, cqz $$2, dli $$3, dze $$4, long $$5, cpe $$6, cpz $$7, Predicate<hg<cqv>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dlt a(long $$0, cpe $$1) {
         dlt $$2 = new dlt(new dkv(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(gw a, Either<Consumer<dwc>, dwc> b) {
      public b(gw $$0, Consumer<dwc> $$1) {
         this($$0, Either.left($$1));
      }

      public dwc a() {
         return (dwc)this.b.map($$0 -> {
            dwc $$1 = new dwc();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public gw b() {
         return this.a;
      }

      public Either<Consumer<dwc>, dwc> c() {
         return this.b;
      }
   }

   public static record c(hk<cqv> b, Map<bjl, dvr> c, dkq.b d, dvv e) {
      public static final MapCodec<dvk.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hv.a(je.ap).fieldOf("biomes").forGetter(dvk.c::a),
                  Codec.simpleMap(bjl.i, dvr.a, asr.a(bjl.values())).fieldOf("spawn_overrides").forGetter(dvk.c::b),
                  dkq.b.l.fieldOf("step").forGetter(dvk.c::c),
                  dvv.e.optionalFieldOf("terrain_adaptation", dvv.a).forGetter(dvk.c::d)
               )
               .apply($$0, dvk.c::new)
      );

      public hk<cqv> a() {
         return this.b;
      }

      public Map<bjl, dvr> b() {
         return this.c;
      }

      public dkq.b c() {
         return this.d;
      }

      public dvv d() {
         return this.e;
      }
   }
}
