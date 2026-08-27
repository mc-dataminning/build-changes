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

public abstract class dvc {
   public static final Codec<dvc> a = jb.U.q().dispatch(dvc::e, dvl::codec);
   public static final Codec<he<dvc>> b = aev.a(jc.aA, a);
   protected final dvc.c c;

   public static <S extends dvc> RecordCodecBuilder<S, dvc.c> a(Instance<S> $$0) {
      return dvc.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends dvc> Codec<S> a(Function<dvc.c, S> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected dvc(dvc.c $$0) {
      this.c = $$0;
   }

   public hi<cqz> a() {
      return this.c.b;
   }

   public Map<bjp, dvj> b() {
      return this.c.c;
   }

   public dki.b c() {
      return this.c.d;
   }

   public dvn d() {
      return this.c.e;
   }

   public duu a(duu $$0) {
      return this.d() != dvn.a ? $$0.a(12) : $$0;
   }

   public dvk a(hr $$0, dha $$1, crd $$2, dla $$3, dyw $$4, long $$5, cpi $$6, int $$7, cqd $$8, Predicate<he<cqz>> $$9) {
      dvc.a $$10 = new dvc.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<dvc.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         dvu $$12 = $$11.get().a();
         dvk $$13 = new dvk(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return dvk.b;
   }

   protected static Optional<dvc.b> a(dvc.a $$0, dkm.a $$1, Consumer<dvu> $$2) {
      cpi $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new dvc.b(new gw($$4, $$6, $$5), $$2));
   }

   private static boolean a(dvc.b $$0, dvc.a $$1) {
      gw $$2 = $$0.b();
      return $$1.j.test($$1.b.c().getNoiseBiome(hp.a($$2.u()), hp.a($$2.v()), hp.a($$2.w()), $$1.d.b()));
   }

   public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, dvr $$6) {
   }

   private static int[] b(dvc.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dha $$5 = $$0.b();
      cqd $$6 = $$0.i();
      dla $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, dkm.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, dkm.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, dkm.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, dkm.a.a, $$6, $$7)
      };
   }

   protected static int a(dvc.a $$0, int $$1, int $$2) {
      cpi $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return a($$0, $$4, $$5, $$1, $$2);
   }

   protected static int a(dvc.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = b($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected gw a(dvc.a $$0, czn $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == czn.b) {
         $$2 = -5;
      } else if ($$1 == czn.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == czn.d) {
         $$3 = -5;
      }

      cpi $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new gw($$5, a($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<dvc.b> a(dvc.a var1);

   public Optional<dvc.b> b(dvc.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract dvl<?> e();

   public static record a(hr a, dha b, crd c, dla d, dyw e, dll f, long g, cpi h, cqd i, Predicate<he<cqz>> j) {

      public a(hr $$0, dha $$1, crd $$2, dla $$3, dyw $$4, long $$5, cpi $$6, cqd $$7, Predicate<he<cqz>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static dll a(long $$0, cpi $$1) {
         dll $$2 = new dll(new dkn(0L));
         $$2.c($$0, $$1.e, $$1.f);
         return $$2;
      }
   }

   public static record b(gw a, Either<Consumer<dvu>, dvu> b) {
      public b(gw $$0, Consumer<dvu> $$1) {
         this($$0, Either.left($$1));
      }

      public dvu a() {
         return (dvu)this.b.map($$0 -> {
            dvu $$1 = new dvu();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public gw b() {
         return this.a;
      }

      public Either<Consumer<dvu>, dvu> c() {
         return this.b;
      }
   }

   public static record c(hi<cqz> b, Map<bjp, dvj> c, dki.b d, dvn e) {
      public static final MapCodec<dvc.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hs.a(jc.aq).fieldOf("biomes").forGetter(dvc.c::a),
                  Codec.simpleMap(bjp.i, dvj.a, asu.a(bjp.values())).fieldOf("spawn_overrides").forGetter(dvc.c::b),
                  dki.b.l.fieldOf("step").forGetter(dvc.c::c),
                  dvn.e.optionalFieldOf("terrain_adaptation", dvn.a).forGetter(dvc.c::d)
               )
               .apply($$0, dvc.c::new)
      );

      public hi<cqz> a() {
         return this.b;
      }

      public Map<bjp, dvj> b() {
         return this.c;
      }

      public dki.b c() {
         return this.d;
      }

      public dvn d() {
         return this.e;
      }
   }
}
