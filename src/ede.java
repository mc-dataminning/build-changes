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

public abstract class ede {
   public static final Codec<ede> a = ki.T.q().dispatch(ede::e, edn::codec);
   public static final Codec<il<ede>> b = ajd.a(kj.aE, a);
   protected final ede.c c;

   public static <S extends ede> RecordCodecBuilder<S, ede.c> a(Instance<S> $$0) {
      return ede.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends ede> Codec<S> a(Function<ede.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected ede(ede.c $$0) {
      this.c = $$0;
   }

   public ip<cya> a() {
      return this.c.b;
   }

   public Map<bps, edl> b() {
      return this.c.c;
   }

   public dsk.b c() {
      return this.c.d;
   }

   public edp d() {
      return this.c.e;
   }

   public ecw a(ecw $$0) {
      return this.d() != edp.a ? $$0.a(12) : $$0;
   }

   public edm a(iz $$0, doy $$1, cye $$2, dtc $$3, ehf $$4, long $$5, cwi $$6, int $$7, cxd $$8, Predicate<il<cya>> $$9) {
      ede.a $$10 = new ede.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<ede.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         edw $$12 = $$11.get().a();
         edm $$13 = new edm(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return edm.b;
   }

   protected static Optional<ede.b> a(ede.a $$0, dso.a $$1, Consumer<edw> $$2) {
      cwi $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new ede.b(new ib($$4, $$6, $$5), $$2));
   }

   private static boolean a(ede.b $$0, ede.a $$1) {
      ib $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(iw.a($$2.u()), iw.a($$2.v()), iw.a($$2.w()), $$1.d.b()));
   }

   public void a(cxw $$0, cxu $$1, doy $$2, axd $$3, ecw $$4, cwi $$5, edt $$6) {
   }

   private static int[] b(ede.a $$0, int $$1, int $$2, int $$3, int $$4) {
      doy $$5 = $$0.b();
      cxd $$6 = $$0.i();
      dtc $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dso.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dso.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dso.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dso.a.a, $$6, $$7)
      };
   }

   protected static int a(ede.a $$0, int $$1, int $$2) {
      cwi $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(ede.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ib a(ede.a $$0, dgo $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dgo.b) {
         $$2 = -5;
      } else if ($$1 == dgo.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dgo.d) {
         $$3 = -5;
      }

      cwi $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ib($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<ede.b> a(ede.a var1);

   public Optional<ede.b> b(ede.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract edn<?> e();

   public static record a(iz a, doy b, cye c, dtc d, ehf e, dtn f, long g, cwi h, cxd i, Predicate<il<cya>> j) {

      public a(iz $$0, doy $$1, cye $$2, dtc $$3, ehf $$4, long $$5, cwi $$6, cxd $$7, Predicate<il<cya>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dtn a(long $$0, cwi $$1) {
         dtn $$2 = new dtn(new dsp(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(ib a, Either<Consumer<edw>, edw> b) {
      public b(ib $$0, Consumer<edw> $$1) {
         this($$0, Either.left($$1));
      }

      public edw a() {
         return (edw)this.b.map($$0 -> {
            edw $$1 = new edw();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ib b() {
         return this.a;
      }

      public Either<Consumer<edw>, edw> c() {
         return this.b;
      }
   }

   public static record c(ip<cya> b, Map<bps, edl> c, dsk.b d, edp e) {
      public static final MapCodec<ede.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ja.a(kj.au).fieldOf("biomes").forGetter(ede.c::a),
                  Codec.simpleMap(bps.i, edl.a, axq.a(bps.values())).fieldOf("spawn_overrides").forGetter(ede.c::b),
                  dsk.b.l.fieldOf("step").forGetter(ede.c::c),
                  edp.e.optionalFieldOf("terrain_adaptation", edp.a).forGetter(ede.c::d)
               )
               .apply($$0, ede.c::new)
      );

      public ip<cya> a() {
         return this.b;
      }

      public Map<bps, edl> b() {
         return this.c;
      }

      public dsk.b c() {
         return this.d;
      }

      public edp d() {
         return this.e;
      }
   }
}
