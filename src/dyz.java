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

public abstract class dyz {
   public static final Codec<dyz> a = kd.T.q().dispatch(dyz::e, dzi::codec);
   public static final Codec<ih<dyz>> b = agz.a(ke.aD, a);
   protected final dyz.c c;

   public static <S extends dyz> RecordCodecBuilder<S, dyz.c> a(Instance<S> $$0) {
      return dyz.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dyz> Codec<S> a(Function<dyz.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dyz(dyz.c $$0) {
      this.c = $$0;
   }

   public il<cuh> a() {
      return this.c.b;
   }

   public Map<bmi, dzg> b() {
      return this.c.c;
   }

   public dof.b c() {
      return this.c.d;
   }

   public dzk d() {
      return this.c.e;
   }

   public dyr a(dyr $$0) {
      return this.d() != dzk.a ? $$0.a(12) : $$0;
   }

   public dzh a(iu $$0, dkx $$1, cul $$2, dox $$3, eda $$4, long $$5, csp $$6, int $$7, ctk $$8, Predicate<ih<cuh>> $$9) {
      dyz.a $$10 = new dyz.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dyz.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dzr $$12 = $$11.get().a();
         dzh $$13 = new dzh(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dzh.b;
   }

   protected static Optional<dyz.b> a(dyz.a $$0, doj.a $$1, Consumer<dzr> $$2) {
      csp $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dyz.b(new hx($$4, $$6, $$5), $$2));
   }

   private static boolean a(dyz.b $$0, dyz.a $$1) {
      hx $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(is.a($$2.u()), is.a($$2.v()), is.a($$2.w()), $$1.d.b()));
   }

   public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5, dzo $$6) {
   }

   private static int[] b(dyz.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dkx $$5 = $$0.b();
      ctk $$6 = $$0.i();
      dox $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, doj.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, doj.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, doj.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, doj.a.a, $$6, $$7)
      };
   }

   protected static int a(dyz.a $$0, int $$1, int $$2) {
      csp $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dyz.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected hx a(dyz.a $$0, dcv $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dcv.b) {
         $$2 = -5;
      } else if ($$1 == dcv.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dcv.d) {
         $$3 = -5;
      }

      csp $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new hx($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dyz.b> a(dyz.a var1);

   public Optional<dyz.b> b(dyz.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dzi<?> e();

   public static record a(iu a, dkx b, cul c, dox d, eda e, dpi f, long g, csp h, ctk i, Predicate<ih<cuh>> j) {

      public a(iu $$0, dkx $$1, cul $$2, dox $$3, eda $$4, long $$5, csp $$6, ctk $$7, Predicate<ih<cuh>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dpi a(long $$0, csp $$1) {
         dpi $$2 = new dpi(new dok(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(hx a, Either<Consumer<dzr>, dzr> b) {
      public b(hx $$0, Consumer<dzr> $$1) {
         this($$0, Either.left($$1));
      }

      public dzr a() {
         return (dzr)this.b.map($$0 -> {
            dzr $$1 = new dzr();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public hx b() {
         return this.a;
      }

      public Either<Consumer<dzr>, dzr> c() {
         return this.b;
      }
   }

   public static record c(il<cuh> b, Map<bmi, dzg> c, dof.b d, dzk e) {
      public static final MapCodec<dyz.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  iv.a(ke.at).fieldOf("biomes").forGetter(dyz.c::a),
                  Codec.simpleMap(bmi.i, dzg.a, ave.a(bmi.values())).fieldOf("spawn_overrides").forGetter(dyz.c::b),
                  dof.b.l.fieldOf("step").forGetter(dyz.c::c),
                  dzk.e.optionalFieldOf("terrain_adaptation", dzk.a).forGetter(dyz.c::d)
               )
               .apply($$0, dyz.c::new)
      );

      public il<cuh> a() {
         return this.b;
      }

      public Map<bmi, dzg> b() {
         return this.c;
      }

      public dof.b c() {
         return this.d;
      }

      public dzk d() {
         return this.e;
      }
   }
}
