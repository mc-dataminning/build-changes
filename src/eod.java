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

public abstract class eod {
   public static final Codec<eod> a = ma.R.q().dispatch(eod::e, eom::codec);
   public static final Codec<jq<eod>> b = all.a(mb.aU, a);
   protected final eod.c c;

   public static <S extends eod> RecordCodecBuilder<S, eod.c> a(Instance<S> $$0) {
      return eod.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eod> MapCodec<S> a(Function<eod.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eod(eod.c $$0) {
      this.c = $$0;
   }

   public ju<dib> a() {
      return this.c.b;
   }

   public Map<bwa, eok> b() {
      return this.c.c;
   }

   public edf.a c() {
      return this.c.d;
   }

   public eoo d() {
      return this.c.e;
   }

   public env a(env $$0) {
      return this.d() != eoo.a ? $$0.a(12) : $$0;
   }

   public eol a(jq<eod> $$0, alo<dgz> $$1, ke $$2, dzk $$3, dif $$4, edx $$5, esg $$6, long $$7, dgf $$8, int $$9, dhb $$10, Predicate<jq<dib>> $$11) {
      bpu $$12 = bpr.f.a($$8, $$1, $$0);
      eod.a $$13 = new eod.a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
      Optional<eod.b> $$14 = this.b($$13);
      if ($$14.isPresent()) {
         eov $$15 = $$14.get().a();
         eol $$16 = new eol(this, $$8, $$9, $$15.a());
         if ($$16.b()) {
            if ($$12 != null) {
               $$12.finish(true);
            }

            return $$16;
         }
      }

      if ($$12 != null) {
         $$12.finish(false);
      }

      return eol.b;
   }

   protected static Optional<eod.b> a(eod.a $$0, edj.a $$1, Consumer<eov> $$2) {
      dgf $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eod.b(new jh($$4, $$6, $$5), $$2));
   }

   private static boolean a(eod.b $$0, eod.a $$1) {
      jh $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kb.a($$2.u()), kb.a($$2.v()), kb.a($$2.w()), $$1.d.b()));
   }

   public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, eos $$6) {
   }

   private static int[] c(eod.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dzk $$5 = $$0.b();
      dhb $$6 = $$0.i();
      edx $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, edj.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, edj.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, edj.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, edj.a.a, $$6, $$7)
      };
   }

   public static int a(eod.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eod.a $$0, int $$1, int $$2) {
      dgf $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eod.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jh a(eod.a $$0, dqv $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dqv.b) {
         $$2 = -5;
      } else if ($$1 == dqv.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dqv.d) {
         $$3 = -5;
      }

      dgf $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jh($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eod.b> a(eod.a var1);

   public Optional<eod.b> b(eod.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eom<?> e();

   public static record a(ke a, dzk b, dif c, edx d, esg e, eei f, long g, dgf h, dhb i, Predicate<jq<dib>> j) {

      public a(ke $$0, dzk $$1, dif $$2, edx $$3, esg $$4, long $$5, dgf $$6, dhb $$7, Predicate<jq<dib>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static eei a(long $$0, dgf $$1) {
         eei $$2 = new eei(new edk(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(jh a, Either<Consumer<eov>, eov> b) {
      public b(jh $$0, Consumer<eov> $$1) {
         this($$0, Either.left($$1));
      }

      public eov a() {
         return (eov)this.b.map($$0 -> {
            eov $$1 = new eov();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jh b() {
         return this.a;
      }

      public Either<Consumer<eov>, eov> c() {
         return this.b;
      }
   }

   public static record c(ju<dib> b, Map<bwa, eok> c, edf.a d, eoo e) {
      static final eod.c f = new eod.c(ju.a(), Map.of(), edf.a.e, eoo.a);
      public static final MapCodec<eod.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(mb.aI).fieldOf("biomes").forGetter(eod.c::a),
                  Codec.simpleMap(bwa.i, eok.a, baq.a(bwa.values())).fieldOf("spawn_overrides").forGetter(eod.c::b),
                  edf.a.l.fieldOf("step").forGetter(eod.c::c),
                  eoo.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(eod.c::d)
               )
               .apply($$0, eod.c::new)
      );

      public c(ju<dib> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public ju<dib> a() {
         return this.b;
      }

      public Map<bwa, eok> b() {
         return this.c;
      }

      public edf.a c() {
         return this.d;
      }

      public eoo d() {
         return this.e;
      }

      public static class a {
         private final ju<dib> a;
         private Map<bwa, eok> b = eod.c.f.c;
         private edf.a c = eod.c.f.d;
         private eoo d = eod.c.f.e;

         public a(ju<dib> $$0) {
            this.a = $$0;
         }

         public eod.c.a a(Map<bwa, eok> $$0) {
            this.b = $$0;
            return this;
         }

         public eod.c.a a(edf.a $$0) {
            this.c = $$0;
            return this;
         }

         public eod.c.a a(eoo $$0) {
            this.d = $$0;
            return this;
         }

         public eod.c a() {
            return new eod.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
