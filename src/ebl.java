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

public abstract class ebl {
   public static final Codec<ebl> a = kf.T.q().dispatch(ebl::e, ebu::codec);
   public static final Codec<ij<ebl>> b = aiu.a(kg.aD, a);
   protected final ebl.c c;

   public static <S extends ebl> RecordCodecBuilder<S, ebl.c> a(Instance<S> $$0) {
      return ebl.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends ebl> Codec<S> a(Function<ebl.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected ebl(ebl.c $$0) {
      this.c = $$0;
   }

   public in<cwq> a() {
      return this.c.b;
   }

   public Map<bol, ebs> b() {
      return this.c.c;
   }

   public dqr.b c() {
      return this.c.d;
   }

   public ebw d() {
      return this.c.e;
   }

   public ebd a(ebd $$0) {
      return this.d() != ebw.a ? $$0.a(12) : $$0;
   }

   public ebt a(iw $$0, dng $$1, cwu $$2, drj $$3, efm $$4, long $$5, cuy $$6, int $$7, cvt $$8, Predicate<ij<cwq>> $$9) {
      ebl.a $$10 = new ebl.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<ebl.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         ecd $$12 = $$11.get().a();
         ebt $$13 = new ebt(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return ebt.b;
   }

   protected static Optional<ebl.b> a(ebl.a $$0, dqv.a $$1, Consumer<ecd> $$2) {
      cuy $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new ebl.b(new hz($$4, $$6, $$5), $$2));
   }

   private static boolean a(ebl.b $$0, ebl.a $$1) {
      hz $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(iu.a($$2.u()), iu.a($$2.v()), iu.a($$2.w()), $$1.d.b()));
   }

   public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, eca $$6) {
   }

   private static int[] b(ebl.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dng $$5 = $$0.b();
      cvt $$6 = $$0.i();
      drj $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dqv.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dqv.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dqv.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dqv.a.a, $$6, $$7)
      };
   }

   protected static int a(ebl.a $$0, int $$1, int $$2) {
      cuy $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(ebl.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected hz a(ebl.a $$0, dfe $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dfe.b) {
         $$2 = -5;
      } else if ($$1 == dfe.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dfe.d) {
         $$3 = -5;
      }

      cuy $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new hz($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<ebl.b> a(ebl.a var1);

   public Optional<ebl.b> b(ebl.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract ebu<?> e();

   public static record a(iw a, dng b, cwu c, drj d, efm e, dru f, long g, cuy h, cvt i, Predicate<ij<cwq>> j) {

      public a(iw $$0, dng $$1, cwu $$2, drj $$3, efm $$4, long $$5, cuy $$6, cvt $$7, Predicate<ij<cwq>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dru a(long $$0, cuy $$1) {
         dru $$2 = new dru(new dqw(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(hz a, Either<Consumer<ecd>, ecd> b) {
      public b(hz $$0, Consumer<ecd> $$1) {
         this($$0, Either.left($$1));
      }

      public ecd a() {
         return (ecd)this.b.map($$0 -> {
            ecd $$1 = new ecd();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public hz b() {
         return this.a;
      }

      public Either<Consumer<ecd>, ecd> c() {
         return this.b;
      }
   }

   public static record c(in<cwq> b, Map<bol, ebs> c, dqr.b d, ebw e) {
      public static final MapCodec<ebl.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ix.a(kg.at).fieldOf("biomes").forGetter(ebl.c::a),
                  Codec.simpleMap(bol.i, ebs.a, axc.a(bol.values())).fieldOf("spawn_overrides").forGetter(ebl.c::b),
                  dqr.b.l.fieldOf("step").forGetter(ebl.c::c),
                  ebw.e.optionalFieldOf("terrain_adaptation", ebw.a).forGetter(ebl.c::d)
               )
               .apply($$0, ebl.c::new)
      );

      public in<cwq> a() {
         return this.b;
      }

      public Map<bol, ebs> b() {
         return this.c;
      }

      public dqr.b c() {
         return this.d;
      }

      public ebw d() {
         return this.e;
      }
   }
}
