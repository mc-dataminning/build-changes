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

public abstract class dvi {
   public static final Codec<dvi> a = jb.U.q().dispatch(dvi::e, dvr::codec);
   public static final Codec<he<dvi>> b = aes.a(jc.az, a);
   protected final dvi.c c;

   public static <S extends dvi> RecordCodecBuilder<S, dvi.c> a(Instance<S> $$0) {
      return dvi.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dvi> Codec<S> a(Function<dvi.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dvi(dvi.c $$0) {
      this.c = $$0;
   }

   public hi<cqt> a() {
      return this.c.b;
   }

   public Map<bjj, dvp> b() {
      return this.c.c;
   }

   public dko.b c() {
      return this.c.d;
   }

   public dvt d() {
      return this.c.e;
   }

   public dva a(dva $$0) {
      return this.d() != dvt.a ? $$0.a(12) : $$0;
   }

   public dvq a(hr $$0, dhg $$1, cqx $$2, dlg $$3, dzc $$4, long $$5, cpc $$6, int $$7, cpx $$8, Predicate<he<cqt>> $$9) {
      dvi.a $$10 = new dvi.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dvi.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dwa $$12 = $$11.get().a();
         dvq $$13 = new dvq(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dvq.b;
   }

   protected static Optional<dvi.b> a(dvi.a $$0, dks.a $$1, Consumer<dwa> $$2) {
      cpc $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dvi.b(new gw($$4, $$6, $$5), $$2));
   }

   private static boolean a(dvi.b $$0, dvi.a $$1) {
      gw $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(hp.a($$2.u()), hp.a($$2.v()), hp.a($$2.w()), $$1.d.b()));
   }

   public void a(cqp $$0, cqn $$1, dhg $$2, asc $$3, dva $$4, cpc $$5, dvx $$6) {
   }

   private static int[] b(dvi.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dhg $$5 = $$0.b();
      cpx $$6 = $$0.i();
      dlg $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dks.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dks.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dks.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dks.a.a, $$6, $$7)
      };
   }

   protected static int a(dvi.a $$0, int $$1, int $$2) {
      cpc $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dvi.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected gw a(dvi.a $$0, czh $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == czh.b) {
         $$2 = -5;
      } else if ($$1 == czh.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == czh.d) {
         $$3 = -5;
      }

      cpc $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new gw($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dvi.b> a(dvi.a var1);

   public Optional<dvi.b> b(dvi.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dvr<?> e();

   public static record a(hr a, dhg b, cqx c, dlg d, dzc e, dlr f, long g, cpc h, cpx i, Predicate<he<cqt>> j) {

      public a(hr $$0, dhg $$1, cqx $$2, dlg $$3, dzc $$4, long $$5, cpc $$6, cpx $$7, Predicate<he<cqt>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dlr a(long $$0, cpc $$1) {
         dlr $$2 = new dlr(new dkt(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(gw a, Either<Consumer<dwa>, dwa> b) {
      public b(gw $$0, Consumer<dwa> $$1) {
         this($$0, Either.left($$1));
      }

      public dwa a() {
         return (dwa)this.b.map($$0 -> {
            dwa $$1 = new dwa();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public gw b() {
         return this.a;
      }

      public Either<Consumer<dwa>, dwa> c() {
         return this.b;
      }
   }

   public static record c(hi<cqt> b, Map<bjj, dvp> c, dko.b d, dvt e) {
      public static final MapCodec<dvi.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hs.a(jc.ap).fieldOf("biomes").forGetter(dvi.c::a),
                  Codec.simpleMap(bjj.i, dvp.a, asp.a(bjj.values())).fieldOf("spawn_overrides").forGetter(dvi.c::b),
                  dko.b.l.fieldOf("step").forGetter(dvi.c::c),
                  dvt.e.optionalFieldOf("terrain_adaptation", dvt.a).forGetter(dvi.c::d)
               )
               .apply($$0, dvi.c::new)
      );

      public hi<cqt> a() {
         return this.b;
      }

      public Map<bjj, dvp> b() {
         return this.c;
      }

      public dko.b c() {
         return this.d;
      }

      public dvt d() {
         return this.e;
      }
   }
}
