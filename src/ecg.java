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

public abstract class ecg {
   public static final Codec<ecg> a = kh.T.q().dispatch(ecg::e, ecp::codec);
   public static final Codec<il<ecg>> b = aiy.a(ki.aE, a);
   protected final ecg.c c;

   public static <S extends ecg> RecordCodecBuilder<S, ecg.c> a(Instance<S> $$0) {
      return ecg.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends ecg> Codec<S> a(Function<ecg.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected ecg(ecg.c $$0) {
      this.c = $$0;
   }

   public ip<cxd> a() {
      return this.c.b;
   }

   public Map<bpa, ecn> b() {
      return this.c.c;
   }

   public drm.b c() {
      return this.c.d;
   }

   public ecr d() {
      return this.c.e;
   }

   public eby a(eby $$0) {
      return this.d() != ecr.a ? $$0.a(12) : $$0;
   }

   public eco a(iy $$0, dob $$1, cxh $$2, dse $$3, egh $$4, long $$5, cvl $$6, int $$7, cwg $$8, Predicate<il<cxd>> $$9) {
      ecg.a $$10 = new ecg.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<ecg.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ecy $$12 = $$11.get().a();
         eco $$13 = new eco(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eco.b;
   }

   protected static Optional<ecg.b> a(ecg.a $$0, drq.a $$1, Consumer<ecy> $$2) {
      cvl $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new ecg.b(new ib($$4, $$6, $$5), $$2));
   }

   private static boolean a(ecg.b $$0, ecg.a $$1) {
      ib $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(iw.a($$2.u()), iw.a($$2.v()), iw.a($$2.w()), $$1.d.b()));
   }

   public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ecv $$6) {
   }

   private static int[] b(ecg.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dob $$5 = $$0.b();
      cwg $$6 = $$0.i();
      dse $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, drq.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, drq.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, drq.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, drq.a.a, $$6, $$7)
      };
   }

   protected static int a(ecg.a $$0, int $$1, int $$2) {
      cvl $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(ecg.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected ib a(ecg.a $$0, dfr $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dfr.b) {
         $$2 = -5;
      } else if ($$1 == dfr.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dfr.d) {
         $$3 = -5;
      }

      cvl $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new ib($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<ecg.b> a(ecg.a var1);

   public Optional<ecg.b> b(ecg.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ecp<?> e();

   public static record a(iy a, dob b, cxh c, dse d, egh e, dsp f, long g, cvl h, cwg i, Predicate<il<cxd>> j) {

      public a(iy $$0, dob $$1, cxh $$2, dse $$3, egh $$4, long $$5, cvl $$6, cwg $$7, Predicate<il<cxd>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dsp a(long $$0, cvl $$1) {
         dsp $$2 = new dsp(new drr(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(ib a, Either<Consumer<ecy>, ecy> b) {
      public b(ib $$0, Consumer<ecy> $$1) {
         this($$0, Either.left($$1));
      }

      public ecy a() {
         return (ecy)this.b.map($$0 -> {
            ecy $$1 = new ecy();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public ib b() {
         return this.a;
      }

      public Either<Consumer<ecy>, ecy> c() {
         return this.b;
      }
   }

   public static record c(ip<cxd> b, Map<bpa, ecn> c, drm.b d, ecr e) {
      public static final MapCodec<ecg.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  iz.a(ki.au).fieldOf("biomes").forGetter(ecg.c::a),
                  Codec.simpleMap(bpa.i, ecn.a, axg.a(bpa.values())).fieldOf("spawn_overrides").forGetter(ecg.c::b),
                  drm.b.l.fieldOf("step").forGetter(ecg.c::c),
                  ecr.e.optionalFieldOf("terrain_adaptation", ecr.a).forGetter(ecg.c::d)
               )
               .apply($$0, ecg.c::new)
      );

      public ip<cxd> a() {
         return this.b;
      }

      public Map<bpa, ecn> b() {
         return this.c;
      }

      public drm.b c() {
         return this.d;
      }

      public ecr d() {
         return this.e;
      }
   }
}
