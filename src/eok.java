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

public abstract class eok {
   public static final Codec<eok> a = ma.R.q().dispatch(eok::e, eot::codec);
   public static final Codec<jq<eok>> b = alv.a(mb.aU, a);
   protected final eok.c c;

   public static <S extends eok> RecordCodecBuilder<S, eok.c> a(Instance<S> $$0) {
      return eok.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eok> MapCodec<S> a(Function<eok.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eok(eok.c $$0) {
      this.c = $$0;
   }

   public ju<dik> a() {
      return this.c.b;
   }

   public Map<bwj, eor> b() {
      return this.c.c;
   }

   public edm.a c() {
      return this.c.d;
   }

   public eov d() {
      return this.c.e;
   }

   public eoc a(eoc $$0) {
      return this.d() != eov.a ? $$0.a(12) : $$0;
   }

   public eos a(ke $$0, dzr $$1, dio $$2, eee $$3, esn $$4, long $$5, dgo $$6, int $$7, dhk $$8, Predicate<jq<dik>> $$9) {
      eok.a $$10 = new eok.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eok.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         epc $$12 = $$11.get().a();
         eos $$13 = new eos(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eos.b;
   }

   protected static Optional<eok.b> a(eok.a $$0, edq.a $$1, Consumer<epc> $$2) {
      dgo $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eok.b(new jh($$4, $$6, $$5), $$2));
   }

   private static boolean a(eok.b $$0, eok.a $$1) {
      jh $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kb.a($$2.u()), kb.a($$2.v()), kb.a($$2.w()), $$1.d.b()));
   }

   public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, eoz $$6) {
   }

   private static int[] c(eok.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dzr $$5 = $$0.b();
      dhk $$6 = $$0.i();
      eee $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, edq.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, edq.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, edq.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, edq.a.a, $$6, $$7)
      };
   }

   public static int a(eok.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eok.a $$0, int $$1, int $$2) {
      dgo $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eok.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jh a(eok.a $$0, drc $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == drc.b) {
         $$2 = -5;
      } else if ($$1 == drc.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == drc.d) {
         $$3 = -5;
      }

      dgo $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jh($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eok.b> a(eok.a var1);

   public Optional<eok.b> b(eok.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eot<?> e();

   public static record a(ke a, dzr b, dio c, eee d, esn e, eep f, long g, dgo h, dhk i, Predicate<jq<dik>> j) {

      public a(ke $$0, dzr $$1, dio $$2, eee $$3, esn $$4, long $$5, dgo $$6, dhk $$7, Predicate<jq<dik>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static eep a(long $$0, dgo $$1) {
         eep $$2 = new eep(new edr(0L));
         $$2.c($$0, $$1.h, $$1.i);
         return $$2;
      }
   }

   public static record b(jh a, Either<Consumer<epc>, epc> b) {
      public b(jh $$0, Consumer<epc> $$1) {
         this($$0, Either.left($$1));
      }

      public epc a() {
         return (epc)this.b.map($$0 -> {
            epc $$1 = new epc();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jh b() {
         return this.a;
      }

      public Either<Consumer<epc>, epc> c() {
         return this.b;
      }
   }

   public static record c(ju<dik> b, Map<bwj, eor> c, edm.a d, eov e) {
      static final eok.c f = new eok.c(ju.a(), Map.of(), edm.a.e, eov.a);
      public static final MapCodec<eok.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(mb.aI).fieldOf("biomes").forGetter(eok.c::a),
                  Codec.simpleMap(bwj.i, eor.a, bba.a(bwj.values())).fieldOf("spawn_overrides").forGetter(eok.c::b),
                  edm.a.l.fieldOf("step").forGetter(eok.c::c),
                  eov.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(eok.c::d)
               )
               .apply($$0, eok.c::new)
      );

      public c(ju<dik> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public ju<dik> a() {
         return this.b;
      }

      public Map<bwj, eor> b() {
         return this.c;
      }

      public edm.a c() {
         return this.d;
      }

      public eov d() {
         return this.e;
      }

      public static class a {
         private final ju<dik> a;
         private Map<bwj, eor> b = eok.c.f.c;
         private edm.a c = eok.c.f.d;
         private eov d = eok.c.f.e;

         public a(ju<dik> $$0) {
            this.a = $$0;
         }

         public eok.c.a a(Map<bwj, eor> $$0) {
            this.b = $$0;
            return this;
         }

         public eok.c.a a(edm.a $$0) {
            this.c = $$0;
            return this;
         }

         public eok.c.a a(eov $$0) {
            this.d = $$0;
            return this;
         }

         public eok.c a() {
            return new eok.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
