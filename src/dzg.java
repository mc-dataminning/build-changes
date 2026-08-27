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

public abstract class dzg {
   public static final Codec<dzg> a = kd.T.q().dispatch(dzg::e, dzp::codec);
   public static final Codec<ih<dzg>> b = ahc.a(ke.aD, a);
   protected final dzg.c c;

   public static <S extends dzg> RecordCodecBuilder<S, dzg.c> a(Instance<S> $$0) {
      return dzg.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dzg> Codec<S> a(Function<dzg.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dzg(dzg.c $$0) {
      this.c = $$0;
   }

   public il<cuo> a() {
      return this.c.b;
   }

   public Map<bmo, dzn> b() {
      return this.c.c;
   }

   public dom.b c() {
      return this.c.d;
   }

   public dzr d() {
      return this.c.e;
   }

   public dyy a(dyy $$0) {
      return this.d() != dzr.a ? $$0.a(12) : $$0;
   }

   public dzo a(iu $$0, dle $$1, cus $$2, dpe $$3, edh $$4, long $$5, csw $$6, int $$7, ctr $$8, Predicate<ih<cuo>> $$9) {
      dzg.a $$10 = new dzg.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dzg.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dzy $$12 = $$11.get().a();
         dzo $$13 = new dzo(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dzo.b;
   }

   protected static Optional<dzg.b> a(dzg.a $$0, doq.a $$1, Consumer<dzy> $$2) {
      csw $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dzg.b(new hx($$4, $$6, $$5), $$2));
   }

   private static boolean a(dzg.b $$0, dzg.a $$1) {
      hx $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(is.a($$2.u()), is.a($$2.v()), is.a($$2.w()), $$1.d.b()));
   }

   public void a(cuk $$0, cui $$1, dle $$2, auv $$3, dyy $$4, csw $$5, dzv $$6) {
   }

   private static int[] b(dzg.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dle $$5 = $$0.b();
      ctr $$6 = $$0.i();
      dpe $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, doq.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, doq.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, doq.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, doq.a.a, $$6, $$7)
      };
   }

   protected static int a(dzg.a $$0, int $$1, int $$2) {
      csw $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dzg.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected hx a(dzg.a $$0, ddc $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == ddc.b) {
         $$2 = -5;
      } else if ($$1 == ddc.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == ddc.d) {
         $$3 = -5;
      }

      csw $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new hx($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dzg.b> a(dzg.a var1);

   public Optional<dzg.b> b(dzg.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dzp<?> e();

   public static record a(iu a, dle b, cus c, dpe d, edh e, dpp f, long g, csw h, ctr i, Predicate<ih<cuo>> j) {

      public a(iu $$0, dle $$1, cus $$2, dpe $$3, edh $$4, long $$5, csw $$6, ctr $$7, Predicate<ih<cuo>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dpp a(long $$0, csw $$1) {
         dpp $$2 = new dpp(new dor(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(hx a, Either<Consumer<dzy>, dzy> b) {
      public b(hx $$0, Consumer<dzy> $$1) {
         this($$0, Either.left($$1));
      }

      public dzy a() {
         return (dzy)this.b.map($$0 -> {
            dzy $$1 = new dzy();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public hx b() {
         return this.a;
      }

      public Either<Consumer<dzy>, dzy> c() {
         return this.b;
      }
   }

   public static record c(il<cuo> b, Map<bmo, dzn> c, dom.b d, dzr e) {
      public static final MapCodec<dzg.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  iv.a(ke.at).fieldOf("biomes").forGetter(dzg.c::a),
                  Codec.simpleMap(bmo.i, dzn.a, avk.a(bmo.values())).fieldOf("spawn_overrides").forGetter(dzg.c::b),
                  dom.b.l.fieldOf("step").forGetter(dzg.c::c),
                  dzr.e.optionalFieldOf("terrain_adaptation", dzr.a).forGetter(dzg.c::d)
               )
               .apply($$0, dzg.c::new)
      );

      public il<cuo> a() {
         return this.b;
      }

      public Map<bmo, dzn> b() {
         return this.c;
      }

      public dom.b c() {
         return this.d;
      }

      public dzr d() {
         return this.e;
      }
   }
}
