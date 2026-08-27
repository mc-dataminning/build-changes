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

public abstract class dzo {
   public static final Codec<dzo> a = kd.T.q().dispatch(dzo::e, dzx::codec);
   public static final Codec<ih<dzo>> b = ahd.a(ke.aD, a);
   protected final dzo.c c;

   public static <S extends dzo> RecordCodecBuilder<S, dzo.c> a(Instance<S> $$0) {
      return dzo.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dzo> Codec<S> a(Function<dzo.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dzo(dzo.c $$0) {
      this.c = $$0;
   }

   public il<cuw> a() {
      return this.c.b;
   }

   public Map<bmr, dzv> b() {
      return this.c.c;
   }

   public dou.b c() {
      return this.c.d;
   }

   public dzz d() {
      return this.c.e;
   }

   public dzg a(dzg $$0) {
      return this.d() != dzz.a ? $$0.a(12) : $$0;
   }

   public dzw a(iu $$0, dlm $$1, cva $$2, dpm $$3, edp $$4, long $$5, cte $$6, int $$7, ctz $$8, Predicate<ih<cuw>> $$9) {
      dzo.a $$10 = new dzo.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dzo.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         eag $$12 = $$11.get().a();
         dzw $$13 = new dzw(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dzw.b;
   }

   protected static Optional<dzo.b> a(dzo.a $$0, doy.a $$1, Consumer<eag> $$2) {
      cte $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dzo.b(new hx($$4, $$6, $$5), $$2));
   }

   private static boolean a(dzo.b $$0, dzo.a $$1) {
      hx $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(is.a($$2.u()), is.a($$2.v()), is.a($$2.w()), $$1.d.b()));
   }

   public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, ead $$6) {
   }

   private static int[] b(dzo.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dlm $$5 = $$0.b();
      ctz $$6 = $$0.i();
      dpm $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, doy.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, doy.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, doy.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, doy.a.a, $$6, $$7)
      };
   }

   protected static int a(dzo.a $$0, int $$1, int $$2) {
      cte $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dzo.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected hx a(dzo.a $$0, ddk $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == ddk.b) {
         $$2 = -5;
      } else if ($$1 == ddk.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == ddk.d) {
         $$3 = -5;
      }

      cte $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new hx($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dzo.b> a(dzo.a var1);

   public Optional<dzo.b> b(dzo.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dzx<?> e();

   public static record a(iu a, dlm b, cva c, dpm d, edp e, dpx f, long g, cte h, ctz i, Predicate<ih<cuw>> j) {

      public a(iu $$0, dlm $$1, cva $$2, dpm $$3, edp $$4, long $$5, cte $$6, ctz $$7, Predicate<ih<cuw>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dpx a(long $$0, cte $$1) {
         dpx $$2 = new dpx(new doz(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(hx a, Either<Consumer<eag>, eag> b) {
      public b(hx $$0, Consumer<eag> $$1) {
         this($$0, Either.left($$1));
      }

      public eag a() {
         return (eag)this.b.map($$0 -> {
            eag $$1 = new eag();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public hx b() {
         return this.a;
      }

      public Either<Consumer<eag>, eag> c() {
         return this.b;
      }
   }

   public static record c(il<cuw> b, Map<bmr, dzv> c, dou.b d, dzz e) {
      public static final MapCodec<dzo.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  iv.a(ke.at).fieldOf("biomes").forGetter(dzo.c::a),
                  Codec.simpleMap(bmr.i, dzv.a, avl.a(bmr.values())).fieldOf("spawn_overrides").forGetter(dzo.c::b),
                  dou.b.l.fieldOf("step").forGetter(dzo.c::c),
                  dzz.e.optionalFieldOf("terrain_adaptation", dzz.a).forGetter(dzo.c::d)
               )
               .apply($$0, dzo.c::new)
      );

      public il<cuw> a() {
         return this.b;
      }

      public Map<bmr, dzv> b() {
         return this.c;
      }

      public dou.b c() {
         return this.d;
      }

      public dzz d() {
         return this.e;
      }
   }
}
