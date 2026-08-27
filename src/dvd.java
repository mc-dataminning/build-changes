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

public abstract class dvd {
   public static final Codec<dvd> a = jd.U.q().dispatch(dvd::e, dvm::codec);
   public static final Codec<hg<dvd>> b = aeq.a(je.az, a);
   protected final dvd.c c;

   public static <S extends dvd> RecordCodecBuilder<S, dvd.c> a(Instance<S> $$0) {
      return dvd.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dvd> Codec<S> a(Function<dvd.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dvd(dvd.c $$0) {
      this.c = $$0;
   }

   public hk<cqo> a() {
      return this.c.b;
   }

   public Map<bje, dvk> b() {
      return this.c.c;
   }

   public dkj.b c() {
      return this.c.d;
   }

   public dvo d() {
      return this.c.e;
   }

   public duv a(duv $$0) {
      return this.d() != dvo.a ? $$0.a(12) : $$0;
   }

   public dvl a(hu $$0, dhb $$1, cqs $$2, dlb $$3, dyx $$4, long $$5, cox $$6, int $$7, cps $$8, Predicate<hg<cqo>> $$9) {
      dvd.a $$10 = new dvd.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dvd.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dvv $$12 = $$11.get().a();
         dvl $$13 = new dvl(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dvl.b;
   }

   protected static Optional<dvd.b> a(dvd.a $$0, dkn.a $$1, Consumer<dvv> $$2) {
      cox $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dvd.b(new gw($$4, $$6, $$5), $$2));
   }

   private static boolean a(dvd.b $$0, dvd.a $$1) {
      gw $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(hs.a($$2.u()), hs.a($$2.v()), hs.a($$2.w()), $$1.d.b()));
   }

   public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, dvs $$6) {
   }

   private static int[] b(dvd.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dhb $$5 = $$0.b();
      cps $$6 = $$0.i();
      dlb $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dkn.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dkn.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dkn.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dkn.a.a, $$6, $$7)
      };
   }

   protected static int a(dvd.a $$0, int $$1, int $$2) {
      cox $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dvd.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected gw a(dvd.a $$0, czc $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == czc.b) {
         $$2 = -5;
      } else if ($$1 == czc.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == czc.d) {
         $$3 = -5;
      }

      cox $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new gw($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dvd.b> a(dvd.a var1);

   public Optional<dvd.b> b(dvd.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dvm<?> e();

   public static record a(hu a, dhb b, cqs c, dlb d, dyx e, dlm f, long g, cox h, cps i, Predicate<hg<cqo>> j) {

      public a(hu $$0, dhb $$1, cqs $$2, dlb $$3, dyx $$4, long $$5, cox $$6, cps $$7, Predicate<hg<cqo>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dlm a(long $$0, cox $$1) {
         dlm $$2 = new dlm(new dko(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(gw a, Either<Consumer<dvv>, dvv> b) {
      public b(gw $$0, Consumer<dvv> $$1) {
         this($$0, Either.left($$1));
      }

      public dvv a() {
         return (dvv)this.b.map($$0 -> {
            dvv $$1 = new dvv();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public gw b() {
         return this.a;
      }

      public Either<Consumer<dvv>, dvv> c() {
         return this.b;
      }
   }

   public static record c(hk<cqo> b, Map<bje, dvk> c, dkj.b d, dvo e) {
      public static final MapCodec<dvd.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hv.a(je.ap).fieldOf("biomes").forGetter(dvd.c::a),
                  Codec.simpleMap(bje.i, dvk.a, ask.a(bje.values())).fieldOf("spawn_overrides").forGetter(dvd.c::b),
                  dkj.b.l.fieldOf("step").forGetter(dvd.c::c),
                  dvo.e.optionalFieldOf("terrain_adaptation", dvo.a).forGetter(dvd.c::d)
               )
               .apply($$0, dvd.c::new)
      );

      public hk<cqo> a() {
         return this.b;
      }

      public Map<bje, dvk> b() {
         return this.c;
      }

      public dkj.b c() {
         return this.d;
      }

      public dvo d() {
         return this.e;
      }
   }
}
