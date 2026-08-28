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

public abstract class elx {
   public static final Codec<elx> a = ly.R.q().dispatch(elx::e, emg::codec);
   public static final Codec<jq<elx>> b = ale.a(lz.aS, a);
   protected final elx.c c;

   public static <S extends elx> RecordCodecBuilder<S, elx.c> a(Instance<S> $$0) {
      return elx.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends elx> MapCodec<S> a(Function<elx.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected elx(elx.c $$0) {
      this.c = $$0;
   }

   public ju<dgc> a() {
      return this.c.b;
   }

   public Map<bvd, eme> b() {
      return this.c.c;
   }

   public ebb.a c() {
      return this.c.d;
   }

   public emi d() {
      return this.c.e;
   }

   public elp a(elp $$0) {
      return this.d() != emi.a ? $$0.a(12) : $$0;
   }

   public emf a(ke $$0, dxg $$1, dgg $$2, ebt $$3, eqa $$4, long $$5, deh $$6, int $$7, dfd $$8, Predicate<jq<dgc>> $$9) {
      elx.a $$10 = new elx.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<elx.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         emp $$12 = $$11.get().a();
         emf $$13 = new emf(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return emf.b;
   }

   protected static Optional<elx.b> a(elx.a $$0, ebf.a $$1, Consumer<emp> $$2) {
      deh $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new elx.b(new jh($$4, $$6, $$5), $$2));
   }

   private static boolean a(elx.b $$0, elx.a $$1) {
      jh $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kb.a($$2.u()), kb.a($$2.v()), kb.a($$2.w()), $$1.d.b()));
   }

   public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, emm $$6) {
   }

   private static int[] c(elx.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dxg $$5 = $$0.b();
      dfd $$6 = $$0.i();
      ebt $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, ebf.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, ebf.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, ebf.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, ebf.a.a, $$6, $$7)
      };
   }

   public static int a(elx.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(elx.a $$0, int $$1, int $$2) {
      deh $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(elx.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jh a(elx.a $$0, dor $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dor.b) {
         $$2 = -5;
      } else if ($$1 == dor.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dor.d) {
         $$3 = -5;
      }

      deh $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jh($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<elx.b> a(elx.a var1);

   public Optional<elx.b> b(elx.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract emg<?> e();

   public static record a(ke a, dxg b, dgg c, ebt d, eqa e, ece f, long g, deh h, dfd i, Predicate<jq<dgc>> j) {

      public a(ke $$0, dxg $$1, dgg $$2, ebt $$3, eqa $$4, long $$5, deh $$6, dfd $$7, Predicate<jq<dgc>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static ece a(long $$0, deh $$1) {
         ece $$2 = new ece(new ebg(0L));
         $$2.c($$0, $$1.g, $$1.h);
         return $$2;
      }
   }

   public static record b(jh a, Either<Consumer<emp>, emp> b) {
      public b(jh $$0, Consumer<emp> $$1) {
         this($$0, Either.left($$1));
      }

      public emp a() {
         return (emp)this.b.map($$0 -> {
            emp $$1 = new emp();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jh b() {
         return this.a;
      }

      public Either<Consumer<emp>, emp> c() {
         return this.b;
      }
   }

   public static record c(ju<dgc> b, Map<bvd, eme> c, ebb.a d, emi e) {
      static final elx.c f = new elx.c(ju.a(), Map.of(), ebb.a.e, emi.a);
      public static final MapCodec<elx.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(lz.aG).fieldOf("biomes").forGetter(elx.c::a),
                  Codec.simpleMap(bvd.i, eme.a, bag.a(bvd.values())).fieldOf("spawn_overrides").forGetter(elx.c::b),
                  ebb.a.l.fieldOf("step").forGetter(elx.c::c),
                  emi.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(elx.c::d)
               )
               .apply($$0, elx.c::new)
      );

      public c(ju<dgc> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public ju<dgc> a() {
         return this.b;
      }

      public Map<bvd, eme> b() {
         return this.c;
      }

      public ebb.a c() {
         return this.d;
      }

      public emi d() {
         return this.e;
      }

      public static class a {
         private final ju<dgc> a;
         private Map<bvd, eme> b = elx.c.f.c;
         private ebb.a c = elx.c.f.d;
         private emi d = elx.c.f.e;

         public a(ju<dgc> $$0) {
            this.a = $$0;
         }

         public elx.c.a a(Map<bvd, eme> $$0) {
            this.b = $$0;
            return this;
         }

         public elx.c.a a(ebb.a $$0) {
            this.c = $$0;
            return this;
         }

         public elx.c.a a(emi $$0) {
            this.d = $$0;
            return this;
         }

         public elx.c a() {
            return new elx.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
