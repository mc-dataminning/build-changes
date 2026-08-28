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

public abstract class eoc {
   public static final Codec<eoc> a = ma.R.q().dispatch(eoc::e, eol::codec);
   public static final Codec<jq<eoc>> b = alv.a(mb.aT, a);
   protected final eoc.c c;

   public static <S extends eoc> RecordCodecBuilder<S, eoc.c> a(Instance<S> $$0) {
      return eoc.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends eoc> MapCodec<S> a(Function<eoc.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected eoc(eoc.c $$0) {
      this.c = $$0;
   }

   public ju<dic> a() {
      return this.c.b;
   }

   public Map<bwe, eoj> b() {
      return this.c.c;
   }

   public ede.a c() {
      return this.c.d;
   }

   public eon d() {
      return this.c.e;
   }

   public enu a(enu $$0) {
      return this.d() != eon.a ? $$0.a(12) : $$0;
   }

   public eok a(ke $$0, dzj $$1, dig $$2, edw $$3, esf $$4, long $$5, dgg $$6, int $$7, dhc $$8, Predicate<jq<dic>> $$9) {
      eoc.a $$10 = new eoc.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<eoc.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         eou $$12 = $$11.get().a();
         eok $$13 = new eok(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return eok.b;
   }

   protected static Optional<eoc.b> a(eoc.a $$0, edi.a $$1, Consumer<eou> $$2) {
      dgg $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new eoc.b(new jh($$4, $$6, $$5), $$2));
   }

   private static boolean a(eoc.b $$0, eoc.a $$1) {
      jh $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kb.a($$2.u()), kb.a($$2.v()), kb.a($$2.w()), $$1.d.b()));
   }

   public void a(dhy $$0, dhw $$1, dzj $$2, bam $$3, enu $$4, dgg $$5, eor $$6) {
   }

   private static int[] c(eoc.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dzj $$5 = $$0.b();
      dhc $$6 = $$0.i();
      edw $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, edi.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, edi.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, edi.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, edi.a.a, $$6, $$7)
      };
   }

   public static int a(eoc.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(eoc.a $$0, int $$1, int $$2) {
      dgg $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(eoc.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jh a(eoc.a $$0, dqu $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dqu.b) {
         $$2 = -5;
      } else if ($$1 == dqu.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dqu.d) {
         $$3 = -5;
      }

      dgg $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jh($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<eoc.b> a(eoc.a var1);

   public Optional<eoc.b> b(eoc.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract eol<?> e();

   public static record a(ke a, dzj b, dig c, edw d, esf e, eeh f, long g, dgg h, dhc i, Predicate<jq<dic>> j) {

      public a(ke $$0, dzj $$1, dig $$2, edw $$3, esf $$4, long $$5, dgg $$6, dhc $$7, Predicate<jq<dic>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static eeh a(long $$0, dgg $$1) {
         eeh $$2 = new eeh(new edj(0L));
         $$2.c($$0, $$1.g, $$1.h);
         return $$2;
      }
   }

   public static record b(jh a, Either<Consumer<eou>, eou> b) {
      public b(jh $$0, Consumer<eou> $$1) {
         this($$0, Either.left($$1));
      }

      public eou a() {
         return (eou)this.b.map($$0 -> {
            eou $$1 = new eou();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jh b() {
         return this.a;
      }

      public Either<Consumer<eou>, eou> c() {
         return this.b;
      }
   }

   public static record c(ju<dic> b, Map<bwe, eoj> c, ede.a d, eon e) {
      static final eoc.c f = new eoc.c(ju.a(), Map.of(), ede.a.e, eon.a);
      public static final MapCodec<eoc.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(mb.aH).fieldOf("biomes").forGetter(eoc.c::a),
                  Codec.simpleMap(bwe.i, eoj.a, bba.a(bwe.values())).fieldOf("spawn_overrides").forGetter(eoc.c::b),
                  ede.a.l.fieldOf("step").forGetter(eoc.c::c),
                  eon.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(eoc.c::d)
               )
               .apply($$0, eoc.c::new)
      );

      public c(ju<dic> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public ju<dic> a() {
         return this.b;
      }

      public Map<bwe, eoj> b() {
         return this.c;
      }

      public ede.a c() {
         return this.d;
      }

      public eon d() {
         return this.e;
      }

      public static class a {
         private final ju<dic> a;
         private Map<bwe, eoj> b = eoc.c.f.c;
         private ede.a c = eoc.c.f.d;
         private eon d = eoc.c.f.e;

         public a(ju<dic> $$0) {
            this.a = $$0;
         }

         public eoc.c.a a(Map<bwe, eoj> $$0) {
            this.b = $$0;
            return this;
         }

         public eoc.c.a a(ede.a $$0) {
            this.c = $$0;
            return this;
         }

         public eoc.c.a a(eon $$0) {
            this.d = $$0;
            return this;
         }

         public eoc.c a() {
            return new eoc.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
