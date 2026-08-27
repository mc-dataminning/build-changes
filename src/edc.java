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

public abstract class edc {
   public static final Codec<edc> a = ki.T.q().dispatch(edc::e, edl::codec);
   public static final Codec<il<edc>> b = ajd.a(kj.aE, a);
   protected final edc.c c;

   public static <S extends edc> RecordCodecBuilder<S, edc.c> a(Instance<S> $$0) {
      return edc.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends edc> Codec<S> a(Function<edc.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected edc(edc.c $$0) {
      this.c = $$0;
   }

   public ip<cxy> a() {
      return this.c.b;
   }

   public Map<bpr, edj> b() {
      return this.c.c;
   }

   public dsi.b c() {
      return this.c.d;
   }

   public edn d() {
      return this.c.e;
   }

   public ecu a(ecu $$0) {
      return this.d() != edn.a ? $$0.a(12) : $$0;
   }

   public edk a(iz $$0, dow $$1, cyc $$2, dta $$3, ehd $$4, long $$5, cwg $$6, int $$7, cxb $$8, Predicate<il<cxy>> $$9) {
      edc.a $$10 = new edc.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<edc.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         edu $$12 = $$11.get().a();
         edk $$13 = new edk(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return edk.b;
   }

   protected static Optional<edc.b> a(edc.a $$0, dsm.a $$1, Consumer<edu> $$2) {
      cwg $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new edc.b(new ib($$4, $$6, $$5), $$2));
   }

   private static boolean a(edc.b $$0, edc.a $$1) {
      ib $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(iw.a($$2.u()), iw.a($$2.v()), iw.a($$2.w()), $$1.d.b()));
   }

   public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, edr $$6) {
   }

   private static int[] b(edc.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dow $$5 = $$0.b();
      cxb $$6 = $$0.i();
      dta $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dsm.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dsm.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dsm.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dsm.a.a, $$6, $$7)
      };
   }

   protected static int a(edc.a $$0, int $$1, int $$2) {
      cwg $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(edc.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ib a(edc.a $$0, dgm $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dgm.b) {
         $$2 = -5;
      } else if ($$1 == dgm.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dgm.d) {
         $$3 = -5;
      }

      cwg $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ib($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<edc.b> a(edc.a var1);

   public Optional<edc.b> b(edc.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract edl<?> e();

   public static record a(iz a, dow b, cyc c, dta d, ehd e, dtl f, long g, cwg h, cxb i, Predicate<il<cxy>> j) {

      public a(iz $$0, dow $$1, cyc $$2, dta $$3, ehd $$4, long $$5, cwg $$6, cxb $$7, Predicate<il<cxy>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dtl a(long $$0, cwg $$1) {
         dtl $$2 = new dtl(new dsn(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(ib a, Either<Consumer<edu>, edu> b) {
      public b(ib $$0, Consumer<edu> $$1) {
         this($$0, Either.left($$1));
      }

      public edu a() {
         return (edu)this.b.map($$0 -> {
            edu $$1 = new edu();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ib b() {
         return this.a;
      }

      public Either<Consumer<edu>, edu> c() {
         return this.b;
      }
   }

   public static record c(ip<cxy> b, Map<bpr, edj> c, dsi.b d, edn e) {
      public static final MapCodec<edc.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ja.a(kj.au).fieldOf("biomes").forGetter(edc.c::a),
                  Codec.simpleMap(bpr.i, edj.a, axq.a(bpr.values())).fieldOf("spawn_overrides").forGetter(edc.c::b),
                  dsi.b.l.fieldOf("step").forGetter(edc.c::c),
                  edn.e.optionalFieldOf("terrain_adaptation", edn.a).forGetter(edc.c::d)
               )
               .apply($$0, edc.c::new)
      );

      public ip<cxy> a() {
         return this.b;
      }

      public Map<bpr, edj> b() {
         return this.c;
      }

      public dsi.b c() {
         return this.d;
      }

      public edn d() {
         return this.e;
      }
   }
}
