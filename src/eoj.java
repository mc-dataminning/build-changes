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

public abstract class eoj {
   public static final Codec<eoj> a = ma.R.q().dispatch(eoj::e, eos::codec);
   public static final Codec<jq<eoj>> b = alv.a(mb.aU, a);
   protected final eoj.c c;

   public static <S extends eoj> RecordCodecBuilder<S, eoj.c> a(Instance<S> $$0) {
      return eoj.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eoj> MapCodec<S> a(Function<eoj.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eoj(eoj.c $$0) {
      this.c = $$0;
   }

   public ju<dij> a() {
      return this.c.b;
   }

   public Map<bwi, eoq> b() {
      return this.c.c;
   }

   public edl.a c() {
      return this.c.d;
   }

   public eou d() {
      return this.c.e;
   }

   public eob a(eob $$0) {
      return this.d() != eou.a ? $$0.a(12) : $$0;
   }

   public eor a(ke $$0, dzq $$1, din $$2, eed $$3, esm $$4, long $$5, dgn $$6, int $$7, dhj $$8, Predicate<jq<dij>> $$9) {
      eoj.a $$10 = new eoj.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eoj.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         epb $$12 = $$11.get().a();
         eor $$13 = new eor(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eor.b;
   }

   protected static Optional<eoj.b> a(eoj.a $$0, edp.a $$1, Consumer<epb> $$2) {
      dgn $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eoj.b(new jh($$4, $$6, $$5), $$2));
   }

   private static boolean a(eoj.b $$0, eoj.a $$1) {
      jh $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kb.a($$2.u()), kb.a($$2.v()), kb.a($$2.w()), $$1.d.b()));
   }

   public void a(dif $$0, did $$1, dzq $$2, bam $$3, eob $$4, dgn $$5, eoy $$6) {
   }

   private static int[] c(eoj.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dzq $$5 = $$0.b();
      dhj $$6 = $$0.i();
      eed $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, edp.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, edp.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, edp.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, edp.a.a, $$6, $$7)
      };
   }

   public static int a(eoj.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eoj.a $$0, int $$1, int $$2) {
      dgn $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eoj.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jh a(eoj.a $$0, drb $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == drb.b) {
         $$2 = -5;
      } else if ($$1 == drb.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == drb.d) {
         $$3 = -5;
      }

      dgn $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jh($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eoj.b> a(eoj.a var1);

   public Optional<eoj.b> b(eoj.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eos<?> e();

   public static record a(ke a, dzq b, din c, eed d, esm e, eeo f, long g, dgn h, dhj i, Predicate<jq<dij>> j) {

      public a(ke $$0, dzq $$1, din $$2, eed $$3, esm $$4, long $$5, dgn $$6, dhj $$7, Predicate<jq<dij>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static eeo a(long $$0, dgn $$1) {
         eeo $$2 = new eeo(new edq(0L));
         $$2.c($$0, $$1.g, $$1.h);
         return $$2;
      }
   }

   public static record b(jh a, Either<Consumer<epb>, epb> b) {
      public b(jh $$0, Consumer<epb> $$1) {
         this($$0, Either.left($$1));
      }

      public epb a() {
         return (epb)this.b.map($$0 -> {
            epb $$1 = new epb();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jh b() {
         return this.a;
      }

      public Either<Consumer<epb>, epb> c() {
         return this.b;
      }
   }

   public static record c(ju<dij> b, Map<bwi, eoq> c, edl.a d, eou e) {
      static final eoj.c f = new eoj.c(ju.a(), Map.of(), edl.a.e, eou.a);
      public static final MapCodec<eoj.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(mb.aI).fieldOf("biomes").forGetter(eoj.c::a),
                  Codec.simpleMap(bwi.i, eoq.a, bba.a(bwi.values())).fieldOf("spawn_overrides").forGetter(eoj.c::b),
                  edl.a.l.fieldOf("step").forGetter(eoj.c::c),
                  eou.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(eoj.c::d)
               )
               .apply($$0, eoj.c::new)
      );

      public c(ju<dij> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public ju<dij> a() {
         return this.b;
      }

      public Map<bwi, eoq> b() {
         return this.c;
      }

      public edl.a c() {
         return this.d;
      }

      public eou d() {
         return this.e;
      }

      public static class a {
         private final ju<dij> a;
         private Map<bwi, eoq> b = eoj.c.f.c;
         private edl.a c = eoj.c.f.d;
         private eou d = eoj.c.f.e;

         public a(ju<dij> $$0) {
            this.a = $$0;
         }

         public eoj.c.a a(Map<bwi, eoq> $$0) {
            this.b = $$0;
            return this;
         }

         public eoj.c.a a(edl.a $$0) {
            this.c = $$0;
            return this;
         }

         public eoj.c.a a(eou $$0) {
            this.d = $$0;
            return this;
         }

         public eoj.c a() {
            return new eoj.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
